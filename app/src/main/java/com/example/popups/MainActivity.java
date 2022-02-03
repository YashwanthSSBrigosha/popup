package com.example.popups;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button popup1,popup2,popup3,popup4,popup5,popup6;
    private AlertDialog.Builder alertDialogBuilder;
    private AlertDialog alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        popup1 = (Button) findViewById(R.id.popup_1);
        popup2 = (Button) findViewById(R.id.popup_2);
        popup3 = (Button) findViewById(R.id.popup_3);
        popup4 = (Button) findViewById(R.id.popup_4);
        popup5 = (Button) findViewById(R.id.popup_5);
        popup6 = (Button) findViewById(R.id.popup_6);

        popup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupView1();
            }
        });

        popup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupView2();
            }
        });

        popup3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupView3();
            }
        });

        popup4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupView4();
            }
        });

        popup5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupView5();
            }
        });

        popup6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupView6();
            }
        });
    }

    public void popupView1(){
        alertDialogBuilder = new AlertDialog.Builder(this);
        final View popupView1 = getLayoutInflater().inflate(R.layout.popup_1,null);
        popupView1.setClipToOutline(true);
        alertDialogBuilder.setView(popupView1);
        alertDialog = alertDialogBuilder.create();
        alertDialog.show();
        Toast.makeText(getApplicationContext(), popup1.getText()+"Clicked", Toast.LENGTH_LONG).show();

    }

    public void popupView2(){
        alertDialogBuilder = new AlertDialog.Builder(this);
        final View popupView2 = getLayoutInflater().inflate(R.layout.popup_2,null);
        alertDialogBuilder.setView(popupView2);
        alertDialog = alertDialogBuilder.create();
        alertDialog.show();
        Toast.makeText(getApplicationContext(), popup2.getText()+"Clicked", Toast.LENGTH_LONG).show();

    }

    public void popupView3(){
        alertDialogBuilder = new AlertDialog.Builder(this);
        final View popupView3 = getLayoutInflater().inflate(R.layout.popup_3,null);
        alertDialogBuilder.setView(popupView3);
        alertDialog = alertDialogBuilder.create();
        alertDialog.show();
        Toast.makeText(getApplicationContext(), popup3.getText()+"Clicked", Toast.LENGTH_LONG).show();
    }

    public void popupView4(){
        alertDialogBuilder = new AlertDialog.Builder(this);
        final View popupView4 = getLayoutInflater().inflate(R.layout.popup_4,null);
        alertDialogBuilder.setView(popupView4);
        alertDialog = alertDialogBuilder.create();
        alertDialog.show();
        Toast.makeText(getApplicationContext(),popup4.getText()+"Clicked",Toast.LENGTH_LONG).show();

    }

    public void popupView5(){
        alertDialogBuilder = new AlertDialog.Builder(this);
        final View popupView5 = getLayoutInflater().inflate(R.layout.popup_5,null);
        alertDialogBuilder.setView(popupView5);
        alertDialog = alertDialogBuilder.create();
        alertDialog.show();
        Toast.makeText(getApplicationContext(), popup5.getText()+"Clicked", Toast.LENGTH_LONG).show();

    }

    public void popupView6(){
        alertDialogBuilder = new AlertDialog.Builder(this);
        final View popupView6 = getLayoutInflater().inflate(R.layout.popup_6,null);
        alertDialogBuilder.setView(popupView6);
        alertDialog = alertDialogBuilder.create();
        alertDialog.show();
        Toast.makeText(getApplicationContext(), popup6.getText()+"Clicked", Toast.LENGTH_LONG).show();

    }
}