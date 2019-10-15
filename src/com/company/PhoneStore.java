package com.company;

public class PhoneStore extends Store {
    private String brandName;
    private String model;
    private int rom;
    private int ram;
    private int rearCamera;
    private int frontCamera;
    private float price;


    PhoneStore(String name, String address, int nrProducts, String feedback, String brandName, String model, int rom, int ram, int rearCamera, int frontCamera, float price) {
     super(name,address,nrProducts,feedback);
     this.brandName = brandName;
     this.model = model;
     this.rom = rom;
     this.ram = ram;
     this.rearCamera = rearCamera;
     this.frontCamera = frontCamera;
     this.price = price;
    }

    public String getBrandName(){
        return this.brandName;
    }

    public String getModel(){
        return this.model;
    }

    public int getRom(){
        return this.rom;
    }

    public int getRam(){
        return this.ram;
    }

    public int getRearCamera() {
        return rearCamera;
    }

    public int getFrontCamera(){
        return this.frontCamera;
    }

    public float getPrice(){
        return this.price;
    }
    public void setBrandName(String brandName){
        this.brandName = brandName;
    }

    public void setModel(String model){
        this.model = model;
    }
    public void setRom(int rom){
        this.rom = rom;
    }

    public void setRam( int ram){
        this.ram = ram;
    }

    public void setRearCamera(int rearCamera){
        this.rearCamera = rearCamera;
    }

    public void setFrontCamera(int frontCamera){
        this.frontCamera = frontCamera;
    }

    public void setPrice(float price){
        this.price = price;
    }
    public String toString(){
        return "Telefonul "+brandName+" "+model+
                " cu RAM-ul de "+ram+" Gb ROM-ul  "+
                 rom+" Gb "+" ,camera frontala: "+
                frontCamera+" MP si cea din spate de "+
                rearCamera+" MP"+ " poate fi procurat de la "+
                getName()+" la adresa:  "+getAddress()+
                " la pretul de "+price+" MDL "+ " aici gasiti peste "+
                getNrProducts()+ " de produse"+
                " ,magazinul avand feedback-ul: "+ getFeedback();

    }

}