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
public class Customer {
    
    private String name;
    private String pss;

    public Customer(String name, String pss) {
        this.name = name;
        this.pss = pss;
    }

    public String getName() {
        return name;
    }

    public String getPss() {
        return pss;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPss(String pss) {
        this.pss = pss;
    }

    @Override
    public String toString() {
        
        String str =this.name +"\t";
        str+= this.pss;
        return str;
        
    }
    
    
    
    
    
}
