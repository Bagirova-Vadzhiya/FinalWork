package com.example.finalwork.africa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalwork.R;
import com.example.finalwork.SecondActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AfricaActivity extends AppCompatActivity {

    // поля
    private ImageButton flags;
    private ImageButton attractions;
    private ImageButton currency;
    FloatingActionButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_africa);

        // присваивание id
        flags = findViewById(R.id.flags);
        attractions = findViewById(R.id.attractions);
        currency = findViewById(R.id.currency);
        back = findViewById(R.id.back);

        // обработка нажатия кнопки
        flags.setOnClickListener(listener);
        currency.setOnClickListener(listener);
        attractions.setOnClickListener(listener);
        back.setOnClickListener(listener);
    }

    // создание слушателя
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          switch (v.getId())  {
              case R.id.flags:
                  Intent intentFlag = new Intent(getApplicationContext(), FlagActivity.class);
                  intentFlag.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                  startActivity(intentFlag);
                  break;
              case R.id.currency:
                  Intent intentCurrency = new Intent(getApplicationContext(), CurrencyActivity.class);
                  intentCurrency.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                  startActivity(intentCurrency);
                  break;
              case R.id.attractions:
                  Intent intentAttractions = new Intent(getApplicationContext(), AttractionsActivity.class);
                  intentAttractions.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                  startActivity(intentAttractions);
                  break;
              case R.id.back:
                  Intent intent  = new Intent(getApplicationContext(), SecondActivity.class);
                  intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                  startActivity(intent);
                  break;
          }
        }
    };

    // переопределение onBackPressed
    @Override
    public void onBackPressed() {
        Intent intent  = new Intent(getApplicationContext(), SecondActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}