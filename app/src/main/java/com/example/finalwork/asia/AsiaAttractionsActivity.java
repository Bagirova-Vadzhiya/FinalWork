package com.example.finalwork.asia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalwork.Entity;
import com.example.finalwork.GeneralAdapter;
import com.example.finalwork.R;

import com.example.finalwork.SecondActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class AsiaAttractionsActivity extends AppCompatActivity {

    List<Entity> entities = new ArrayList<Entity>();

    FloatingActionButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asia_attractions);

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

        RecyclerView recyclerView = findViewById(R.id.attractionsList);

        GeneralAdapter adapter = new GeneralAdapter(this, entities);

        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        entities.add(new Entity("Великая Китайская стена", "Страна: Китай", R.drawable.attractions_1));
        entities.add(new Entity("Терракотовая армия", "Страна: Китай", R.drawable.attractions_2));
        entities.add(new Entity("Тадж-Махал", "Страна: Индия", R.drawable.attractions_3));
        entities.add(new Entity("Золотой павильон", "Страна: Япония", R.drawable.attractions_4));
        entities.add(new Entity("Московский Кремль", "Страна: Россия", R.drawable.attractions_5));
        entities.add(new Entity("Бухта Халонг", "Страна: Вьетнам", R.drawable.attractions_6));
        entities.add(new Entity("Ангкор-Ват", "Страна: Камбоджа", R.drawable.attractions_7));
        entities.add(new Entity("Башни По Нагар", "Страна: Вьетнам", R.drawable.attractions_8));
        entities.add(new Entity("Путраджайя", "Страна: Малайзия", R.drawable.attractions_9));
        entities.add(new Entity("Запретный город", "Страна: Китай", R.drawable.attractions_10));

    }

    // переопределение onBackPressed
    @Override
    public void onBackPressed() {
        Intent intent  = new Intent(getApplicationContext(), AsiaActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}
