/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ervan180626;

/**
 *
 * @author LABSIDOSEN
 */
public class MahasiswaNilaiController {
    private final MahasiswaNilaiDao dao;

    public MahasiswaNilaiController() {
        this.dao = new MahasiswaNilaiDao(10); 
    }
    
    public String insert(MahasiswaNilai mhsBaru) {
        if(dao.getByNim(mhsBaru.getNim()) != null) {
            return "Mahasiswa Sudah Ada";
        }
        boolean hasil = dao.Simpan(mhsBaru);
        if(hasil) {
            return "Sukses";
        } else {
            return "Gagal";
        } 
    }
    
    public String update(String nim, MahasiswaNilai mhs) {
        boolean hasil = dao.update(nim, mhs);
        if(hasil) {
            return "Sukses";
        } else {
            return "Gagal";
        } 
    }
    
    public MahasiswaNilai[] getAll() {
        return dao.getAll();
    }
    
    public MahasiswaNilai getByNim(String nim) {
        return dao.getByNim(nim);
    }
}
