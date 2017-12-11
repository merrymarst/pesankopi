package com.example.common.pesankopi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView textJumlah;
    int jumlahPesanan1;
    int jumlahPesanan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayJumlah(0);
        displayprice(0);
        textJumlah = (TextView) findViewById(R.id.jumlah);
        jumlahPesanan = Integer.parseInt(textJumlah.getText().toString());
    }

    public void displayJumlah(int number) {
        TextView jumlah = (TextView) findViewById(R.id.jumlah);
        jumlah.setText("" + number);
    }

    public void tambah(View v) {
        jumlahPesanan = jumlahPesanan + 1;
        displayJumlah(jumlahPesanan);
    }

    public void kurang(View v) {
        if (jumlahPesanan != 0) {
            jumlahPesanan = jumlahPesanan - 1;
        }
        displayJumlah(jumlahPesanan);
    }

    public void displayprice(int number) {
        TextView jumlah = (TextView) findViewById(R.id.price);
        jumlah.setText("Quality Summary");
    }

    public void price(View v) {
        String hasil="";
        TextView jumlah1 = (TextView) findViewById(R.id.r1);
        TextView jumlah5 = (TextView) findViewById(R.id.hasil);
        TextView jumlah2 = (TextView) findViewById(R.id.r2);
        TextView jumlah3 = (TextView) findViewById(R.id.r3);
        TextView jumlah4 = (TextView) findViewById(R.id.r4);

        RadioButton cb1=(RadioButton) findViewById(R.id.ck1);
        RadioButton cb2=(RadioButton) findViewById(R.id.ck2);
        RadioButton cb3=(RadioButton) findViewById(R.id.ck3);
        RadioButton cb4=(RadioButton) findViewById(R.id.ck4);

        if(cb1.isChecked())
        {
            jumlahPesanan1 = jumlahPesanan * 5;
            hasil="Handphone";
        }
        if(cb2.isChecked())
        {
            jumlahPesanan1 = jumlahPesanan * 10;
            hasil="Laptop";
        }
        if(cb3.isChecked())
        {
            jumlahPesanan1 = jumlahPesanan * 15;
            hasil="Kamera";
        }
        if(cb4.isChecked())
        {
            jumlahPesanan1 = jumlahPesanan * 5;
            hasil="Hardisk";
        }


        jumlah1.setText("Nama : Fahri Ramadhan Hasibuan");
        jumlah5.setText("Anda Membeli " + hasil);
        jumlah2.setText("Quantity : " + jumlahPesanan);
        jumlah3.setText("Total : $ " + jumlahPesanan1);
        jumlah4.setText("Terima Kasih");


    }
}

