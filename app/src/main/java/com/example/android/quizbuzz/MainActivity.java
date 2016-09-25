package com.example.android.quizbuzz;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    RadioGroup rgroup1,rgroup2,rgroup3,rgroup4,rgroup5;
    int mSum = 0;
    int Some = 0;
    Boolean six = false;
    String mAnswer = "Nougat";
    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        rgroup1 = (RadioGroup) findViewById(R.id.rgroup1);
        rgroup2 = (RadioGroup) findViewById(R.id.rgroup2);
        rgroup3 = (RadioGroup) findViewById(R.id.rgroup3);
        rgroup4 = (RadioGroup) findViewById(R.id.rgroup4);
        rgroup5 = (RadioGroup) findViewById(R.id.rgroup5);
    }

    public void onSubmit(View v){

        EditText mEdit1;
        mEdit1   = (EditText)findViewById(R.id.Name);
        mEdit1.getText().toString();
        EditText mEdit2;
        mEdit2   = (EditText)findViewById(R.id.Noughat);
        String message = mEdit2.getText().toString();

        if(rgroup1.getCheckedRadioButtonId()== R.id.a1){
                mSum = mSum +1;


        }
        if(rgroup2.getCheckedRadioButtonId()== R.id.b2){
                mSum = mSum +1;


        }
        if(rgroup3.getCheckedRadioButtonId()== R.id.d3){
                mSum = mSum +1;


        }if(rgroup4.getCheckedRadioButtonId()== R.id.a4){
                mSum = mSum +1;


        }if(rgroup5.getCheckedRadioButtonId()== R.id.a5){
                mSum = mSum +1;


        }if (six)
                mSum = mSum +1;
        if(message.equals(mAnswer))
        {   mSum = mSum +1; }


        Context context = getApplicationContext();
        CharSequence text = "Hello "+mEdit1.getText().toString()+",Your Score is"+mSum+" ThankYou!!!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
            mSum= 0;



    }
    public  void question6(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();


        switch (view.getId()) {
            case R.id.a6:
                if (checked)
                {    Some++;
                break;}
                else
                    break;
            case R.id.b6:
                if (checked)
                {    Some++;
                break;}
                else
                break;
            case R.id.c6:
                if (checked)
                { Some++;
                break;}
                else
                break;
            case R.id.d6:
                if (checked)
                {    Some = 0;
                break;}
                else
                break;
        }
        if (Some == 3)
            six = true;}



}

