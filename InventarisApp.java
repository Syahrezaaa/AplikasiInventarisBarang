package JavaInventory;
import java.util.ArrayList;
import java.util.List;

public class InventarisApp<T extends Barang> {
    private List<T> inventaris = new ArrayList<>();

    public void tambahBarang(T barang) {
        inventaris.add(barang);
    }

    public void tampilkanBarang() {
        for (T barang : inventaris) {
            System.out.println("Kode: " + barang.kodeBarang + ", Nama: " + barang.namaBarang);
        }
    }

    public double hitungTotalNilai() {
        double total = 0;
        for (T barang : inventaris) {
            total += barang.hitungNilai();
        }
        return total;
    }
}
