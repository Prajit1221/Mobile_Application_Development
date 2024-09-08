package com.example.my_calculator_application;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button add,sub,div,mul;
    EditText no1,no2;
    TextView ans;
    int a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        add= findViewById(R.id.add);
        sub= findViewById(R.id.sub);
        div= findViewById(R.id.div);
        mul= findViewById(R.id.mul);
        no1= findViewById(R.id.no1);
        no2= findViewById(R.id.no2);
        ans= findViewById(R.id.ans);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a =Integer.parseInt(no1.getText().toString());
                int b =Integer.parseInt(no2.getText().toString());
                c=a+b;
                ans.setText(Integer.toString(c));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a =Integer.parseInt(no1.getText().toString());
                int b =Integer.parseInt(no2.getText().toString());
                c=a-b;
                ans.setText(Integer.toString(c));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a =Float.parseFloat(no1.getText().toString());
                float b =Float.parseFloat(no2.getText().toString());

                float c=a/b;
                ans.setText(Float.toString(c));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a =Integer.parseInt(no1.getText().toString());
                int b =Integer.parseInt(no2.getText().toString());
                c=a*b;
                ans.setText(Integer.toString(c));
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}