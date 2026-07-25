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
public class MahasiswaNilaiDao {
    private final MahasiswaNilai mhsNilai[];
    private int jumlahMhs;

    public MahasiswaNilaiDao(int kapasitas) {
        mhsNilai = new MahasiswaNilai[kapasitas];
        MahasiswaNilai mhs = new MahasiswaNilai();
        mhs.setNim("9831111");
        mhs.setNama("Ali");
        mhs.setAlamat("Padang");
        mhs.setTugas(70.00);
        mhs.setUts(60.00);
        mhs.setUas(90.00);
        mhsNilai[0] = mhs;
        mhs = new MahasiswaNilai();
        mhs.setNim("981233");
        mhs.setNama("Ani");
        mhs.setAlamat("Padang");
        mhs.setTugas(80.00);
        mhs.setUts(60.00);
        mhs.setUas(90.00);
        mhsNilai[1] = mhs;
        jumlahMhs = 2;
    }
    
    public boolean Simpan(MahasiswaNilai mhs) {
        if(jumlahMhs < mhsNilai.length) {
            mhsNilai[jumlahMhs] = mhs;
            jumlahMhs++;
            return true;
        }
        return false;
    }
    
    public MahasiswaNilai[] getAll() {
        MahasiswaNilai[] data = new MahasiswaNilai[jumlahMhs];
        System.arraycopy(mhsNilai, 0, data, 0, jumlahMhs);
        return data;
    }
    
    public MahasiswaNilai getByNim(String nim) {
        for(int i=0;i<jumlahMhs;i++) {
            if(mhsNilai[i].getNim().equals(nim)) {
                return mhsNilai[i];
            }
        }
        return null;
    }
    
    public boolean update(String nim, MahasiswaNilai dataBaru) {
        for(int i=0; i<jumlahMhs;i++) {
            if(mhsNilai[i].getNim().equals(nim)) {
                mhsNilai[i] = dataBaru;
                return true;
            }
        }
        return false;
    }
    
    public boolean delete(String nim) {
        for(int i = 0;i<jumlahMhs;i++) {
            for(int j=i; j<jumlahMhs - 1;j++) {
                mhsNilai[j] = mhsNilai[j + 1];
            }
            mhsNilai[jumlahMhs - 1] = null;
            jumlahMhs--;
            return true;
        }
        return false;
    }
    
}
