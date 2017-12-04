/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import courierservice.model.Paket;
import courierservice.model.Tarif;
import java.io.File;
import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class DaoTarif {

    Paket paket = new Paket();

    public double resultBiaya(int berat, double hargaTipe) {
        double beratAja = hargaTipe * berat;
        return beratAja;
    }
    
    public double resultBiayaWithAsuransi (double hargaBarang){
        double resultWithAsuransi = hargaBarang*0.003;
        return resultWithAsuransi;
    }

    public double hasilAkhirWithAsuransi (double biayaBerat, double withAsuransi){
        double hasil = biayaBerat+withAsuransi;
        return hasil;
    }
    
    public List<Tarif> tarifByKota() {

        List<Tarif> tarifs = new ArrayList<>();
        try {

            Scanner scan = new Scanner(new File("E:\\DaftarPaket.txt"));
            while (scan.hasNextLine()) {
                Tarif tarif = new Tarif();

                String line = scan.nextLine();
                String[] data = line.split(",");
                tarif.setKotaTujuan(data[0]);
                tarifs.add(tarif);
                for (Tarif tarifTarif : tarifs) {
                    System.out.println(tarifTarif);
                }
            }
        } catch (Exception e) {
        }
        return tarifs;
    }

    public List<String> tipeLayanan() {
        tarifByKota();
        ArrayList<String> listType = new ArrayList<>();
        listType.add("Reguler");
        listType.add("Kilat");
        listType.add("SDS");
        listType.add("ONS");
        listType.add("HDS");
        return listType;
    }

    public Double tarifByTipe(String tipePaket, String kotaTujuan) {
        List<Tarif> tipeReguler = new ArrayList<>();
        Double result = null;
        try {
            Scanner scan = new Scanner(new File("E:\\DaftarPaket.txt"));
            while (scan.hasNextLine()) {
                Tarif tipePelayanan = new Tarif();
                String line = scan.next();
                String[] data = line.split(",");
                String kota = data[0];
                if (kotaTujuan.equalsIgnoreCase(kota)) {
                    if (tipePaket.equalsIgnoreCase("Reguler")) {
                        result = Double.parseDouble(data[1].trim());
                        System.out.println(Double.parseDouble(data[1].trim()));
                    } else if (tipePaket.equalsIgnoreCase("Kilat")) {
                        result = Double.parseDouble(data[2].trim());
                        System.out.println(Double.parseDouble(data[2].trim()));
                    } else if (tipePaket.equalsIgnoreCase("SDS")) {
                        result = Double.parseDouble(data[3].trim());
                        System.out.println(Double.parseDouble(data[3].trim()));
                    } else if (tipePaket.equalsIgnoreCase("ONS")) {
                        result = Double.parseDouble(data[4].trim());
                        System.out.println(Double.parseDouble(data[4].trim()));
                    } else if (tipePaket.equalsIgnoreCase("HDS")) {
                        result = Double.parseDouble(data[5].trim());
                        System.out.println(Double.parseDouble(data[5].trim()));
                    }

                }

            }

        } catch (FileNotFoundException fileErr) {
            System.out.println("aaaaaaaaaaaa");
        }

        return result;
    }
}

