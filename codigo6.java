import java.util.Scanner;

public class codigo6 {
	public static void main(String[] args) {//sE AÑADE METODO MAIN

	int[] n = new int[20];
	
    for (int i = 0; i < 20; i++) {//Se corrige el incremento + con ++
      n[i] = (int)(Math.random() * 381) + 20;
      System.out.print(n[i] + " ");//Se completa la expresión de system.out
    }
    Scanner sc = new Scanner (System.in); //Se inserta e importa scanner
    System.out.println("\n¿Qué números quiere resaltar? ");//Se añade correctamente el println
    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
    int opcion = Integer.parseInt(System.console().readLine()); //Se añade un parentesis ")" extra para corregir el enunciado

    int multiplo = (opcion == 1) ? 5 : 7;//Se corrige el orden para que funcione el operador ternario

    for(int e : n) { //se establece corectamente el for each y se sustituye el tipo de dato char
      if (e % multiplo == 0) {
        System.out.print("[" + e + "] ");
      }else {//Se inserta llave correctamente en el else
        System.out.print(e + " ");//Se sustituye el in por out
      }
    }
    sc.close();//se cierra scanner
}
}

  


