package edu.utsa.cs3443.jgj891_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import edu.utsa.cs3443.jgj891_lab3.controller.AvengersController;

/**
 * A class that is launched when the application is run.
 * Creates an AvengersController and connects each button on the GUI to the controller.
 *
 * @author Sarthak Negi (jgj891)
 * UTSA CS 3443 - Lab 2
 * Spring 2023
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AvengersController AVController = new AvengersController("data.csv",this);

        Button blackPanther = findViewById(R.id.blackPanther);
        Button blackWidow = findViewById(R.id.blackWidow);
        Button hawkEye = findViewById(R.id.hawkEye);
        Button hulk = findViewById(R.id.hulk);
        Button ironMan = findViewById(R.id.ironMan);
        Button doctorStrange = findViewById(R.id.doctorStrange);

        blackPanther.setOnClickListener(AVController);
        blackWidow.setOnClickListener(AVController);
        hawkEye.setOnClickListener(AVController);
        hulk.setOnClickListener(AVController);
        ironMan.setOnClickListener(AVController);
        doctorStrange.setOnClickListener(AVController);
    }
}