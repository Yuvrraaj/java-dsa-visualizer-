let stack=[];

function renderStack(){

    const container=document.getElementById("stack-container");
    container.innerHTML="";

    for(let i=stack.length-1;i>=0;i--){
        let box=document.createElement("div");
        box.classList.add("stack-box");
        box.innerText=stack[i];
        container.appendChild(box);
    }
}

function pushStack(){

    let value=document.getElementById("stackInput").value;
    if(value==="") return;

    stack.push(value);
    renderStack();
}

function popStack(){

    if(stack.length===0) return;
    stack.pop();
    renderStack();
}
