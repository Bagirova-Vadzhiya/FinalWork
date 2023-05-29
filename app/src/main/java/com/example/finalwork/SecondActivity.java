package com.example.finalwork;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalwork.africa.AfricaActivity;
import com.example.finalwork.asia.AsiaActivity;
import com.example.finalwork.australia.AustraliaActivity;
import com.example.finalwork.europe.EuropeActivity;
import com.example.finalwork.northamerica.NamericaActivity;
import com.example.finalwork.southamerica.SamActivity;

public class SecondActivity extends AppCompatActivity {

    // поля
    private ImageButton australia;
    private ImageButton africa;
    private ImageButton asia;
    private ImageButton namerica;
    private ImageButton samerica;
    private ImageButton europe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // присваивания полям id
        australia = findViewById(R.id.australia);
        africa = findViewById(R.id.africa);
        asia = findViewById(R.id.asia);
        namerica = findViewById(R.id.namerica);
        samerica = findViewById(R.id.samerica);
        europe = findViewById(R.id.europe);

        // обработка нажатия кнопки
        australia.setOnClickListener(listener);
        africa.setOnClickListener(listener);
        asia.setOnClickListener(listener);
        namerica.setOnClickListener(listener);
        samerica.setOnClickListener(listener);
        europe.setOnClickListener(listener);

    }

    // создание слушателя
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.australia:
                    Intent ausIntent = new Intent(getApplicationContext(), AustraliaActivity.class);
                    ausIntent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                    startActivity(ausIntent);
                    break;
                case R.id.africa:
                    Intent afrIntent = new Intent(getApplicationContext(), AfricaActivity.class);
                    afrIntent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                    startActivity(afrIntent);
                    break;
                case R.id.asia:
                    Intent asIntent = new Intent(getApplicationContext(), AsiaActivity.class);
                    asIntent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                    startActivity(asIntent);
                    break;
                case R.id.namerica:
                    Intent namIntent = new Intent(getApplicationContext(), NamericaActivity.class);
                    namIntent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                    startActivity(namIntent);
                    break;
                case R.id.samerica:
                    Intent samIntent = new Intent(getApplicationContext(), SamActivity.class);
                    samIntent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                    startActivity(samIntent);
                    break;
                case R.id.europe:
                    Intent eurIntent = new Intent(getApplicationContext(), EuropeActivity.class);
                    eurIntent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                    startActivity(eurIntent);
                    break;
            }
        }
    };


    // переопределение onBackPressed
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}