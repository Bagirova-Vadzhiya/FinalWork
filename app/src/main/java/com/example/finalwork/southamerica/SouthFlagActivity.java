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

public class SouthFlagActivity extends AppCompatActivity {

    List<Entity> entities = new ArrayList<Entity>();

    FloatingActionButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_south_flag);

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

        RecyclerView recyclerView = findViewById(R.id.flagList);

        GeneralAdapter adapter = new GeneralAdapter(this, entities);

        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        entities.add(new Entity("Аргентина", "Население: 46 403 544 чел.\n" +
                "Столица: Буэнос-Айрес\nПлощадь государства: 2 780 400 км²\nЯзык: испанский\nКрупнейшие города: Буэнос-Айрес, Кордова, Росарио, Мендоса, Сан-Мигель-де-Тукуман, Ла-Плата, Мар-дель-Плата", R.drawable.im11));
        entities.add(new Entity("Бразилия", "Население: 207 353 391 чел.\n" +
                "Столица: Бразилиа\nПлощадь государства: 8 515 767 км²\nЯзык: португальский\nКрупнейшие города: Сан-Паулу, Рио-де-Жанейро, Бразилиа, Салвадор, Форталезая", R.drawable.im12));
        entities.add(new Entity("Венесуэла", "Население: 28 887 118 чел.\n" +
                "Столица: Каракас\nПлощадь государства: 916 445 км²\nЯзык: испанский\nКрупнейшие города: Каракас, Маракайбо, Валенсия", R.drawable.im13));
        entities.add(new Entity("Колумбия", "Население: 49 336 454 чел.\n" +
                "Столица: Богота\nПлощадь государства: 1 141 748 км²\nЯзык: испанский\nКрупнейшие города: Богота, Медельин, Кали, Барранкилья, Картахена", R.drawable.im14));
        entities.add(new Entity("Парагвай", "Население: 7 252 672 чел.\n" +
                "Столица: Асунсьон\nПлощадь государства: 406 752 км²\nЯзыки: испанский  и гуарани\nКрупнейшие города: Асунсьон, Сьюдад-дель-Эсте", R.drawable.im15));
        entities.add(new Entity("Перу", "Население: 32 162 184 чел.\n" +
                "Столица: Лима\nПлощадь государства: 1 285 216 км²\nЯзык: испанский\nКрупнейшие города: Лима, Арекипа, Трухильо", R.drawable.im16));
        entities.add(new Entity("Суринам", "Население: 575 990 чел.\n" +
                "Столица: Парамарибо\nПлощадь государства: 163 821 км²\nЯзыки: нидерландский (официальный), сранан-тонго\nКрупнейшие города: Парамарибо", R.drawable.im17));
        entities.add(new Entity("Уругвай", "Население: 3 480 883 чел.\n" +
                "Столица: Монтевидео\nПлощадь государства: 176 215 км²\nЯзык: уругвайский испанский\nКрупнейшие города: Монтевидео, Мальдонадо, Сальто", R.drawable.im18));
        entities.add(new Entity("Чили", "Население: 18 186 770 чел.\n" +
                "Столица: Сантьяго\nПлощадь государства: 756 102 км²\nЯзык: испанский\nКрупнейшие города: Сантьяго", R.drawable.im19));
        entities.add(new Entity("Эквадор", "Население: 18 267 203 чел.\n" +
                "Столица: Кито\nПлощадь государства: 283 561 км²\nЯзык: испанский\nКрупнейшие города: Кито, Гуаякиль", R.drawable.im20));
    }


    // переопределение onBackPressed
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), SamActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}