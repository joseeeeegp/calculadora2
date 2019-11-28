package com.example.calculadora2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    boolean decimal = false;
    boolean sum = false;
    boolean rest = false;
    boolean div = false;
    boolean mul = false;

    Double[] numero = new Double[20];
    Double dato;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button num0 = (Button) findViewById(R.id.cero);
        num0.setOnClickListener(this);
        Button num1 = (Button) findViewById(R.id.uno);
        num1.setOnClickListener(this);
        Button num2 = (Button) findViewById(R.id.dos);
        num2.setOnClickListener(this);
        Button num3 = (Button) findViewById(R.id.tres);
        num3.setOnClickListener(this);
        Button num4 = (Button) findViewById(R.id.cuatro);
        num4.setOnClickListener(this);
        Button num5 = (Button) findViewById(R.id.cinco);
        num5.setOnClickListener(this);
        Button num6 = (Button) findViewById(R.id.seis);
        num6.setOnClickListener(this);
        Button num7 = (Button) findViewById(R.id.siete);
        num7.setOnClickListener(this);
        Button num8 = (Button) findViewById(R.id.ocho);
        num8.setOnClickListener(this);
        Button num9 = (Button) findViewById(R.id.nuevve);
        num9.setOnClickListener(this);
        Button npunto = (Button) findViewById(R.id.punto);
        npunto.setOnClickListener(this);
        Button nigual = (Button) findViewById(R.id.igual);
        nigual.setOnClickListener(this);
        Button ndiv = (Button) findViewById(R.id.dividir);
        ndiv.setOnClickListener(this);
        Button nmul = (Button) findViewById(R.id.multiplicar);
        nmul.setOnClickListener(this);
        Button nsum = (Button) findViewById(R.id.sumar);
        nsum.setOnClickListener(this);
        Button nrestar = (Button) findViewById(R.id.restar);
        nrestar.setOnClickListener(this);
        Button nborrar = (Button) findViewById(R.id.reset);
        nborrar.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        TextView screen = (TextView) findViewById(R.id.textView);
        int selector = v.getId();
        String x = screen.getText().toString();
        try {
            switch (selector) {
                case R.id.cero:

                    screen.setText(x + "0");
                    break;

                case R.id.uno:

                    screen.setText(x + "1");
                    break;
                case R.id.dos:

                    screen.setText(x + "2");
                    break;

                case R.id.tres:

                    screen.setText(x + "3");
                    break;

                case R.id.cuatro:

                    screen.setText(x + "4");
                    break;
                case R.id.cinco:

                    screen.setText(x + "5");
                    break;

                case R.id.seis:

                    screen.setText(x + "6");
                    break;
                case R.id.siete:

                    screen.setText(x + "7");
                    break;

                case R.id.ocho:

                    screen.setText(x + "8");
                    break;

                case R.id.nuevve:

                    screen.setText(x + "9");
                    break;

                case R.id.punto:
                    if (decimal == false) {
                        screen.setText(x + ".");
                        decimal = true;
                    } else {
                        return;

                    }

                    screen.setText(x + ".");
                    break;

                case R.id.dividir:
                    div = true;
                    numero[0] = Double.parseDouble(x);
                    screen.setText("");
                    decimal = false;
                    break;

                case R.id.multiplicar:
                    mul = true;
                    numero[0] = Double.parseDouble(x);
                    screen.setText("");
                    decimal = false;
                    break;

                case R.id.sumar:

                    sum = true;
                    numero[0] = Double.parseDouble(x);
                    screen.setText("");
                    decimal = false;
                    break;

                case R.id.restar:
                    rest = true;
                    numero[0] = Double.parseDouble(x);
                    screen.setText("");
                    decimal = false;
                    break;

                case R.id.igual:
                    numero[1] = Double.parseDouble(x);
                    if (sum == true) {
                        dato = numero[0] + numero[1];
                        screen.setText(String.valueOf(dato));
                    } else if (rest == true) {
                        dato = numero[0] - numero[1];
                        screen.setText(String.valueOf(dato));

                    } else if (mul == true) {
                        dato = numero[0] * numero[1];
                        screen.setText(String.valueOf(dato));
                    } else if (div == true) {
                        dato = numero[0] / numero[1];
                        screen.setText(String.valueOf(dato));
                    }
                    decimal = false;
                    sum = false;
                    rest = false;
                    div = false;
                    mul = false;
                    break;

                case R.id.reset:

                    screen.setText("");
                    decimal = false;
                    break;


            }

        } catch (Exception e) {
            screen.setText("ERROR");
        }
    }
}
