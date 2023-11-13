package UTS1A;

import java.util.Scanner;
public class UTS1A {
    public static void main(String[] args) {

        String kodeBarang;
        String namaBarang;
        int qty;
        double harga;
        double totalHarga;


        Scanner input = new Scanner(System.in);


        System.out.print("Masukan kode barang: ");
        kodeBarang = input.nextLine();

        System.out.print("Masukan nama barang: ");
        namaBarang = input.nextLine();

        System.out.print("Masukan qty barang: ");
        qty = input.nextInt();

        System.out.print("Masukan harga barang: ");
        harga = input.nextInt();


        totalHarga = qty * harga;
        System.out.println();

        System.out.println("Kode barang: " + kodeBarang);
        System.out.println("Nama barang: " + namaBarang);
        System.out.println("Quality: " + qty);
        System.out.println("Harga: " + harga);
        System.out.println("Total harga: " + totalHarga);

    }
}