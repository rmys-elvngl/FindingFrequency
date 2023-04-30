package main;

public class FrekansBulma {

    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] frekanslar = new int[dizi.length];
        int kontrol;
        
        for (int i = 0; i < dizi.length; i++) {
            kontrol = 1;
            for (int j = i+1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    kontrol++;
                    frekanslar[j] = -1;
                }
            }
            if (frekanslar[i] != -1) {
                frekanslar[i] = kontrol;
            }
        }
        
        System.out.println("Elemanlar\tFrekanslar");
        for (int i = 0; i < dizi.length; i++) {
            if (frekanslar[i] != -1) {
                System.out.println(dizi[i] + "\t\t" + frekanslar[i]);
            }
        }
    }
}
