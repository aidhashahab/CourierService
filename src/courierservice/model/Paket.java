/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courierservice.model;

import Dao.DaoTarif;

/**
 *
 * @author user
 */
public class Paket {
    DaoTarif daoAja;
    
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
