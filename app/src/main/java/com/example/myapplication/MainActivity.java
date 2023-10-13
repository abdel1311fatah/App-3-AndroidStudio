//Abel Ibarra

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n = (EditText) findViewById(R.id.n);
        n.setText("0");
    }

    public void sumar(View dibuix) {

        n.clearComposingText();

        String valor1 = n.getText().toString();

        try {
            long n1 = Long.parseLong(valor1);
            n1++;
            String resultat_suma = String.valueOf(n1);
            n.setText(resultat_suma);
        } catch (NumberFormatException e) { // Per si fiques caracters no valids, en aquest cas deixar en blanc
            n.setHint("Introdueix un numero valid"); // fiquem un setHint en lloc de un setText per que si no el programa pille letres
        }
    }

    public void restar(View dibuix) {

        n.clearComposingText();

        String valor1 = n.getText().toString();

        try {
            long n1 = Long.parseLong(valor1);
            n1--;
            String resultat_suma = String.valueOf(n1);
            n.setText(resultat_suma);
        } catch (NumberFormatException e) { // Per si fiques caracters no valids, en aquest cas deixar en blanc
            n.setHint("Introdueix un numero valid"); // fiquem un setHint en lloc de un setText per que si no el programa pille letres
        }
    }

    public void reset(View dibuix){

        n.setText("0");

    }

}