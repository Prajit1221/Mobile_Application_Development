package com.example.factevenodd;

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

    Button fact ,eo ;
    EditText ip;
    TextView op;
    int sol=1,n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        fact = findViewById(R.id.fact);
        eo = findViewById(R.id.eo);
        ip = findViewById(R.id.ip);
        op = findViewById(R.id.op);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

        public void Solve(View view) {
        n = Integer.parseInt(ip.getText().toString());
        if(fact==view){
            for (int i=1;i<=n;i++){
                sol=sol*i;
            }
            op.setText(Integer.toString(sol));
            sol=1;
        }
        else if(eo==view){
            if (n%2==0){
                op.setText("EVEN");
            }
            else {
                op.setText("ODD");
            }
        }
    }
}