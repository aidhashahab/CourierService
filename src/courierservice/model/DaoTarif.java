/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courierservice.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class DaoTarif {
  

    public List<Tarif> tarifByKota() {

        List<Tarif> tarifs = new ArrayList<>();
        try {

            Scanner scan = new Scanner(new File("D:\\BOOTCAMP\\DaftarPaket.txt"));
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

    
    public List<Tarif> tarifByTipe(){
        List<Tarif> tipeReguler = new ArrayList<>();
        try {
            Scanner scan = new Scanner (new File("D:\\BOOTCAMP\\DaftarPaket.txt"));
            while(scan.hasNextLine()){
            Tarif tipePelayanan = new Tarif();
            String line = scan.next();
            String[] data = line.split(",");
            tipePelayanan.setReguler(Double.parseDouble(data[1]));
            tipePelayanan.setKilat(Double.parseDouble(data[2]));
            tipePelayanan.setSds(Double.parseDouble(data[3]));
            tipePelayanan.setOns(Double.parseDouble(data[4]));
            tipePelayanan.setHds(Double.parseDouble(data[5]));
            }
            
        } catch (Exception e) {
        }
        
        return tipeReguler;
    }
    
}
