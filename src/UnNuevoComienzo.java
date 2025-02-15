import java.util.Scanner;

/**
 * @author Eusebio Fernández Espada
 *  @version 1.0
 */
public class UnNuevoComienzo {
    public static void main(String[] args) {
        /*
        Creamos un "Scanner" para que el usuario pueda añadir un valor mas adelante y un "int" al que le asignamos el
        nombre "dificultad" y el valor de 0, para dentro del bucle asignarle el valor deseado por el usuario..
         */
        Scanner sc = new Scanner(System.in);
        int dificultad = 0;
        /*
         Creamos un bucle "do-while", en el imprimimos y pedimos al ususario que ingrese la dificultad deseada, si no se imprime una
         opción válida con un "if" se le avisa al usuario y al cumplirse la condición del "while" este se repetirá tantas veces como
         el usuario siga introduciones opciones inválidas.
         */
        do {
            System.out.println("Selecciona la dificultad con la que quieres jugar" + "\n" +
                    "╔═══════════════════════════════╗" + "\n" +
                    "║      ESCOGE LA DIFICULTAD     ║" + "\n" +
                    "╠═══════════════════════════════╣" + "\n" +
                    "║ 1. Entrenador Pokemon (Fácil) ║" + "\n" +
                    "║ 2. Maestro Pokemon (Difícil)  ║" + "\n" +
                    "╚═══════════════════════════════╝");
            dificultad = sc.nextInt();

            if (dificultad != 1 && dificultad != 2) {
                System.out.println("No has elegido ninguna de las opciones enseñadas, vuelve a introducir una dificultad de nuevo.");
            }
        } while (dificultad != 1 && dificultad != 2);


        /*
        Creamos a los Pokémon disponibles en el juego, utilizando diferentes "String" con el valor del nombre del pokemon,
        le asignamos el nombre y una imagen con la ayuda de ASCII ART.
         */
        String nombreBulbasaur = "Bulbasaur";
        String bulbasaur = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⡀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⡠⠉⢳ ⠴⢲⠂⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⠤⠤⠤⠤⠤⠤⠤⠤⠤⠖⠊⠀⣠⠎ ⠀⡞⢹⠏⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡴⠊⠁⠀⠀⠀⠀⠀⢀⡠⠤⠄⠀⠀⠀⠁⠀   ⠀⢀⠀⢸⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⣠⠤⠤⠄⣀⠀⠀⠀⠀⢀⣌⠀⠀⠀⠀⠀⢀⣠⣆⡁⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⡀⠘⡄⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⡴⠁⠀⠀⠐⠛⠉⠁⠀⠀⣉⠉⠉⠉⠑⠒⠉⠁⠀⠀⢸⡀⠀⠀⠀⠀⠀⠀⠀ ⠀ ⠀⢧⠀⠱⡀⠀⠀⠀\n" +
                "⠀⠀⠀⢰⣥⠆⠀⠀⠀⣠⣴⣶⣿⣿⣿⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⢇⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠈⡆⠀⠑⡄⠀⠀\n" +
                "⠀⠀⢀⡜⠁⠀⠀⢀⠀⠻⣿⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⢰⠀⠀⠸⡀⠀\n" +
                "⠀⢀⣮⢖⣧⢠⠀⣿⠇⠀⠀⠁⠀⠀⠀⠠⠀⢀⣠⣴⣤⡀⠀⠀⠀⠈⡗⢄⠀⠀⠀⠀⠀⠀ ⠀ ⠀⠀⡇⠀⠀⢱⠀\n" +
                "⠀⣼⠃⣼⣿⠘⠀⠀⠀⢠⣶⣿⡆⠀⠀⠁⣠⠊⣸⣿⣿⣿⡄⠀⠀⠀⡇⠀⢑⣄⠀⠀⠀⠀⠀⠀⢠⠃⠀⠀⠸⡆\n" +
                "⠀⣿⢰⣿⣿⠀⠀⠀⠀⠙⠻⠿⠁⠀⠀⠠⠁⠀⣿⣿⣿⣿⡇⠀⠀⠀⠇⠀⢻⣿⣷⣦⣀⡀⣀⠠⠋⠀⠀⠀⢀⡇\n" +
                "⠈⠉⠺⠿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⢿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠈⢿⣿⣿⣿⣿⢦⡀⠀⠀⠀⠀⡸⠀\n" +
                "⠘⣟⠦⢀⠀⠀⢠⠀⠀⡠⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠁⣀⠔⠀⠀⠀⠀⠀⠀⠀⠛⠻⠟⠋⠀⠙⢦⠀⣠⠜⠀⠀\n" +
                "⠀⠈⠑⠤⡙⠳⣶⣦⣤⣤⣤⣤⣤⣤⣤⣤⣴⣶⡶⠞⠁⠀⠀⣠⠖⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠈⢯⠁⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠈⢳⠤⣙⡻⠿⣿⣿⣿⣿⡿⠿⠛⠉⠀⢀⣀⡤⡚⠁⠀⠀⠀⠀⠀⠀⣧⠖⣁⣤⣦⠀⠀⠈⢇⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⢸⠀⢀⣩⣍⠓⠒⣒⠒⠒⠒⠒⠊⠉⠁⢀⡟⠀⠀⣾⣷⠀⠀⠀⠀⠏⢴⣿⣿⣿⠀⠀⠀⢸⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠘⣶⣿⣿⣿⠀⠀⠈⠒⢄⣀⡀⠀⠀⠀⣼⣶⣿⡇⠈⠋⠀⠀⠀⡼⠀⠈⠻⣿⡿⠀⠀⠀⢸⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠹⡿⠿⠋⠀⠀⠀⠀⡜⠁⠈⢯⡀⢺⣿⣿⣿⠃⠀⠀⠀⢀⣼⣇⠀⠀⠀⠀⠀⠀⠀⠀⡞⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⣿⣦⣄⣠⣀⣠⠞⠀⠀⠀⠈⠛⣿⡛⠛⠁⠀⠀⠀⣠⠊⠀⠈⢦⣄⣀⣀⣀⣀⢀⡼⠁⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠛⠉⠀⠀⠀⠀⠀⠀⠘⠛⠿⣿⠷⡾⠗⠊⠁⠀⠀⠀⠈⠉⠙⠛⠛⠛⠉⠀⠀⠀⠀⠀";
        int vidaBulbasaur = 200, ataqueBulbasaur = 20, defensaBulbasaur = 60; //Creamos variables necesarias y asignamos su valor.
        int habilidadBulbasaur = 0;

        String nombreSquirtle = "Squirtle";
        String squirtle =
                "⣦⡾⢃⣤⡿⠛⣒⡛⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⡐⢊⠉⢱⠖⣲⢤⣀⠀⠀⠀⠀   ⢠⡾⡗⡛⠒⠈⣤⣤⡀⠀⠀⠀\n" +
                "⣻⣿⠿⢛⣣⠜⠸⣟⣿⡇⠀⠀⠀⡀⠀⠀⠀⣀⣤⣤⣶⣶⣿⠿⠿⠿⠿⠿⠿⣿⣶⣦⣍⡛⢻⣦⣄⠀⢼⡿⡇⠥⠙⢘⣹⣿⣟⠀⠀⠀\n" +
                "⣿⣭⠘⣁⠀⠀⠀⢫⣩⡽⣦⠞⠉⣠⣴⣾⡿⠟⠛⠉⠉⢀⠀⠖⡌⠀⠀⠀⠁⠀⠈⠙⡻⢿⣶⣄⠙⢷⣞⣛⣧⣇⡤⣈⣿⣿⣿⠀⠀⠀\n" +
                "⣿⡟⢸⣷⠀⣰⣾⣫⣭⡿⢛⣶⣿⠟⢋⠡⡐⢌⠱⣀⠠⢄⠢⢑⡈⢆⠑⣂⠒⡰⢄⠀⠀⠈⡙⢿⣿⣟⣿⡿⢻⣿⣿⣷⡿⠟⢟⠀⠀⠠\n" +
                "⢸⣸⣹⣿⣼⣿⣿⣿⣷⣿⣿⣏⣰⡈⠢⣁⠃⠎⡰⢀⡃⠦⡘⠤⡘⢄⠣⢄⢣⠐⡌⢒⡀⢀⠜⣤⣿⠿⠉⠀⠀⢻⣿⣿⡅⠀⠈⡆⠀⣶\n" +
                "⠈⢇⡦⣿⣿⣿⠏⠁⠩⢿⣿⠛⢿⣿⣿⣶⣬⣴⣁⣢⠘⢠⠑⣂⠱⣈⠒⡌⢢⠑⡌⠂⣌⣶⡿⢿⣿⣄⠀⠀⠀⠈⢿⣿⣿⣶⡍⠀⣀⠛\n" +
                "⠀⠘⣿⠸⣿⣿⣦⣀⣔⣿⣿⣧⠀⢿⣿⡌⠙⠛⠻⠿⣿⣶⣮⣤⣒⡠⠑⢌⢂⠡⣨⣾⣿⣿⣇⠘⣿⣿⡄⠀⠀⠀⠘⣿⣿⣿⡧⣼⡇⠀\n" +
                "⠀⠀⠸⣧⠹⣿⣿⣿⣿⣿⣿⣿⣇⠈⣿⣿⡄⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣶⣮⣾⣿⣿⣿⣿⣿⡔⠸⣿⣷⡀⠀⠀⠀⠸⣿⣿⢹⡟⠀⠀\n" +
                "⠀⠀⠀⡿⢠⣿⣿⣿⣿⣿⣿⣿⣿⣆⠘⣿⣿⡀⠀⠀⠀⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡠⠹⣿⣷⠀⠀⠄⠀⣿⣟⣿⡇⠀⠀\n" +
                "⠀⠀⠰⢙⣹⣿⠇⡠⠿⢿⣿⣿⣿⣿⡀⠹⣿⣧⠀⠀⠀⠀⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⢿⣿⣇⠀⠀⢸⣿⡏⠹⣇⠀⠀\n" +
                "⠀⠀⡈⠋⣿⡿⠐⡄⠣⢼⣿⣿⣿⣿⣿⡀⢹⣿⣧⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠈⢿⣿⣆⢠⣿⠟⣿⣆⠙⣇⠀\n" +
                "⢀⠒⢁⣾⡿⢃⠱⣈⠱⢠⢸⣿⣿⣿⣿⣷⠀⢿⣿⣆⠀⠀⠀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠘⣿⣿⣾⡟⢠⠹⣿⡆⣿⢷\n" +
                "⣾⣤⣿⠏⡁⠦⡑⢄⠃⢆⣹⣿⣿⣿⣿⣿⣧⠈⢿⣿⡄⠀⠀⠀⠘⣿⣿⣿⣿⣿⡿⣿⢿⣿⣿⣿⣿⣿⣿⣶⣾⣿⠏⡐⢂⠆⣿⣿⣹⣛\n" +
                "⠿⣿⢋⡐⢌⠱⡈⠆⡹⢼⣿⣿⠣⡝⢿⣿⣿⣆⠘⣿⣿⡀⠀⢀⣤⣼⣿⠿⣋⠷⡘⢆⠣⢒⠰⡘⡐⢣⠍⠭⣉⠡⢂⠱⡈⣴⣿⡇⢿⣿\n" +
                "⠀⣿⠠⢐⠊⡔⢡⠊⡵⢫⣿⣧⢫⠜⣣⣮⡻⢿⣷⣾⣿⣷⣾⡿⢟⡹⢢⠝⡨⠑⢌⠂⠓⡌⢲⡄⣉⠒⡌⢒⣠⣥⣮⣶⣿⡿⢋⣰⠾⠡\n" +
                "⠙⣿⢀⠃⣍⠰⡁⢎⡵⢋⣿⣟⠠⢉⣾⣿⠋⠶⣩⢛⠿⢫⠕⡊⠇⡉⢆⡘⠤⡉⠜⣿⠔⡠⢛⠡⣄⣶⣾⣿⠿⠟⢛⣿⡿⠲⣾⠋⠀⠐\n" +
                "⠀⢹⠀⠎⡄⢣⠘⣬⢚⡥⣿⣿⠀⡙⣿⣷⣌⡐⠠⠉⠌⢡⢘⣀⣣⣬⣤⣶⣴⣧⣮⣤⣶⣤⣷⣾⡿⠟⠋⣄⠢⣩⣾⣟⣱⡾⠃⠀⠀⠀\n" +
                "⠀⢈⠘⡰⠘⡄⠳⣌⢳⡘⣿⣿⢀⠡⠌⠻⠿⣿⣿⣿⣿⣿⡿⠿⠿⢛⠛⠛⠛⠛⠛⠛⡛⠿⢛⠩⠐⢌⢒⣠⣾⣿⣯⣍⡉⠅⠂⡀⠀⠀\n" +
                "⠀⠀⠐⡡⢃⢌⡳⣌⢧⡙⣿⣯⢀⠃⢎⡑⢢⠐⡄⢢⠐⠤⡐⢢⠑⡌⠬⠡⢍⠊⢅⠣⢐⠂⣡⣊⣵⣾⣿⠟⠻⣿⣏⠻⢿⣷⣤⡙⠲⣤\n" +
                "⠀⠀⠘⡄⢃⢬⢳⡘⢦⡙⣿⣿⣿⣮⣄⣘⡠⢃⠘⠤⠉⠆⠱⡈⢆⠱⣈⣑⣈⣬⣴⣶⣿⣿⡿⢟⠛⡩⡔⠎⠁⠘⣿⣷⠠⠌⠻⣷⡘⣿\n" +
                "⠀⠀⢈⠔⣩⠞⢦⡙⢦⣙⣿⣯⠘⡛⠿⠿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⠿⠿⠿⢛⠻⣿⣯⠰⡐⢎⡱⠁⠌⠠⢁⠠⠘⣿⣧⠈⡅⢚⣿⣯\n" +
                "⠀⠀⡐⢮⡱⢎⢧⡙⢦⢹⣿⡇⡱⢘⢆⠳⢄⠢⡔⡰⠢⢔⠢⡔⡒⡔⢪⡑⠎⡥⢊⠽⣿⣇⠉⡀⠄⡐⢈⠂⠂⢀⣤⣿⣿⡆⡘⠌⣿⡧\n" +
                "⠀⠀⡘⣇⢞⡩⢖⡹⣌⢻⣿⢃⡌⢣⠜⣌⢊⡕⠬⣑⠩⢆⡓⢬⡑⠬⠑⠌⢃⢈⠁⡀⢿⣿⡀⠄⠂⠀⣄⣠⣶⣿⡿⠛⣿⣇⠰⠁⣿⡗\n" +
                "⠀⠀⠸⡜⢪⡕⡫⣔⢣⣿⡿⠐⠬⠡⠎⠰⠁⠎⠒⠁⡉⠂⠌⠀⠄⠂⠡⠈⠄⠂⠄⢀⣸⣿⣧⣴⣶⣿⡿⠿⠛⠁⢀⠀⣿⣯⠐⡁⣿⣟\n" +
                "⠀⠀⠈⢉⣃⣞⣑⣬⣚⠛⠁⠀⠠⠁⠄⠂⣁⢀⡁⢌⠠⠅⠌⠰⠈⠤⠡⣒⣒⣛⣾⣛⣟⣿⣛⣯⣭⣥⣄⣠⣀⣤⡶⣴⣟⡃⠸⠴⡷⠋";
        int vidaSquirtle = 150, ataqueSquirtle = 40, defensaSquirtle = 40; //Creamos variables necesarias y asignamos su valor.
        int habilidadSquirtle = 1;

        String nombreCharmander = "Charmander";
        String charmander =
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣠⠤⠤⠤⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⣤⠞⠉⠀⠀⠀⠀⠀⠀ ⠈⠙⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⢠⡞⠁⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀  ⠈⢳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⢀⣿⠰⣦⠀⠀⠀⠀⠀⠀⢀⣼ ⢡⠾⣷⠀⢻⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⢸⣿⢷⠛⠀⠀⠀⠀⠀ ⠀⠉ ⢸⡀⢸⣇⠈⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⢸⣿⣾⡆⠀⠀⠀⠀⠀⠀⠀ ⠀⢸⠿⣿⢹⡀⢻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⢸⣏⢉⡇⠀⠀⠀⠀⠀⠀⠀ ⠀⠸⣦⡤⠞⠃⢸⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⢠⡟⡈⠉⠀⠀⡀⠀⠀⠀⡀⠀⠀⠀⠀⢀⣠⠄⢸⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀         ⣷⣤⣀⠀⠀⠀\n" +
                "⠀⠀⠀⠸⣇⠙⢶⢤⣄⣁⣀⣀⣈⣁⣤⠤⠔⢾⣽⠁⢀⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⣄⢠⣄⡿⢿⣿⡆⠀⠀\n" +
                "⠀⠀⠀⠀⠙⠦⣜⠛⠳⣄⡀⢀⡼⠟⠛⠛⣶⠞⠁⠀⡾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀     ⠈⣿⣿     ⣿⡇⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠈⠙⠒⠤⣭⡟⢒⣒⠒⣋⠁⠀⠀⢸⣅⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⢸⡞⠙⠀⠀  ⠀  ⣧⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⢀⣠⠴⠚⢩⡇⣠⠿⠛⠧⣄⠀⠀⠀⠀⠀⠉⠙⠲⢤⣀⡀⠀⣀⡀⠀⠀⠀ ⢠⡾⠁⠀⠀  ⠀⠀  ⢸⠀⠀\n" +
                "⢠⣴⣶⣾⠶⠚⠁⠀⠀⠀⢸⡼⠁⠀⠀⠀⠈⠳⡄⠀⠀⠀⠀⠀⠀⠀⠀⠉⠋⢻⣷⡶⠀ ⠀⡟⠀⠀⠀⠀   ⠀ ⣠⣿⣇⡀\n" +
                "⠈⠻⢿⡀⠀⠀⠀⠀⠀⠀⣾⠁⠀⠀⠀⠀⠀⠀⠙⣆⠀⠀⠀⠀⠀⠀  ⢠⣿⣆⣨⣿⡆⠀⢻⡄⠀⠀⠀  ⠀  ⠈⠛⣹⠁\n" +
                "⠀⠀⢾⠽⠒⠒⠒⠒⠒⠒⡇⠀⠀⠀⠀⠀⠀⠀⠀⠸⡍⠓⠒⢶⡒⠒⠒⠚⠉⠁⠀⠀⠀⠀⠀⠹⡄⠀   ⠀⣠⠞⠉⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡀⠀⠈⠳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠙⣳   ⡞⠃⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣧⠀⠀⠀⠹⣆⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⣰⠃  ⢠⡇⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⣠⠾⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡷⠀⠀⠀⠘⢦⠀⠀⠀⠀⠀⠀  ⣠⡾⠁⠀  ⣼⠁⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⣴⠋⠁⠀⢧⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠏⠀⠀⠀⠀⠀⠘⣧⣤⣤⣤⠴⠚⠉⠀  ⢀⣾⡏⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⣼⠁⠀⠀⠀⠈⢷⡀⠀⠀⠀⠀⠀⠀⠀⡏⠀⠀⠀⠀⠀⠀⠀⢸⡄⠀⠀⠀⠀  ⢀⡴⢫ ⡞⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠙⠶⣄⡀⠀⠀⠀⠀⢻⡀⠀⠀⠀⠀⠀⠀⠀⡇⢀⣀⡤⠖⢋  ⡴⠋⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠘⣆⡀⠀⠀⠀⠀⢀⣤⡤⠟⠓⠒⠲⠤⠤⢿⣄⠀⠀⠀⠀⠀⠀⣏⣩⡤⠴⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⢠⣴⣿⣍⣻⠀⠀⠀⠀⣨⡇⠀⠀⠀⠀⠀⠀⠀⠀⠈⢷⡀⠀⠀⠀⠀⢻⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠻⠿⢵⡿⠽⠛⠛⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢧⡀⡤⢤⡶⢿⡽⡶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⡀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠈⣙⣳⣿⣛⣙⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        int vidacharmander = 120, ataqueCharmander = 60, defensaCharmander = 30; //Creamos variables necesarias y asignamos su valor.
        int habilidadCharmander = 2;


        /*
        Seguimos los mismos pasos para crear al Pokémon enemigo, en este caso hacemos uso de "Math.random ()" para generar un valor
        aleatorio entre los valores deseados, con el fin de obtener unas estadísticas similares a la de cada uno de los Pokémon disponibles
        para el usuario.
         */
        String nombrePikachu = "Pikachu";
        String pikachu =
                "             ⢀⣴⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡾⠋⠉⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠃⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⢀⡏⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀     ⠀⢀⣀⣀⣠⣤⣤⣤⣤⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⡏⠀⠀⠀⠀⢸⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⣀⡤⠴⠒⠊⠉⠉⠀  ⠀⣿⣿⣿⠿⠋⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⢀⡠⠼⠴⠒⠒⠒⠒⠦⠤⠤⣄⣀⠀⢀⣠⠴⠚⠉⠀⠀⠀⠀⠀⠀⠀  ⠀⣼⠿⠋⠁⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⣇⠔⠂⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⢨⠿⠋⠀⠀⠀⠀⠀⠀⠀ ⣀⡤⠖⠋⠁⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⢰⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⣀⣠⠤⠒⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⢀⡟⠀⣠⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⢻⠁⠀⠀⠀⠀⠀⠀⠀    ⠀⠀ ⢀⣠⣤⣤⡤⠤⢴\n" +
                "⠀⠀⠀⠀⠀⠀⣸⠁⣾⣿⣀⣽⡆⠀⠀⠀⠀⠀⠀⠀⢠⣾⠉⢿⣦⠀⠀⠀⢸⡀⠀⠀  ⢀⣠⠤⠔⠒⠋⠉⠉⠀⠀ ⠀ ⢀⡞\n" +
                "⠀⠀⠀⠀⠀⢀⡏⠀⠹⠿⠿⠟⠁⠀⠰⠦⠀⠀⠀⠀⠸⣿⣿⣿⡿⠀⠀⠀⢘⡧⠖⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀ ⡼⠀\n" +
                "⠀⠀⠀⠀⠀⣼⠦⣄⠀⠀⢠⣀⣀⣴⠟⠶⣄⡀⠀⠀⡀⠀⠉⠁⠀⠀⠀⠀⢸⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⣸⠁⠀\n" +
                "⠀⠀⠀⠀⢰⡇⠀⠈⡇⠀⠀⠸⡾⠁⠀⠀⠀⠉⠉⡏⠀⠀⠀⣠⠖⠉⠓⢤⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⣰⠃⠀⠀\n" +
                "⠀⠀⠀⠀⠀⢧⣀⡼⠃⠀⠀⠀⢧⠀⠀⠀⠀⠀⢸⠃⠀⠀⠀⣧⠀⠀⠀⣸⢹⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⡰⠃⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠈⢧⡀⠀⠀⠀⠀⠘⣆⠀⠀⠀⢠⠏⠀⠀⠀⠀⠈⠳⠤⠖⠃⡟⠀⠀⠀⢾⠛⠛⠛⠛⠛⠛⠛⠛⠁⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠙⣆⠀⠀⠀⠀⠈⠦⣀⡴⠋⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⠙⢦⠀⠀⠘⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⢠⡇⠙⠦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⠴⠋⠸⡇⠈⢳⡀⠀⢹⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⡼⣀⠀⠀⠈⠙⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠀⠀⠀⠀⣷⠴⠚⠁⠀⣀⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⡴⠁⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣆⡴⠚⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⣼⢷⡆⠀⣠⡴⠧⣄⣇⠀⠀⠀⠀⠀⠀⠀⢲⠀⡟⠀⠀⠀⠀⠀⠀⠀⢀⡇ ⣠⣽⢦⣄⢀⣴⣶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⡿⣼⣽⡞⠁⠀⠀⠀⢹⡀⠀⠀⠀⠀⠀⠀⠈⣷⠃⠀⠀⠀⠀⠀⠀⠀⣼⠉⠁⠀⠀ ⢠⢟⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⣷⠉⠁⢳⠀⠀⠀⠀⠈⣧⠀⠀⠀⠀⠀⠀⠀⣻⠀⠀⠀⠀⠀⠀⠀⣰⠃⠀⠀⠀ ⠀⠏⠀ ⠀⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠹⡆⠀⠈⡇⠀⠀⠀⠀⠘⣆⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⣰⠃⠀⠀⠀⠀⠀⠀⠀  ⣸⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⢳⡀⠀⠙⠀⠀⠀⠀⠀⠘⣆⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⣰⠃⠀⠀⠀⠀ ⢀⡄⠀ ⢠⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⢳⡀⣰⣀⣀⣀⠀⠀⠀⠘⣦⣀⠀⠀⠀⡇⠀⠀⠀⢀⡴⠃⠀⠀⠀⠀⠀⢸⡇⢠⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠉⠉⠀⠀⠈⠉⠉⠉⠙⠻⠿⠾⠾⠻⠓⢦⠦⡶⡶⠿⠛⠛⠓⠒⠒⠚⠛⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        int vidaEnemigo = (int) (Math.random()*100)+50, ataqueEnemigo = (int) (Math.random()*20)+30, defensaEnemigo = (int) (Math.random()*20)+40; //Creamos variables necesarias y asignamos aleatorio.
        int vidaEnemigoMaxima = vidaEnemigo; //Guardanos bajo la variable "vidaEnemigoMaxima" el valor total de la vida del Pokémon enemigo.

        /*
       Utilizamos dos "String" para guardar el menu de escoger pokémon y el menu del combate.
         */
        String menuEscoge =
                        "╔═══════════════════════════════╗" + "\n" +
                        "║       ESCOGE TU POKÉMON       ║" + "\n" +
                        "╠═══════════════════════════════╣" + "\n" +
                        "║ 1. Bulbasaur                  ║" + "\n" +
                        "║ 2. Squirtle                   ║" + "\n" +
                        "║ 3. Charmander                 ║" + "\n" +
                        "╚═══════════════════════════════╝";

        String menuCombate =
                        "╔═══════════════════════════════╗" + "\n" +
                        "║        MENÚ DE COMBATE        ║" + "\n" +
                        "╠═══════════════════════════════╣" + "\n" +
                        "║ 1. Atacar                     ║" + "\n" +
                        "║ 2. Defender                   ║" + "\n" +
                        "║ 3. Habilidad Especial         ║" + "\n" +
                        "╚═══════════════════════════════╝";

        /*
        Introducimos las variables necesarias, los dos primeros "int" para la eleccion del Pokémon y la acción en combate,
        los restantes para asginar las estadisticas asginadas anteriormente a los Pokémon por separado a unas variables
        predetermiandas para las posteriores acciones en combate.
         */
        int eleccionPokemon, eleccionCombate = 0;
        int vidaMaxima = 0, vida = 0, ataque = 0, defensa = 0, habilidadEspecial = 0;
        String nombre = "";
        String pokemon = "";

        /*
        Haciendo uso de un bucle "do-while", dentro de él preguntamos al usuario que Pokémon desea utilizar, al final,
        asignamos la condición del "while" y de cumplirse vuelve de nuevo a generar la pregunta al usuario hasta que se
        introduzca una opción válida.
         */
        do {
        System.out.println("Selecciona el pokémon con el que quieres combatir (Introduce: 1, 2 o 3)" + "\n" + menuEscoge);
        eleccionPokemon = sc.nextInt();
            /*
            Creamos un "switch" con 3 opciones que representan a cada uno de los Pokémon disponibles (dentro aplicamos
              sus estadísticas) y un "default" por si se ingresa una opción inválida.
            */
            switch (eleccionPokemon) {
                case 1:
                    nombre = nombreBulbasaur;
                    pokemon = bulbasaur;
                    vida = vidaBulbasaur;
                    vidaMaxima = vida;
                    ataque = ataqueBulbasaur;
                    defensa = defensaBulbasaur;
                    habilidadEspecial = habilidadBulbasaur; //Hidrodrenaje quita un 40% de vida al enemigo y se la cura a sí mismo.
                    break;
                case 2:
                    nombre = nombreSquirtle;
                    pokemon = squirtle;
                    vida = vidaSquirtle;
                    vidaMaxima = vida;
                    ataque = ataqueSquirtle;
                    defensa = defensaSquirtle;
                    habilidadEspecial = habilidadSquirtle; //Hidrobomba quita un 60% de la vida del enemigo.
                    break;
                case 3:
                    nombre = nombreCharmander;
                    pokemon = charmander;
                    vida = vidacharmander;
                    vidaMaxima = vida;
                    ataque = ataqueCharmander;
                    defensa = defensaCharmander;
                    habilidadEspecial = habilidadCharmander; //Llamarada quita 50% de la vida del enemigo y quema durante 3 turnos.
                    break;
                default:
                    System.out.println("No has seleccionado ninguna opción valida, escoge un pokemon introduciendo 1, 2 o 3");
                    break;
            }
        }while (eleccionPokemon != 1 && eleccionPokemon != 2 && eleccionPokemon != 3);

        /*
        Imprimimos la opción del Pokémon escogido e introducimos al usuario en la escena del combate presentando al Pikachu
        enemigo que acaba de aparecer.
         */
        System.out.println("Has escogido a " + nombre + " : " + "\n" + pokemon);
        System.out.println("¡Un " + nombrePikachu + " salvaje apareció, prepárate para combatir contra él!" + "\n" + pikachu);
        /*
        Creamos las variables necesarias para este apartado, dos contadores (Uno para contar el turno en el que nos encontramos
        y otro para la duración de la quemadura) y dos "boolean" (Para indicar si el Pokémon se encuentra o no en estado de
        quemadura o parálisis):
         */
        boolean quemado = false, paralizado = false;
        int turno = 1, quemadura = 3;

        /*
        Creamos un bucle "while" que englobe todas las acciones que se darán durante los turnos, tanto para las acciones
        del jugador, como las del enemigo, este bucle se repetirá siempre que se cumpla su condición asociada, es decir,
        que al menos el Pokémon del usuario o el enemigo dispongan de un valor asociado a la vida superior a 0.
         */
        while (vida > 0 && vidaEnemigo > 0) {
            int accionUsuario = 0, accionEnemigo = 0;
            int patron = 0;
            boolean turnoPrimo = true, turnoPar = true, defensaFase2 = false;

            System.out.println("Estás en el turno " + turno); //Imprimimos el turno en el que se encuentra el usuario.

            /*
            Con un "if" introducimos la condición de que si nuestro contador de "quemadura" llega a 0, en este se
            devuelva "quemado = false" y de nuevo se vuelva asignar el valor de "3" a la variable "quemadura".
             */
            if (quemadura == 0) {
                System.out.println("El " + nombrePikachu + " ya no esta quemado.");
                quemado = false;
                quemadura = 3;
            }

            /*
            Bajo un "if" con la condición de que el Pokémon no se encuentre paralizado, creamos un bucle "do-while" en el que
            imprimimos y pedimos al usuario que desea realizar durante el turno en el combate, si la opción escogida es
            inválida se avisa al usuario y mientras que no escoja una opción válida, la condición del bucle se dará y
            por lo tanto se seguirá repitiendo el bucle.
             */
            if (!paralizado) {
                do {
                    System.out.println("Qué debería de hacer " + nombre + ":" + "\n" + pokemon + "\n" + menuCombate);
                    eleccionCombate = sc.nextInt();
                    /*
                    Con este "switch" se presentan la opciones disponibles al ususario, en ellas hemos implementado una
                    probabilidad en cada una de las acciones, de cumplirse, imprime y guarda la acción bajo la variable
                    "accionUsuario" (De no cumplirse, antes de finizalizar el turno se imprime que falló).
                     */
                    switch (eleccionCombate) {
                        case 1: //Atacar.
                            if (Math.random() < 0.85) {
                                System.out.println("Tu " + nombre + " usó ataque a " + nombrePikachu + ".");
                                accionUsuario = ataque;
                            }
                            break;
                        case 2: //Defender.
                            if (Math.random() < 0.85) {
                                System.out.println("Tu " + nombre + " usó defensa contra " + nombrePikachu + ".");
                                accionUsuario = defensa;
                            }
                            break;
                        case 3: //Habilidad especial.
                            if (Math.random() < 0.6) {
                                System.out.print("Tu " + nombre + " usó su habilidad especial: ");
                                if (habilidadEspecial == 0) {
                                    accionUsuario = (int)(vidaEnemigo * 0.4);
                                    System.out.println("hidradrenaje.");
                                } else if (habilidadEspecial == 1) {
                                    System.out.println("hidrobomba.");
                                    accionUsuario = (int)(vidaEnemigo * 0.6);

                                } else {
                                    System.out.println("llamarada.");
                                    accionUsuario = (int)(vidaEnemigo * 0.5);
                                    if (Math.random() < 0.8) {
                                        quemado = true;
                                    }
                                }
                            }
                            break;
                        default:
                            System.out.println("No has seleccionado ninguna opción válida, escoge una acción introduciendo 1, 2 o 3.");
                            break;
                    }
                } while (eleccionCombate != 1 && eleccionCombate != 2 && eleccionCombate != 3);
            /*
            Si el Pokémon se encuentra paralizado no cumplirá la condición del "if" y llegará hasta aquí, donde se imprimirá
            que el pokémon se encuentra paralizado, posteriormente se devolverá "paralizado = false".
             */
            } else {
                System.out.println("Tu " +nombre + " está paralizado");
                paralizado = false;// El pokémon escogido queda paralizado 1 turno.
            }
            /*
            Con este "if" creamos dos opciones de dificultad: La dificultad "Maestro Pokémon", donde mientras el Pokémon disponga
            de más del 15% de la vida, este podrá de atacar, defenderse o usar habilidad especial. Pero si la vida se encuentra
            por debajo del 15% seguirá un patrón que desevuelve una seria de acciones predeterminadas posteriormente en el
            código, cada acción irá determinada por una probabilidad para determinar si acertó o falló (Las acciones del enemigo
            se guardan bajo la variable "accionEnemigo").
             */
            if(dificultad == 2) { //Dificultad "Maestro Pokémon".
                turnoPar = turno%2==0; //Asignamos a la variable "turnoPar" el valor de la operación "turno%2==0".
                if (vidaEnemigo > (int)(vidaEnemigoMaxima*0.15)) { //Si la vida es superior al 15%.
                    for (int i = 2; i < turno; i++) { //Con este "for" operamos para saber si es primo o no.
                        turnoPrimo = turno%i!=0;
                        if (!turnoPrimo) {
                            break;
                        }
                    }
                    if (turnoPrimo) { //Si es turno primo...
                        if (Math.random() < 0.85) {
                            System.out.println(nombrePikachu + " usó ataque.");
                            accionEnemigo = ataqueEnemigo;
                        }
                    } else { //Si es turno no primo...
                        if (turnoPar){ //Si es turno par...
                            if (Math.random() < 0.85) {
                                System.out.println(nombrePikachu + " usó defensa.");
                                accionEnemigo = defensaEnemigo;
                            }
                        } else { //Si no es turno par...
                            if (Math.random() < 0.6) {
                                System.out.println(nombrePikachu + "usó su habilidad especial: Rayo.");
                                accionEnemigo = (int)(vida*0.4);
                                if (Math.random() < 0.7) {
                                    paralizado = true;
                                }
                            }
                        }
                    }
                } else { //Si su vida es inferior al 15%
                    if (patron == 0) { //Si el patrón es igual a cero, el enemigo se cura un 20% de la vida.
                        accionEnemigo = (int)(vidaEnemigo*0.2);
                        vidaEnemigo += accionEnemigo;
                        System.out.println("El " + nombrePikachu + " usó curar.");
                    } else if (patron == 1) { //Si el patrón es igual a 1, el enemigo se defenderá de los ataques infligidos del jugador o
                        // atacará al Pokémon del jugador.
                        defensaFase2 = Math.random() > 0.5;
                        if (defensaFase2) {
                            accionEnemigo = defensaEnemigo;
                            System.out.println("El " + nombrePikachu + " usó defensa.");
                        } else {
                            accionEnemigo = ataqueEnemigo;
                            System.out.println("El " + nombrePikachu + " usó ataque.");
                        }
                    } else if (patron == 2) { //Si el patrón es igual a 2, el enemigo usará su habilidad especial.
                        System.out.println("El " + nombrePikachu + " usó ataque especial: Rayo.");
                        if (Math.random() < 0.6) {
                             accionEnemigo = (int) (vida * 0.4);
                            if (Math.random() < 0.7) {
                                paralizado = true;
                            }
                        }
                    }
                }
            } else { //Dificultad "Entrenador Pokémon".
                if (Math.random() < 0.75) {
                     accionEnemigo = ataqueEnemigo;
                    System.out.println("El " + nombrePikachu + " usa ataque.");
                }
            }

            if (accionUsuario == 0){ //El ataque del usuario ha fallado.
                System.out.println("Tú " + nombre + " falló.");
            } else { //Si no ha fallado...
                if (eleccionCombate == 1 || eleccionCombate == 3) { //Para acciones que realizan un ataque del usuario.
                    if ((!turnoPrimo && turnoPar) || (patron ==1 && defensaFase2)) { //Si el enemigo se defiende...
                        if (accionUsuario > accionEnemigo) {
                            System.out.println("El ataque de tu " + pokemon + " es más alto que la defensa del " + nombrePikachu + " enemigo.");
                            accionUsuario -= accionEnemigo;
                            vidaEnemigo -= accionUsuario;
                        } else { //Si la defensa del usuario es superior al ataque del enemigo
                            System.out.println("El enemigo bloqueo el ataque de tu pokémon.");
                        }
                    } else { //Si el enemigo no se defiende...
                        vidaEnemigo -= accionUsuario;

                    }
                    /*
                    Utilizamos "if" para definir la característica especial que tiene la habilidad de "Bulbasaur".
                     */
                    if (eleccionCombate == 3 && habilidadEspecial == 0) {
                        vida += accionUsuario;
                        System.out.println("Tu " + nombre + " absorbió el 40% de la vida del enemigo.");
                    }
                }
            }

            if(accionEnemigo == 0) { //El ataque del enemigo ha fallado.
                System.out.println("El " + nombrePikachu + " enemigo falló.");
            } else { //si no ha fallado...
                if (turnoPrimo || (!turnoPrimo && !turnoPar) || (patron == 1 && !defensaFase2) || patron == 2) { //Para acciones que realizan un ataque del enemigo.
                    if(eleccionCombate == 2){ //Si el usuario se defiende...
                        if (accionEnemigo > accionUsuario) { //Si el usuario se defiende...
                            System.out.println("El ataque " + nombrePikachu + " es más alto que la defensa de tu " + nombre + " .");
                            accionEnemigo -= accionUsuario;
                            vida -= accionEnemigo;
                        } else { //Si la defensa del enemigo es superior al ataque del usuario.
                            System.out.println("Tú " + nombre + " bloqueó el ataque rival.");
                        }
                    } else { //Si el usuario no se defiende...
                        vida -= accionEnemigo;
                    }
                }
            }
            /*
            Utilizamos un "if" para definir la acción que se produce cuando se cumple la condición de "quemado = true", se imprime
            que el Pokémon se encuentra quemado y se resta un 10% de vida al enemigo por cada turno quemado (duración de 3 turnos).
             */
            if (quemado) {
                System.out.println("El " + nombrePikachu + " está quemado, este efecto durará" + quemadura + " turnos.");
                vidaEnemigo -= (int)(vidaEnemigo*0.1);
                quemadura--;
            }
            /*
            Utilizamos un if para definir la acción que se produce cuando se cumple la condición de "paralizado = true", se imprime
            que el Pokémon se encuentra paralizado.
             */
            if (paralizado) {
                System.out.println(nombrePikachu + " te paralizó y no podrás pelear el siguiente turno.");
            }
            /*
            Utilizamos dos "if" para que cuando la vida del enemigo o Pokémon del usuario sea menor que 0, esta pase a ser 0.
             */
            if (vidaEnemigo < 0) {
                vidaEnemigo = 0;
            }
            if (vida < 0) {
                vida = 0;
            }
            /*
            Creamos una variable para guardar la operación que nos ayuda a escalar la vida restante a la barra de vida mediante una
            regla de tres. Posteriormente imprimimos el marco de la barra de vida y con la ayuda de dos "for" y la operación guardada en
            "barraVidausuario", imprimimos la barra de vida. Con un "for" imprimimos los asteriscos necesarios para mostrar la vida y con el
            otro "for" imprimimos los espacios necesarios para completar los espacios vacíos que quedan a restarse vida al Pokémon en
            cada ronda (vida = *).
             */
            int barraVidausuario = ((vida * 40)/vidaMaxima);
            System.out.println("La vida de tu " + nombre + " ahora es de " + vida + ": ");
            System.out.println(pokemon);
            System.out.println("╔════════════════════════════════════════╗");
            System.out.print("║");
            for (int i = 0; i < barraVidausuario; i++) {
                System.out.print("*"); //Imprimimos "*".
            }
            for (int j = barraVidausuario; j < 40 ; j++) {
                System.out.print(" "); //Imprimimos " ".
            }
            System.out.println("║");
            System.out.println("╚════════════════════════════════════════╝");

            System.out.println("La vida del " + nombrePikachu + " enemigo ahora es de " + vidaEnemigo + ": ");
            System.out.println(pikachu);
            System.out.println("╔════════════════════════════════════════╗");
            System.out.print("║");
            int barraVidaEnemigo = ((vidaEnemigo * 40)/vidaEnemigoMaxima);
            for (int i = 0; i < barraVidaEnemigo ; i++) {
                System.out.print("*"); //Imprimimos "*".
            }
            for (int j = 0; j < 40 - barraVidaEnemigo; j++) {
                System.out.print(" "); //Imprimimos " ".
            }
            System.out.println("║");
            System.out.println("╚════════════════════════════════════════╝");

            System.out.println();

            turno++; //Sumamos +1 al turno.
            /*
            Con un "if" creamos la condición de que si el enemigo se encuentra por debajo del 15% de su vida máxima, este sume
            +1 al contador del patrón, así en cada turno irá realizando la siguiente función asignada en el patrón. Una vez este
            sea superior a 2, con la ayuda de otro "if" le daremos a "patron" el valor de 0 para seguir recoriendo el patrón
            deseado.
             */
            if (vidaEnemigo < vidaEnemigoMaxima*0.15) {
                patron ++;
                if (patron > 2) {
                    patron = 0;
                }
            }
        }
        /*
        Con un "if" creamos la condición de que si la vida del enemigo tiene valor 0 y la del usuario es mayor a 0 (victoria del usuario)
        se impriman una serie de mensajes.
         */
        if (vidaEnemigo == 0 && vida > 0) {
            System.out.println(pokemon);
            System.out.println("¡ENHORABUENA, HAS DERROTADO AL PIKACHU ENEMIGO!");
            System.out.println("Has obtenido un total de 430 Exp.");
            System.out.println("¡Tu " + nombre + " subió de nivel!");
        }
        /*
        Con un "if" creamos la condición de que si la vida del usuario tiene valor 0 y la del enemigo es mayor a 0 (derrota del usuario)
        se impriman una serie de mensajes.
         */
        if (vida == 0 && vidaEnemigo > 0){
            System.out.println("Tu " + nombre + " se ha debilitado.");
            System.out.println(pikachu);
            System.out.println("Has sido derrotado por " + nombrePikachu + "...");
            System.out.println("Dirígete a la central Pokémon para curar a tu " + nombre + ".");
        }
        /*
        Con un "if" creamos la condición de que si la vida del enemigo y la del usuario tienen valor 0 (empate) se impriman
        una serie de mensajes.
         */
        if (vida == 0 && vidaEnemigo == 0) {
            System.out.println(nombre + " y " + nombrePikachu + " se dieron un cabezado bruscamente...");
            System.out.println("¡LOS DOS POKÉMON QUEDARON FUERA DE COMBATE!");
            System.out.println("Se considera empate técnico");
        }
    }
}