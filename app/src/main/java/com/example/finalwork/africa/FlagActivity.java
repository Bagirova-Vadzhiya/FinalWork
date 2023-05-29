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

public class FlagActivity extends AppCompatActivity {

    List<Entity> entities = new ArrayList<Entity>();

    FloatingActionButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag);
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

        RecyclerView recyclerView = findViewById(R.id.flagList);

        GeneralAdapter adapter = new GeneralAdapter(this, entities);

        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        entities.add(new Entity("Алжир", "Население: 46 002 849 чел. (2022 г.)\n" +
                "Столица: Алжир\nПлощадь государятва: 2 381 741 км²\nЯзык: арабский\nКрупнейшие города: Оран, Константина, Аннаба, Беджая, Батна, Сетиф, Джельфа", R.drawable.img));
        entities.add(new Entity("Ангола", "Население: 34 795 287 чел. (2022 г.)\n" +
                "Столица: Луанда\nПлощадь государства: 1 246 700 км²\nЯзык: португальский\nКрупнейшие города: Луанда, Кабинда, Уамбо, Лубанго, Бенгела", R.drawable.img_1 ));
        entities.add(new Entity("Бенин", "Население: 12 880 731 чел. (2022 г.)\n" +
                "Столица: Порто-Ново\nПлощадь государства: 112 622 км²\nЯзык: французский\nКрупнейшие города: Котону, Абомей-Калави, Порто-Ново, Джугу, Параку, Боикон", R.drawable.img_2 ));
        entities.add(new Entity("Ботсвана", "Население: 2 380 250 чел. (2022 г.)\n" +
                "Столица: Габороне\nПлощадь государства: 581 730 км²\nЯзыки: английский, тсвана\nКрупнейшие города: Габороне, Франсистаун, Молепололе, Селеби-Пхикве, Серове", R.drawable.img_3 ));
        entities.add(new Entity("Буркина-Фасо", "Население: 20 835 401 чел. (2020 г.)\n" +
                "Столица: Уагадугу\nПлощадь государства: 274 200 км²\nЯзык: французский\nКрупнейшие города: Уагадугу, Бобо-Диуласо", R.drawable.img_4 ));
        entities.add(new Entity("Бурунди", "Население: 11 099 298 чел.\n" +
                "Столица: Гитега\nПлощадь государства: 27 830 км²\nЯзыки: рунди, французский, английский\nКрупнейшие города: Бужумбура, Гитега", R.drawable.img_5 ));
        entities.add(new Entity("Габон", "Население: 2 230 908 чел.\n" +
                "Столица: Либревиль\nПлощадь государства: 267 667 км²\nЯзык: французский\nКрупнейшие города: Либревиль, Порт-Жантиль", R.drawable.img_6 ));
        entities.add(new Entity("Гамбия", "Население: 2 173 999 чел.\n" +
                "Столица: Банжул\nПлощадь государства: 11 300 км²\nЯзык: английский\nКрупнейшие города: Серекунда, Большой Банжул", R.drawable.img_7 ));
        entities.add(new Entity("Гана", "Население: 33 107 275 чел.\n" +
                "Столица: Аккра\nПлощадь государства: 238 533 км²\nЯзык: английский\nКрупнейшие города: Аккра, Тамале, Кумаси, Болгатанга", R.drawable.img_8 ));
        entities.add(new Entity("Гвинея", "Население: 12 771 000 чел.\n" +
                "Столица: Конакри\nПлощадь государства: 245 857 км²\nЯзык: французский\nКрупнейшие города: Конакри, Нзерекоре, Киндиа", R.drawable.img_9 ));
        entities.add(new Entity("Гвинея-Бисау", "Население: 1 647 000 чел.\n" +
                "Столица: Бисау\nПлощадь государства: 36 120 км²\nЯзык: португальский\nКрупнейшие города: Бисау, Бафата", R.drawable.img_10 ));
        entities.add(new Entity("Джибути", "Население: 921 804 чел.\n" +
                "Столица: Джибути\nПлощадь государства: 23 200 км² км²\nЯзыки: арабский, французский\nКрупнейший город: Джибути", R.drawable.img_11 ));
        entities.add(new Entity("ДР Конго", "Население: 108 407 721 чел.\n" +
                "Столица: Киншаса\nПлощадь государства: 2 345 409 км²\nЯзык: французский\nКрупнейшие города: Киншаса, Мбужи-Майи, Лубумбаши, Кисангани", R.drawable.img_12 ));
        entities.add(new Entity("Египет", "Население: 106 646 200 чел.\n" +
                "Столица: Каир\nПлощадь государства: 1 001 450 км²\nЯзык: арабский\nКрупнейшие города: Каир, Александрия, Гиза, Шубра-эль-Хейма, Порт-Саид, Суэц", R.drawable.img_13 ));

    }

    // переопределение onBackPressed
    @Override
    public void onBackPressed() {
        Intent intent  = new Intent(getApplicationContext(), AfricaActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}