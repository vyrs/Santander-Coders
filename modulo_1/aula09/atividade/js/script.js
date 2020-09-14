
function principal() {

    document.querySelector("form").addEventListener("submit", mostrar);
    
    function mostrar(event) {
        event.preventDefault();
        var name = document.getElementById('nomeEsobrenome').value;
        var email = document.getElementById('email').value;
        var password = document.getElementById('password').value;
        var passwordConf = document.getElementById('passwordConf').value;
        var formulario = document.getElementById('formulario');
        var container = document.getElementById('container');
        formulario.style.display = "none";
       
        if(name === ""){
            alert("O Campo Nome e Sobrenome é obrigatório!");
            return;
        } 

        if(email === ""){
            alert("O Campo email é obrigatório!");
            return;
        } 
       
        if(password === ""){
            alert("O Campo Senha é obrigatório!");
            return;
        }
        if(passwordConf === ""){
            alert("O Campo Senha Novamente é obrigatório!");
            return;
        }
        if(passwordConf !== password){
            alert("O campo Senha novamente precisa ser igual ao campo senha!");
            return;
        }

        var ul = document.createElement("ul");
        var li1 = document.createElement("li");
        li1.innerText = name;
        var li2 = document.createElement("li");
        li2.innerText = email;
        var li3 = document.createElement("li");
        

        var rads = document.getElementsByName("genero");
  
        if(rads[0].checked) {
            container.style.backgroundColor = "blue";
            li3.innerText = rads[0].value;
        }else if(rads[1].checked) {
            container.style.backgroundColor = "pink";
            li3.innerText = rads[1].value;
        }else if(rads[2].checked) {
            container.style.backgroundColor = "green";
            li3.innerText = rads[2].value;
        }

       
        

        ul.appendChild(li1);
        ul.appendChild(li2);
        ul.appendChild(li3);

        var editar = document.createElement("button");
        editar.textContent = "editar";
        container.appendChild(ul);
        container.appendChild(editar);

     

    };
};






// <!DOCTYPE html>
// <html lang="pt-br">
// <head>
//     <meta charset="UTF-8">
//     <meta name="viewport" content="width=device-width, initial-scale=1.0">
//     <title>Contato</title>

//     <script>
//         function principal() {

//             document.querySelector("form").addEventListener("submit", mostrar);
            
//             function mostrar(event) {
//                 event.preventDefault();
//                 var name = document.getElementById('nomeEsobrenome').value;
//                 var email = document.getElementById('email').value;
//                 var password = document.getElementById('password').value;
//                 var passwordConf = document.getElementById('passwordConf').value;
//                 var genero = document.getElementsByName('genero').value;
//                 var formulario = document.getElementById('formulario');
//                 var container = document.getElementById('container');
//                 formulario.style.display = "none";
//                 var ul = document.createElement("ul");
//                 var li1 = document.createElement("li");
//                 li1.innerText = name;
//                 var li2 = document.createElement("li");
//                 li2.innerText = email;
        
//                 ul.appendChild(li1);
//                 ul.appendChild(li2);
//                 container.appendChild(ul);
    
//             };
//         };
//     </script>


// </head>
// <body onload="principal()">
//     <h1>Formulário de Contato</h1>
    
//     <hr>
//     <!-- <div id="container"> -->
//         <div id="container"></div>
//         <form action="" id="formulario">
//             <label for="nomeEsobrenome">Nome e Sobrenome:</label>
//             <input type="text" name="nomeEsobrenome" id="nomeEsobrenome">
//             <br>
//             <label for="email">E-mail:</label>
//             <input type="email" name="email" id="email">
//             <br>
//             <label for="assunto">Assunto:</label>
//             <select name="assunto" id="assunto">
//                 <option value="">Música</option>
//                 <option value="">livros</option>
//                 <option value="">Filmes</option>
//             </select>

//             <br>
//             <label>Gênero:</label>
//             <input type="radio" name="genero" value="masculino">masculino
//             <input type="radio" name="genero" value="feminino">feminino
//             <input type="radio" name="genero" value="outro">prefiro não responder
            
//             <br>
//             <label>Passatempos:</label>
//             <input type="checkbox" name="passatempos" value="Surf">Surf
//             <input type="checkbox" name="passatempos" value="Surf">Música
//             <input type="checkbox" name="passatempos" value="Surf">Séries
//             <input type="checkbox" name="passatempos" value="Surf">Filmes
//             <input type="checkbox" name="passatempos" value="Surf">Esportes

//             <br>
//             <!-- <label for="comentarios">Comentários:</label><br>
//             <textarea name="comentarios" id="comentarios" cols="30" rows="10"></textarea> -->
//             <br>

//             <label for="password">Senha:</label><br>
//             <input type="password" id="password"><br><br>

//             <label for="passwordConf">Senha Novamente:</label><br>
//             <input type="password" id="passwordConf"><br><br>
            
//             <label for="noticias">Receber Notícias Sobre o Site?</label>
//             <input type="checkbox" name="noticias" value="sim">Sim
        
//             <br><br>
//             <!-- <button onclick="envio()">Enviar</button> -->
//             <button type="submit">Mostrar</button>

//         </form>
//     <!-- </div> -->
//     <!-- <script src="js/script.js"></script> -->
// </body>
// </html>