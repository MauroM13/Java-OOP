
package Mesa0103;
public class Partida {

    public static void main(String[] args) {
        UsuarioJogo jogador1 = new UsuarioJogo("Mauro", "mauro123");
// aumentar a pontuação do jogador1 em 5 pontos
        jogador1.bonus(5);
// subir o nível do jogador1
        jogador1.subirNivel();

        UsuarioJogo jogador2 = new UsuarioJogo("Anne", "anne456");
// aumentar a pontuação do jogador2 em 10 pontos
        jogador2.bonus(10);
// subir o nível do jogador2 duas vezes
        jogador2.subirNivel();
        jogador2.subirNivel();
    }

}
