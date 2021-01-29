package com.example.simplecalc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.app.FragmentManagerNonConfig;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*

        Button buttonSimple = findViewById(R.id.buttonSimpleFragment);
        Button buttonProg = findViewById(R.id.buttonProgrammerFragment);
*/

        Fragment FirstFragment = new SimpleCalcFrag();
        Fragment SecondFragment = new ProgCalcFrag();
        Fragment ThirdFragment = new viewFragmentLog();

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.frameView, FirstFragment).commit();
        fragmentManager.beginTransaction().replace(R.id.frameViewLog, ThirdFragment).commit();
        //log("Wykonano onCreate()");
    }

    ;


    public void onClickSimple(View v) {
        Fragment fragment = new SimpleCalcFrag();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.frameView, fragment)
                .commit();
        //log("Wykonano onCreate()");
    }

    public void onClickProg(View v) {
        Fragment fragment = new ProgCalcFrag();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.frameView, fragment)
                .commit();
        //log("Wykonano onCreate()");
    }

    public void buttonMultiplicationClick(View v) {
        EditText editTextA = findViewById(R.id.editTextNumber4);
        EditText editTextB = findViewById(R.id.editTextNumber5);
        EditText editTextResult = findViewById(R.id.editTextNumberResult3);
        EditText editTextResultBinary = findViewById(R.id.editTextNumberResultBinary3);

        int a, b;
        try {
            a = Integer.parseInt(editTextA.getText().toString());
        } catch (Exception e) {
            a = 0;
            editTextA.setText("0");
        }
        try {
            b = Integer.parseInt(editTextB.getText().toString());
        } catch (Exception e) {
            b = 0;
            editTextB.setText("");//setText("0");
        }
        int result = a * b;

        editTextResult.setText(Integer.toString(result));
        editTextResultBinary.setText(Integer.toBinaryString(result));
    }

    public void buttonAdditionClick(View v) {
        EditText editTextA = findViewById(R.id.editTextNumber4);
        EditText editTextB = findViewById(R.id.editTextNumber5);
        EditText editTextResult = findViewById(R.id.editTextNumberResult3);
        EditText editTextResultBinary = findViewById(R.id.editTextNumberResultBinary3);

        int a, b;
        try {
            a = Integer.parseInt(editTextA.getText().toString());
        } catch (Exception e) {
            a = 0;
            editTextA.setText("0");
        }
        try {
            b = Integer.parseInt(editTextB.getText().toString());
        } catch (Exception e) {
            b = 0;
            editTextB.setText("");//setText("0");
        }
        int result = a + b;

        editTextResult.setText(Integer.toString(result));
        editTextResultBinary.setText(Integer.toBinaryString(result));
    }

    public void buttonDivideClick(View v) {
        EditText editTextA = findViewById(R.id.editTextNumber4);
        EditText editTextB = findViewById(R.id.editTextNumber5);
        EditText editTextResult = findViewById(R.id.editTextNumberResult3);
        EditText editTextResultBinary = findViewById(R.id.editTextNumberResultBinary3);

        int a, b;
        try {
            a = Integer.parseInt(editTextA.getText().toString());
        } catch (Exception e) {
            a = 0;
            editTextA.setText("0");
        }
        try {
            b = Integer.parseInt(editTextB.getText().toString());
        } catch (Exception e) {
            b = 0;
            editTextB.setText("");//setText("0");
        }
        String Result;
        if (b != 0){
            int result = a / b;
        editTextResult.setText(Integer.toString(result));
        editTextResultBinary.setText(Integer.toBinaryString(result));
        }
        else
            Result = "Cannot divide by 0.";
    }

    public void buttonSubtractClick(View v) {
        EditText editTextA = findViewById(R.id.editTextNumber4);
        EditText editTextB = findViewById(R.id.editTextNumber5);
        EditText editTextResult = findViewById(R.id.editTextNumberResult3);
        EditText editTextResultBinary = findViewById(R.id.editTextNumberResultBinary3);

        int a, b;
        try {
            a = Integer.parseInt(editTextA.getText().toString());
        } catch (Exception e) {
            a = 0;
            editTextA.setText("0");
        }
        try {
            b = Integer.parseInt(editTextB.getText().toString());
        } catch (Exception e) {
            b = 0;
            editTextB.setText("");//setText("0");
        }
        int result = a - b;

        editTextResult.setText(Integer.toString(result));
        editTextResultBinary.setText(Integer.toBinaryString(result));
    }

    public void buttonANDDClick(View v) {
        EditText editTextA = findViewById(R.id.editTextNumber4);
        EditText editTextB = findViewById(R.id.editTextNumber5);
        EditText editTextResult = findViewById(R.id.editTextNumberResult3);
        EditText editTextResultBinary = findViewById(R.id.editTextNumberResultBinary3);

        int a, b;
        try {
            a = Integer.parseInt(editTextA.getText().toString());
        } catch (Exception e) {
            a = 0;
            editTextA.setText("0");
        }
        try {
            b = Integer.parseInt(editTextB.getText().toString());
        } catch (Exception e) {
            b = 0;
            editTextB.setText("");//setText("0");
        }
        int result = a & b;

        editTextResult.setText(Integer.toString(result));
        editTextResultBinary.setText(Integer.toBinaryString(result));
    }

    public void buttonXORClick(View v) {
        EditText editTextA = findViewById(R.id.editTextNumber4);
        EditText editTextB = findViewById(R.id.editTextNumber5);
        EditText editTextResult = findViewById(R.id.editTextNumberResult3);
        EditText editTextResultBinary = findViewById(R.id.editTextNumberResultBinary3);

        int a, b;
        try {
            a = Integer.parseInt(editTextA.getText().toString());
        } catch (Exception e) {
            a = 0;
            editTextA.setText("0");
        }
        try {
            b = Integer.parseInt(editTextB.getText().toString());
        } catch (Exception e) {
            b = 0;
            editTextB.setText("");//setText("0");
        }
        int result = a ^ b;

        editTextResult.setText(Integer.toString(result));
        editTextResultBinary.setText(Integer.toBinaryString(result));
    }

    public void buttonORClick(View v) {
        EditText editTextA = findViewById(R.id.editTextNumber4);
        EditText editTextB = findViewById(R.id.editTextNumber5);
        EditText editTextResult = findViewById(R.id.editTextNumberResult3);
        EditText editTextResultBinary = findViewById(R.id.editTextNumberResultBinary3);

        int a, b;
        try {
            a = Integer.parseInt(editTextA.getText().toString());
        } catch (Exception e) {
            a = 0;
            editTextA.setText("0");
        }
        try {
            b = Integer.parseInt(editTextB.getText().toString());
        } catch (Exception e) {
            b = 0;
            editTextB.setText("");//setText("0");
        }
        int result = a | b;

        editTextResult.setText(Integer.toString(result));
        editTextResultBinary.setText(Integer.toBinaryString(result));
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

/*    public void buttonProgrammerClick(View v) {
        Intent programmerCalcIntent = new Intent(this, ProgrammerCalcActivity.class);
        startActivity(programmerCalcIntent);
    }*/

    public void log(String text) {
        EditText textEditLog = findViewById(R.id.LogBody);
        Editable logTextBody = textEditLog.getText();
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        logTextBody.insert(0, dateFormat.format(new Date()) + ": " + text + '\n');
        textEditLog.setText(logTextBody);
    }
}