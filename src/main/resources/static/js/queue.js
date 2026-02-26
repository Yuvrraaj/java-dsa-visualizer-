let queue = [];

function render(){

    const memory=document.getElementById("memory");
    const size=document.getElementById("queueSize");

    memory.innerHTML="";
    size.innerText="Size : "+queue.length;

    queue.forEach((val,index)=>{

        let cell=document.createElement("div");
        cell.className="cell";

        cell.innerHTML=
        "<div>"+val+"</div>"+
        "<div class='cell-index'>"+(index===0?"Front":index===queue.length-1?"Rear":index)+"</div>";

        memory.appendChild(cell);
    });
}

function enqueue(){
    let val=document.getElementById("enqueueValue").value;
    if(val==="") return;
    queue.push(Number(val));
    render();
}

function dequeue(){
    if(queue.length===0) return;
    queue.shift();
    render();
}

function peek(){
    let res=document.getElementById("peekResult");

    if(queue.length===0)
        res.innerText="Queue Empty";
    else
        res.innerText="Front Element : "+queue[0];
}

window.onload=render;