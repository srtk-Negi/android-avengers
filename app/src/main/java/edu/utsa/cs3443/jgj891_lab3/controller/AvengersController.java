package edu.utsa.cs3443.jgj891_lab3.controller;

import android.view.View;
import android.widget.Toast;


import java.io.IOException;

import edu.utsa.cs3443.jgj891_lab3.MainActivity;
import edu.utsa.cs3443.jgj891_lab3.R;
import edu.utsa.cs3443.jgj891_lab3.model.Avenger;
import edu.utsa.cs3443.jgj891_lab3.model.Team;

/**
 * A class that connects each button on the GUI with the Controller.
 *
 * @author Sarthak Negi (jgj891)
 * UTSA CS 3443 - Lab 2
 * Spring 2023
 *
 */
public class AvengersController implements View.OnClickListener {
    private String fileName;
    private MainActivity MA;

    /**
     * constructor that calls the functions to initialize fileName and MA
     *
     * @param fileName
     * @param MA
     *
     */
    public AvengersController(String fileName, MainActivity MA) {
        setFileName(fileName);
        setMA(MA);
    }

    /**
     * sets the name of the file
     *
     * @param fileName
     *
     */
    private void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * sets the value of the MainActivity object
     *
     * @param MA
     */
    private void setMA(MainActivity MA) {
        this.MA = MA;
    }

    /**
     * gets the name of the file
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * gets the value of the MainActivity object
     * @return MA
     */
    public MainActivity getMA() {
        return this.MA;
    }

    /**
     *
     * @return string representation of the AvengersController
     */
    public String toString(){
        return (this.getFileName()+","+this.getMA());
    }

    /**
     * Prints the location of the Avenger in the form of a toast whose button has been clicked
     * @param view
     */
    public void onClick(View view) {
        Team team = new Team(MA, fileName);
        try {
            team.loadAvengers();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String avAlias = getAliasOfAvenger(view.getId());
        Avenger Av = team.getAvenger(avAlias);
        Toast t = Toast.makeText(view.getContext(), Av.getCurrentLocation(), Toast.LENGTH_SHORT);
        t.show();
    }

    /**
     * Compares the ID of the button that is clicked to the ID's of the elements and returns the alias of that particular element
     * @param ID
     * @return alias
     */
    public String getAliasOfAvenger(int ID) {
        String alias = "";
        if (ID == R.id.blackPanther) {
            alias = "Black Panther";
        } else if (ID == R.id.blackWidow) {
            alias = "Black Widow";
        } else if (ID == R.id.hulk) {
            alias = "Hulk";
        } else if (ID == R.id.doctorStrange) {
            alias = "Doctor Strange";
        } else if (ID == R.id.hawkEye) {
            alias = "Hawkeye";
        } else if (ID == R.id.ironMan) {
            alias = "Iron Man";
        }
        return (alias);
    }
}


