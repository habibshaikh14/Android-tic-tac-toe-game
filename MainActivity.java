package com.habibakhtar.tictactoemaybe;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean player = true;
    int count = 9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void change1(View view){

        count--;
        Button b = (Button)(findViewById(R.id.button15));
       if(player){

           b.setText("X");
           b.setBackgroundColor(Color.parseColor("#7f8fe7"));
           b.setTextSize(45);
           b.setEnabled(false);
           player=false;

       }else{
           b.setText("O");
           b.setTextSize(45);
           b.setBackgroundColor(Color.parseColor("#d269a2"));
           b.setEnabled(false);
           player=true;
       }
        possiblity();
    }
    public void change2(View view){

        count--;
        Button b = (Button)(findViewById(R.id.button4));
        if(player){

            b.setText("X");
            b.setTextSize(45);
            b.setBackgroundColor(Color.parseColor("#7f8fe7"));
            b.setEnabled(false);
            player=false;

        }else{
            b.setText("O");
            b.setTextSize(45);
            b.setBackgroundColor(Color.parseColor("#d269a2"));
            b.setEnabled(false);
            player=true;
        }
        possiblity();
    }
    public void change3(View view){

        count--;
        Button b = (Button)(findViewById(R.id.button9));
        if(player){

            b.setText("X");
            b.setTextSize(45);
            b.setBackgroundColor(Color.parseColor("#7f8fe7"));
            b.setEnabled(false);
            player=false;

        }else{
            b.setText("O");
            b.setTextSize(45);
            b.setBackgroundColor(Color.parseColor("#d269a2"));
            b.setEnabled(false);
            player=true;
        }
        possiblity();
    }
    public void change4(View view){

        count--;
        Button b = (Button)(findViewById(R.id.button16));
        if(player){

            b.setText("X");
            b.setTextSize(45);
            b.setBackgroundColor(Color.parseColor("#7f8fe7"));
            b.setEnabled(false);
            player=false;

        }else{
            b.setText("O");
            b.setTextSize(45);
            b.setBackgroundColor(Color.parseColor("#d269a2"));
            b.setEnabled(false);
            player=true;
        }
        possiblity();
    }
    public void change5(View view){

        count--;
        Button b = (Button)(findViewById(R.id.button));
        if(player){

            b.setText("X");
            b.setTextSize(45);
            b.setBackgroundColor(Color.parseColor("#7f8fe7"));
            b.setEnabled(false);
            player=false;

        }else{
            b.setText("O");
            b.setTextSize(45);
            b.setBackgroundColor(Color.parseColor("#d269a2"));
            b.setEnabled(false);
            player=true;
        }
        possiblity();
    }
    public void change6(View view){

        count--;
        Button b = (Button)(findViewById(R.id.button13));
        if(player){

            b.setText("X");
            b.setTextSize(45);
            b.setBackgroundColor(Color.parseColor("#7f8fe7"));
            b.setEnabled(false);
            player=false;

        }else{
            b.setText("O");
            b.setTextSize(45);
            b.setBackgroundColor(Color.parseColor("#d269a2"));
            b.setEnabled(false);
            player=true;
        }
        possiblity();
    }
    public void change7(View view){

        count--;
        Button b = (Button)(findViewById(R.id.button19));
        if(player){

            b.setText("X");
            b.setTextSize(45);
            b.setBackgroundColor(Color.parseColor("#7f8fe7"));
            b.setEnabled(false);
            player=false;

        }else{
            b.setText("O");
            b.setTextSize(45);
            b.setBackgroundColor(Color.parseColor("#d269a2"));
            b.setEnabled(false);
            player=true;
        }
        possiblity();
    }
    public void change8(View view){

        count--;
        Button b = (Button)(findViewById(R.id.button5));
        if(player){

            b.setText("X");
            b.setTextSize(45);
            b.setBackgroundColor(Color.parseColor("#7f8fe7"));
            b.setEnabled(false);
            player=false;

        }else{
            b.setText("O");
            b.setTextSize(45);
            b.setBackgroundColor(Color.parseColor("#d269a2"));
            b.setEnabled(false);
            player=true;
        }
        possiblity();
    }
    public void change9(View view){

        count--;
        Button b = (Button)(findViewById(R.id.button14));
        if(player){

            b.setText("X");
            b.setTextSize(45);
            b.setBackgroundColor(Color.parseColor("#7f8fe7"));
            b.setEnabled(false);
            player=false;

        }else{
            b.setText("O");
            b.setTextSize(45);
            b.setBackgroundColor(Color.parseColor("#d269a2"));
            b.setEnabled(false);
            player=true;
        }
        possiblity();
    }

    public void possiblity(){
        Button b1 = (Button)(findViewById(R.id.button15));
        Button b2 = (Button)(findViewById(R.id.button4));
        Button b3 = (Button)(findViewById(R.id.button9));
        Button b4 = (Button)(findViewById(R.id.button16));
        Button b5 = (Button)(findViewById(R.id.button));
        Button b6 = (Button)(findViewById(R.id.button13));
        Button b7 = (Button)(findViewById(R.id.button19));
        Button b8 = (Button)(findViewById(R.id.button5));
        Button b9 = (Button)(findViewById(R.id.button14));
        TextView t = (TextView)(findViewById(R.id.textView2));
        if(count>=0){
            if(b1.getText()==b2.getText()&&b2.getText()==b3.getText()){
                t.setText(b1.getText()+" WON");
                t.setVisibility(t.VISIBLE);
                disableall();
            }else if (b1.getText()==b4.getText()&&b4.getText()==b7.getText()){
                t.setText(b1.getText()+" WON");
                t.setVisibility(t.VISIBLE);
                disableall();
            }else if (b1.getText()==b5.getText()&&b5.getText()==b9.getText()){
                t.setText(b1.getText()+" WON");
                t.setVisibility(t.VISIBLE);
                disableall();
            }else if (b2.getText()==b5.getText()&&b5.getText()==b8.getText()){
                t.setText(b2.getText()+" WON");
                t.setVisibility(t.VISIBLE);
                disableall();
            }else if (b3.getText()==b5.getText()&&b5.getText()==b7.getText()){
                t.setText(b3.getText()+" WON");
                t.setVisibility(t.VISIBLE);
                disableall();
            }else if (b3.getText()==b6.getText()&&b6.getText()==b9.getText()){
                t.setText(b3.getText()+" WON");
                t.setVisibility(t.VISIBLE);
                disableall();
            }else if (b4.getText()==b5.getText()&&b5.getText()==b6.getText()){
                t.setText(b4.getText()+" WON");
                t.setVisibility(t.VISIBLE);
                disableall();
            }else if (b7.getText()==b8.getText()&&b8.getText()==b9.getText()){
                t.setText(b7.getText()+" WON");
                t.setVisibility(t.VISIBLE);
                disableall();
            }else if (count == 0){
				 t.setVisibility(t.VISIBLE);
			}
        }
    }
    public void refr(View view){
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }
    public void closeapp(View view){
        Intent intent = getIntent();
        finish();
    }
    public void disableall(){
        Button b1 = (Button)(findViewById(R.id.button15));
        Button b2 = (Button)(findViewById(R.id.button4));
        Button b3 = (Button)(findViewById(R.id.button9));
        Button b4 = (Button)(findViewById(R.id.button16));
        Button b5 = (Button)(findViewById(R.id.button));
        Button b6 = (Button)(findViewById(R.id.button13));
        Button b7 = (Button)(findViewById(R.id.button19));
        Button b8 = (Button)(findViewById(R.id.button5));
        Button b9 = (Button)(findViewById(R.id.button14));
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
    }
}
