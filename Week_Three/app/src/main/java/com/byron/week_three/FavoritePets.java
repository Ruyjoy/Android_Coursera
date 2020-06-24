package com.byron.week_three;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Objects;


public class FavoritePets extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView recyclerViewFavoritePets;
    AdapterFavoritePets adapterFavoritePets;
    ArrayList<FavoritePetsList> favoritePetsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_pets);

        toolbar = findViewById(R.id.miActionBar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);



        favoritePetsList= new ArrayList<>();
        recyclerViewFavoritePets = findViewById(R.id.rvFavoritePets);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerViewFavoritePets.setLayoutManager(linearLayoutManager);
        adapterFavoritePets = new AdapterFavoritePets(favoritePetsList);
        recyclerViewFavoritePets.setAdapter(adapterFavoritePets);

        fillPets();

    }

    public boolean onCreateOptionMenu (MenuItem menuItem){

        getMenuInflater().inflate(R.menu.menu, (Menu) menuItem);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem menuItem){
        switch (menuItem.getItemId()){
            case android.R.id.home:
                Intent intent = new Intent(FavoritePets.this, MainActivity.class);
                startActivity(intent);
                break;
        }
        return  true;
    }

      private void fillPets (){

      favoritePetsList.add(new FavoritePetsList("Bambi","0",  R.drawable.dog_5,   R.drawable.hueso_raiting, R.drawable.hueso_like));
      favoritePetsList.add(new FavoritePetsList("Sam","0",    R.drawable.dog_4,   R.drawable.hueso_raiting, R.drawable.hueso_like));
      favoritePetsList.add(new FavoritePetsList("Luna","0",   R.drawable.dog_8,   R.drawable.hueso_raiting, R.drawable.hueso_like));
      favoritePetsList.add(new FavoritePetsList("Raiter","0", R.drawable.dog_2,   R.drawable.hueso_raiting, R.drawable.hueso_like));
      favoritePetsList.add(new FavoritePetsList("Lucas","0",  R.drawable.dog_1,   R.drawable.hueso_raiting, R.drawable.hueso_like));

    }



}
