let arr = [10,20,30,40,50];

function render(){

    const container = document.getElementById("array-container");
    container.innerHTML="";

    arr.forEach(val=>{
        let box=document.createElement("div");
        box.className="stack-box";
        box.innerText=val;
        container.appendChild(box);
    });
}

function traverse(){

    let i=0;

    let interval=setInterval(()=>{
        if(i>=arr.length){
            clearInterval(interval);
            render();
            return;
        }

        render();
        document.getElementById("array-container")
            .children[i].style.background="red";

        i++;
    },600);
}

function insertElement(){

    let value=document.getElementById("insertValue").value;
    if(value==="") return;

    arr.push(Number(value));
    render();
}

function deleteElement(){

    arr.pop();
    render();
}

window.onload=render;
