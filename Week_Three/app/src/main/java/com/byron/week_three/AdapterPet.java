package com.byron.week_three;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class AdapterPet extends RecyclerView.Adapter<AdapterPet.PetViewHolder> {

    ArrayList<Pets> petsList;
    //Generamos el constructor que reciba esa lista de mascostas


    public AdapterPet(ArrayList<Pets> petsList) {
        this.petsList = petsList;
    }

    @NonNull
    @Override
    public AdapterPet.PetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        return new PetViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterPet.PetViewHolder holder, int position) {
        //Coloca el contenido (texto o imagen) en el view correspondiente, ya sea un textview o ImageView etc..
        Pets pets = petsList.get(position);
        holder.ivPets.setImageResource(pets.getImagePet());
        holder.ivBonesRaiting.setImageResource(pets.getImageBonesRaiting());
        holder.ivBonesCheck.setImageResource(pets.getImageBonesCheckg());
        holder.tvNameDog.setText(pets.getNamePet());
        holder.tvQuantity.setText(pets.getPetQuantity());



    }

    @Override
    public int getItemCount() {
        return petsList.size();
    }
       //Esta clase es utilizada para evitar crear las vistas o views desde cero
    public class PetViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivPets;
        private ImageView ivBonesRaiting;
        private ImageView ivBonesCheck;
        private TextView tvNameDog;
        private TextView tvQuantity;
        //Constructor
        public PetViewHolder(@NonNull View itemView) {
            super(itemView);

            ivPets          =   itemView.findViewById(R.id.ivPets);
            ivBonesRaiting  =   itemView.findViewById(R.id.ivBonesRaiting);
            ivBonesCheck    =   itemView.findViewById(R.id.ivbBonesCheck);
            tvNameDog       =   itemView.findViewById(R.id.tvNameDog);
            tvQuantity      =   itemView.findViewById(R.id.tvQuantity);



        }
    }
}
