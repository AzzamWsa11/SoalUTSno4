package ECommerce;

public class Main {
    public static void main(String[] args) {
        Kategori elektronik = new Kategori("Elektronik");
        Kategori pakaian = new Kategori("Pakaian");

        Gudang gudangJakarta = new Gudang("Jakarta");
        Gudang gudangSurabaya = new Gudang("Surabaya");

        Produk laptop = new Produk("Laptop Lenovo", 10000000, 10);
        Produk baju = new Produk("Baju H&M", 150000, 50);
        Produk Helm = new Produk("Helm Cargloss", 300000, 16);

        laptop.tambahkanKategori(elektronik);
        baju.tambahkanKategori(pakaian);

        laptop.tambahkanKeGudang(gudangJakarta);
        laptop.tambahkanKeGudang(gudangSurabaya);

        System.out.println("Produk: " + laptop.getNamaProduk());
        System.out.println("Harga: " + laptop.getHarga());
        System.out.println("Stok: " + laptop.getStok());
        System.out.println("Kategori: ");
        for (Kategori kategori : laptop.getKategoriList()) {
            System.out.println("- " + kategori.getNamaKategori());
        }
        System.out.println("Tersedia di Gudang: ");
        for (Gudang gudang : laptop.getGudangList()) {
            System.out.println("- " + gudang.getLokasiGudang());
        }
    }
}