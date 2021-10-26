package com.tdd.palindromo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PalindromoTest 
{  
    //Testes Contemplados
    
    //É Palindromo - 
    //Não É Palindromo -
    //Palindromo Maiúsculo
    //Palindromo Minusculo
    //Palindromo Maiúsculo e Minúsculo 
    //Frase
    //Caracteres Especiais 
    //Números


    //Verdadeiro
    // “Rotator”
    // “bob”
    // “madam”
    // “mAlAyAlam”
    // “1”
    // “Able was I, ere I saw Elba”
    // “Madam I’m Adam”
    // “Step on no pets.”
    // “Top spot!”
    // “02/02/2020”
    
    @Test
    public void testPalindromoUpperCase(){
        //Arrange
        Palindromo palindromo = new Palindromo("Rotator");
        //Act
        boolean palindromoTrue = palindromo.validaPalindromo(palindromo.getPalindromo);
        //Assert
        assertTrue(palindromoTrue);
    }

    @Test
    public void testPalindromo(){
        //Arrange
        Palindromo palindromo = new Palindromo("bob");
        //Act
        boolean palindromoTrue = palindromo.validaPalindromo(palindromo.getPalindromo);
        //Assert
        assertTrue(palindromoTrue);
    }
    
    @Test
    public void testPalindromoUpperAndLowerCase(){
        //Arrange
        Palindromo palindromo = new Palindromo("mAlAyAlam");
        //Act
        boolean palindromoTrue = palindromo.validaPalindromo(palindromo.getPalindromo);
        //Assert
        assertTrue(palindromoTrue);
    }

    @Test
    public void testPalindromoNumber(){
        //Arrange
        Palindromo palindromo = new Palindromo("1");
        //Act
        boolean palindromoTrue = palindromo.validaPalindromo(palindromo.getPalindromo);
        //Assert
        assertTrue(palindromoTrue);
    }
    
    @Test
    public void testPalindromoFrase(){
        //Arrange
        Palindromo palindromo = new Palindromo("Able was I, ere I saw Elba");
        //Act
        boolean palindromoTrue = palindromo.validaPalindromo(palindromo.getPalindromo);
        //Assert
        assertTrue(palindromoTrue);
    }

    @Test
    public void testPalindromoData(){
        //Arrange
        Palindromo palindromo = new Palindromo("02/02/2020");
        //Act
        boolean palindromoTrue = palindromo.validaPalindromo(palindromo.getPalindromo);
        //Assert
        assertTrue(palindromoTrue);
    }

    //Falso
    // “xyz”
    // “elephant”
    // “Country”
    // “Top . post!”
    // “Wonderful-fool”
    // “Wild imagination!”

    @Test
    public void testNaoPalindromo(){
        //Arrange
        Palindromo palindromo = new Palindromo("xyz");
        //Act
        boolean palindromoFalse = palindromo.validaPalindromo(palindromo.getPalindromo);
        //Assert
        assertFalse(palindromoFalse);
    }
    
    @Test
    public void testNaoPalindromoUpperCase(){
        //Arrange
        Palindromo palindromo = new Palindromo("Country");
        //Act
        boolean palindromoFalse = palindromo.validaPalindromo(palindromo.getPalindromo);
        //Assert
        assertFalse(palindromoFalse);
    }
    
    @Test
    public void testNaoPalindromoSpecialCharacters(){
        //Arrange
        Palindromo palindromo = new Palindromo("Top . post!");
        //Act
        boolean palindromoFalse = palindromo.validaPalindromo(palindromo.getPalindromo);
        //Assert
        assertFalse(palindromoFalse);
    }
    
}
