package org.example;

public class IllegalAgeException extends RuntimeException{
    public IllegalAgeException(String message) {
        super(message);
    }
}
