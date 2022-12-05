package com.example.androidstudentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class StudentsDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_detail);


        findViewById(R.id.edit_student_save_btn)
                .setOnClickListener(view -> startActivity(
                        new Intent(this, EditStudentActivity.class)
                ));

        TextView name = findViewById(R.id.student_details_id_tv);
        TextView id = findViewById(R.id.student_details_name_tv);
        TextView phone = findViewById(R.id.student_details_phone_tv);
        TextView address = findViewById(R.id.student_details_id_tv);

        CheckBox checkBox = findViewById(R.id.student_details_checkbox);

        name.setText("Name: TODO CHANGE THIS");
        id.setText("Id: TODO CHANGE THIS");
        phone.setText("Phone: TODO CHANGE THIS");
        address.setText("Address: TODO CHANGE THIS");
    }
}