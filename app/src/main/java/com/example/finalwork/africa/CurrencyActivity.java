package com.example.finalwork.africa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalwork.Entity;
import com.example.finalwork.GeneralAdapter;
import com.example.finalwork.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class CurrencyActivity extends AppCompatActivity {

    List<Entity> entities = new ArrayList<Entity>();

    FloatingActionButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(getApplicationContext(), AfricaActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent);
            }
        });

        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.currencyList);

        GeneralAdapter adapter = new GeneralAdapter(this, entities);

        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        entities.add(new Entity("Алжирский динар (Страна: Алжир)", "Дробная единица: сантим\nСимвол валюты: DA или دج\nКод: DZD",
                R.drawable.currency1));
        entities.add(new Entity("Ангольская кванза (Страна: Ангола)", "Дробная единица: сентимо\nСимвол валюты: Kz\nКод: AOA",
                R.drawable.currency2));
        entities.add(new Entity("Франк КФА (Страна: Бенин)", "Дробная единица: —\nСимвол валюты: ₣\nКод: XOF",
                R.drawable.currency3));
        entities.add(new Entity("Ботсвана пула (Страна: Ботсвана)", "Дробная единица: тхебе\nСимвол валюты: P\nКод: BWP",
                R.drawable.currency4));
        entities.add(new Entity("Франк КФА (Страна: Буркина-Фасо)", "Дробная единица: —\nСимвол валюты: ₣\nКод: XOF",
                R.drawable.currency3));
        entities.add(new Entity("Бурундийский франк (Страна: Бурунди)", "Дробная единица: —\nСимвол валюты: ₣\nКод: BIF",
                R.drawable.currency5));
        entities.add(new Entity("Франк КФА (Страна: Габон)", "Дробная единица: —\nСимвол валюты: ₣\nКод: XAF",
                R.drawable.currency3));
        entities.add(new Entity("Даласи (Страна: Гамбия)", "Дробная единица: бутут\nСимвол валюты: D\nКод: GMD",
                R.drawable.currency6));
        entities.add(new Entity("Ганский седи (Страна: Гана)", "Дробная единица: песева\nСимвол валюты: ₵\nКод: GHS",
                R.drawable.currency7));
        entities.add(new Entity("Гвинейский франк (Страна: Гвинея)", "Дробная единица: —\nСимвол валюты: ₣\nКод: GNF",
                R.drawable.currency8));
        entities.add(new Entity("Франк КФА (Страна: Гвинея-Бисау)", "Дробная единица: —\nСимвол валюты: ₣\nКод: XOF",
                R.drawable.currency3));
        entities.add(new Entity("Джибутианский франк (Страна: Джибути)", "Дробная единица: —\nСимвол валюты: ₣\nКод: DJF",
                R.drawable.currency9));
        entities.add(new Entity("Конголезский франк (Страна: ДР Конго)", "Дробная единица: сантим\nСимвол валюты: ₣\nКод: CDF",
                R.drawable.currency10));
        entities.add(new Entity("Египетский фунт (Страна: Египет)", "Дробная единица: пиастров\nСимвол валюты: .ج.م или LE \nКод: EGP",
                R.drawable.currency11));
    }

    // переопределение onBackPressed
    @Override
    public void onBackPressed() {
        Intent intent  = new Intent(getApplicationContext(), AfricaActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}