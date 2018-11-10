package com.nmit.contextmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn =(Button) findViewById(R.id.btnShow);
        registerForContextMenu(btn);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Context Menu");
        menu.add(0,v.getId(),0,"Upload");
        menu.add(0,v.getId(),3,"Search");
        menu.add(0,v.getId(),2,"Share");
        menu.add(0,v.getId(),1,"Bookmark");
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Toast.makeText(this,"Selected Item:"+item.getTitle(),Toast.LENGTH_SHORT).show();
        return true;
    }
}
