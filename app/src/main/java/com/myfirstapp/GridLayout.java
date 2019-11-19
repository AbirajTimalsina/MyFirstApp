package com.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GridLayout extends AppCompatActivity {

    private TextView Result;
    private Button Btn0,Btn1,Btn2,Btn3,Btn4,Btn5,Btn6,Btn7,Btn8,Btn9,BtnPlus,BtnMinus,BtnMultiply,BtnDiv,BtnClear,BtnEqual;
    public int check=0;
   private int first,second; // value set garna ko lagio rakheko

    arithmetic a = new arithmetic();
//    String Activity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);

        //Binding

        Btn0 = findViewById(R.id.btn0);
        Btn1 = findViewById(R.id.btn1);
        Btn2 = findViewById(R.id.btn2);
        Btn3 = findViewById(R.id.btn3);
        Btn4 = findViewById(R.id.btn4);
        Btn5 = findViewById(R.id.btn5);
        Btn6 = findViewById(R.id.btn6);
        Btn7 = findViewById(R.id.btn7);
        Btn8 = findViewById(R.id.btn8);
        Btn9 = findViewById(R.id.btn9);
        BtnClear = findViewById(R.id.btnClear);
        BtnDiv = findViewById(R.id.btnDiv);
        BtnPlus = findViewById(R.id.btnPlus);
        BtnMinus = findViewById(R.id.btnMinus);
        BtnMultiply = findViewById(R.id.btnMultiply);
        BtnEqual = findViewById(R.id.btnEqual);
        Result = findViewById(R.id.Result);

//        if (Integer.parseInt(Result.getText().toString()) == 0) {
//            temp = "";
//        }


        Btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result.setText(Result.getText()+"0"); // +"0" number lai repeate garaidinxa.
            }
        });

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result.setText(Result.getText()+"1");
            }
        });

        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result.setText(Result.getText()+"2");
            }
        });


        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Result.setText(Result.getText()+"3");
            }
        });

        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Result.setText(Result.getText()+"4");
            }
        });

        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Result.setText(Result.getText()+"5");
            }
        });

        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Result.setText(Result.getText()+"6");
            }

        });

        Btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Result.setText(Result.getText()+"7");
            }
        });

        Btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Result.setText(Result.getText()+"8");
            }
        });

        Btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Result.setText(Result.getText()+"9");
            }
        });

        BtnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                check=1;
              first=Integer.parseInt(Result.getText().toString());
              a.setFirst(first);
              Result.setText(""); // button plus click garepaxi empty garauxa.

            }
        });

        BtnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                check=2;
                first=Integer.parseInt(Result.getText().toString());
                a.setFirst(first);
                Result.setText(""); //empty garauxa

            }
        });

        BtnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                check=3;
                first=Integer.parseInt(Result.getText().toString());
                a.setFirst(first);
                Result.setText(""); //empty garauxa

            }
        });

        BtnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                check=4;
                first=Integer.parseInt(Result.getText().toString());
                a.setFirst(first);
                Result.setText(""); //empty garauxa

            }
        });

        BtnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                second=Integer.parseInt(Result.getText().toString());
                a.setSecond(second);

                if (check==1)
                {
                    Result.setText(Integer.toString(a.add()));

                }

                else if(check==2)
                {
                    Result.setText(Integer.toString(a.sub()));

                }

                else if(check==3)
                {
                    Result.setText(Integer.toString(a.mul()));
                }
                else if(check==4)
                {
                    Result.setText(Integer.toString(a.div()));

                }

            }
        });

        BtnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Result.setText("");

            }
        });
    }

}
