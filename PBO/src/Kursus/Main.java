package Kursus;

import Data.Pendaftar;
import Data.Pengajar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kursus = new Scanner(System.in);
        System.out.println("Selamat Datang di Program Kursus Musik");
        AlatMusik a = new AlatMusik();
        System.out.print("Masukkan Jenis Alat Musik : ");
        String jenis = kursus.nextLine();
        System.out.print("Masukkan Lama Waktu Kursus (Jam)  : ");
        String waktu = kursus.nextLine();

        Pengajar p = new Pengajar();
        System.out.print("Masukkan Nama Pengajar : ");
        String nama = kursus.nextLine();
        System.out.print("Masukkan Kode Pengajar  : ");
        String kode = kursus.nextLine();

        Pendaftar d = new Pendaftar();
        System.out.print("Masukkan Nama Pendaftar : ");
        String namad = kursus.nextLine();
        System.out.print("Masukkan Alamat Pendaftar  : ");
        String alamat = kursus.nextLine();

        System.out.println("DATA KURSUS");
        a.tampil(jenis,waktu);
        p.tampil(nama,kode);
        d.tampil(namad,alamat);
    }
}
