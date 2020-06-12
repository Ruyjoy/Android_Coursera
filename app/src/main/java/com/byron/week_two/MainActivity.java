package com.byron.week_two;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText etName;
    private EditText etPhone;
    private EditText etEmail;
    private EditText etContactDescription;
    private Button button;
    private DatePicker dpDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName= findViewById(R.id.etName);
        etPhone= findViewById(R.id.etPhone);
        etEmail= findViewById(R.id.etEmail);
        etContactDescription= findViewById(R.id.etContactDescription);
        dpDate = findViewById(R.id.dpDate);
        button= findViewById(R.id.miButtonNext);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ConfirmData.class);
                intent.putExtra(getResources().getString(R.string.pname),etName.getText().toString());
                intent.putExtra(getResources().getString(R.string.pdatepicker),String.valueOf(dpDate.getDayOfMonth())+
                        "/"+ String.valueOf(dpDate.getMonth())+"/"+ String.valueOf(dpDate.getYear()));
                intent.putExtra(getResources().getString(R.string.pphone), etPhone.getText().toString());
                intent.putExtra(getResources().getString(R.string.pemail), etEmail.getText().toString());
                intent.putExtra(getResources().getString(R.string.pcontact_description), etContactDescription.getText().toString());
                startActivity(intent);


            }
        });
   }


}
