package com.example.firebaseintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;

import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerviewNotes);

        new FirebaseDatabaseHelper().readNotes(new FirebaseDatabaseHelper.DataStatus() {
            @Override
            public void DataIsLoaded(List<Notes> notes, List<String> keys) {
                new RecyclerView_Config().setConfig(mRecyclerView,MainActivity.this,notes,keys);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.notelist_activity_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.newMateria:
                startActivity(new Intent(this ,NewNoteActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
