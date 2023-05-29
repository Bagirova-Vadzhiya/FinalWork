package com.example.finalwork.southamerica;

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

public class SouthCurrencyActivity extends AppCompatActivity {

    List<Entity> entities = new ArrayList<Entity>();

    FloatingActionButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_south_currency);

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SamActivity.class);
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
        entities.add(new Entity("Аргентинское песо  (Страна: Аргентина)", "Дробная единица: сентаво\nСимвол валюты: $\nКод: ARS", R.drawable.cy_1));
        entities.add(new Entity("Реал (Страна: Бразилия)", "Дробная единица: сентаво\nСимвол валюты: $\nКод: BRL", R.drawable.cy_2));
        entities.add(new Entity("Боливар (Страна: Венесуэла)", "Дробная единица: сентимо\nСимвол валюты: Bs. S.\nКод: VEB", R.drawable.cy_3));
        entities.add(new Entity("Колумбийское песо (Страна: Колумбия)", "Дробная единица: сентаво\nСимвол валюты: $\nКод: COP", R.drawable.cy_4));
        entities.add(new Entity("Гуарани (Страна: Парагвай)", "Дробная единица: сентимо\nСимвол валюты: ₲\nКод: PYG", R.drawable.cy_5));
        entities.add(new Entity("Новый соль (Страна: Перу)", "Дробная единица: сентимо\nСимвол валюты: S/\nКод: PEN", R.drawable.cy_6));
        entities.add(new Entity("Суринамский доллар (Страна: Суринам)", "Дробная единица: цент\nСимвол валюты: $\nКод: SRD", R.drawable.cy_7));
        entities.add(new Entity("Уругвайское песо (Страна: Уругвай)", "Дробная единица: сенте\nСимвол валюты: $\nКод: UYU", R.drawable.cy_8));
        entities.add(new Entity("Чилийское песо (Страна: Чили)", "Дробная единица: сентаво\nСимвол валюты: $\nКод: CLP", R.drawable.cy_9));
        entities.add(new Entity("Доллар США (Страна: Эквадор)", "Дробная единица: цент\nСимвол валюты: $\nКод: USD", R.drawable.currency_11));
    }


    // переопределение onBackPressed
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), SamActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}