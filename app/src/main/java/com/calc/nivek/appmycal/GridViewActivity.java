package com.calc.nivek.appmycal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

import com.calc.nivek.appmycal.Com.calc.nivek.appmycal.pojos.Calculadora;

public class GridViewActivity extends AppCompatActivity {
    TextView textView;
    GridView gridView;
     float num1,num2;
    String strVacio="";
    static final String[] numbers = new String[]{
            "CE", "C", "DEL", "/",
            "7", "8", "9", "x",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            " ", "0", ".", "="};
    String strOpe="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        gridView = (GridView) findViewById(R.id.gridViewCustom);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, numbers);
        textView=(TextView) findViewById(R.id.textView);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                    String StrValselect= ((TextView) v).getText().toString();
                    String Stractual=textView.getText().toString();
                switch(StrValselect) {
                    case "1":
                        textView.setText(Stractual+StrValselect);
                        break;
                    case "2":
                        textView.setText(Stractual+StrValselect);
                        break;
                    case "3":
                        textView.setText(Stractual+StrValselect);
                        break;
                    case "4":
                        textView.setText(Stractual+StrValselect);
                        break;
                    case "5":
                         textView.setText(Stractual+StrValselect);
                        break;
                    case "6":
                        textView.setText(Stractual+StrValselect);
                        break;
                    case "7":
                        textView.setText(Stractual+StrValselect);
                        break;
                    case "8":
                        textView.setText(Stractual+StrValselect);
                        break;
                    case "9":
                        textView.setText(Stractual+StrValselect);
                        break;
                    case "0":
                        if(Stractual!="0")
                        textView.setText(Stractual+StrValselect);
                        break;
                    case ".":
                       if(Stractual.contains(".")==false && Stractual!="0"){
                           textView.setText(Stractual+StrValselect);
                       }
                        break;
                     case "CE":
                        num1=num2=0;
                        textView.setText(strVacio);
                        break;
                    case "C":
                        num1=num2=0;
                        textView.setText(strVacio);
                        break;

                    case "DEL":
                       if (Stractual.length()>0)
                           Stractual=Stractual.substring(0,Stractual.length()-1);
                        textView.setText(Stractual);
                        break;

                    case "/":
                        num1=Float.parseFloat(textView.getText().toString());
                        textView.setText(strVacio.toString());
                        strOpe="/";
                        break;
                    case "x":
                        num1=Float.parseFloat(textView.getText().toString());
                        textView.setText(strVacio.toString());
                        strOpe="x";
                        break;
                    case "+":
                        num1=Float.parseFloat(textView.getText().toString());
                        textView.setText(strVacio.toString());
                        strOpe="+";
                        break;
                    case "-":
                        num1=Float.parseFloat(textView.getText().toString());
                        textView.setText(strVacio.toString());
                        strOpe="-";
                        break;
                    case "=":
                        num2=Float.parseFloat(textView.getText().toString());
                        Calculadora cal= new Calculadora(num1,num2);
                        switch (strOpe){

                            case "x":
                                num1=cal.f_multiplicacion();
                                textView.setText(String.valueOf(num1));
                                break;
                            case "+":
                                num1=cal.f_suma();
                                textView.setText(String.valueOf(num1));
                                break;
                            case "-":
                                num1=cal.f_resta();
                                textView.setText(String.valueOf(num1));
                                break;
                            case "/":
                                num1=cal.f_division();
                                textView.setText(String.valueOf(num1));
                                break;
                        }
                        Stractual= String.valueOf(num1);
                        break;
                }

                if(Stractual.contains(".0")==true && Stractual.length()>3){
                    Stractual=Stractual.substring(0,Stractual.length()-2);
                    textView.setText(Stractual);
                }

            }
        });

    }
    }
