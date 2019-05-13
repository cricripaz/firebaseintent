package com.example.firebaseintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;
import java.util.TooManyListenersException;

public class NoteDetailsActivity extends AppCompatActivity {

    private EditText materia_EditText;
    private EditText primero_EditText;
    private EditText segundo_EditText;
    private EditText tercero_EditText;

    private Button addButton;
    private Button backbtn;
    private Button deletebtn;
    private Button updatebtn;

    private String key;
    private String primero;
    private String segundo;
    private String tercero;
    private String materia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_details);

        key = getIntent().getStringExtra("key");
        primero =  getIntent().getStringExtra("primero");
        segundo = getIntent().getStringExtra("segundo");
        tercero = getIntent().getStringExtra("tercero");
        materia = getIntent().getStringExtra("materia");

        materia_EditText =(EditText) findViewById(R.id.materia_editText);
        materia_EditText.setText(materia);

        primero_EditText =(EditText) findViewById(R.id.primero_editText);
        primero_EditText.setText(primero);
        segundo_EditText =(EditText) findViewById(R.id.segundo_editText);
        segundo_EditText.setText(segundo);
        tercero_EditText =(EditText) findViewById(R.id.tercero_editText);
        tercero_EditText.setText(tercero);
        addButton = (Button) findViewById(R.id.add_button);

        backbtn = (Button) findViewById(R.id.back_btn);

        deletebtn = (Button) findViewById(R.id.delete_button);

        updatebtn = (Button) findViewById(R.id.update_button);

        updatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Notes note = new Notes();
                note.setN_materia(materia_EditText.getText().toString());
                note.setPrimero(primero_EditText.getText().toString());
                note.setSegundo(segundo_EditText.getText().toString());
                note.setTercero(tercero_EditText.getText().toString());

                new FirebaseDatabaseHelper().updateNote(key, note, new FirebaseDatabaseHelper.DataStatus() {
                    @Override
                    public void DataIsLoaded(List<Notes> notes, List<String> keys) {

                    }

                    @Override
                    public void DataIsInserted() {

                    }

                    @Override
                    public void DataIsUpdated() {
                        Toast.makeText(NoteDetailsActivity.this, "Datos Actualizados",Toast.LENGTH_LONG).show();

                    }

                    @Override
                    public void DataIsDeleted() {

                    }
                });

            }
        });

        deletebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new FirebaseDatabaseHelper().deleteNote(key, new FirebaseDatabaseHelper.DataStatus() {
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
                        Toast.makeText(NoteDetailsActivity.this,"delete exitoso",Toast.LENGTH_LONG).show();
                        finish(); return;
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
