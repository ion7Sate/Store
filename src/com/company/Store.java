package com.company;

public class Store {
    private String name;
    private String address;
    private int nrProducts;
    private String feedback;

    Store(String name, String address, int nrProducts, String feedback) {
        this.name = name;
        this.address = address;
        this.nrProducts = nrProducts;
        this.feedback = feedback;
    }

public String getName(){
        return this.name;
}

public String getAddress(){
        return this.address;
}

public int getNrProducts(){
        return this.nrProducts;
}

public String getFeedback(){
        return this.feedback;
}

public void setName(String Name){
        this.name = name;
}

public void setAddress(String address){
        this.address = address;
}

public void setNrProducts(int nrProducts){
        this.nrProducts = nrProducts;
}

public void setFeedback(String feedback){
        this.feedback = feedback;
}


}

