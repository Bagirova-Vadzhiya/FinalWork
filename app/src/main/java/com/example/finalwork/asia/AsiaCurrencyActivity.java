package com.example.finalwork.asia;

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

public class AsiaCurrencyActivity extends AppCompatActivity {

    List<Entity> entities = new ArrayList<Entity>();

    FloatingActionButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asia_currency);

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(getApplicationContext(), AsiaActivity.class);
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
        entities.add(new Entity("Азербайджанский манат (Страна: Азербайджан)", "Дробная единица: гяпик\nСимвол валюты: ₼\nКод: AZM",
                R.drawable.currency_1));
        entities.add(new Entity("Така (Страна: Бангладеш)", "Дробная единица: пойша\nСимвол валюты: ৳\nКод: BDT",
                R.drawable.currency_2));
        entities.add(new Entity("Бахрейнский динар (Страна: Бахрейн)", "Дробная единица: филс\nСимвол валюты: .د.ب или BD\nКод: BHD",
                R.drawable.currency_3));
        entities.add(new Entity("Донг (Страна: Вьетнам)", "Дробная единица: –\nСимвол валюты: ₫\nКод: VND",
                R.drawable.currency_4));
        entities.add(new Entity("Лари (Страна: Грузия)", "Дробная единица: тетри\nСимвол валюты: ₾\nКод: GEL",
                R.drawable.currency_5));
        entities.add(new Entity("Израильский шекель (Страна: Израиль)", "Дробная единица: агорот\nСимвол валюты: ₪\nКод: ILS",
                R.drawable.currency_6));
        entities.add(new Entity("Индийская рупия (Страна: Индия)", "Дробная единица: пайс\nСимвол валюты: ₹\nКод: INR",
                R.drawable.currency_7));
        entities.add(new Entity("Юань (Страна: Китай)", "Дробная единица: фынь\nСимвол валюты: ¥\nКод: CHY",
                R.drawable.currency_8));
        entities.add(new Entity("Российский рубль (Страна: Россия)", "Дробная единица: копейка\nСимвол валюты: ₽\nКод: RUR",
                R.drawable.currency_9));
        entities.add(new Entity("Иена (Страна: Япония)", "Дробная единица: –\nСимвол валюты: ¥\nКод: JPY",
                R.drawable.currency_10));
    }

    // переопределение onBackPressed
    @Override
    public void onBackPressed() {
        Intent intent  = new Intent(getApplicationContext(), AsiaActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}