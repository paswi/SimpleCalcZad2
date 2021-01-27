package com.example.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        log("Wykonano onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();

        log("Wykonano onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();

        log("Wykonano onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();

        log("Wykonano onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();

        log("Wykonano onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        log("Wykonano onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        log("Wykonano onRestart()");
    }

    public void buttonProgrammerClick(View v) {
        Intent programmerCalcIntent = new Intent(this, ProgrammerCalcActivity.class);
        startActivity(programmerCalcIntent);
    }

    private void log(String text) {
        EditText textEditLog = findViewById(R.id.editTextLog);
        Editable logText = textEditLog.getText();
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        logText.insert(0, dateFormat.format(new Date()) + ": " + text + '\n');
        textEditLog.setText(logText);
    }
}