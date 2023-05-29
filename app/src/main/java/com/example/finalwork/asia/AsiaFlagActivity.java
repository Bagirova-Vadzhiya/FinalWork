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

public class AsiaFlagActivity extends AppCompatActivity {

    List<Entity> entities = new ArrayList<Entity>();

    FloatingActionButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asia_flag);

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

        RecyclerView recyclerView = findViewById(R.id.flagList);

        GeneralAdapter adapter = new GeneralAdapter(this, entities);

        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        entities.add(new Entity("Азербайджан", "Население: 10 138 585 чел.\n" +
                "Столица: Баку\nПлощадь государства: ок. 86,6 тыс. км²\nЯзык: азербайджанский\nКрупнейшие города: Баку, Гянджа, Сумгайыт, Мингечевир, Хырдалан, Ленкорань, Нахичевань", R.drawable.img_14));
        entities.add(new Entity("Бангладеш", "Население: 171 674 893 чел.\n" +
                "Столица: Дакка\nПлощадь государства: 148 460 км²\nЯзык: бенгальский\nКрупнейшие города: Дакка, Читтагонг", R.drawable.img2));
        entities.add(new Entity("Бахрейн", "Население: 1 505 003 чел.\n" +
                "Столица: Манама\nПлощадь государства: 766 км²\nЯзык: арабский\nКрупнейшие города: Манама", R.drawable.img3));
        entities.add(new Entity("Вьетнам", "Население: 100 195 275 чел.\n" +
                "Столица: Ханой\nПлощадь государства: 331 210 км²\nЯзык: вьетнамский\nКрупнейшие города: Хошимин, Ханой, Хайфон, Кантхо, Бьенхоа, Дананг", R.drawable.img4));
        entities.add(new Entity("Грузия", "Население:  3 723 536 чел.\n" +
                "Столица: Тбилиси\nПлощадь государства: 69 789 км²\nЯзык: грузинский\nКрупнейшие города: Тбилиси, Батуми, Кутаиси, Рустави, Зугдиди, Гори, Поти", R.drawable.img5));
        entities.add(new Entity("Израиль", "Население:  9 656 000 чел.\n" +
                "Столица: Иерусалим\nПлощадь государства: 20 770 км²\nЯзык: иврит\nКрупнейшие города: Иерусалим, Тель-Авив-Яффа, Хайфа", R.drawable.img6));
        entities.add(new Entity("Индия", "Население: 1 400 000 000 чел.\n" +
                "Столица: Нью-Дели\nПлощадь государства: 3 287 263 км²\nЯзыки: хинди, английский\nКрупнейшие города: Мумбаи, Дели, Бангалор, Ченнаи, Калькутта", R.drawable.img7));
        entities.add(new Entity("Китай", "Население: 1 411 750 000 чел.\n" +
                "Столица: Пекин\nПлощадь государства: 9 598 962 км²\nЯзык: китайский\nКрупнейшие города: Чунцин, Шанхай, Пекин, Гуанчжоу, Чэнду, Тяньцзинь, Шэньчжень, Харбин, Нанкин, Гонконг", R.drawable.img8));
        entities.add(new Entity("Россия", "Население: 146 748 590 чел.\n" +
                "Столица: Москва\nПлощадь государства: 17 207 090 км²\nЯзык: Русский\nКрупнейшие города: Москва, Санкт-Петербург, Новосибирск, Екатеринбург, Казань, Нижний Новгород, Челябинск, Самара, Омск, Ростов-на-Дону, Уфа, Красноярск, Воронеж, Пермь, Волгоград, Краснодар", R.drawable.img1));
        entities.add(new Entity("Япония", "Население: 125 309 000 чел.\n" +
                "Столица: Токио\nПлощадь государства: 377 976 км²\nЯзык: японский\nКрупнейшие города: Токио, Иокогама, Осака, Нагоя, Саппоро, Кобе, Фукуока, Киото, Кавасаки, Сайтама", R.drawable.img9));
    }

    // переопределение onBackPressed
    @Override
    public void onBackPressed() {
        Intent intent  = new Intent(getApplicationContext(), AsiaActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}