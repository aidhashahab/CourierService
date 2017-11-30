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

            Scanner scan = new Scanner(new File("C:\\Users\\user\\Documents\\DaftarPaket.txt"));
            while (scan.hasNextLine()) {
                Tarif tarif = new Tarif();

                String line = scan.nextLine();
                String[] data = line.split(",");

                tarif.setKotaTujuan(data[0]);

                tarif.setReguler(Double.parseDouble(data[1]));
                tarif.setKilat(Double.parseDouble(data[2]));
                tarif.setSds(Double.parseDouble(data[3]));
                tarif.setOns(Double.parseDouble(data[4]));
                tarif.setHds(Double.parseDouble(data[5]));

                tarifs.add(tarif);
                for (Tarif tarifTarif : tarifs) {
                    System.out.println(tarifTarif);

                }
            }

        } catch (Exception e) {
        }

        return tarifs;
    }

}
