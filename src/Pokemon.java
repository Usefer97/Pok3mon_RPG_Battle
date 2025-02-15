import java.util.Random;

public class Pokemon {
    private String nombre;
    private int vidaMaxima;
    private int vida;
    private int ataque;
    private int defensa;
    private String asciiArt;
    private Random random = new Random();
    private boolean quemado = false;
    private int turnosQuemado = 0;

    public Pokemon(String nombre, int vida, int ataque, int defensa, String asciiArt) {
        this.nombre = nombre;
        this.vidaMaxima = vida;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.asciiArt = asciiArt;
    }

    public String getNombre() { return nombre; }
    public int getVida() { return vida; }
    public int getVidaMaxima() { return vidaMaxima; }
    public int getAtaque() { return ataque; }
    public int getDefensa() { return defensa; }
    public String getAsciiArt() { return asciiArt; }

    public void recibirDanio(int danio) {
        vida -= danio;
        if (vida < 0) vida = 0;
    }

    public boolean ataqueExitoso() {
        return Math.random() < 0.85; // 85% de probabilidad de éxito
    }

    public int ataqueEspecial() {
        System.out.println(nombre + " usa su ataque especial!");
        if (nombre.equals("Charmander")) {
            if (Math.random() < 0.7) { // 70% de acierto
                if (Math.random() < 0.5) { turnosQuemado = 2; System.out.println("El oponente ha sido quemado!"); }
                return ataque / 2;
            } else {
                System.out.println("¡El ataque especial falló!");
                return 0;
            }
        } else if (nombre.equals("Squirtle")) {
            if (Math.random() < 0.7) { // 70% de acierto
                return ataque * 2;
            } else {
                System.out.println("¡El ataque especial falló!");
                return 0;
            }
        } else if (nombre.equals("Bulbasaur")) {
            if (Math.random() < 0.7) { // 70% de acierto
                int danio = ataque * 2;
                curarse(danio);
                return danio;
            } else {
                System.out.println("¡El ataque especial falló!");
                return 0;
            }
        }
        return ataque * 2;
    }

    public void curarse(int cantidad) {
        int curacion = Math.min(vidaMaxima - vida, cantidad);
        vida += curacion;
        System.out.println(nombre + " se ha curado " + curacion + " puntos de vida!");
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void aplicarEstado() {
        if (turnosQuemado > 0) {
            recibirDanio(10);
            turnosQuemado--;
            System.out.println(nombre + " pierde 10 puntos de vida por estar quemado!");
        }
    }

    public void mostrarBarraDeVida() {
        int porcentajeVida = (vida * 20) / vidaMaxima;
        System.out.print(nombre + " [");
        for (int i = 0; i < porcentajeVida; i++) System.out.print("#");
        for (int j = porcentajeVida; j < 20; j++) System.out.print(" ");
        System.out.println("] " + vida + "/" + vidaMaxima);
    }
}