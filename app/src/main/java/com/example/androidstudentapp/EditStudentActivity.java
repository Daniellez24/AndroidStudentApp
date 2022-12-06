package com.example.androidstudentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class EditStudentActivity extends AppCompatActivity {
    EditText name, id, phone, address;
    CheckBox checkBox;
    Button saveBtn, deleteBtn, cancelBtn;
    int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_student);

        Intent intent = getIntent();
        pos = (intent.getIntExtra("studentRow", -1));
        Log.d("edit position", pos + "");

        name = findViewById(R.id.edit_student_name_et);
        id = findViewById(R.id.edit_student_id_et);
        phone = findViewById(R.id.edit_student_phone_et);
        address = findViewById(R.id.edit_student_address_et);

        checkBox = findViewById(R.id.edit_student_checkbox);

        saveBtn = findViewById(R.id.edit_student_edit_btn);
        cancelBtn = findViewById(R.id.edit_student_cancel_btn);
        deleteBtn = findViewById(R.id.edit_student_delete_btn);

        name.setText(MainActivity.students.get(pos).name);
        id.setText(MainActivity.students.get(pos).id);
        phone.setText(MainActivity.students.get(pos).phone);
        address.setText(MainActivity.students.get(pos).address);
        checkBox.setChecked(MainActivity.students.get(pos).cb);

        saveBtn.setOnClickListener(view -> saveStudent());
        deleteBtn.setOnClickListener(view -> deleteStudent());
        cancelBtn.setOnClickListener(view -> finish());

    }

    void saveStudent() {
        MainActivity.students.get(pos).setName(name.getText().toString());
        MainActivity.students.get(pos).setId(id.getText().toString());
        MainActivity.students.get(pos).setPhone(phone.getText().toString());
        MainActivity.students.get(pos).setAddress(address.getText().toString());
        MainActivity.students.get(pos).setCb(checkBox.isChecked());
        finish();
    }

    void deleteStudent(){
        MainActivity.students.remove(pos);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}