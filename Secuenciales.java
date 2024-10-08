//Ejercicio 1: Generador de Horóscopo
import java.util.Scanner;
public class horoscopo {
    public static void main(String[] args) {
        int dia,mes, anno;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese su dia de nacimiento");
        dia = lectura.nextInt();
        System.out.println("ingrese su mes de nacimiento 1-12");
        mes = lectura.nextInt();
        System.out.println("ingrese su año de nacimiento");
        anno = lectura.nextInt();


        if ((mes == 12 && dia >= 22  ) || (mes == 1 && dia <= 19)) {
            System.out.print("su signo zofiacal es Capricornio, Cuerpo a tierra si tu intención es discutir con un Capricornio.  ");
        }else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18))
        System.out.println("Su signo zodiacal es Acuario");


        if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            System.out.print("Su signo zodiacal es Piscis ");
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <=19))
            System.out.println("Su signo es Aries ");


        if ((mes == 4 && dia <= 20) || (mes == 5 && dia <= 20)) {
            System.out.print("Su signo zodiacal es Tauro ");
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <=20))
            System.out.println("Su signo es Geminis ");



        if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            System.out.print("Su signo zodiacal es Cancer ");
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <=22))
            System.out.println("Su signo zodiacal es Leo ");



        if ((mes == 8 && dia <= 21) || (mes == 9 && dia >= 22)) {
            System.out.print("Su signo zodiacal es Virgo ");
        } else if ((mes == 9 && dia <= 23) || (mes == 10 && dia <=22))
            System.out.println("Su signo zodiacal es Libra ");



        if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            System.out.print("Su signo zodiacal es Escorpio ");
        } else if ((mes == 11 && dia >= 22 ) || (mes == 12 && dia <=21))
            System.out.println("Su signo zodiacal es Sagitario ");



        }


    }

//Ejercicio 2: Calculadora de Calorías Quemadas
import java.util.Scanner;
public class calorias {
    public static void main(String[] args) {
        int peso, tiempo, ejercicio;
        double caloriasQuemadas = 0;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Selecciona el tipo de ejercicio:");
        System.out.println("1. Natación");
        System.out.println("2. Correr");
        System.out.println("3. Andar en bicicleta");
        ejercicio = lectura.nextInt();
        System.out.println("Ingrese su peso en kilogramos ");
        peso = lectura.nextInt();
        System.out.println("Ingrese el tiempo estimado en minutos que realizara el ejercico");
        tiempo = lectura.nextInt();

        switch (ejercicio) {
            case 1:

                caloriasQuemadas = 700 * (tiempo / 60);
                break;
            case 2:

                caloriasQuemadas = 125 * (tiempo / 30);
                break;
            case 3:

                caloriasQuemadas = 500 * (tiempo / 60);
                break;
        }
        System.out.println("Calorías quemadas: " + caloriasQuemadas);








    }
}


//Ejercicio 3: Generador de Rutinas de Ejercicio
import java.util.Scanner;
public class rutian {
    public static void main(String[] args) {
        int nivel;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el nivel de estado fisico actual");
        System.out.println("1. Bajo");
        System.out.println("2. Intermedio");
        System.out.println("3. Elevado");
        nivel = lectura.nextInt();
        switch (nivel) {
            case 1:
                System.out.println("Lunes (piernas) :");
                System.out.println("Extensiones de cuadriceps + Prensa= 4 x 12  ");
                System.out.println("Sentadillas= 4 x 10  ");
                System.out.println("Zancada + Curl femoral= 4 x 10 ");
                System.out.println(" ");
                System.out.println("Martes (pecho) :");
                System.out.println("Press banca= 4 series de 12 ");
                System.out.println("Press inclina= 4 x 10  ");
                System.out.println("Apertura= 3 x 10 ");
                System.out.println(" ");
                System.out.println("Jueves (hombro) :");
                System.out.println("Pres militar= 4 x 10  ");
                System.out.println("Elevacion lat + Pajaros = 4 x 10 ");
                System.out.println("Elevacion front= 4 x 10 ");
                System.out.println(" ");
                System.out.println("Viernes (brazo) :");
                System.out.println("Pres frances= 4 x 12 ");
                System.out.println("Curl martillo reclinado = 4 x 10 ");
                System.out.println("Patada trasera= 4 x 12 ");
                break;
            case 2:
                System.out.println("Lunes (pecho) ");
                System.out.println("Pres banca= 10 x 4 ");
                System.out.println("Pres banca inclinado= 8 x 3 ");
                System.out.println("Pres declinado= 8 x 3");
                System.out.println(" ");
                System.out.println("Martes (espalda)");
                System.out.println("Dominadas= 3 x 8");
                System.out.println("Remo horizontal= 3 x 8");
                System.out.println("Remo sentado en polea con agarre abierto= 2 x 8");
                System.out.println(" ");
                System.out.println("Jueves(hombro)");
                System.out.println("Pres frontal= 3 x 10");
                System.out.println("Pres arnold= 4 x 10 ");
                System.out.println("Elevaciones laterales= 2 x 10");
                System.out.println(" ");
                System.out.println("Viernes(piernas)");
                System.out.println("Sentadillas= 3x10");
                System.out.println("Curl femoral en maquina= 4x10 ");
                System.out.println("Zancadas= 2x10");
                break;
            case 3:
                System.out.println("lunes (brazos + gemelos) ");
                System.out.println("Curl alterno 3 x 12");
                System.out.println("Curl predicador 3 x 12");
                System.out.println("Curl barra 7 x 12");
                System.out.println(" ");
                System.out.println("Martes (piernas + abdos)");
                System.out.println("Sentadillas 3 x 12");
                System.out.println("Prensa 3 x 12 ");
                System.out.println("Curl femoral 3 x 12 ");
                System.out.println(" ");
                System.out.println("Jueves (pecho + triceps)");
                System.out.println("Press inclinado 3 x 12");
                System.out.println("Aperturas inclinadas 3 x 12");
                System.out.println("Press de banca 3 x 12");
                System.out.println(" ");
                System.out.println("Viernes (espalda + gemelos) ");
                System.out.println("Dominadas agarre neutro 3 al fallo ");
                System.out.println("Jalones agarre ancho 3 x 12");
                System.out.println("remo con barra 3 x 12 ");
                break;



        }
    }
}

