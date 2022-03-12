package com.cv.pertemuan10mobiled;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nama = findViewById(R.id.name_et);
        EditText email = findViewById(R.id.email_et);

        RadioButton frontend = findViewById(R.id.frontend_rb);
        RadioButton backend = findViewById(R.id.backend_rb);
        RadioButton uiux = findViewById(R.id.uiux_rb);
        RadioButton mobile = findViewById(R.id.mobile_rb);
        RadioButton java = findViewById(R.id.java_rb);

        Button register = findViewById(R.id.register_btn);

        SharedPreferences sp = getSharedPreferences("dataLogin", MODE_PRIVATE);
        SharedPreferences.Editor edit = sp.edit();

        // Nama lengkap harus lebih dari 5 huruf
        // Email harus berakhiran dengan @binus.ac.id
        // Radio button harus dipilih satu, tidak boleh kosong

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nama.getText().toString().length() <= 5){
                    Snackbar.make(view, "Nama lengkap harus lebih dari 5 huruf", Snackbar.LENGTH_LONG).show();
                }else if(!email.getText().toString().endsWith("@binus.ac.id")){
                    Snackbar.make(view, "Email harus berakhiran dengan @binus.ac.id", Snackbar.LENGTH_LONG).show();
                }else if(!frontend.isChecked() && !backend.isChecked() && !uiux.isChecked() && !mobile.isChecked() && !java.isChecked()){
                    Snackbar.make(view, "Harus pilih satu course", Snackbar.LENGTH_LONG).show();
                }else{
                    AlertDialog.Builder build = new AlertDialog.Builder(MainActivity.this);
                    build.setTitle("Konfirmasi registrasi").setMessage("Apakah semua data yang dimasukkan sudah benar?")
                            .setPositiveButton("Sudah", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    edit.putString("nama", nama.getText().toString());
                                    edit.putString("email", email.getText().toString());
                                    if(frontend.isChecked()){
                                        edit.putString("course", "Front End Development");
                                    }else if(backend.isChecked()){
                                        edit.putString("course", "Back End Development");
                                    }else if(uiux.isChecked()){
                                        edit.putString("course", "UI/UX");
                                    }else if(mobile.isChecked()){
                                        edit.putString("course", "Mobile App Development");
                                    }else if(java.isChecked()){
                                        edit.putString("course", "Java Programming");
                                    }
                                    edit.apply();
                                    Intent toHome = new Intent(MainActivity.this, HomeActivity.class);
                                    startActivity(toHome);
                                }
                            }).setNegativeButton("Belum", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.dismiss();
                                }
                    });
                    AlertDialog dialog = build.create();
                    dialog.show();
                }
            }
        });

    }
}