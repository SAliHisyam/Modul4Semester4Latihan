package modul4semester4latihan;

import java.util.*;

/**
 *
 * @author Administrator Ali 202110370311422
 */
public class Mahasiswa {
    String nama, kelas, MatkulPraktikum;
    int nim;
    
    public Mahasiswa(String nm, String kl, String mat, int ni){
        nama = nm;
        kelas = kl;
        MatkulPraktikum = mat;
        nim = ni;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        String input;
        Mahasiswa data;
            
        mhs.put("1", new Mahasiswa("Putri", "3H", "Struktur Data", 2020000));
        mhs.put("2", new Mahasiswa("Agus", "3A", "Matematika", 2020012));
        mhs.put("3", new Mahasiswa("Arro", "3D", "Pemrograman", 20200017));
        
        System.out.println("Masukkan ID : ");
        input = in.nextLine();
        data = mhs.get(input);
        if(data != null){
            System.out.println("Data Mahasiswa : " +data.nama + ", Kelas : " +data.kelas + ", Mata Kuliah Praktikum : " +data.MatkulPraktikum + ", NIM : " +data.nim);
        }
    }
}
