package com.hardiyan.magister.juventusplayers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;

import com.hardiyan.magister.juventusplayers.adapter.ListPlayerAdapter;
import com.hardiyan.magister.juventusplayers.model.Player;
import com.hardiyan.magister.juventusplayers.model.PlayersData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvPlayers;
    private ArrayList<Player> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPlayers = findViewById(R.id.rv_juve);
        rvPlayers.setHasFixedSize(true);

        list.addAll(PlayersData.getListData());
        showRecyclerList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.about, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void showRecyclerList(){
        rvPlayers.setLayoutManager(new LinearLayoutManager(this));
        ListPlayerAdapter listPlayerAdapter = new ListPlayerAdapter(list);
        rvPlayers.setAdapter(listPlayerAdapter);
    }
}
