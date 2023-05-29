package com.example.finalwork.australia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalwork.Entity;
import com.example.finalwork.GeneralAdapter;
import com.example.finalwork.R;

import com.example.finalwork.asia.AsiaActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class AustraliaAttractionsActivity extends AppCompatActivity {

    List<Entity> entities = new ArrayList<Entity>();

    FloatingActionButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_australia_attractions);

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

        RecyclerView recyclerView = findViewById(R.id.attractionsList);

        GeneralAdapter adapter = new GeneralAdapter(this, entities);

        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        entities.add(new Entity("Большой Барьерный Риф", "Страна: Австралия", R.drawable.attractions9));
        entities.add(new Entity("Скала Айерс Рок (Улуру)", "Страна: Австралия", R.drawable.attractions10));
        entities.add(new Entity("Скай Тауэр", "Страна: Новая Зеландия", R.drawable.attractions11));
        entities.add(new Entity("Музей Фиджи", "Страна: Фиджи", R.drawable.attractions12));
        entities.add(new Entity("Сиднейский оперный театр", "Страна: Австралия", R.drawable.attractions13));
        entities.add(new Entity("Рок-Айлендс", "Страна: Палау", R.drawable.attractions14));
        entities.add(new Entity("Архипелаг Ясава", "Страна: Фиджи", R.drawable.attractions15));
    }

    // переопределение onBackPressed
    @Override
    public void onBackPressed() {
        Intent intent  = new Intent(getApplicationContext(), AustraliaActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}