import java.util.Scanner;
public class Combate {
    private Jugador jugador;
    private Enemigo enemigo;
    private Scanner sc = new Scanner(System.in);

    public Combate(Jugador jugador, Enemigo enemigo) {
        this.jugador = jugador;
        this.enemigo = enemigo;
    }

    public void iniciar() {
        System.out.println("¡Un Pikachu salvaje apareció!");

        while (jugador.getPokemon().estaVivo() && enemigo.estaVivo()) {
            System.out.println("\nTurno del jugador:");
            System.out.println(jugador.getPokemon().getAsciiArt());
            jugador.getPokemon().mostrarBarraDeVida();
            System.out.println(enemigo.getAsciiArt());
            enemigo.mostrarBarraDeVida();

            System.out.println("1. Atacar  2. Defender  3. Ataque Especial  4. Curarse");
            int opcion = sc.nextInt();

            if (opcion == 1) {
                int danio = Math.max(1, jugador.getPokemon().getAtaque() - enemigo.getDefensa());
                enemigo.recibirDanio(danio);
                System.out.println("Tu Pokémon atacó y causó " + danio + " de daño.");
            } else if (opcion == 3) {
                int danio = Math.max(1, jugador.getPokemon().ataqueEspecial() - enemigo.getDefensa());
                enemigo.recibirDanio(danio);
                System.out.println("El ataque especial causó " + danio + " de daño!");
            } else if (opcion == 4) {
                jugador.getPokemon().curarse(20);
            }

            if (enemigo.estaVivo()) {
                enemigo.tomarTurno(jugador.getPokemon());
            }

            // Mostrar ASCII y barra de vida al final del turno
            System.out.println("\nEstado actual después del turno:");
            System.out.println(jugador.getPokemon().getAsciiArt());
            jugador.getPokemon().mostrarBarraDeVida();
            System.out.println(enemigo.getAsciiArt());
            enemigo.mostrarBarraDeVida();
        }
        System.out.println(jugador.getPokemon().estaVivo() ? "¡Has ganado el combate!" : "Has sido derrotado...");
    }
}