package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b;
        char islem;

        System.out.println("İki işlemli Hesap Makinesi");

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz :");
        a = input.nextDouble();

        System.out.print("İkinci Sayıyı Giriniz :");
        b = input.nextDouble();

        System.out.print("Yapılacak işlemi seçin (+, -, *, /): ");
        islem =input.next().charAt(0);

        double result;


        switch (islem){
            case '+':
                result = a + b;
                break;
            case '-':
                result = a-b;
                break;
            case'*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Hata: Sıfıra bölme tanımsızdır.");
                    return;
                }
                break;

            default:
                System.out.print("Hata: Geçersiz işlem.");
                return;
        }

        System.out.println("Sonuç: " + result);





    }
}