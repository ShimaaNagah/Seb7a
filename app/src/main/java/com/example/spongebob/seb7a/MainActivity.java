package com.example.spongebob.seb7a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    static int counter1 = 0;
    static int counter2 = 0;
    static int counter3 = 0;
    static int counter4 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button1 = (Button) findViewById(R.id.button1);
        final Button button2 = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        final Button button4 = (Button) findViewById(R.id.button4);
        final Button reset_button = (Button) findViewById(R.id.reset_button);

        button1.setText("سبحان الله" + "\n" + counter1);
        button2.setText("الحمد الله" + "\n" + counter2);
        button3.setText("لا إلاه إلا الله" + "\n" + counter3);
        button4.setText("الله أكبر" + "\n" + counter4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter1++;
                button1.setText("سبحان الله" + "\n" + counter1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter2 ++;
                button2.setText("الحمد الله" + "\n" + counter2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter3 ++;
                button3.setText("لا إلاه إلا الله" + "\n" + counter3);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter4 ++;
                button4.setText("الله أكبر" + "\n" + counter4);
            }
        });

        reset_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter1=0;
                counter2=0;
                counter3=0;
                counter4=0;
                button1.setText("سبحان الله" + "\n" + counter1);
                button2.setText("الحمد الله" + "\n" + counter2);
                button3.setText("لا إلاه إلا الله" + "\n" + counter3);
                button4.setText("الله أكبر" + "\n" + counter4);
            }
        });

    }

}
