package com.example.androidstudentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    LinkedList<StudentModel> students = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        students.add(new StudentModel("Studet", "1", "Adress1", 0501111));
        students.add(new StudentModel("Studet1", "2", "Adress2", 052656));
        students.add(new StudentModel("Studet2", "3", "Adress3", 21254651));
        students.add(new StudentModel("Studet3", "4", "Adress4", 1321564));
        students.add(new StudentModel("Studet4", "5", "Adress5", 12315646));
        students.add(new StudentModel("Studet5", "6", "Adress6", 32156469));

        findViewById(R.id.new_student_btn)
                .setOnClickListener(view -> startActivity(
                        new Intent(this, StudentsDetailActivity.class)
                ));
    }
}