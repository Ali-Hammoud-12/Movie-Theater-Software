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
public class Purchase {
    
    String movieName;
    String customerName;
    int movietickets;

    public Purchase(String movieName, String customerName, int movietickets) {
        this.movieName = movieName;
        this.customerName = customerName;
        this.movietickets = movietickets;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getmovietickets() {
        return movietickets;
    }

    public void setmovietickets(int movietickets) {
        this.movietickets = movietickets;
    }

    @Override
    public String toString() {
        
        String str =this.movieName+"\t";
        str +=this.customerName+"\t";
        str+=this.movietickets+"\t";
        
        return str;
    }
    
    
    
    
}
