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
        //TODO Wait for danielle and add recyclerView presenting the list data
        //TODO check how to pass this data to other screens (they should be able to edit the original list)
        students.add(new StudentModel("Student", "1", "Address1", 0501111));
        students.add(new StudentModel("Student1", "2", "Address2", 052656));
        students.add(new StudentModel("Student2", "3", "Address3", 21254651));
        students.add(new StudentModel("Student3", "4", "Address4", 1321564));
        students.add(new StudentModel("Student4", "5", "Address5", 12315646));
        students.add(new StudentModel("Student5", "6", "Address6", 32156469));

        findViewById(R.id.new_student_btn)
                .setOnClickListener(view -> startActivity(
                        new Intent(this, AddStudentActivity.class)
                ));
    }
}