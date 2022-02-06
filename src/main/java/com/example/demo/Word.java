package com.example.demo;

public class Word {
    private String value;
    public Word(){

    }
    public Word(String value){
        super();
        this.value = value;
    }
    public String getValue(){
        return value;
    }

    public void setValue(String value){
        this.value = value;
    }
    
    @Override
    public String toString(){
        return this.getValue();
    }
}
