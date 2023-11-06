package day01;

import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        int sayi;
        System.out.println("seri alınacak sayıyı giriniz: ");
        Scanner input = new Scanner(System.in);
        sayi = input.nextInt();
        double sonuc= 0.0;
        for(double i=1;i<=sayi;i++){
            sonuc+=(1/i);
        }
        System.out.println("seri sonuc: "+sonuc);
    }
}
