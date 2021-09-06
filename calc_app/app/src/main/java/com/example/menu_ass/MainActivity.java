package com.example.menu_ass;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textv=(TextView)findViewById(R.id.textView3);
        registerForContextMenu(textv);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater inf=getMenuInflater();

        inf.inflate(R.menu.menu2,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        float num1=0;
        float num2=0;
        boolean n1=false;
        boolean n2=false;
        if (((EditText)findViewById(R.id.editTextNumber)).getText().toString().equals("")){
            num1=0;
            n1=true;
        }
        if(((EditText)findViewById(R.id.editTextNumber2)).getText().toString().equals("")){
            num2=0;
            n2=true;
        }
        if(n1==false) {
            num1 = Integer.parseInt(((EditText) findViewById(R.id.editTextNumber)).getText().toString());
        }
        if(n2==false) {
            num2 = Integer.parseInt(((EditText) findViewById(R.id.editTextNumber2)).getText().toString());
        }
        float res=0;
        switch (item.getItemId()) {
            case R.id.addition2:
                res = num1 + num2;
                ((TextView) findViewById(R.id.textView3)).setText(String.valueOf(res));
                return true;
            case R.id.subtraction2:
                res = num1 - num2;
                ((TextView) findViewById(R.id.textView3)).setText(String.valueOf(res));
                return true;

            case R.id.mult2:
                res = num1 * num2;
                ((TextView) findViewById(R.id.textView3)).setText(String.valueOf(res));
                return true;

            case R.id.divition2:
                if (num2 == 0) {
                    Toast.makeText(getApplicationContext(), "you cnnot divide by zero !", Toast.LENGTH_LONG).show();
                    return true;
                } else {
                    res = num1 / num2;
                    ((TextView) findViewById(R.id.textView3)).setText(String.valueOf(res));
                    return true;
                }


        }
        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inf=getMenuInflater();

        inf.inflate(R.menu.menu1,menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        float num1=0;
        float num2=0;
        boolean n1=false;
        boolean n2=false;
        if (((EditText)findViewById(R.id.editTextNumber)).getText().toString()==""){
            num1=0;
            n1=true;
        }
        if(((EditText)findViewById(R.id.editTextNumber2)).getText().toString()==""){
            num2=0;
            n2=true;
        }
        if(n1==false) {
            num1 = Integer.parseInt(((EditText) findViewById(R.id.editTextNumber)).getText().toString());
        }
        if(n2==false) {
            num2 = Integer.parseInt(((EditText) findViewById(R.id.editTextNumber2)).getText().toString());
        }
        float res=0;
        switch (item.getItemId()) {
            case R.id.addition:
                res = num1 + num2;
                ((TextView) findViewById(R.id.textView3)).setText(String.valueOf(res));
                return true;
            case R.id.subtraction:
                res = num1 - num2;
                ((TextView) findViewById(R.id.textView3)).setText(String.valueOf(res));
                return true;
            case R.id.mult:
                res = num1 * num2;
                ((TextView) findViewById(R.id.textView3)).setText(String.valueOf(res));
                return true;
            case R.id.mul_three:
                res = num1 * num2 * 3;
                ((TextView) findViewById(R.id.textView3)).setText(String.valueOf(res));
                return true;
            case R.id.mul_four:
                res = num1 * num2 * 4;
                ((TextView) findViewById(R.id.textView3)).setText(String.valueOf(res));
                return true;
            case R.id.divition:
                if (num2 == 0) {
                    Toast.makeText(getApplicationContext(), "you cnnot divide by zero !", Toast.LENGTH_LONG).show();
                    return true;
                } else {
                    res = num1 / num2;
                    ((TextView) findViewById(R.id.textView3)).setText(String.valueOf(res));
                    return true;
                } }
            return false; }}