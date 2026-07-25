/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rza180626;

/**
 *
 * @author LAB-SI-PC
 */
public class MahasiswaNilaiExample {

    public static void main(String[] args) {
        MahasiswaNilai m = new MahasiswaNilai();
        m.setNim("2401001");
        m.setNama("Ali");
        m.setAlamat("Padang");
        m.setTugas(80.0);
        m.setUts(70.0);
        m.setUas(80.0);
        System.out.println("Nim     :" + m.getNim());
        System.out.println("Nama     :" + m.getNama());
        System.out.println("Tugas    :" + m.getTugas());
        System.out.println("UTS    :" + m.getUts());
        System.out.println("UAS    :" + m.getUas());
        System.out.println("Nilai Angka    :" + m.getNilaiAngka());
        System.out.println("Nilai Huruf    :" + m.getNilaiHuruf());

    }
}
