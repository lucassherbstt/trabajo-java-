//Ejercicio 1: Sistema de Recomendación de Películas
import java.util.Scanner;

public class peliculas {
    public static void main(String[] args) {
        int genero;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese su genero favorito de peliculas");
        System.out.println("1. comedia");
        System.out.println("2. accion");
        System.out.println("3. drama ");
        System.out.println("4.ciencia ficción");
        genero = lectura.nextInt();
        switch (genero) {
            case 1:
                System.out.println("Algunas de las mejores peliculas dentro del genero de comedia serian:");
                System.out.println("Zoolander, Supercool, Metegol, Una pelicula de miedo. Espero que le gusten. ");
                break;
            case 2:
                System.out.println(" Algunas de las mejores peliculas dentro del genero de accion serian:");
                System.out.println("The Warriors, John Wick, 'Kill Bill: The Whole Bloody Affair. Espero que le guten.");
                break;
            case 3:
                System.out.println("Algunas de las mejores peliculas dentro del genero de drama serian:");
                System.out.println("Ciudad de dios, El padrino, Buenos muchachos. Espero que le gusten.");
                break;
            case 4:
                System.out.println("Algunas de las mejores peliculas dentro del genero de ciencia ficción serian:");
                System.out.println("Alien, Star Wars, El señor de los anillos. Espero que le gusten.");
                break;
            default:
                System.out.println("ingrese un genero valida.");
                return;
        }

    }
}

//Ejercicio 2: Calculadora de Descuentos
import java.util.Scanner;

public class descuentos {
    public static void main(String[] args) {
        Double precio,descuento;
        int categoria;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto:");
        precio = lectura.nextDouble();
        System.out.println(" ");
        System.out.println("Ingrese a continuacion su categoría asignada porfavor: ");
        System.out.println("1.Estudiante");
        System.out.println("2.Adulto");
        System.out.println("3.Jubilado");
        categoria = lectura.nextInt();
        descuento = 0.0;

        switch (categoria){
            case 1: descuento = 0.10;
            break;
            case 2: descuento = 0.05;
            break;
            case 3: descuento = 0.15;
            break;
            default:
                System.out.println("ingrese una categoria valida.");
                return;

        }
        double preciofinal = precio - (precio*descuento);
        System.out.println("El precio final del producto con el descuento incluido es: $ " + preciofinal);

    }
}

//Ejercicio 3: Sistema de Recomendación de Libros
import java.util.Scanner;

public class libros {
    public static void main(String[] args) {
        int genero;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese su genero favorito de peliculas");
        System.out.println("1. fantasia");
        System.out.println("2. misterio");
        System.out.println("3. romance ");
        System.out.println("4.ciencia ficción");
        genero = lectura.nextInt();
        switch (genero) {
            case 1:
                System.out.println("Un buen libro dentro del genero fantasia es:");
                System.out.println("harry potter. Espero que le guste. ");
                break;
            case 2:
                System.out.println(" Un buen libro dentro del genero misterio es:");
                System.out.println("las aventuras de sherlock holmes. Espero que le gute.");
                break;
            case 3:
                System.out.println("Un buen libro dentro del genero romance es:");
                System.out.println("Bajo la misma estrella. Espero que le guste.");
                break;
            case 4:
                System.out.println("Un buen libro dentro del genero ciencia ficción es:");
                System.out.println("El señor de los anillos. Espero que le guste.");
                break;
            default:
                System.out.println("ingrese un genero valida.");
                return;
        }
    }
}

//Ejercicio 4: Calculadora de IMC con Recomendaciones
import java.util.Scanner;

