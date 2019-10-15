package com.company;

public class TvStore extends Store {
    private String brand;
    private String resolution;
    private boolean smartTV;
    private float screenSize;

    TvStore(String name, String address, int nrProducts, String feedback,String brand,String resolution,float screenSize){
        super(name,address,nrProducts,feedback);
        this.brand = brand;
        this.resolution = resolution;
        this.screenSize = screenSize;
    }
    
    public String getBrand(){
        return this.brand;
    }
    
    public String getResolution(){
        return this.resolution;
    }

    public float getScreenSize(){
        return this.screenSize;
    }
    
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    public void setResolution(String resolution){
         this.resolution = resolution;
    }

    public void setScreenSize(float screenSize){
        this.screenSize = screenSize;
    }
    public String toString(){
        return "Tv-ul"+brand+ " cu marimea de "+screenSize+
                " inch "+ "rezolutia "+resolution+
                " poate fi procurat de la "+
                getName()+" la adresa:  "+getAddress()+
                " aici gasiti peste "+getNrProducts()+
                " de produse"+" ,magazinul avand feedback-ul: "+
                getFeedback();

    }
    
}
