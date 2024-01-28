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
public class PurchaseBeverages {
    
    String BeveragesName;
    String customerName;
    int Beveragequantity;

    public PurchaseBeverages(String BeveragesName, String customerName, int Beveragequantity) {
        this.BeveragesName = BeveragesName;
        this.customerName = customerName;
        this.Beveragequantity = Beveragequantity;
    }

    public String getBeveragesName() {
        return BeveragesName;
    }

    public void setBeveragesName(String BeveragesName) {
        this.BeveragesName = BeveragesName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getBeveragequantity() {
        return Beveragequantity;
    }

    public void setBeveragequantity(int Beveragequantity) {
        this.Beveragequantity = Beveragequantity;
    }

    @Override
    public String toString() {
        
        String str =this.BeveragesName+"\t";
        str +=this.customerName+"\t";
        str+=this.Beveragequantity+"\t";
        
        return str;
    }
    
}
