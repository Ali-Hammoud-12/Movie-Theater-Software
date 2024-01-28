/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Beverages;
import Model.Customer;
import Model.Movie;
import Model.Purchase;
import Model.PurchaseBeverages;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class FileAccess {

    public void writeToFile(String fileName, String str) {
        try {
            FileWriter stdinf = new FileWriter(fileName + ".txt", true);
            stdinf.write(str);
            stdinf.close();
        } catch (IOException ioe) {
        }
    }

    public ArrayList<Customer> ReadCustomer() {

        ArrayList allCustomers = new ArrayList();
        String line;
        String custinfo[];

        try {
            FileInputStream fs = new FileInputStream("Customer.txt");
            InputStreamReader ir = new InputStreamReader(fs);
            BufferedReader in = new BufferedReader(ir);

            while (in.ready()) {
                line = in.readLine();
                custinfo = line.split("\t");
                Customer s = new Customer(custinfo[0], custinfo[1]);
                allCustomers.add(s);
            }
            in.close();

        } catch (IOException e) {
        }
        return allCustomers;
    }

    public ArrayList<Purchase> ReadPurchase() {

        ArrayList allPurchase = new ArrayList();
        String line;
        String purinfo[];

        try {
            FileInputStream fs = new FileInputStream("Purchase.txt");
            InputStreamReader ir = new InputStreamReader(fs);
            BufferedReader in = new BufferedReader(ir);

            while (in.ready()) {
                line = in.readLine();
                purinfo = line.split("\t");
                Purchase P = new Purchase(purinfo[0], purinfo[1], Integer.parseInt(purinfo[2]));
                allPurchase.add(P);
            }
            in.close();

        } catch (IOException e) {
        }
        return allPurchase;
    }
    
    public ArrayList<PurchaseBeverages> ReadPurchaseBeverages() {

        ArrayList allBeveragesPurchase = new ArrayList();
        String line;
        String purinfo[];

        try {
            FileInputStream fs = new FileInputStream("Beverages Purchase.txt");
            InputStreamReader ir = new InputStreamReader(fs);
            BufferedReader in = new BufferedReader(ir);

            while (in.ready()) {
                line = in.readLine();
                purinfo = line.split("\t");
                Purchase P = new Purchase(purinfo[0], purinfo[1], Integer.parseInt(purinfo[2]));
                allBeveragesPurchase.add(P);
            }
            in.close();

        } catch (IOException e) {
        }
        return allBeveragesPurchase;
    }

    public ArrayList<Movie> ReadMovies() {

        ArrayList allMovies = new ArrayList();
        String line;
        String movieinfo[];

        try {
            FileInputStream fs = new FileInputStream("Movie.txt");
            InputStreamReader ir = new InputStreamReader(fs);
            BufferedReader in = new BufferedReader(ir);

            while (in.ready()) {
                line = in.readLine();
                movieinfo = line.split("\t");
                Movie M = new Movie(movieinfo[0], Integer.parseInt(movieinfo[1]), Double.parseDouble(movieinfo[2]));
                allMovies.add(M);
            }
            in.close();

        } catch (IOException e) {
        }
        return allMovies;
    }

    public ArrayList<Beverages> ReadBeverages() {

        ArrayList allBeverages = new ArrayList();
        String line;
        String Beveragesinfo[];

        try {
            FileInputStream fs = new FileInputStream("Beverages.txt");
            InputStreamReader ir = new InputStreamReader(fs);
            BufferedReader in = new BufferedReader(ir);

            while (in.ready()) {
                line = in.readLine();
                Beveragesinfo = line.split("\t");
                Beverages B = new Beverages(Beveragesinfo[0], Integer.parseInt(Beveragesinfo[1]), Double.parseDouble(Beveragesinfo[2]));
                allBeverages.add(B);
            }
            in.close();

        } catch (IOException e) {
        }
        return allBeverages;
    }

    public void resetFile(String filename) {

        try {

            FileWriter stdinf = new FileWriter(filename + ".txt", false);

        } catch (IOException ex) {
        }

    }

    public String[][] getItemInfo(int rowCount) {

        String[][] data = new String[rowCount][4];
        String cinfo[];
        String line = "";
        int row = 0;

        try {

            FileInputStream fStream = new FileInputStream("Movie.txt");
            InputStreamReader ir = new InputStreamReader(fStream);
            BufferedReader in = new BufferedReader(new InputStreamReader(fStream));

            while (in.ready()) {

                line = in.readLine();
                cinfo = line.split("\t");
                data[row][0] = cinfo[0];
                data[row][1] = cinfo[1];
                data[row][2] = cinfo[2];

                if (cinfo[1].equals("0")) {

                    data[row][3] = "Out of Stock";
                    data[row][2] = "-";
                    data[row][1] = "-";

                }
                row++;

            }

            in.close();

        } catch (IOException e) {

            System.out.println("File input error");

        }

        return data;

    }
    
    public String[][] getBeveragesInfo(int rowCount) {

        String[][] data = new String[rowCount][4];
        String cinfo[];
        String line = "";
        int row = 0;

        try {

            FileInputStream fStream = new FileInputStream("Beverages.txt");
            InputStreamReader ir = new InputStreamReader(fStream);
            BufferedReader in = new BufferedReader(new InputStreamReader(fStream));

            while (in.ready()) {

                line = in.readLine();
                cinfo = line.split("\t");
                data[row][0] = cinfo[0];
                data[row][1] = cinfo[1];
                data[row][2] = cinfo[2];

                if (cinfo[1].equals("0")) {

                    data[row][3] = "Out of Stock";
                    data[row][2] = "-";
                    data[row][1] = "-";

                }
                row++;

            }

            in.close();

        } catch (IOException e) {

            System.out.println("File input error");

        }

        return data;

    }

}
