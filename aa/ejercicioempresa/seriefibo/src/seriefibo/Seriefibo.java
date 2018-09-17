/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriefibo;

import java.util.Scanner;

public class Seriefibo {

    public static void main(String[] args) {
        Seriefibo valor = new Seriefibo();
        valor.fiboprimo();
    }

    public int fibonacci() {
        Scanner reader = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 1;
        int valor = 0;

        System.out.println("Ingrese un numero:");
        int numero = reader.nextInt();

        System.out.print(numero1 + "-");
        System.out.print(numero2 + "-");
        for (int i = 1; i <= numero; i++) {

            valor = numero1 + numero2;
            numero1 = numero2;
            numero2 = valor;
            if (i < numero) {
                System.out.print(valor + "-");
            } else {
                System.out.print(valor);
            }

        }
        return 0;

    }
//-----------------------------------------------------------------------------------------------------------------

    public void ciclo() {
        Scanner reader = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int s = 0;

        System.out.print("Ingrese un numero:");
        int n = reader.nextInt();
        int cont = 0;
        while (cont < n) {
            System.out.print(a);
            s = a + b;
            a = b;
            b = s;
            cont++;
        }

    }
//----------------------------------------------------------------------------------------------------------------

    public boolean primo(int numero) {
//        Scanner reader = new Scanner(System.in);
        int contador = 0;
//
//        System.out.print("Ingrese un numero:");
//        {
//            numero = reader.nextInt();
//
//        }
        for (int i = 1; i <= numero; i++) {
            if ((numero % i) == 0) {
                contador++;
            }
        }
        if (contador <= 2) {
            //System.out.print("El numero es primo");
            return true;
        } else {
            // System.out.print("El numero NO es primo");
            return false;
        }

    }
//--------------------------------------------------------------------------------------------------------

    public void fiboprimo() {
        Scanner reader = new Scanner(System.in);
        int limite;
        System.out.print("Ingrese un numero:");
        limite = reader.nextInt();

        for (int i = 1; i < limite; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
               // System.out.println(i);
            }
            
        }
        int a = 0;
        int b = 1;
        int s = 0;

        System.out.print("Ingrese un numero:");
        int n = reader.nextInt();
        int cont = 0;
        while (cont < n) {
            System.out.print(a);
            s = a + b;
            a = b;
            b = s;
            cont++;
        }

    }
//-------------------------------------------------------------------------------------------
    
    public void llamar(){
        fiboprimo();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void serie() {
        Scanner reader = new Scanner(System.in);
        int n;
        int s = 0;
        //ingresar los datos
        System.out.println("Ingrese un numero:");
        {
            n = reader.nextInt();
        }
        //funcion para aumentar los numeros
        for (int i = 1; i <= n; i++) {
            if (i > 1) {
                System.out.print("+" + i);
            } else {
                System.out.print(i);
            }

            s = s + i;
        }
        System.out.println("\nla respuesta es:" + s);
    }
}
