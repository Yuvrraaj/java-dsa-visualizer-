let list = [10,20,30];

function render(){

    const memory=document.getElementById("memory");
    const sizeDisplay=document.getElementById("sizeDisplay");

    memory.innerHTML="";
    sizeDisplay.innerText="Size : "+list.length;

    list.forEach((val,index)=>{

        let cell=document.createElement("div");
        cell.className="cell";

        cell.innerHTML=
        "<div>"+val+"</div>"+
        "<div class='cell-index'>"+index+"</div>";

        memory.appendChild(cell);
    });
}

function add(){
    let v=document.getElementById("addValue").value;
    if(v==="") return;
    list.push(Number(v));
    render();
}

function insertAt(){
    let i=parseInt(document.getElementById("insertIndex").value);
    let v=parseInt(document.getElementById("insertValue").value);

    if(i<0 || i>list.length) return;

    list.splice(i,0,v);
    render();
}

function update(){
    let i=parseInt(document.getElementById("updateIndex").value);
    let v=parseInt(document.getElementById("updateValue").value);

    if(i>=0 && i<list.length){
        list[i]=v;
        render();
    }
}

function removeAt(){
    let i=parseInt(document.getElementById("removeIndex").value);
    if(i>=0 && i<list.length){
        list.splice(i,1);
        render();
    }
}

async function traverse(){

    const cells=document.querySelectorAll(".cell");

    for(let i=0;i<cells.length;i++){
        cells[i].classList.add("active");
        await new Promise(r=>setTimeout(r,500));
        cells[i].classList.remove("active");
    }
}

function search(){
    let val=parseInt(document.getElementById("searchValue").value);
    const cells=document.querySelectorAll(".cell");

    cells.forEach(c=>c.classList.remove("active"));

    list.forEach((v,i)=>{
        if(v===val)
            cells[i].classList.add("active");
    });
}

window.onload=render;