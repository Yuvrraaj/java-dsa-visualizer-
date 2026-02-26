package com.dsa.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/code")
public class CodeRunnerController {

    @PostMapping("/run")
    public ResponseEntity<Map<String, String>> runCode(@RequestBody Map<String, String> request) {
        String code = request.get("code");
        Map<String, String> response = new HashMap<>();

        try {
            // 1. Create a temporary directory and file named Main.java
            Path tempDir = Files.createTempDirectory("java-exec");
            File sourceFile = new File(tempDir.toFile(), "Main.java");
            Files.writeString(sourceFile.toPath(), code);

            // 2. Compile the code (javac Main.java)
            ProcessBuilder compilePb = new ProcessBuilder("javac", sourceFile.getAbsolutePath());
            compilePb.directory(tempDir.toFile());
            Process compileProcess = compilePb.start();
            
            // Capture compilation errors
            String compileError = readStream(compileProcess.getErrorStream());
            if (compileProcess.waitFor() != 0) {
                response.put("error", compileError);
                return ResponseEntity.ok(response);
            }

            // 3. Run the compiled code (java Main)
            ProcessBuilder runPb = new ProcessBuilder("java", "Main");
            runPb.directory(tempDir.toFile());
            Process runProcess = runPb.start();

            // Capture output and runtime errors
            String output = readStream(runProcess.getInputStream());
            String runtimeError = readStream(runProcess.getErrorStream());

            runProcess.waitFor();

            if (!runtimeError.isEmpty()) {
                response.put("error", runtimeError);
            } else {
                response.put("output", output);
            }

        } catch (Exception e) {
            response.put("error", "Server Error: " + e.getMessage());
        }

        return ResponseEntity.ok(response);
    }

    // Helper method to read InputStream
    private String readStream(InputStream stream) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        StringBuilder builder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            builder.append(line).append("\n");
        }
        return builder.toString();
    }
}