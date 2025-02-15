import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean jugarOtraVez;

        do {
            Jugador jugador = new Jugador();
            Enemigo enemigo = new Enemigo();

            Combate combate = new Combate(jugador, enemigo);
            combate.iniciar();

            System.out.println("¿Quieres jugar otra vez? (1: Sí, 2: No)");
            int respuesta = sc.nextInt();
            jugarOtraVez = (respuesta == 1);
        } while (jugarOtraVez);

        System.out.println("Gracias por jugar. ¡Hasta la próxima!");
    }
}