public class calculador_IMC {
    public static void main(String[] args) {
        Double peso,altura;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingresa su peso");
        peso = lectura.nextDouble();
        System.out.println("Ingresa su altura en metros");
        altura = lectura.nextDouble();
        double imc = peso / (altura * altura);
        if (imc < 18.5 && imc > 0) {
            System.out.println("El imc es: " + imc);
            System.out.println("El imc es muy bajo");
            System.out.println("Consulta a un profesional de salud para obtener un plan de alimentación que te ayude a ganar peso de forma saludable.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("El imc es: " + imc);
            System.out.println("El imc es normal");
            System.out.println("Mantén tu peso actual mediante una dieta equilibrada y continua actividad física regular.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("El imc es: " + imc);
            System.out.println("El imc es alto");
            System.out.println("Considera hacer ajustes en tu dieta, reduciendo la ingesta de alimentos ricos en grasas y azúcares");

        } else if (imc >= 30) {
            System.out.println("El imc es: " + imc);
            System.out.println("El imc es muy alto");
            System.out.println("Es recomendable consultar a un médico o un nutricionista para obtener un plan adecuado que incluya una dieta controlada y un programa de ejercicios");
        } else {
            System.out.println("Algun dato ingresado es incorrecto");
        }
    }}
//Ejercicio 5: Juego de Piedra, Papel o Tijera
import java.util.Scanner;

public class piedra_papel_tijera {
    public static void main(String[] args) {
        int eleccion_usuario;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Juego Piedra, Papel y Tijeras");
        System.out.print("Elije entre ");
        System.out.println("1:Piedra ");
        System.out.println("2.Papel");
        System.out.println("3.Tijera");
        eleccion_usuario = lectura.nextInt();
        int eleccion_cpu = (int) (Math.random() *3)+1;
        System.out.println(eleccion_cpu);
        if (eleccion_usuario==1) {
          if (eleccion_cpu==1) {
              System.out.println("Empate");
          }else if (eleccion_cpu==2) {
              System.out.println("Gano la CPU");
          }else if (eleccion_cpu==3) {
              System.out.println("Gano el Usuario");
          }
         }
        if (eleccion_usuario==2) {
          if (eleccion_cpu==1) {
              System.out.println("Gano el Usuario");

          }else if (eleccion_cpu==2) {
              System.out.println("Empate");
          }else if (eleccion_cpu==3) {
              System.out.println("Gano la CPU");
            }
        }
        if (eleccion_usuario==3) {
          if (eleccion_cpu==1) {
              System.out.println("Gano La CPU");

                  }else if (eleccion_cpu==2) {
              System.out.println("Gano el Usuario");

          }else if (eleccion_cpu==3) {
              System.out.println("Empate");
          }
        }
    }

//Ejercicio 6: Evaluador de Hábitos Saludables
import java.util.Scanner;

public class habitos {
    public static void main(String[] args) {
        int dormir,ejercicio,comidas,total_habitos;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Cuantas horas duermes?");
        dormir = lectura.nextInt();
        System.out.println("Cuantos horas haces ejercicio?");
        ejercicio= lectura.nextInt();
        System.out.println("Cuantas comidas saludables consumes al dia");
        comidas = lectura.nextInt();
         total_habitos = dormir + ejercicio + comidas;
        if (total_habitos >= 20) {
           System.out.println("¡Excelente! Tienes muy buenos hábitos saludables.");
        } else if (total_habitos >= 12) {
          System.out.println("Estás en el camino correcto, pero podrías mejorar algunos aspectos.");
        } else {
          System.out.println("Deberías mejorar tus hábitos saludables.");
        }
    }
}

//Ejercicio 7: Sistema de Recomendación de Actividades
import java.util.Scanner;

public class recomendacion_actividades {
    public static void main(String[] args) {
        int estado_animo;
        Scanner lectura = new Scanner(System.in);
        System.out.println("¿Hola, como te llamas?)");
        String nombre = lectura.nextLine().toLowerCase();
        System.out.println("Hola " +  nombre);
        System.out.println("¿Como te sientes el dia de hoy?");
        System.out.println("1. feliz");
        System.out.println("2. triste");
        System.out.println("3. energico ");
        System.out.println("4.relajado");
        estado_animo = lectura.nextInt();
        switch (estado_animo) {
            case 1:
                System.out.println("Me alegra mucho que estes feliz"   +    nombre);
                System.out.println("Estas son mis recomendaciones para ti segun tu estado de animo: Juntarte con tus amigo o salir a caminar al parque");
                break;
            case 2:
                System.out.println(" O, me pone muy mal saber que te encuentras triste el dia de hoy"   +    nombre);
                System.out.println("Estas son mis recomendaciones para ti segun tu estado de animo: Hablar con alguna persona cercana o tambien podrias ver alguna pelicula que te guste mucho y comer helado");
                break;
            case 3:
                System.out.println("Vaya, que bueno que te encuentres con muchas energias"   +    nombre);
                System.out.println("Estas son mis recomendaciones para ti segun tu estado de animo: Hacer ejercicio o tambien podrias salir a correr o andar en bicicleta ");
                break;
            case 4:
                System.out.println("Que bueno que te encuentres relajado"   +    nombre);
                System.out.println("Estas son mis recomendaciones para ti segun tu estado de animo: Jugar a algun videojuego o tambien podrias ver alguna pelicula qe te guste");
                break;
            default:
                System.out.println("ingrese un genero valida.");
                return;
        }

    }
}

