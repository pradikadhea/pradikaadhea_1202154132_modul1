package com.example.user.pradika_1202154132_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText namen,jml;
    private Button resto,resto2;
    private TextView tmptmakan;

    private int uang = 60000;

    private int jumlah1,hsl;

    public static final String EXTRA_MESSAGE = "com.example.pradika_1202154132_modul1.extra.MESSAGE";


    public static final int TEXT_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namen = (EditText) findViewById(R.id.menu);
        jml = (EditText) findViewById(R.id.jumlah);
        tmptmakan = (TextView) findViewById(R.id.resto);
//
//        restaurant = (Button) findViewById(R.id.eatbus);
//        restaurant2 = (Button) findViewById(R.id.abnormal);
//

    }

    public void launcheatbs(View view) {


        String menu = namen.getText().toString();
        String jumlah = jml.getText().toString();
        jumlah1 = Integer.parseInt(jumlah.trim());

        hsl = jumlah1 * 50000;

        Intent a = new Intent(this,output2.class);

        a.putExtra("Menu",menu);
        a.putExtra("Porsi",jumlah);
        a.putExtra("Total",String.valueOf(hsl));
        a.putExtra("Restaurant","Eatbus");

        startActivity(a);

        if (hsl > uang){
            Toast.makeText(this,"Jangan disini makan malamnya, uang kamu tidak cukup",Toast.LENGTH_LONG).show();
        }


    }

    public void lauchabnl(View view) {

        String menu = namen.getText().toString();
        String jumlah = jml.getText().toString();
        jumlah1 = Integer.parseInt(jumlah.trim());

        hsl = jumlah1 * 30000;

        Intent a = new Intent(this,output2.class);

        a.putExtra("Menu",menu);
        a.putExtra("Porsi",jumlah);
        a.putExtra("Total",String.valueOf(hsl));
        a.putExtra("Restaurant","Eatbus");
        startActivity(a);

        if (hsl < uang){
            Toast.makeText(this,"Disini aja makan malamnya",Toast.LENGTH_LONG).show();
        }
    }
}
