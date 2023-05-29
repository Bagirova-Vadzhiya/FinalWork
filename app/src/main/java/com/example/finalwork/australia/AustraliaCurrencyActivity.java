package com.example.finalwork.australia;

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

public class AustraliaCurrencyActivity extends AppCompatActivity {

    List<Entity> entities = new ArrayList<Entity>();

    FloatingActionButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_australia_currency);

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(getApplicationContext(), AustraliaActivity.class);
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
        entities.add(new Entity("Австралийский доллар (Страна: Австралия)", "Дробная единица: цент\nСимвол валюты: $ \nКод: AUD", R.drawable.currency_13));
        entities.add(new Entity("Вануатский вату (Страна: Вануату)", "Дробная единица: -\nСимвол валюты: Vt \nКод: VUV", R.drawable.currency_12));
        entities.add(new Entity("Австралийский доллар (Страна: Кирибати)", "Дробная единица: цент\nСимвол валюты: $ \nКод: AUD", R.drawable.currency_13));
        entities.add(new Entity("Доллар США (Страна: Маршалловы Острова)", "Дробная единица: цент\nСимвол валюты: $\nКод: USD", R.drawable.currency_11));
        entities.add(new Entity("Новозеландский доллар (Страна: Новая Зеландия)", "Дробная единица: цент\nСимвол валюты: $\nКод: NZD", R.drawable.currency_19));
        entities.add(new Entity("Франк КФП (Страна: Новая Каледония)", "Дробная единица: -\nСимвол валюты: ₣ \nКод: XPF", R.drawable.currency_14));
        entities.add(new Entity("Кина (Страна: Папуа Новая Гвинея)", "Дробная единица: тойя\nСимвол валюты: K\nКод: PGK", R.drawable.currency_15));
        entities.add(new Entity("Тала (Страна: Самоа)", "Дробная единица: цент\nСимвол валюты: $ \nКод: WST", R.drawable.currency_16));
        entities.add(new Entity("Паанга (Страна: Тонга)", "Дробная единица: цент\nСимвол валюты: $ \nКод: TOP", R.drawable.currency_17));
        entities.add(new Entity("Доллар Фиджи (Страна: Фиджи)", "Дробная единица: цент\nСимвол валюты: $\nКод: FJD", R.drawable.currency_18));
    }

    // переопределение onBackPressed
    @Override
    public void onBackPressed() {
        Intent intent  = new Intent(getApplicationContext(), AustraliaActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}