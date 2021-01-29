package com.example.simplecalc;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SimpleCalcFrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SimpleCalcFrag extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SimpleCalcFrag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SimpleCalcFrag.
     */
    // TODO: Rename and change types and number of parameters
    public static SimpleCalcFrag newInstance(String param1, String param2) {
        SimpleCalcFrag fragment = new SimpleCalcFrag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_simple_calc, container, false);
    }


    public void buttonMultiplicationClick(View v) {
        EditText editTextA = getView(). findViewById(R.id.editTextNumber1);
        EditText editTextB =  getView().findViewById(R.id.editTextNumber2);
        EditText editTextResult =  getView().findViewById(R.id.editTextNumberResult);
        EditText editTextResultBinary =  getView().findViewById(R.id.editTextNumberResultBinary);

        int a,b;
        try {
            a = Integer.parseInt(editTextA.getText().toString());
        } catch(Exception e) {
            a = 0;
            editTextA.setText("0");
        }
        try {
            b = Integer.parseInt(editTextB.getText().toString());
        } catch (Exception e) {
            b = 0;
            editTextB.setText("0");
        }
        int result = a & b;

        editTextResult.setText(Integer.toString(result));
        editTextResultBinary.setText(Integer.toBinaryString(result));
    }

    public void buttonSubtractClick(View v) {
        EditText editTextA = getView(). findViewById(R.id.editTextNumber1);
        EditText editTextB =  getView().findViewById(R.id.editTextNumber2);
        EditText editTextResult =  getView().findViewById(R.id.editTextNumberResult);
        EditText editTextResultBinary =  getView().findViewById(R.id.editTextNumberResultBinary);

        int a,b;
        try {
            a = Integer.parseInt(editTextA.getText().toString());
        } catch(Exception e) {
            a = 0;
            editTextA.setText("0");
        }
        try {
            b = Integer.parseInt(editTextB.getText().toString());
        } catch (Exception e) {
            b = 0;
            editTextB.setText("0");
        }
        int result = a - b;

        editTextResult.setText(Integer.toString(result));
        editTextResultBinary.setText(Integer.toBinaryString(result));
    }

    public void buttonDivideClick(View v) {
        EditText editTextA = getView(). findViewById(R.id.editTextNumber1);
        EditText editTextB =  getView().findViewById(R.id.editTextNumber2);
        EditText editTextResult =  getView().findViewById(R.id.editTextNumberResult);
        EditText editTextResultBinary =  getView().findViewById(R.id.editTextNumberResultBinary);

        int a,b;
        try {
            a = Integer.parseInt(editTextA.getText().toString());
        } catch(Exception e) {
            a = 0;
            editTextA.setText("0");
        }
        try {
            b = Integer.parseInt(editTextB.getText().toString());
        } catch (Exception e) {
            b = 0;
            editTextB.setText("0");
        }
        int result = a / b;

        editTextResult.setText(Integer.toString(result));
        editTextResultBinary.setText(Integer.toBinaryString(result));
    }
    public void buttonAdditionClick(View v) {
        EditText editTextA = getView(). findViewById(R.id.editTextNumber1);
        EditText editTextB =  getView().findViewById(R.id.editTextNumber2);
        EditText editTextResult =  getView().findViewById(R.id.editTextNumberResult);
        EditText editTextResultBinary =  getView().findViewById(R.id.editTextNumberResultBinary);

        int a,b;
        try {
            a = Integer.parseInt(editTextA.getText().toString());
        } catch(Exception e) {
            a = 0;
            editTextA.setText("0");
        }
        try {
            b = Integer.parseInt(editTextB.getText().toString());
        } catch (Exception e) {
            b = 0;
            editTextB.setText("0");
        }
        int result = a + b;

        editTextResult.setText(Integer.toString(result));
        editTextResultBinary.setText(Integer.toBinaryString(result));
    }
}