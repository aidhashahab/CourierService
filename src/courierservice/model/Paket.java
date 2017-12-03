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

    public double hitungBiayaReguler(int index) {
        double reg = 0.0;
        DaoTarif df = new DaoTarif();
        Tarif ta = new Tarif();
        ta = df.tarifByTipe().get(index);
        reg = ta.getReguler() * getBeratBarang();
        
        return reg;
    }

    public double hitungBiayaPakeRegulertWithAsuransi() {
        double biaya = hitungBiayaReguler(beratBarang) * 0.003;
        double biayaWithAsuransi = hitungBiayaReguler(beratBarang) + biaya;
        return biayaWithAsuransi;
    }

    public double hitungBiayaKilat(int index) {
        double kil = 0.0;
        DaoTarif df = new DaoTarif();
        Tarif ta = new Tarif();
        ta = df.tarifByTipe().get(index);
        kil = ta.getKilat() * getBeratBarang();
        return kil;
    }

    public double hitungBiayaPakeKilatWithAsuransi() {
        double biaya = hitungBiayaKilat(beratBarang) * 0.003;
        double biayaWithAsuransi = hitungBiayaKilat(beratBarang) + biaya;
        return biayaWithAsuransi;
    }

    public double hitungBiayaSDS(int index) {
        double sds = 0.0;
        DaoTarif df = new DaoTarif();
        Tarif ta = df.tarifByTipe().get(index);
        sds = ta.getSds() * getBeratBarang();
        return sds;
    }

    public double hitungBiayaPaketSdstWithAsuransi() {
        double biaya = hitungBiayaSDS(beratBarang) * 0.003;
        double biayaWithAsuransi = hitungBiayaSDS(beratBarang) + biaya;
        return biayaWithAsuransi;
    }

    public double hitungBiayaONS(int index) {
        double ons = 0.0;
        DaoTarif df = new DaoTarif();
        Tarif ta = df.tarifByTipe().get(index);
        ons = ta.getOns() * getBeratBarang();
        return ons;
    }

    public double hitungBiayaPaketONStWithAsuransi() {
        double biaya = hitungBiayaONS(beratBarang) * 0.003;
        double biayaWithAsuransi = hitungBiayaONS(beratBarang) + biaya;
        return biayaWithAsuransi;
    }

    public double hitungBiayaHDS(int index) {
        double hds = 0.0;
        DaoTarif df = new DaoTarif();
        Tarif ta = df.tarifByTipe().get(index);
        hds = ta.getHds() * getBeratBarang();
        return hds;
    }

    public double hitungBiayaPaketHDStWithAsuransi() {
        double biaya = hitungBiayaHDS(beratBarang) * 0.003;
        double biayaWithAsuransi = hitungBiayaHDS(beratBarang) + biaya;
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
