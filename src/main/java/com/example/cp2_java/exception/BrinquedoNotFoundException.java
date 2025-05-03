package com.example.cp2_java.exception;

public class BrinquedoNotFoundException extends Exception{
    public BrinquedoNotFoundException(Long id) {
        super("Brinquedo não encontrado com ID: " + id);
    }
}
