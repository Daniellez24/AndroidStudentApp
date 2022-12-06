package com.example.androidstudentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.TextView;

public class StudentsDetailActivity extends AppCompatActivity {

    int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_detail);

    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onStart() {
        super.onStart();
        Intent intent = getIntent();
        pos = (intent.getIntExtra("position", -1));
        Log.d("edit",intent.getStringExtra("position") + "");

        TextView name = findViewById(R.id.student_details_name_tv);
        TextView id = findViewById(R.id.student_details_id_tv);
        TextView phone = findViewById(R.id.student_details_phone_tv);
        TextView address = findViewById(R.id.student_details_address_tv);

        CheckBox checkBox = findViewById(R.id.student_details_checkbox);

        name.setText("Name: " + MainActivity.students.get(pos).name);
        id.setText("ID: " + MainActivity.students.get(pos).id);
        phone.setText("Phone: " + MainActivity.students.get(pos).phone);
        address.setText("Address: " + MainActivity.students.get(pos).address);
        checkBox.setChecked(MainActivity.students.get(pos).cb);

        findViewById(R.id.edit_student_edit_btn)
                .setOnClickListener(view -> startActivity(
                        new Intent(this, EditStudentActivity.class)
                                .putExtra("studentRow", pos)
                ));
    }
}