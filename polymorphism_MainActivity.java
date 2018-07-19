package com.example.deniz.polymorphism;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtAnimal = (TextView) findViewById(R.id.txtAnimal);
        TextView txtLion = (TextView) findViewById(R.id.txtLion);
        TextView txtPolyLion = (TextView) findViewById(R.id.txtPolyLion);
        TextView txtPolyCat = (TextView) findViewById(R.id.txtPolyCat);

        Animal animal = new Animal("Bear", "Black", 200, 300);
        Lion lion = new Lion("myLion", "yellow", 400, 700, true, 170);

        txtAnimal.setText(animal.toString());
        txtLion.setText(lion.toString());

        Animal myAnimal = lion;
        txtPolyLion.setText(myAnimal.toString());

        Cat myCat = new Cat("My Cat", "White", 400, 700);

        Animal myAnimal2 = myCat;
        txtPolyCat.setText(myAnimal2.toString());

    }
}
