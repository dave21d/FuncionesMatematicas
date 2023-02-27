package com.example.funcionesmatematicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView res;
    private EditText val1,val2;
    private Button buton1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        val1=(EditText)findViewById(R.id.editTextTextPersonName);
        val2=(EditText) findViewById(R.id.editTextTextPersonName2);

        Button buttonsuma=findViewById(R.id.button2suma);
        Button buttonresta=findViewById(R.id.button3resta);
        Button buttonmulti=findViewById(R.id.buttonmulti);
        Button buttondivi=findViewById(R.id.buttondivi);

        res=(TextView) findViewById(R.id.txtres);

        buttonsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor1,valor2,suma;
                valor1=Integer.parseInt(val1.getText().toString());
                valor2=Integer.parseInt(val2.getText().toString());
                suma=valor1+valor2;

                Intent intent=new Intent(MainActivity.this,Pagina2.class);
                intent.putExtra("suma",suma);
                startActivity(intent);
            }
        });

        buttonresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor1,valor2,resta;
                valor1=Integer.parseInt(val1.getText().toString());
                valor2=Integer.parseInt(val2.getText().toString());
                resta=valor1-valor2;

                Intent intent=new Intent(MainActivity.this,Pagina2.class);
                intent.putExtra("resta",resta);
                startActivity(intent);
            }
        });

        buttonmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor1,valor2,multi;
                valor1=Integer.parseInt(val1.getText().toString());
                valor2=Integer.parseInt(val2.getText().toString());
                multi=valor1*valor2;

                Intent intent=new Intent(MainActivity.this,Pagina2.class);
                intent.putExtra("multi",multi);
                startActivity(intent);
            }
        });

        buttondivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor1,valor2,divi;
                valor1=Integer.parseInt(val1.getText().toString());
                valor2=Integer.parseInt(val2.getText().toString());
                divi=valor1/valor2;

                Intent intent=new Intent(MainActivity.this,Pagina2.class);
                intent.putExtra("divi",divi);
                startActivity(intent);
            }
        });


        }




//    public  void sumatoria(View view){
//        int valor1,valor2,sumatoria;
//        valor1=Integer.parseInt(val1.getText().toString());
//        valor2=Integer.parseInt(val2.getText().toString());
//        sumatoria=valor1+valor2;
//        res.setText("Resultado Final:"+sumatoria);
//    }
//    public  void resta(View view){
//        int valor1,valor2,resta;
//        valor1=Integer.parseInt(val1.getText().toString());
//        valor2=Integer.parseInt(val2.getText().toString());
//        resta=valor1-valor2;
//        res.setText("Resultado Final:"+resta);
//    }
}