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
public class Tarif {
    
    private String jenis;
    private double reguler;
    private double kilat;
    private double sds;
    private double ons;
    private double hds;
    private String kotaTujuan;

    public Tarif() {
    }

    public Tarif(String jenis, double reguler, double kilat, double sds, double ons, double hds, String kotaTujuan) {
        this.jenis = jenis;
        this.reguler = reguler;
        this.kilat = kilat;
        this.sds = sds;
        this.ons = ons;
        this.hds = hds;
        this.kotaTujuan = kotaTujuan;
    }

    

    
    
    @Override
    public String toString() {
        return getKotaTujuan(); //To change body of generated methods, choose Tools | Templates.
    }

    
    public double getReguler() {
        return reguler;
    }

    public void setReguler(double reguler) {
        this.reguler = reguler;
    }

    public double getKilat() {
        return kilat;
    }

    public void setKilat(double kilat) {
        this.kilat = kilat;
    }


    public double getSds() {
        return sds;
    }

    public void setSds(double Sds) {
        this.sds = sds;
    }

    /**
     * @return the ons
     */
    public double getOns() {
        return ons;
    }

    /**
     * @param ons the ons to set
     */
    public void setOns(double ons) {
        this.ons = ons;
    }

    /**
     * @return the hds
     */
    public double getHds() {
        return hds;
    }

    /**
     * @param hds the hds to set
     */
    public void setHds(double hds) {
        this.hds = hds;
    }

    /**
     * @return the kotaTujuan
     */
    public String getKotaTujuan() {
        return kotaTujuan;
    }

    /**
     * @param kotaTujuan the kotaTujuan to set
     */
    public void setKotaTujuan(String kotaTujuan) {
        this.kotaTujuan = kotaTujuan;
    }

    /**
     * @return the jenis
     */
    public String getJenis() {
        return jenis;
    }

    /**
     * @param jenis the jenis to set
     */
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    

}
