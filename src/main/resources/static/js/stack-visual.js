let stack = [];

function renderStack(){

    const container = document.getElementById("stack");
    container.innerHTML="";

    for(let i=stack.length-1;i>=0;i--){

        let box=document.createElement("div");
        box.className="stack-item";
        box.innerText=stack[i];

        container.appendChild(box);
    }
}

function push(){

    const value=document.getElementById("value").value;
    if(value==="") return;

    stack.push(value);
    renderStack();
}

function pop(){
    stack.pop();
    renderStack();
}

window.onload=renderStack;