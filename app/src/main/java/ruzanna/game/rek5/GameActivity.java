package ruzanna.game.rek5;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.*;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static android.view.WindowManager.LayoutParams.*;

public class GameActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);
        Window w = getWindow();
        w.setFlags(FLAG_LAYOUT_NO_LIMITS, FLAG_LAYOUT_NO_LIMITS);

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        Collections.shuffle(list);
        boolean odd = true;

        while(odd){
            int n = 0;
            for (int i = 0; i < 15; ++i ){
                for (int j = i ; j < 15; ++j ){
                    if(list.get(i) > list.get(j)){
                        ++n;
                    }
                }
            }
            System.out.println("________"+n);
            if(n%2==0){
                odd = false;
            }else{
                Collections.shuffle(list);
            }
        }

        List<TextView> btns = new ArrayList<>();

        final TextView btn1 = findViewById(R.id.textView1);
        final TextView btn2 = findViewById(R.id.textView2);
        final TextView btn3 = findViewById(R.id.textView3);
        final TextView btn4 = findViewById(R.id.textView4);
        final TextView btn5 = findViewById(R.id.textView5);
        final TextView btn6 = findViewById(R.id.textView6);
        final TextView btn7 = findViewById(R.id.textView7);
        final TextView btn8 = findViewById(R.id.textView8);
        final TextView btn9 = findViewById(R.id.textView9);
        final TextView btn10 = findViewById(R.id.textView10);
        final TextView btn11 = findViewById(R.id.textView11);
        final TextView btn12 = findViewById(R.id.textView12);
        final TextView btn13 = findViewById(R.id.textView13);
        final TextView btn14 = findViewById(R.id.textView14);
        final TextView btn15 = findViewById(R.id.textView15);
        final TextView btn16 = findViewById(R.id.textView16);

        btns.add(btn1);
        btns.add(btn2);
        btns.add(btn3);
        btns.add(btn4);
        btns.add(btn5);
        btns.add(btn6);
        btns.add(btn7);
        btns.add(btn8);
        btns.add(btn9);
        btns.add(btn10);
        btns.add(btn11);
        btns.add(btn12);
        btns.add(btn13);
        btns.add(btn14);
        btns.add(btn15);
        for (int i = 0 ; i < 15; ++i){
            btns.get(i).setText((CharSequence)list.get(i).toString());
        }

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = (String)btn1.getText();
                Drawable drawableTemp = btn1.getBackground();
                if(check(temp, drawableTemp, btn1, btn2)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
                else if(check(temp, drawableTemp, btn1, btn5)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = (String)btn2.getText();
                Drawable drawableTemp = btn2.getBackground();
                if(check(temp, drawableTemp, btn2, btn1)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
                else if(check(temp, drawableTemp, btn2, btn3)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
                else if(check(temp, drawableTemp, btn2, btn6)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = (String)btn3.getText();
                Drawable drawableTemp = btn3.getBackground();
                if(check(temp, drawableTemp, btn3, btn2)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
                else if(check(temp, drawableTemp, btn3, btn4)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
                else if(check(temp, drawableTemp, btn3, btn7)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }


            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = (String)btn4.getText();
                Drawable drawableTemp = btn4.getBackground();
                if(check(temp, drawableTemp, btn4, btn3)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
                else if(check(temp, drawableTemp, btn4, btn8)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = (String)btn5.getText();
                Drawable drawableTemp = btn5.getBackground();
                if(check(temp, drawableTemp, btn5, btn1)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
                else if(check(temp, drawableTemp, btn5, btn6)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
                else if(check(temp, drawableTemp, btn5, btn9)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = (String)btn6.getText();
                Drawable drawableTemp = btn6.getBackground();
                if(check(temp, drawableTemp, btn6, btn2)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
                else if(check(temp, drawableTemp, btn6, btn5)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
                else if(check(temp, drawableTemp, btn6, btn7)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
                else if(check(temp, drawableTemp, btn6, btn10)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = (String)btn7.getText();
                Drawable drawableTemp = btn7.getBackground();
                if(check(temp, drawableTemp, btn7, btn3)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
                else if(check(temp, drawableTemp, btn7, btn6)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
                else if(check(temp, drawableTemp, btn7, btn8)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
                else if(check(temp, drawableTemp, btn7, btn11)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = (String)btn8.getText();
                Drawable drawableTemp = btn8.getBackground();
                if(check(temp, drawableTemp, btn8, btn4)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
                else if(check(temp, drawableTemp, btn8, btn7)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
                else if(check(temp, drawableTemp, btn8, btn12)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = (String)btn9.getText();
                Drawable drawableTemp = btn9.getBackground();
                if(check(temp, drawableTemp, btn9, btn5)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
                else if(check(temp, drawableTemp, btn9, btn10)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
                else if(check(temp, drawableTemp, btn9, btn13)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }

            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = (String)btn10.getText();
                Drawable drawableTemp = btn10.getBackground();
                if(check(temp, drawableTemp, btn10, btn6)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
                else if(check(temp, drawableTemp, btn10, btn9)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
                else if(check(temp, drawableTemp, btn10, btn11)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
                else if(check(temp, drawableTemp, btn10, btn14)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }

            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = (String)btn11.getText();
                Drawable drawableTemp = btn11.getBackground();
                if(check(temp, drawableTemp, btn11, btn7)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }

                else if(check(temp, drawableTemp, btn11, btn10)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
                else if(check(temp, drawableTemp, btn11, btn12)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
                else if(check(temp, drawableTemp, btn11, btn15)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }

            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = (String)btn12.getText();
                Drawable drawableTemp = btn12.getBackground();
                if(check(temp, drawableTemp, btn12, btn8)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
                else if(check(temp, drawableTemp, btn12, btn11)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
                else if(check(temp, drawableTemp, btn12, btn16)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }

            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = (String)btn13.getText();
                Drawable drawableTemp = btn13.getBackground();
                if(check(temp, drawableTemp, btn13, btn9)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
                else if(check(temp, drawableTemp, btn13, btn14)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }

            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = (String)btn14.getText();
                Drawable drawableTemp = btn14.getBackground();
                if(check(temp, drawableTemp, btn14, btn10)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
                else if(check(temp, drawableTemp, btn14, btn13)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
                else if(check(temp, drawableTemp, btn14, btn15)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }

            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = (String)btn15.getText();
                Drawable drawableTemp = btn15.getBackground();
                if(check(temp, drawableTemp, btn15, btn11)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
                else if(check(temp, drawableTemp, btn15, btn14)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
                else if(check(temp, drawableTemp, btn15, btn16)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }

            }
        });
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = (String)btn16.getText();
                Drawable drawableTemp = btn16.getBackground();
                if(check(temp, drawableTemp, btn16, btn12)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }
                else if(check(temp, drawableTemp, btn16, btn15)){
                    won(btn16, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btn10, btn11,btn12, btn13, btn14, btn15);
                }

            }
        });


    }


    boolean check(String temp, Drawable drawableTemp, TextView btn, TextView btnChange){
        if(btnChange.getText().toString().equalsIgnoreCase("")){
            btn.setText("");
            btn.setBackground(null);
            btnChange.setText(temp);
            btnChange.setBackground(drawableTemp);
            return true;
        }
        return false;
    }
    void  won(TextView btn16, TextView btn1, TextView btn2, TextView btn3,
              TextView btn4, TextView btn5, TextView btn6, TextView btn7,
              TextView btn8, TextView btn9, TextView btn10, TextView btn11,
              TextView btn12, TextView btn13, TextView btn14, TextView btn15
    ){
        if(btn16.getText().toString().equalsIgnoreCase("")&&
                btn1.getText().toString().equals("1")&&
                btn2.getText().toString().equals("2")&&
                btn3.getText().toString().equals("3")&&
                btn4.getText().toString().equals("4")&&
                btn5.getText().toString().equals("5")&&
                btn6.getText().toString().equals("6")&&
                btn7.getText().toString().equals("7")&&
                btn8.getText().toString().equals("8")&&
                btn9.getText().toString().equals("9")&&
                btn10.getText().toString().equals("10")&&
                btn11.getText().toString().equals("11")&&
                btn12.getText().toString().equals("12")&&
                btn13.getText().toString().equals("13")&&
                btn14.getText().toString().equals("14")&&
                btn15.getText().toString().equals("15")
        ){
            btn16.setText((CharSequence)"16");
            btn16.setBackground(btn1.getBackground());
        }}



}

