package com.example.finalwork.europe;

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

public class EuropeCurrencyActivity extends AppCompatActivity {

    List<Entity> entities = new ArrayList<Entity>();

    FloatingActionButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_europe_currency);

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(getApplicationContext(), EuropeActivity.class);
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
        entities.add(new Entity("Евро (Страна: Австрия)", "Дробная единица: евроцент\nСимвол валюты: €\nКод: EUR",
                R.drawable.currency12));
        entities.add(new Entity("Болгарский лев (Страна: Болгария)", "Дробная единица: сотин\nСимвол валюты: лв\nКод: BGL",
                R.drawable.currency13));
        entities.add(new Entity("Евро (Страна: Ватикан)", "Дробная единица: евроцент\nСимвол валюты: €\nКод: EUR",
                R.drawable.currency12));
        entities.add(new Entity("Евро (Страна: Греция)", "Дробная единица: евроцент\nСимвол валюты: €\nКод: EUR",
                R.drawable.currency12));
        entities.add(new Entity("Датская крона  (Страна: Дания)", "Дробная единица: эре\nСимвол валюты: kr\nКод: DKK",
                R.drawable.currency14));
        entities.add(new Entity("Евро (Страна: Италия)", "Дробная единица: евроцент\nСимвол валюты: €\nКод: EUR",
                R.drawable.currency12));
        entities.add(new Entity("Евро (Страна: Латвия)", "Дробная единица: евроцент\nСимвол валюты: €\nКод: EUR",
                R.drawable.currency12));
        entities.add(new Entity("Российский рубль (Страна: Россия)", "Дробная единица: копейка\nСимвол валюты: ₽\nКод: RUR",
                R.drawable.currency_9));
        entities.add(new Entity("Денар (Страна: Северная Македония)", "Дробная единица: дени\nСимвол валюты: ден.\nКод: MKD",
                R.drawable.currency15));
        entities.add(new Entity("Куна (Страна: Хорватия)", "Дробная единица: лип\nСимвол валюты: Kn\nКод: HRK",
                R.drawable.currency16));
    }

    // переопределение onBackPressed
    @Override
    public void onBackPressed() {
        Intent intent  = new Intent(getApplicationContext(), EuropeActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}
