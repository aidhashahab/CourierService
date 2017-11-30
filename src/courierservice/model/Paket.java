/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courierservice.model;

/**
 *
 * @author user
 */
public class Paket {

    private String noPaket;
    private int beratBarang;
    private String jenisBarang;
    private Tarif kotaTujuan;
    private double biayaPerkilo;

    public Paket() {
    }

    public Paket(String noPaket, int beratBarang, String jenisBarang, Tarif kotaTujuan, double biayaPerkilo) {
        this.noPaket = noPaket;
        this.beratBarang = beratBarang;
        this.jenisBarang = jenisBarang;
        this.kotaTujuan = kotaTujuan;
        this.biayaPerkilo = biayaPerkilo;
    }

    public double hitungCoba(int index) {
        double a = 0.0;
        DaoTarif df = new DaoTarif();
        Tarif ta = new Tarif();

        return a;
    }

    public double hitungBiayaPaketTanpaAsuransi() {
        double biaya = this.beratBarang * this.biayaPerkilo;
        return biaya;
    }

    public double hitungBiayaPaketWithAsuransi() {
        double biaya = hitungBiayaPaketTanpaAsuransi() * 0.003;
        double biayaWithAsuransi = hitungBiayaPaketTanpaAsuransi() + biaya;
        return biayaWithAsuransi;
    }

    public String getNoPaket() {
        return noPaket;
    }

    public void setNoPaket(String noPaket) {
        this.noPaket = noPaket;
    }

    public int getBeratBarang() {
        return beratBarang;
    }

    public void setBeratBarang(int beratBarang) {
        this.beratBarang = beratBarang;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public Tarif getKotaTujuan() {
        return kotaTujuan;
    }

    public void setKotaTujuan(Tarif kotaTujuan) {
        this.kotaTujuan = kotaTujuan;
    }

    public double getBiayaPerkilo() {
        return biayaPerkilo;
    }

    public void setBiayaPerkilo(double biayaPerkilo) {
        this.biayaPerkilo = biayaPerkilo;
    }

}
