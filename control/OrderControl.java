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
public class OrderControl {
    
    ArrayList<Purchase> cart;
    Customer activeCustomer;
    AppControl controller;
    ArrayList<PurchaseBeverages> cart2;

    public OrderControl() {
        
        cart = new ArrayList();
        cart2 = new ArrayList();
        controller = new AppControl();
    }
    
    public ArrayList<Purchase> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Purchase> cart) {
        this.cart = cart;
    }

    public ArrayList<PurchaseBeverages> getCart2() {
        return cart2;
    }

    public void setCart2(ArrayList<PurchaseBeverages> cart2) {
        this.cart2 = cart2;
    }
    
    

    public Customer getActiveCustomer() {
        return activeCustomer;
    }

    public void setActiveCustomer(Customer activeCustomer) {
        this.activeCustomer = activeCustomer;
    }
    
    public void addtocart(String name, int quantity,String customer){
        
        Purchase p =new Purchase(name,customer,quantity);
        cart.add(p);
        
        
    }
    public void addtocart2(String name, int quantity,String customer){
        
        PurchaseBeverages PB =new PurchaseBeverages(name,customer,quantity);
        cart2.add(PB);
        
        
    }
    
    public void removefromcart(String name){
        
        for(int i=0;i<cart.size();i++){
            
            if(cart.get(i).getMovieName().equals(name)){
                cart.remove(i);
            }
            
        }
        
    }
    
    
    public void removefromcart2(String name){
        
        for(int i=0;i<cart2.size();i++){
            
            if(cart2.get(i).getBeveragesName().equals(name)){
                cart2.remove(i);
            }
            
        }
        
    }
    
    public int countmovies(){
        
        int count = 0;
        
        for(int i=0;i<cart.size();i++){
            
            count+= cart.get(i).getmovietickets();
        }
        
        return count;
        
        
    }
    public int countBeverages(){
        
        int count = 0;
        
        for(int i=0;i<cart2.size();i++){
            
            count+= cart2.get(i).getBeveragequantity();
        }
        
        return count;
        
        
    }
    
    public void emptycart(){
        
        cart.removeAll(cart);
        
    }
    public void emptycart2(){
        
        cart2.removeAll(cart2);
        
    }
    
    public double estimateprice(){
        
        double sum=0;
        for(int i=0;i<cart.size();i++){
            
            String name = cart.get(i).getMovieName();
            double price = controller.getMoviePrice(name);
            int qt = cart.get(i).getmovietickets();
            sum+= price*qt;
            
            
            
        }
        return sum;
        
    }
    public double estimateBeveragesprice(){
        
        double sum=0;
        for(int i=0;i<cart2.size();i++){
            
            String name = cart2.get(i).getBeveragesName();
            double price = controller.getBeveragesPrice(name);
            int qt = cart2.get(i).getBeveragequantity();
            sum+= price*qt;
            
            
            
        }
        return sum;
        
    }
    
    public String printcart(){
        
        String str ="";
        for(int i=0;i<cart.size();i++){
            
            str+= cart.get(i).getMovieName()+ "\t"+cart.get(i).getmovietickets()+"\t";
            str+= controller.getMoviePrice(cart.get(i).getMovieName());
            str+="\n";
                   
            
        }
        
        return str;
        
    }
    public String printcart2(){
        
        String str ="";
        for(int i=0;i<cart2.size();i++){
            
            str+= cart2.get(i).getBeveragesName()+ "\t"+cart2.get(i).getBeveragequantity()+"\t";
            str+= controller.getBeveragesPrice(cart2.get(i).getBeveragesName());
            str+="\n";
                   
            
        }
        
        return str;
        
    }
    
    
}

