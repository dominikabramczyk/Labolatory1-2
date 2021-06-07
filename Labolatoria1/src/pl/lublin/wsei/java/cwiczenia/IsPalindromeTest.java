package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;
import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

import java.util.Scanner;

public class IsPalindromeTest {

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        do{
            System.out.print("Podaj tekst do sprawdzenia ( wpisz '0' żeby zamknąć):");
            String tekst = scn.next();
            if (tekst.equals("0")) break;
            System.out.print("Tekst: " + tekst + " " +(StringFun.IsPalindrome(tekst) ? " " : "nie") +
                    "jest palindromem");
        }while(true);
    }
}
