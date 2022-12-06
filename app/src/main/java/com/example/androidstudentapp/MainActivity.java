package com.example.androidstudentapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    LinkedList<Student> students = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.activity_student_recycler_list);
        list.hasFixedSize();

        list.setLayoutManager(new LinearLayoutManager(this));
        StudentRecyclerAdapter adapter = new StudentRecyclerAdapter();
        list.setAdapter(adapter);

        adapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(int pos) {
                Log.d("TAG", "Row was clicked " + pos);
            }
        });
        //TODO Wait for danielle and add recyclerView presenting the list data
        //TODO check how to pass this data to other screens (they should be able to edit the original list)
        students.add(new Student("Student", "1", "Address", "1234", false ));
        students.add(new Student("Student1", "2", "Address", "1234", false));
        students.add(new Student("Student2", "3", "Address", "1234", false));
        students.add(new Student("Student3", "4", "Address", "1234", false));
        students.add(new Student("Student4", "5", "Address", "1234", false));
        students.add(new Student("Student5", "6", "Address", "1234", false));

        findViewById(R.id.new_student_btn)
                .setOnClickListener(view -> startActivity(
                        new Intent(this, AddStudentActivity.class)
                ));
    }

    class StudentViewHolder extends RecyclerView.ViewHolder{
        TextView nameTv;
        TextView idTv;
        CheckBox cb;

        public StudentViewHolder(View itemView, OnItemClickListener listener){
            super(itemView);
            nameTv = itemView.findViewById(R.id.studentlistrow_name_tv);
            idTv = itemView.findViewById(R.id.studentlistrow_id_tv);
            cb = itemView.findViewById(R.id.studentlistrow_cb);
            cb.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View view) {
                    int pos = (int)cb.getTag();
                    Student st = students.get(pos);
                    st.cb = cb.isChecked();
                }
            });

            itemView.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View view) {
                    int pos = getAdapterPosition();
                    listener.onItemClick(pos);
                }
            });

        }

        public void bind(Student st, int pos){
            nameTv.setText(st.name);
            idTv.setText(st.id);
            cb.setChecked(st.cb);
            cb.setTag(pos);
        }

    }

    public interface OnItemClickListener{
        void onItemClick(int pos);
    }

    class StudentRecyclerAdapter extends RecyclerView.Adapter<StudentViewHolder>{

        OnItemClickListener listener;

        void setOnItemClickListener(OnItemClickListener listener){
            this.listener = listener;
        }

        @NonNull
        @Override
        public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = getLayoutInflater().inflate(R.layout.student_list_row, parent, false);

            return new StudentViewHolder(view, listener);
        }

        @Override
        public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
            Student st = students.get(position);
            holder.bind(st, position);
        }

        @Override
        public int getItemCount() {
            return students.size();
        }
    }
}