package com.example.androidstudentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class EditStudentActivity extends AppCompatActivity {
    EditText name, id, phone, address;
    CheckBox checkBox;
    Button saveBtn, deleteBtn, cancelBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_student);

        name = findViewById(R.id.edit_student_name_et);
        id = findViewById(R.id.edit_student_id_et);
        phone = findViewById(R.id.edit_student_phone_et);
        address = findViewById(R.id.edit_student_address_et);

        checkBox = findViewById(R.id.student_details_checkbox);

        saveBtn = findViewById(R.id.edit_student_save_btn);
        cancelBtn = findViewById(R.id.edit_student_cancel_btn);
        deleteBtn = findViewById(R.id.edit_student_delete_btn);

        saveBtn.setOnClickListener(view -> saveStudent());
        cancelBtn.setOnClickListener(view -> finish());

    }


    void saveStudent() {
        //TODO update the relevant student on the list of student with this new data
        name.getText();
        id.getText();
        phone.getText();
        address.getText();
    }
}