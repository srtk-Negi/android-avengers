package edu.utsa.cs3443.jgj891_lab3.model;

import android.content.res.AssetManager;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import edu.utsa.cs3443.jgj891_lab3.MainActivity;

/**
 * A class that contains the list of all the Avengers and the function to read the data from the data file
 *
 * @author Sarthak Negi (jgj891)
 * UTSA CS 3443 - Lab 2
 * Spring 2023
 */
public class Team {
    private ArrayList<Avenger> avengersList = new ArrayList<>();
    private MainActivity MA;
    private String fileName;
    public Team(MainActivity MA, String fileName) {
        setMA(MA);
        setFileName(fileName);
    }

    /**
     * sets the valueof the MainActivity object
     * @param MA
     */
    private void setMA(MainActivity MA){
        this.MA = MA;
    }

    /**
     * sets the value of fileName
     * @param fileName
     */
    private void setFileName(String fileName){
        this.fileName = fileName;
    }

    /**
     * gets the value of the MainActivity object
     * @return MA
     */
    public MainActivity getMA(){
        return(this.MA);
    }

    /**
     * gets the name of the file
     * @return fileName
     */
    public String getFileName(){
        return(this.fileName);
    }

    /**
     *
     * @return string representation of the Team
     */
    public String toString(){
        return(this.getMA()+","+getFileName());
    }

    /**
     * reads the Avengers data from the data file and adds the Avengers to the avengersList
     * @throws IOException
     */
    public void loadAvengers() throws IOException {
        AssetManager am = MA.getAssets();
        InputStream IS = am.open(this.getFileName());
        Scanner sc = new Scanner(IS);

        while(sc.hasNext()){
            String[] line = sc.nextLine().split(",");
            Avenger av = new Avenger(line[0],line[1],line[2],Integer.parseInt(line[3]),Integer.parseInt(line[4]),Double.parseDouble(line[5]),line[6],line[7]);
            avengersList.add(av);
        }
    }

    /**
     * checks and returns the Avenger object whose button was clicked
     *
     * @param alias
     * @return Avenger
     */
    public Avenger getAvenger(String alias) {
        for(Avenger Av: avengersList){
            System.out.println(Av);
            if(Av.getAlias().equals(alias)){
                return(Av);
            }
        }
        return(null);
    }
}
