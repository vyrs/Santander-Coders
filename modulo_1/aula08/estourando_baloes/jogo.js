function iniciaJogo() {
    var url = window.location.search; 
    var nivel_jogo = url.replace("?", ""); 
    var tempo_segundos = 0; if (nivel_jogo == 1) { 1 fácil -> 120segundos tempo_segundos = 120; } if (nivel_jogo == 2) { 2 normal -> 60segundos tempo_segundos = 60; } if (nivel_jogo == 3) { 3 difícil -> 30segundos tempo_segundos = 30; } inserindo segundos no span document.getElementById('cronometro').innerHTML = tempo_segundos; quantidade de balões var qtde_baloes = 20; imprimir qtde baloes inteiros document.getElementById('baloes_inteiros').innerHTML = qtde_baloes; document.getElementById('baloes_estourados').innerHTML = 0; cria_baloes(qtde_baloes);
}