//Ejercicio 4: Generador de Listas de Reproducción
import java.util.Scanner;

public class estados_de_animo {
    public static void main(String[] args) {
        int estado_animo;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese su estado de animo ");
        System.out.println("1. feliz");
        System.out.println("2. triste");
        System.out.println("3. enerjico ");
        System.out.println("4.relajado");
        estado_animo = lectura.nextInt();
        switch (estado_animo) {
            case 1:
                System.out.println("O, veo que estas feliz, para ese estado de animo te puedo recomendar que escuhes estas tres canciones: Back on trak: Ryan James, Tik Tok Tok: PØW, Up to us: Ryan James ");
                break;
            case 2:
                System.out.println("O, lastimosamente veo que te encuentras triste,para ese estado de animo te puedo recomendar que escuches estas tres canciones: The story untold: Rikard, Symphonic Voyage: Megan Wofford, The Green: Ruiqi Zhao ");
                break;
            case 3:
                System.out.println("O, veo que estas con muchas energias, para ese estado de animo te puedo recomendar que escuches estas tres canciones: Mr. Everything (Instrumental Version): Max Volante, The Harrysons: Harry Edvino, Ur Karma (Instrumental Version): Craig Reever");
                break;
            case 4:
                System.out.println("O, veo que estas muy relajado, para ese estado de animo te puedo recomendar que escuches estas tres canciones:Back on Track: Ryan James, Good Energy: Sarah, the Illstrumentalist, Salut!: Andreas Dahlbäck ");
                break;
            default:
                System.out.println("ingrese un estado valido.");
                return;
        }

    }
}

//Ejercicio 5: Calculadora de Costo de Viaje
import java.util.Scanner;

public class viaje {
        public static void main(String[] args) {
            Scanner lectura = new Scanner(System.in);
            double distanciaKm,consumoCombustible,precioCombustible,costoTotal;
            System.out.print("Ingresa la distancia a recorrer en kilómetros: ");
            distanciaKm = lectura.nextDouble();

            System.out.print("Ingresa el consumo de combustible (litros por kilómetro): ");
            consumoCombustible = lectura.nextDouble();

            System.out.print("Ingresa el precio del combustible por litro: ");
            precioCombustible = lectura.nextDouble();

            costoTotal = distanciaKm * consumoCombustible * precioCombustible;

            System.out.println("El costo total del viaje es: $" + costoTotal);

        }
    }

//Ejercicio 6: Generador de Planes de Estudio
import java.util.Scanner;

public class horas_estudio {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double horasDiarias,horasPorMateria;
            System.out.print("¿Cuántas horas al día puedes estudiar? ");
             horasDiarias = lectura.nextInt();

             horasPorMateria = horasDiarias / 4;

            System.out.println("Plan de estudio semanal:");
            System.out.println("Matemática: " + horasPorMateria + " horas");
            System.out.println("Programación: " + horasPorMateria + " horas");
            System.out.println("Arquitectura: " + horasPorMateria + " horas");
            System.out.println("Organización Empresarial: " + horasPorMateria + " horas");
        }
    }


//Ejercicio 7: Calculadora de Índice de Felicidad
import java.util.Scanner;

public class felicidad {;
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int satisfaccionVida,estres,salud;
            System.out.print("En una escala del 1 al 10, ¿cuál es tu nivel de satisfacción con la vida? ");
            satisfaccionVida = lectura.nextInt();

            System.out.print("En una escala del 1 al 10, ¿cuál es tu nivel de estrés? ");
            estres = lectura.nextInt();

            System.out.print("En una escala del 1 al 10, ¿cuál es tu nivel de salud? ");
            salud = lectura.nextInt();

            double indiceFelicidad = (satisfaccionVida + estres + salud) / 3.0;

            System.out.println("Tu índice de felicidad es: " + indiceFelicidad);
        }
    }
