package JavaInventory;

public class Main {
    public static void main(String[] args) {
        InventarisApp<Barang> inventarisApp = new InventarisApp<>();

        BarangElektronik barangElektronik = new BarangElektronik("E001", "Laptop", 500.0, 10);
        BarangPakaian barangPakaian = new BarangPakaian("P001", "Kemeja", 50.0, 10);

        inventarisApp.tambahBarang(barangElektronik);
        inventarisApp.tambahBarang(barangPakaian);

        inventarisApp.tampilkanBarang();
        System.out.println("Total Nilai Inventaris: " + inventarisApp.hitungTotalNilai());
    }
}
