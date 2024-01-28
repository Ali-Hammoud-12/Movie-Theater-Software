/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author user
 */
public class Movie {
    
    String name;
    int nboftickets;
    double price;

    public Movie(String name, int nboftickets, double price) {
        this.name = name;
        this.nboftickets = nboftickets;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getNboftickets() {
        return nboftickets;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNboftickets(int nboftickets) {
        this.nboftickets = nboftickets;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        String str =this.name+"\t";
        str +=this.nboftickets+"\t";
        str+=this.price;
        
        return str;
    }
    
    
    
}
