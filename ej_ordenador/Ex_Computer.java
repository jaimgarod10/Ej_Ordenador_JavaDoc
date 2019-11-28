package ej_ordenador;

import java.util.Scanner;

/**
 * This is the main class
 * 
 * @author jgarciaodowd
 */
public class Ex_Computer {

    /**
     *
     * @param args command line with arguments
     */
    public static void main(String[] args) {
          
        Scanner keyboard = new Scanner(System.in);

        System.out.println(" tipo do ratón? ");
        String type = keyboard.nextLine();
        System.out.println(" marca de la pantalla? ");
        String brand = keyboard.nextLine();
        System.out.println("pulgadas de la pantalla? ");
        float inch = keyboard.nextFloat();
        System.out.println(" velocidad de la CPU? ");
        int speed = keyboard.nextInt();
        System.out.println(" memoria de la CPU? ");
        int memorie = keyboard.nextInt();

        Mouse mouse = new Mouse(type);
        Screen screen = new Screen(brand, inch);
        CPU cpu = new CPU(speed, memorie);
        Computer computer = new Computer(mouse, screen, cpu);
        computer.amosar();

    }
 }
