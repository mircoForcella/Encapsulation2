package it.develhop.encapsulation;

import it.develhop.encapsulation.entities.Person;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Person person = new Person();

        System.out.println("Your name: ");

        person.setName(scanner.nextLine());

        System.out.println("Your surname: ");
        person.setSurname(scanner.nextLine());

        System.out.println("Your height in meter: ");
        try{
        person.setHeight(scanner.nextDouble());
        } catch (InputMismatchException e) {
            System.out.println("Error, try using comma (,)");
        }

        System.out.println("Your age: ");
        person.setAge(scanner.nextInt());
        scanner.close();

        System.out.printf("Name: %s \nSurname: %s \nHeight: %.2f \nAge: %d%n",
                person.getName(), person.getSurname(),person.getHeight(),person.getAge());
    }
}
