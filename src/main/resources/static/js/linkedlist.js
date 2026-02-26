let list = [];

function render(){

    const memory=document.getElementById("memory");
    memory.innerHTML="";

    list.forEach((val,index)=>{

        let node=document.createElement("div");
        node.className="cell";

        node.innerHTML =
        "<div>"+val+"</div>" +
        "<div class='cell-index'>Node "+index+"</div>";

        memory.appendChild(node);

        if(index !== list.length-1){
            let arrow=document.createElement("span");
            arrow.innerText=" → ";
            memory.appendChild(arrow);
        }
    });
}

function insertHead(){
    let v=document.getElementById("headValue").value;
    if(v==="") return;
    list.unshift(Number(v));
    render();
}

function insertTail(){
    let v=document.getElementById("tailValue").value;
    if(v==="") return;
    list.push(Number(v));
    render();
}

function deleteHead(){
    list.shift();
    render();
}

async function traverse(){

    const nodes=document.querySelectorAll(".cell");

    for(let i=0;i<nodes.length;i++){
        nodes[i].classList.add("active");
        await new Promise(r=>setTimeout(r,500));
        nodes[i].classList.remove("active");
    }
}

function search(){
    let val=parseInt(document.getElementById("searchValue").value);
    const nodes=document.querySelectorAll(".cell");

    nodes.forEach(n=>n.classList.remove("active"));

    list.forEach((v,i)=>{
        if(v===val)
            nodes[i].classList.add("active");
    });
}

window.onload=render;