package com.tdd.palindromo;

public class Palindromo 
{
    private String palavra;

    public Boolean getPalindromo;

    public Palindromo(String palava) {
        this.palavra = palava;
    }

    public boolean validaPalindromo(Boolean getPalindromo) {                 
        this.palavra = palavra.toUpperCase().replaceAll("[\\p{Punct}&&[^_-]]+", "").replace(" ", "");
         return palavra.equals(new StringBuilder(palavra).reverse().toString());
    }
    
}
