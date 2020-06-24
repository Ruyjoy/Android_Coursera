package com.byron.week_three;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    ArrayList<Pets> petsList;
    RecyclerView recyclerViewPets;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.miActionBar);
        setSupportActionBar(toolbar);




        petsList = new ArrayList<>();
        //Se obtiene el identificador para el recyclerview
        recyclerViewPets = findViewById(R.id.rvPets);
        //Proporciona el recyclerview a un administrador de diseño predeterminado
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewPets.setLayoutManager(linearLayoutManager);

        fillPets();
        //Conecta el adaptador con el recyclerview
        AdapterPet adapter = new AdapterPet(petsList);
        recyclerViewPets.setAdapter(adapter);


    }

    public boolean onCreateOptionsMenu (Menu menu){

        getMenuInflater().inflate(R.menu.menu,menu);
        return true;


    }

    public boolean onOptionsItemSelected(MenuItem menuItem){
        switch (menuItem.getItemId()){
            case R.id.iconStar:
                Intent intent = new Intent(MainActivity.this, FavoritePets.class);
                startActivity(intent);
            break;
        }

        return true;
    }


    private void fillPets (){

        petsList.add(new Pets("Bambi","0",  R.drawable.dog_1,   R.drawable.hueso_raiting, R.drawable.hueso_like));
        petsList.add(new Pets("Sam","0",    R.drawable.dog_2,   R.drawable.hueso_raiting, R.drawable.hueso_like));
        petsList.add(new Pets("Luna","0",   R.drawable.dog_3,   R.drawable.hueso_raiting, R.drawable.hueso_like));
        petsList.add(new Pets("Raiter","0", R.drawable.dog_4,   R.drawable.hueso_raiting, R.drawable.hueso_like));
        petsList.add(new Pets("Lucas","0",  R.drawable.dog_5,   R.drawable.hueso_raiting, R.drawable.hueso_like));
        petsList.add(new Pets("Sacha","0",  R.drawable.dog_6,   R.drawable.hueso_raiting, R.drawable.hueso_like));
        petsList.add(new Pets("Lin","0",    R.drawable.dog_7,   R.drawable.hueso_raiting, R.drawable.hueso_like));
        petsList.add(new Pets("Toby","0",    R.drawable.dog_8,   R.drawable.hueso_raiting, R.drawable.hueso_like));



    }


}
