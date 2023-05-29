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

public class NorthFlagActivity extends AppCompatActivity {

    List<Entity> entities = new ArrayList<Entity>();

    FloatingActionButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north_flag);

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(getApplicationContext(), NamericaActivity.class);
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
        entities.add(new Entity("Антигуа и Барбуда", "Население: 93 581 чел.\n" +
                "Столица: Сент-Джонс\nПлощадь государства: 440 км²\nЯзык: английский\nКрупнейшие города: Сент-Джонс", R.drawable.im_1));
        entities.add(new Entity("Содружество Багамских Островов", "Население: 321 834 чел.\n" +
                "Столица: Нассау\nПлощадь государства: 13 878 км²\nЯзык: английский\nКрупнейшие города: Нассау", R.drawable.im_2));
        entities.add(new Entity("Доминиканская Республика", "Население: 10 499 707 чел.\n" +
                "Столица: Санто-Доминго\nПлощадь государства: 48 670 км²\nЯзык: испанский\nКрупнейшие города: Санто-Доминго", R.drawable.im_3));
        entities.add(new Entity("Содружество Доминики", "Население: 74 243 чел.\n" +
                "Столица: Розо\nПлощадь государства: 751 км²\nЯзыки: английский, доминиканский креольский французский\nКрупнейшие города: Розо", R.drawable.im_4));
        entities.add(new Entity("Канада", "Население: 39 432 111 чел.\n" +
                "Столица: Оттава\nПлощадь государства: 9 984 670 км²\nЯзыки: английский, французский\nКрупнейшие города: Торонто, Монреаль, Ванкувер, Калгари, Эдмонтон", R.drawable.im_5));
        entities.add(new Entity("Куба", "Население: 11 061 886 чел.\n" +
                "Столица: Гавана\nПлощадь государства: 110 860 км²\nЯзык: испанский\nКрупнейшие города: Гавана, Сантьяго-де-Куба, Камагуэй", R.drawable.im_6));
        entities.add(new Entity("Мексика", "Население: 129 150 971 чел.\n" +
                "Столица: Мехико\nПлощадь государства: 1 972 550 км²\nЯзыки: мексиканский испанский и 67 языков коренных народов\nКрупнейшие города: Мехико, Экатепек-де-Морелос, Гвадалахара, Пуэбла, Сьюдад-Хуарес", R.drawable.im_7));
        entities.add(new Entity("Никарагуа", "Население: 6 751 191 чел.\n" +
                "Столица: Манагуа\nПлощадь государства: 130 370 км²\nЯзык: испанский\nКрупнейшие города: Манагуа", R.drawable.im_8));
        entities.add(new Entity("Панама", "Население: 4 252 620 чел.\n" +
                "Столица: Панама\nПлощадь государства: 78 200 км²\nЯзык: испанский\nКрупнейшие города: Панама", R.drawable.im_9));
        entities.add(new Entity("Соединённые Штаты Америки", "Население: 336 343 250 чел.\n" +
                "Столица: Вашингтон\nПлощадь государства: 9 519 431 км²\nЯзык:  американский английский\nКрупнейшие города: Нью-Йорк, Лос-Анджелес, Чикаго, Хьюстон, Финикс, Филадельфия, Сан-Антонио, Сан-Диего, Даллас, Сан-Хосе, Остин, Джэксонвилл, Форт-Уэрт, Колумбус, Шарлотт, Сан-Франциско, Индианаполис, Сиэтл", R.drawable.im_10));
    }

    // переопределение onBackPressed
    @Override
    public void onBackPressed() {
        Intent intent  = new Intent(getApplicationContext(), NamericaActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}