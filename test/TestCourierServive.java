/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Dao.DaoTarif;
import courierservice.model.Tarif;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class TestCourierServive {

    public TestCourierServive() {
    }

    @Test
    public void testResultBiaya() {
        DaoTarif df = new DaoTarif();
        double hasil = df.resultBiaya(3, 1000);
        double expect = 3000;
        assertEquals(expect, hasil, 0);
    }

    @Test
    public void testResultBiayaWithAsuransi() {
        DaoTarif df = new DaoTarif();
        double hasil2 = df.resultBiayaWithAsuransi(100000);
        double expect = 300;
        assertEquals(expect, hasil2, 0.05);
    }

    @Test
    public void testHasilAkhirWithAsuransi() {
        DaoTarif df = new DaoTarif();
        double hasil3 = df.hasilAkhirWithAsuransi(100000, 300);
        double expect = 100300;
        assertEquals(expect, hasil3, 0.05);
    }

    @Test
    public void testTarifByKota() throws FileNotFoundException {
        DaoTarif df = new DaoTarif();

        List<Tarif> tarifs = new ArrayList<>();
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
        Tarif hasil = tarifs.get(4);
        String h = (String.valueOf(hasil));
        String expect = "semarang";
        assertEquals(expect, h);

    }

    public void testTarifByTipe(String tipePaket, String kotaTujuan) throws FileNotFoundException {
        DaoTarif df = new DaoTarif();

        List<Tarif> tipeReguler = new ArrayList<>();
        Double result = null;
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
        
    //    Tarif hasil = tipePaket. ;
    //    int h = (String.valueOf(hasil));
    //    int expect = 23467;
    //    assertEquals(expect, hasil);

    }
}