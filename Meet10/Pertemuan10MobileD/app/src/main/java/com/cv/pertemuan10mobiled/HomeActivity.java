package com.cv.pertemuan10mobiled;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView welcome = findViewById(R.id.welcome_text);
        TextView emailText = findViewById(R.id.email_text);
        TextView courseText = findViewById(R.id.chosencourse_text);

        SharedPreferences sp = getSharedPreferences("dataLogin", MODE_PRIVATE);

        welcome.setText("Welcome " + sp.getString("nama", " ") + "!");
        emailText.setText("Email: " + sp.getString("email", " "));
        courseText.setText("Course yang dipilih: " + sp.getString("course", " "));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int menu = item.getItemId();
        switch(menu){
            case R.id.logout_item:{
                Intent toMain = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(toMain);
            }

        }
        return super.onOptionsItemSelected(item);
    }
}