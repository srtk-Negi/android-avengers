package edu.utsa.cs3443.jgj891_lab3.model;

/**
 * A class that represents a Person
 *
 * @author Sarthak Negi (jgj891)
 * UTSA CS 3443 - Lab 2
 * Spring 2023
 */
public abstract class Person {
    private String personName;
    private int personHeightFT;
    private int personHeightIN;
    private double personWeight;

    /**
     * Constructor that calls the functions to initialize the values of the Person object
     *
     * @param personName
     * @param personHeightFT
     * @param personHeightIN
     * @param personWeight
     */
    public Person(String personName, int personHeightFT, int personHeightIN, double personWeight){
        setPersonName(personName);
        setPersonHeightFT(personHeightFT);
        setPersonHeightIN(personHeightIN);
        setPersonWeight(personWeight);
    }

    /**
     * sets the name
     *
     * @param name
     */
    private void setPersonName(String name){
        this.personName = name;
    }

    /**
     * sets the height in feat
     * @param height
     */
    private void setPersonHeightFT(int height){
        this.personHeightFT = height;
    }

    /**
     * sets the height in Inches
     * @param height
     */
    private void setPersonHeightIN(int height){
        this.personHeightIN = height;
    }

    /**
     * sets the weight of the person
     * @param weight
     */
    private void setPersonWeight(double weight){
        this.personWeight = weight;
    }

    /**
     * gets the person's name
     * @return personName
     */
    public String getPersonName(){
        return(this.personName);
    }

    /**
     * gets the person's height in Feat
     * @return personHeightFT
     */
    public int getPersonHeightFT(){
        return(this.personHeightFT);
    }

    /**
     * gets the person's height in Inches
     * @return personHeightIN
     *
     */
    public int getPersonHeightIN(){
        return(this.personHeightIN);
    }

    /**
     * gets the person's weight
     * @return personWeight
     *
     */
    public double getPersonWeight(){
        return(this.personWeight);
    }

    /**
     *
     * @return string representation of the person object
     */
    public String toString(){
        return(getPersonName()+","+getPersonHeightFT()+","+getPersonHeightIN()+","+getPersonWeight());
    }
}
