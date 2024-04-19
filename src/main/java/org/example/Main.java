package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
          while (true) {
              System.out.println("Enter your name");
              String name = scanner.next();
              try {
                  user.setName(name);
                  System.out.println("Successfully, your name is " + user.getName());
              } catch (IllegalNameException e ){
                  System.out.println("Error. " + e.getMessage());
              }
              System.out.println("Enter your age");
              Integer age = scanner.nextInt();
              try {
                  user.setAge(age);
                  System.out.println("Successfully. Your age " + user.getAge());
              }catch( IllegalAgeException ie){
                  System.out.println("Error." + ie.getMessage());

              }
          }

    }
}