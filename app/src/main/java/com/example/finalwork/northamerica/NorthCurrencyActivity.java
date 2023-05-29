package com.example.finalwork.northamerica;

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

public class NorthCurrencyActivity extends AppCompatActivity {

    List<Entity> entities = new ArrayList<Entity>();

    FloatingActionButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north_currency);

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NamericaActivity.class);
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
        entities.add(new Entity("Восточно-карибский доллар (Страна: Антигуа и Барбуда)", "Дробная единица: цент\nСимвол валюты: $\nКод: XCD",
                R.drawable.cy1));
        entities.add(new Entity("Багамский доллар (Страна: Содружество Багамских Островов)", "Дробная единица: цент\nСимвол валюты: $\nКод: BSD",
                R.drawable.cy2));
        entities.add(new Entity("Доминиканское песо (Страна: Доминиканская Республика)", "Дробная единица: сентаво\nСимвол валюты: $\nКод: DOP",
                R.drawable.cy3));
        entities.add(new Entity("Восточно-карибский доллар (Страна: Содружество Доминики)", "Дробная единица: цент\nСимвол валюты: $\nКод: XCD",
                R.drawable.cy1));
        entities.add(new Entity("Канадский доллар (Страна: Канада)", "Дробная единица: цент\nСимвол валюты: $\nКод: CAD",
                R.drawable.cy4));
        entities.add(new Entity("Кубинское песо (Страна: Куба)", "Дробная единица: сентаво\nСимвол валюты: $\nКод: CUP",
                R.drawable.cy5));
        entities.add(new Entity("Мексиканское песо  (Страна: Мексика)", "Дробная единица: сентаво\nСимвол валюты: $\nКод: MXP",
                R.drawable.cy6));
        entities.add(new Entity("Золотая кордоба (Страна: Никарагуа)", "Дробная единица: сентаво\nСимвол валюты: $\nКод: NIO",
                R.drawable.cy7));
        entities.add(new Entity("Бальбоа (Страна: Панама)", "Дробная единица: сентесимо\nСимвол валюты: B/.\nКод: PAB",
                R.drawable.cy8));
        entities.add(new Entity("Доллар США (Страна: Соединённые Штаты Америки)", "Дробная единица: цент\nСимвол валюты: $\nКод: USD", R.drawable.currency_11));
    }

    // переопределение onBackPressed
    @Override
    public void onBackPressed() {
        Intent intent  = new Intent(getApplicationContext(), NamericaActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}