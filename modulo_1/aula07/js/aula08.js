// function ParOuImpar(n) {
//     if(n % 2 === 0) return "Par";
//     return "Ímpar";
// }

// console.log(ParOuImpar(3));

// let primo = (n) => {
//     for (let i = 2; i < n; i++) {
//         if (n % i === 0) {
//             return n + " não é primo!";
//         }
//     }
//     return n + " é primo!";
// }

// console.log(primo(11));

// function circunferencia(raio) {
//     function diametro() {
//         return 2*raio;
//     }

//     return Math.PI * diametro();
// }

// console.log(circunferencia(2));

// function a(callback){
//     console.log('A Vem primeiro');
//     setTimeout(function(){
//         callback();
//     }, 3000);
// }

// function b() {
//     console.log('b vem depois');
// }

// a( b );

// // Prototype
// String.prototype.apagar = function() {
//     return "dvsdvsv ";
// };

// console.log("oi".apagar());

// let array = ["manga", "Uva", "Banana"];
// console.log(array.join(" , "));

// function contador(callback){
//     for(i = 10; i > 0; i--) {
//         console.log(i);
//     }
//     callback();
// }

// function mensagem() {
//     console.log('Feliz Ano Novo!');
// }

// contador( mensagem );

// function contador() {
//     return new Promise((resolve, reject) => {
//         for(i = 10; i > 0; i--) {
//             console.log(i);
//         }
//         resolve();
//     });
// }

// //contador().then(console.log("Feliz Ano Novo"));

// async function executa() {
//     await contador();
//     console.log("Feliz Ano Novo");
// }

// executa();

// var notas = [5.3, 4.7, 8.5, 7.1, 6.4, 9.2,
//     9.8, 5.5, 7.4, 7.0];


// console.log(notas.filter(function(n) {
//     return (n > 7);
// }));

// const p1 = {
//     nome: "arroz",
//     preco: 12
// }

// const p2 = {
//     nome: "Refrigerante",
//     preco: 5
// }
// const p3 = {
//     nome: "Café",
//     preco: 12
// }

// var produtos = [p1, p2, p3];

// const total = produtos.reduce(function(total, produto) {
//     total += produto.preco;
//     return total;
// }, 0);

// console.log(total);

const a1 = {
    nome: "vitor",
    serie: 8
}

const a2 = {
    nome: "Lucas",
    serie: 8
}

const a3 = {
    nome: "Andre",
    serie: 9
}

const a4 = {
    nome: "João",
    serie: 9
}

const a5 = {
    nome: "Maria",
    serie: 8
}

var alunos = [a1, a2, a3, a4, a5];

const adicionar = alunos.map(function(aluno) {
    if(aluno.serie === 8) return aluno.materia_quarta = "História";
    return aluno.materia_quarta = "Física";
});

console.log(alunos);