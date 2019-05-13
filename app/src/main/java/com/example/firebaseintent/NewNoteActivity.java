package com.example.firebaseintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class NewNoteActivity extends AppCompatActivity {


    private EditText materia_EditText;
    private EditText primero_EditText;
    private EditText segundo_EditText;
    private EditText tercero_EditText;

    private Button addButton;
    private Button backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_note);
        materia_EditText =(EditText) findViewById(R.id.materia_editText);

        primero_EditText =(EditText) findViewById(R.id.primero_editText);

        segundo_EditText =(EditText) findViewById(R.id.segundo_editText);

        tercero_EditText =(EditText) findViewById(R.id.tercero_editText);

        addButton = (Button) findViewById(R.id.add_button);

        backbtn = (Button) findViewById(R.id.back_btn);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Notes note = new Notes();
                note.setN_materia(materia_EditText.getText().toString());
                note.setPrimero(primero_EditText.getText().toString());
                note.setSegundo(segundo_EditText.getText().toString());
                note.setTercero(tercero_EditText.getText().toString());
                new FirebaseDatabaseHelper().addNote(note, new FirebaseDatabaseHelper.DataStatus() {
                    @Override
                    public void DataIsLoaded(List<Notes> notes, List<String> keys) {

                    }

                    @Override
                    public void DataIsInserted() {

                    }

                    @Override
                    public void DataIsUpdated() {

                    }

                    @Override
                    public void DataIsDeleted() {

                    }
                });
            }


        });

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); return;

            }
        });
    }
}
