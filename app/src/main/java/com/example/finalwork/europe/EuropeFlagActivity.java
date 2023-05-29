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

public class EuropeFlagActivity extends AppCompatActivity {

    List<Entity> entities = new ArrayList<Entity>();

    FloatingActionButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_europe_flag);

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

        RecyclerView recyclerView = findViewById(R.id.flagList);

        GeneralAdapter adapter = new GeneralAdapter(this, entities);

        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        entities.add(new Entity("Австрия", "Население: 8 923 507 чел.\n" +
                "Столица: Вена\nПлощадь государства: 83 879 км²\nЯзык: австрийский вариант немецкого\nКрупнейшие города: Вена, Грац, Линц, Зальцбург, Инсбрук", R.drawable.im1));
        entities.add(new Entity("Болгария", "Население: 6 847 402 чел.\n" +
                "Столица: София\nПлощадь государства: 110 993,6 км²\nЯзык: болгарский\nКрупнейшие города: София, Пловдив, Варна, Бургас, Русе, Стара-Загора, Плевен, Сливен, Добрич, Шумен, Перник, Хасково, Ямбол", R.drawable.im2));
        entities.add(new Entity("Ватикан", "Население: 825 чел.\n" +
                "Столица: Ватикан\nПлощадь государства: 0,49 км²\nЯзыки: итальянский, латинский\nКрупнейшие города: Ватикан", R.drawable.im3));
        entities.add(new Entity("Греция", "Население: 10 482 487 чел.\n" +
                "Столица: Афины\nПлощадь государства: 131 957 км²\nЯзык: греческий\nКрупнейшие города: Афины, Салоники, Патры, Ираклион, Лариса", R.drawable.im4));
        entities.add(new Entity("Дания", "Население: 5 848 669 чел.\n" +
                "Столица: Копенгаген\nПлощадь государства: 43 094 км²\nЯзык: греческий\nКрупнейшие города: Копенгаген, Орхус, Оденсе, Ольборг", R.drawable.im5));
        entities.add(new Entity("Италия", "Население: 58 983 122 чел.\n" +
                "Столица: Рим\nПлощадь государства: 302 073 км²\nЯзык: итальянский\nКрупнейшие города: Рим, Милан, Неаполь, Турин, Палермо, Генуя, Венеция, Болонья, Флоренция, Бари, Катания", R.drawable.im6));
        entities.add(new Entity("Латвия", "Население: 1 891 000 чел.\n" +
                "Столица: Рига\nПлощадь государства: 64 589 км²\nЯзык: латышский\nКрупнейшие города: Рига, Даугавпилс, Лиепая, Елгава, Юрмала, Вентспилс", R.drawable.im7));
        entities.add(new Entity("Россия", "Население: 146 748 590 чел.\n" +
                "Столица: Москва\nПлощадь государства: 17 207 090 км²\nЯзык: Русский\nКрупнейшие города: Москва, Санкт-Петербург, Новосибирск, Екатеринбург, Казань, Нижний Новгород, Челябинск, Самара, Омск, Ростов-на-Дону, Уфа, Красноярск, Воронеж, Пермь, Волгоград, Краснодар", R.drawable.img1));
        entities.add(new Entity("Северная Македония", "Население: 2 073 702 чел.\n" +
                "Столица: Скопье\nПлощадь государства: 25 333 км²\nЯзыки: македонский и албанский\nКрупнейшие города: Скопье, Тетово, Куманово, Битола, Прилеп, Охрид", R.drawable.im8));
        entities.add(new Entity("Хорватия", "Население:  4 188 853 чел.\n" +
                "Столица: Загреб\nПлощадь государства: 56 594 км²\nЯзык: Русский\nКрупнейшие города: Загреб, Сплит, Риека, Осиек", R.drawable.im9));
    }

    // переопределение onBackPressed
    @Override
    public void onBackPressed() {
        Intent intent  = new Intent(getApplicationContext(), EuropeActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}