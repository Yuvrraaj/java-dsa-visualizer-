let array = [5,12,8,20];

function render(){

    const memory=document.getElementById("memory");
    memory.innerHTML="";

    array.forEach((val,index)=>{

        let cell=document.createElement("div");
        cell.className="cell";

        cell.innerHTML=
            `<div>${val}</div>
             <div class="cell-index">${index}</div>`;

        memory.appendChild(cell);
    });
}

function insert(){

    const value=document.getElementById("valueInput").value;
    if(value==="") return;

    array.push(Number(value));
    render();
}

function removeLast(){
    array.pop();
    render();
}

async function traverse(){

    const cells=document.querySelectorAll(".cell");

    for(let i=0;i<cells.length;i++){
        cells[i].classList.add("active");
        await new Promise(r=>setTimeout(r,600));
        cells[i].classList.remove("active");
    }
}

window.onload=render;
