package edu.utsa.cs3443.jgj891_lab3.model;

/**
 * A class that represents an Avenger object
 *
 * @author Sarthak Negi (jgj891)
 * UTSA CS 3443 - Lab 2
 * Spring 2023
 */
public class Avenger extends Person{
    private String alias;
    private String currentLocation;
    private boolean hasPower;
    private String gender;

    /**
     * Constructor that calls the functions to initialize the values of Avenger and Person object
     * @param personName
     * @param alias
     * @param gender
     * @param personHeightFT
     * @param personHeightIN
     * @param personWeight
     * @param power
     * @param location
     */
    public Avenger(String personName, String alias, String gender, int personHeightFT, int personHeightIN, double personWeight, String power, String location){
        super(personName, personHeightFT, personHeightIN, personWeight);
        setAlias(alias);
        setCurrentLocation(location);
        setHasPower(power);
        setGender(gender);
    }

    /**
     * sets the value of alias
     * @param alias
     */
    private void setAlias(String alias){
        this.alias = alias;
    }

    /**
     * sets the value of gender
     * @param gender
     */
    private void setGender(String gender){
        this.gender = gender;
    }

    /**
     * sets the value of currentLocation
     * @param currentLocation
     */
    private void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    /**
     * sets the value of hasPower
     * @param power
     */
    private void setHasPower(String power) {
        if (power.equals("T"))
            this.hasPower = true;
        else
            this.hasPower = false;
    }

    /**
     * gets the value of alias
     * @return alias
     */
    public String getAlias(){
        return (this.alias);
    }

    /**
     * gets the value of currentLocation
     * @return currentLocation
     */
    public String getCurrentLocation() {
        return (this.currentLocation);
    }

    /**
     * gets the value of hasPower
     * @return hasPower
     */
    public boolean getHasPower(){
        return(this.hasPower);
    }

    /**
     * gets the value of gender
     * @return gender
     */
    private String getGender(){
        return(this.gender);
    }

    /**
     *
     * @return string representation of the Avenger object
     */
    public String toString(){
        return(this.getPersonName()+","+this.getGender()+","+this.getPersonHeightFT()+","+this.getPersonHeightIN()+","+this.getPersonWeight()+","+this.getAlias()+","+this.getCurrentLocation()+","+this.getHasPower());
    }
}