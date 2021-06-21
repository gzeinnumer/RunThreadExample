package com.gzeinnumer.runthreadexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        run1();
        run2();
        run3();
        run4();
    }

    private void run1() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this, "Coba", Toast.LENGTH_SHORT).show();
            }
        }, 1, 6000);
    }

    private void run2() {
        runOnUiThread (new Thread(new Runnable() {
            public void run() {
                Toast.makeText(MainActivity.this, "Coba", Toast.LENGTH_SHORT).show();
            }
        }));
    }

    private void run3() {
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Toast.makeText(MainActivity.this, "COba", Toast.LENGTH_SHORT).show();
                }
            }
        };
        timer.start();
    }

    private void run4() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this, "COba", Toast.LENGTH_SHORT).show();
            }
        }, 4000);
    }
}