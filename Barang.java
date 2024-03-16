package JavaInventory;

public abstract class Barang {
    public String kodeBarang;
    public String namaBarang;
    public Barang (String kodeBarang,String namaBarang){
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
    }
    public abstract double hitungNilai();


}
