package ECommerce;

import java.util.ArrayList;
import java.util.List;

class Kategori {
    private String namaKategori;
    private List<Produk> daftarProduk;

    public Kategori(String namaKategori) {
        this.namaKategori = namaKategori;
        this.daftarProduk = new ArrayList<>();
    }

    public String getNamaKategori() {
        return namaKategori;
    }

    public List<Produk> getDaftarProduk() {
        return daftarProduk;
    }

    public void tambahkanProduk(Produk produk) {
        daftarProduk.add(produk);
    }
}

class Gudang {
    private String lokasiGudang;
    private List<Produk> daftarProduk;

    public Gudang(String lokasiGudang) {
        this.lokasiGudang = lokasiGudang;
        this.daftarProduk = new ArrayList<>();
    }

    public String getLokasiGudang() {
        return lokasiGudang;
    }

    public List<Produk> getDaftarProduk() {
        return daftarProduk;
    }

    public void tambahkanProduk(Produk produk) {
        daftarProduk.add(produk);
    }
}

class Produk {
    private String namaProduk;
    private double harga;
    private int stok;
    private List<Kategori> kategoriList;  
    private List<Gudang> gudangList;      

    public Produk(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
        this.kategoriList = new ArrayList<>();
        this.gudangList = new ArrayList<>();
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void tambahkanKategori(Kategori kategori) {
        kategoriList.add(kategori);
        kategori.tambahkanProduk(this);
    }

    public void tambahkanKeGudang(Gudang gudang) {
        gudangList.add(gudang);
        gudang.tambahkanProduk(this);
    }

    public List<Kategori> getKategoriList() {
        return kategoriList;
    }

    public List<Gudang> getGudangList() {
        return gudangList;
    }
}