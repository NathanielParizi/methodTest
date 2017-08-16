package com.example.go.gametest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


                boolean gameOver;
                int gp;
                int hp;
                int mp;

                checkGame(true, 100, 55,25);

            }

            //Method Test

            public static void checkGame(boolean gameOver, int gp, int hp, int mp){

                if(gameOver){

                    System.out.println("You have " + gp + "gp, " + hp +"hp, and " + mp+ "mp.");


                }



    }
}
