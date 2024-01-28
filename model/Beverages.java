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
public class Beverages {
    
    String name;
    int totalquantity;
    double price;

    public Beverages(String name, int totalquantity, double price) {
        this.name = name;
        this.totalquantity = totalquantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalquantity() {
        return totalquantity;
    }

    public void setTotalquantity(int totalquantity) {
        this.totalquantity = totalquantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        
        String str="";
        str+= name + "\t";
        str+= totalquantity + "\t";
        str+= price + "\t";
        return str;
        
        
    }
    
}
