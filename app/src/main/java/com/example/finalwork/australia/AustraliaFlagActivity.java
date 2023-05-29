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

public class AustraliaFlagActivity extends AppCompatActivity {

    List<Entity> entities = new ArrayList<Entity>();

    FloatingActionButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_australia_flag);

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

        RecyclerView recyclerView = findViewById(R.id.flagList);

        GeneralAdapter adapter = new GeneralAdapter(this, entities);

        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        entities.add(new Entity("Австралия", "Население: 25 978 935 чел.\n" +
                "Столица: Канберра\nПлощадь государства: 7 692 024 км²\nЯзык: австралийский английский\nКрупнейшие города: Сидней, Мельбурн, Брисбен, Перт, Аделаида, Голд-Кост, Канберра, Ньюкасл, Вуллонгонг", R.drawable.img15));
        entities.add(new Entity("Вануату", "Население: 277 554 чел.\n" +
                "Столица: Порт-Вила\nПлощадь государства: 12 190 км²\nЯзык: австралийский английский\nКрупнейшие города: Порт-Вила, Люганвиль", R.drawable.img16));
        entities.add(new Entity("Кирибати", "Население: 115 300 чел.\n" +
                "Столица: Южная Тарава\nПлощадь государства: 812,34 км²\nЯзыки: кирибати, английский\nКрупнейшие города: Южная Тарава", R.drawable.img17));
        entities.add(new Entity("Маршалловы Острова", "Население: 55 000 чел.\n" +
                "Столица: Маджуро\nПлощадь государства: 181,3 км²\nЯзыки: маршалльский, английский\nКрупнейшие города: Маджуро", R.drawable.img18));
        entities.add(new Entity("Новая Зеландия", "Население: 5 157 270 чел.\n" +
                "Столица: Веллингтон\nПлощадь государства: 268 680 км²\nЯзыки: английский, маори, новозеландский жестовый язык\nКрупнейшие города: Окленд, Веллингтон, Крайстчерч, Гамильтон, Данидин, Тауранга", R.drawable.img19));
        entities.add(new Entity("Новая Каледония", "Население: 275 590 чел.\n" +
                "Столица: Нумеа\nПлощадь государства: 18 576 км²\nЯзык: Французский\nКрупнейшие города: Нумеа", R.drawable.img20));
        entities.add(new Entity("Папуа Новая Гвинея", "Население: 9 134 073 чел.\n" +
                "Столица: Порт-Морсби\nПлощадь государства: 462 840 км²\nЯзыки: английский, ток-писин и хири-моту\nКрупнейшие города: Порт-Морсби, Лаэ", R.drawable.img21));
        entities.add(new Entity("Самоа", "Население: 187 820 чел.\n" +
                "Столица: Апиа\nПлощадь государства: 2832 км²\nЯзыки: самоанский и английский\nКрупнейшие города: Апиа", R.drawable.img22));
        entities.add(new Entity("Тонга", "Население: 100 651 чел.\n" +
                "Столица: Нукуалофа\nПлощадь государства: 748 км²\nЯзыки: тонганский, английский\nКрупнейшие города: Нукуалофа", R.drawable.img23));
        entities.add(new Entity("Фиджи", "Население: 935 974 чел.\n" +
                "Столица: Сува\nПлощадь государства: 18 274  км²\nЯзыки: английский, фиджийский, хиндустани\nКрупнейшие города: Сува, Лаутока", R.drawable.img24));

    }

    // переопределение onBackPressed
    @Override
    public void onBackPressed() {
        Intent intent  = new Intent(getApplicationContext(), AustraliaActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}