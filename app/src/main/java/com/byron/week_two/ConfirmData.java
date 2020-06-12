package com.byron.week_two;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ConfirmData extends AppCompatActivity {

    private TextView tvConfirmName;
    private TextView tvBirthdate;
    private TextView tvPhone;
    private TextView tvEmail;
    private TextView tvContactDescription;
    private Button   btEdit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_data);

        Bundle parametres = getIntent().getExtras();
        String completName = parametres.getString(getResources().getString(R.string.pname));
        String birthDate = parametres.getString(getResources().getString(R.string.pdatepicker));
        String phone = parametres.getString(getResources().getString(R.string.pphone));
        String email = parametres.getString(getResources().getString(R.string.pemail));
        String contactDescription = parametres.getString(getResources().getString(R.string.pcontact_description));

        tvConfirmName = findViewById(R.id.tvConfirmName);
        tvBirthdate   = findViewById(R.id.tvBirthdate);
        tvPhone = findViewById(R.id.tvPhone);
        tvEmail = findViewById(R.id.tvEmail);
        tvContactDescription = findViewById(R.id.tvContactDescription);
        btEdit = findViewById(R.id.btEdit);

        tvConfirmName.setText(completName);
        tvBirthdate.setText(birthDate);
        tvPhone.setText(phone);
        tvEmail.setText(email);
        tvContactDescription.setText(contactDescription);



        btEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();

            }
        });
    }
}
