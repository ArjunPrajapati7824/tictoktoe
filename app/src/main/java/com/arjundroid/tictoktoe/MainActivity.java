package com.arjundroid.tictoktoe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnRestart;

    TextView txtResult,txtResult1;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9,txt1get;
    int flag=0;
    int count=0;

    //Animation scale= AnimationUtils.loadAnimation(MainActivity.this,R.anim.scale);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Intent inextthis = new Intent(MainActivity.this,MainActivity.class);
    initialize();





    }




    void initialize()
    {

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        txtResult=findViewById(R.id.txtResult);
        txtResult1=findViewById(R.id.txtResult1);
        btnRestart=findViewById(R.id.btn10Restart);

    }

    void Reset_Result()
    {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                btnRestart.callOnClick();
            }
        },1000);

    }

    @SuppressLint("SetTextI18n")
    public void check_notation(View view)
    {

        Button current_button = (Button) view;
        if(current_button.getText().toString().equals("")) {
            count++;

            if (flag == 0) {
                current_button.setText("O");
                flag = 1;
            } else {
                current_button.setText("X");
                flag = 0;
            }
            if (flag == 0){
                txtResult1.setText("Player 1 Move");
            } else {
                txtResult1.setText("Player 2 Move");
            }

            if (count > 4) {
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();
                b9 = btn9.getText().toString();
                txt1get=txtResult1.getText().toString();

                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
//                    Toast.makeText(this, "winnner is : " + b1, Toast.LENGTH_SHORT).show();
                    txtResult1.setText("");
                    txtResult.setText(b1 + " is Winner");
                    Reset_Result();

                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    txtResult1.setText("");
                    txtResult.setText(b4 + " is Winner");
                    Reset_Result();


                    //                  Toast.makeText(this, "Winner is :" + b4, Toast.LENGTH_SHORT).show();
                } else if (b7.equals(b8) && b7.equals(b9) && !b7.equals("")) {
                txtResult.setText(b7 + " is Winner");
                    txtResult1.setText("");
                    Reset_Result();


                    //                Toast.makeText(this, "Winner is :" + b7, Toast.LENGTH_SHORT).show();
                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                txtResult.setText(b1 + " is Winner");
                    txtResult1.setText("");
                    Reset_Result();


                    //              Toast.makeText(this, "Winner is :" + b1, Toast.LENGTH_SHORT).show();
                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                txtResult.setText(b2 + " is Winner");
                    txtResult1.setText("");
                    Reset_Result();


                    //            Toast.makeText(this, "Winner is :" + b2, Toast.LENGTH_SHORT).show();
                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                txtResult.setText(b3 + " is Winner");
                    txtResult1.setText("");
                    Reset_Result();


                    //          Toast.makeText(this, "Winner is :" + b3, Toast.LENGTH_SHORT).show();
                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                txtResult.setText(b1 + " is Winner");
                    txtResult1.setText("");
                    Reset_Result();


                    //        Toast.makeText(this, "Winner is :" + b1, Toast.LENGTH_SHORT).show();
                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                txtResult.setText(b3 + " is Winner");
                    txtResult1.setText("");
                    Reset_Result();


                    //      Toast.makeText(this, "Winner is :" + b3, Toast.LENGTH_LONG).show();
                } else if(count==9){
                txtResult.setText("Match Draw");
                    txtResult1.setText("");
                    Reset_Result();

                    //    Toast.makeText(this, "Match Draw", Toast.LENGTH_SHORT).show();
                }



            }
        }
        else {
            Toast.makeText(this, "!Already Draw...", Toast.LENGTH_SHORT).show();

        }



                btnRestart.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        btn1.setText("");
                        btn2.setText("");
                        btn3.setText("");
                        btn4.setText("");
                        btn5.setText("");
                        btn6.setText("");
                        btn7.setText("");
                        btn8.setText("");
                        btn9.setText("");
                        txtResult.setText("");
                        count=0;
                        flag=0;
                        txtResult1.setText("Player 1 move");

                    }
                });





    }

}