function cumprimentar() {
    alert("Olá!");
};

function alterarFundo() {
    document.body.style.background = "green";
};

function vendoImagem() {
    console.log("estou vendo a imagem");
};

document.querySelector("#imgClick").addEventListener("click", 
function(event) {
    //console.log("estou clicando na imagem");
    let mouseX = event.pageX;
    let mouseY = event.pageY;
    console.log(`Localização: X:${mouseX} Y:${mouseY}`);
});

// const body = document.getElementByTagName("body");
// body.addEventListener("click", mudarCor);
// function mudarCor() {
//     body.style.backgroundColor = "red";
// }

document.querySelector("body").addEventListener("click", fff);

function fff(event) {
    this.style.background = "red";
}

document.querySelector("body").removeEventListener("click", fff);

document.querySelector("form").addEventListener("submit", submit);

function submit(event) {
    alert("Não é possível enviar");
    event.preventDefault();
}

const tempoEsgotado = () => {
    setTimeout(() => {
      alert("Tempo Esgotado");
    }, 10000);
};

const intervalo = () => {
    setInterval(() => {
      alert("Hora do Intervalo");
    }, 5000);
};


