/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.*;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class AppControl {
    
    FileAccess FA;

    public AppControl() {
        FA = new FileAccess();
        
    }
    
     public Boolean addMovie(String name,int nboftickets, double price) {

        ArrayList<Movie> allMovies = FA.ReadMovies();
        for (int i = 0; i < allMovies.size(); i++) {
            if (allMovies.get(i).getName().equals(name)) {
                return false;
            }
        }

        Movie m = new Movie(name,nboftickets,price);

        String str = m.toString() + "\n";
        FA.writeToFile("Movie", str);
        return true;

    }
     public Boolean addBeverages(String name,int totalquantity, double price) {

        ArrayList<Beverages> allBeverages = FA.ReadBeverages();
        for (int i = 0; i < allBeverages.size(); i++) {
            if (allBeverages.get(i).getName().equals(name)) {
                return false;
            }
        }

        Beverages b = new Beverages(name,totalquantity,price);

        String str = b.toString() + "\n";
        FA.writeToFile("Beverages", str);
        return true;

    }
     public Boolean addCustomers(String name, String pss) {

        ArrayList<Customer> allCustomers = FA.ReadCustomer();
        for (int i = 0; i < allCustomers.size(); i++) {
            if (allCustomers.get(i).getName().equals(name)) {
                return false;
            }
        }

        Customer c = new Customer(name, pss);
        String str = c.toString() + "\n";
        FA.writeToFile("Customer", str);
        return true;

    }
    public void addPurchase(ArrayList<Purchase> cart) {

        for (int i = 0; i < cart.size(); i++) {
            FA.writeToFile("Purchase", cart.get(i).toString() + "\n");
        }

    }
    public void addBeveragesPurchase(ArrayList<PurchaseBeverages> cart) {

        for (int i = 0; i < cart.size(); i++) {
            FA.writeToFile("Beverages Purchase", cart.get(i).toString() + "\n");
        }

    }
    
    public ArrayList<Movie> getMovieList() {

        return FA.ReadMovies();
        

    }
    
    public ArrayList<Beverages> getBeveragesList() {

        return FA.ReadBeverages();
        

    }
    public String getallMovies() {
        String s = "";
        ArrayList<Movie> allMovies = FA.ReadMovies();
        for (int i = 0; i < allMovies.size(); i++) {

            s += allMovies.get(i).toString() + "\n";

        }
        return s;

    }
    public String getallBeverages() {
        String s = "";
        ArrayList<Beverages> allBeverages = FA.ReadBeverages();
        for (int i = 0; i < allBeverages.size(); i++) {

            s += allBeverages.get(i).toString() + "\n";

        }
        return s;

    }
    public int getMovieTickets(String name) {

        int n = 0;
        ArrayList<Movie> allMovies = FA.ReadMovies();
        for (int i = 0; i < allMovies.size(); i++) {
            if (allMovies.get(i).getName().equals(name)) {
                n = allMovies.get(i).getNboftickets();
            }

        }
        return n;

    }
    public int getBeveragesQuantity(String name) {

        int n = 0;
        ArrayList<Beverages> allBeverages = FA.ReadBeverages();
        for (int i = 0; i < allBeverages.size(); i++) {
            if (allBeverages.get(i).getName().equals(name)) {
                n = allBeverages.get(i).getTotalquantity();
            }

        }
        return n;

    }
    public double getMoviePrice(String name) {

        double d = 0;
        ArrayList<Movie> allMovies = FA.ReadMovies();
        for (int i = 0; i < allMovies.size(); i++) {
            if (allMovies.get(i).getName().equals(name)) {
                d = allMovies.get(i).getPrice();
            }
        }
        return d;

    }
    public double getBeveragesPrice(String name) {

        double d = 0;
        ArrayList<Beverages> allBeverages = FA.ReadBeverages();
        for (int i = 0; i < allBeverages.size(); i++) {
            if (allBeverages.get(i).getName().equals(name)) {
                d = allBeverages.get(i).getPrice();
            }
        }
        return d;

    }
    
    public ArrayList<String> getMovieName() {

        ArrayList<String> out = new ArrayList();
        ArrayList<Movie> allmovies = FA.ReadMovies();
        for (int i = 0; i < allmovies.size(); i++) {
            out.add(allmovies.get(i).getName());

        }
        return out;

    }
    
    public ArrayList<String> getBeveragesName() {

        ArrayList<String> out = new ArrayList();
        ArrayList<Beverages> allBeverages = FA.ReadBeverages();
        for (int i = 0; i < allBeverages.size(); i++) {
            out.add(allBeverages.get(i).getName());

        }
        return out;

    }
    
    public void RemoveMovie (String name){
        
        int index =0;
        ArrayList<Movie> allMovies = FA.ReadMovies();
        for (int i = 0; i < allMovies.size(); i++) {
            if(allMovies.get(i).getName().equalsIgnoreCase(name)){
                
                index =i;
            }
            
        }
        allMovies.remove(index);
        
        FA.resetFile("Movie");
        for (int i = 0; i < allMovies.size(); i++){
            
            FA.writeToFile("Movie", allMovies.get(i).toString() + "\n");
            
        }
        
        
        
        
    }
    
    public void RemoveBeverages (String name){
        
        int index =0;
        ArrayList<Beverages> allBeverages = FA.ReadBeverages();
        for (int i = 0; i < allBeverages.size(); i++) {
            if(allBeverages.get(i).getName().equalsIgnoreCase(name)){
                
                index =i;
            }
            
        }
        allBeverages.remove(index);
        
        FA.resetFile("Beverages");
        for (int i = 0; i < allBeverages.size(); i++){
            
            FA.writeToFile("Beverages", allBeverages.get(i).toString() + "\n");
            
        }
        
    }
    
     public void reducetickets(ArrayList<Purchase> cart) {

        String name = "";
        int red = 0;

        ArrayList<Movie> allmovies = FA.ReadMovies();
        for (int i = 0; i < cart.size(); i++) {

            name = cart.get(i).getMovieName();
            red = cart.get(i).getmovietickets();

        }
        for (int j = 0; j < allmovies.size(); j++) {
            int q;
            if (allmovies.get(j).getName().equalsIgnoreCase(name)) {
                q = allmovies.get(j).getNboftickets();
                q = q - red;
                allmovies.get(j).setNboftickets(q);

            }
        }
        FA.resetFile("Movie");
        for (int j = 0; j < allmovies.size(); j++) {
            FA.writeToFile("Movie", allmovies.get(j).toString() + "\n");
        }

    }
      public void reducequantity(ArrayList<PurchaseBeverages> cart) {

        String name = "";
        int red = 0;

        ArrayList<Beverages> allBeverages = FA.ReadBeverages();
        for (int i = 0; i < cart.size(); i++) {

            name = cart.get(i).getBeveragesName();
            red = cart.get(i).getBeveragequantity();

        }
        for (int j = 0; j < allBeverages.size(); j++) {
            int q;
            if (allBeverages.get(j).getName().equalsIgnoreCase(name)) {
                q = allBeverages.get(j).getTotalquantity();
                q = q - red;
                allBeverages.get(j).setTotalquantity(q);

            }
        }
        FA.resetFile("Beverages");
        for (int j = 0; j < allBeverages.size(); j++) {
            FA.writeToFile("Beverages", allBeverages.get(j).toString() + "\n");
        }

    }
    
    
    public Boolean CheckCustomer(String username, String pss) {

        boolean r = false;
        ArrayList<Customer> allCustomers = FA.ReadCustomer();
        for (int i = 0; i < allCustomers.size(); i++) {

            if (allCustomers.get(i).getName().equals(username) && allCustomers.get(i).getPss().equals(pss)) {
                r = true;
            }

        }
        return r;

    }
    public int getMovieCount() {

        return FA.ReadMovies().size();
    }
    
    public String[][] getItemdata() {
        
        int row =this.getMovieCount();
        String[][] data = FA.getItemInfo(row);
        return data;

    }
    
    
        public int getBeveragesCount() {

        return FA.ReadBeverages().size();
    }
    
    public String[][] getBeveragesdata() {
        
        int row =this.getBeveragesCount();
        String[][] data = FA.getBeveragesInfo(row);
        return data;

    }
    
    
}
