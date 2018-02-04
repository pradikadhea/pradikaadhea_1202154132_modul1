package com.example.user.pradika_1202154132_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class output2 extends AppCompatActivity {

    TextView aa, bb, cc, dd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        aa = (TextView) findViewById(R.id.namen);

        bb = (TextView) findViewById(R.id.porsi);

        cc = (TextView) findViewById(R.id.harga);

        dd = (TextView) findViewById(R.id.resto);

        Intent a = getIntent();

        String b = a.getStringExtra("Menu");
        String c = a.getStringExtra("Porsi");
        String d = a.getStringExtra("Total");
        String e = a.getStringExtra("Restaurant");

        aa.setText(b);
        bb.setText(c);
        cc.setText(d);
        dd.setText(e);


//        if (getIntent().getExtras() != null) {
//
//            Bundle bundle = getIntent().getExtras();
//            a.setText(bundle.getString("Menu"));
//            b.setText(bundle.getString("Jumlah"));
//            c.setText(bundle.getString("Total"));
//            d.setText(bundle.getString("Restaurant"));
//        } else {
//            a.setText(getIntent().getStringExtra("Menu"));
//             b.setText(getIntent().getStringExtra("Jumlah"));
//            c.setText(getIntent().getStringExtra("Total"));
//            d.setText(getIntent().getStringExtra("Restaurant"));
//        }
    }
}