var timerId = null;
function inicia() {

    var url = window.location.search;
	var qnt = url.replace("?", "");

    var tempo_segundos = 30;

    document.getElementById('contador').innerHTML = qnt;

    cria_quadros(qnt);
    contagem_tempo(tempo_segundos + 1);
}

function contagem_tempo(segundos){

	segundos = segundos - 1;

	if(segundos == -1){
		clearTimeout(timerId); //para a execução da função do settimeout
		game_over();
		return false;
	}

	document.getElementById('cronometro').innerHTML = segundos;

	timerId = setTimeout("contagem_tempo("+segundos+")", 1000);
}

function cria_quadros(qnt){

	for(var i = 1; i <= qnt; i++){

		var quadro = document.createElement("div");
		quadro.style.backgroundColor = "lightblue";
		quadro.style.width = '80px';
        quadro.style.height = '80px';
        quadro.style.margin = '10px';
        quadro.style.float = 'left';
        
	    quadro.id = 'q'+i;
	    quadro.onclick = function(){ mudarCor(this); };

		document.getElementById('container').appendChild(quadro);
	}
}

function mudarCor(e){

	var id_quadro = e.id;
 //corrigir TODO
	document.getElementById(id_quadro).setAttribute("onclick","");
	document.getElementById(id_quadro).style.backgroundColor = "green";

	pontuacao(-1);

}

function pontuacao(acao){

	var quadros1 = document.getElementById('contador').innerHTML;

	quadros1 = parseInt(quadros1);

	quadros1 = quadros1 + acao;

	document.getElementById('contador').innerHTML = quadros1;

	situacao_jogo(quadros1);


}

function situacao_jogo(quadros){
	if(quadros == 0){
        alert('Parabéns, você conseguiu clicou em todos os quadros');
        parar_jogo();
        window.location.href = "paginaInicial.html";
	}
}

function game_over(){
	//corrigir TODO
	remove_eventos_quadros();
    alert('Fim de jogo, o tempo acabou!');
    window.location.href = "paginaInicial.html";
}

function remove_eventos_quadros() {
    var i = 1; //contador para recuperar balões por id
    
    //percorre os elementos de acordo com o id e só irá sair do laço quando não houver correspondência com elemento
    while(document.getElementById('q'+ i)) {
        //retira o evento onclick do elemnto
        document.getElementById('q'+ i).onclick = '';
        i++; //faz a iteração da variávei i
    }
}

function parar_jogo(){
	clearTimeout(timerId);
}




