package com.example.tictactoc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btno1, btno2, btno3, btno4, btno5, btno6, btno7, btno8, btno9;

    private Button btnx1, btnx2, btnx3, btnx4, btnx5, btnx6, btnx7, btnx8, btnx9;

    private TextView tvxn1, tvxn2, tvxn3, tvxn4, tvxn5, tvxn6, tvxn7, tvxn8, tvxn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //region parte x
        btnx1 = findViewById(R.id.btnx1);
        btnx2 = findViewById(R.id.btnx2);
        btnx3 = findViewById(R.id.btnx3);
        btnx4 = findViewById(R.id.btnx4);
        btnx5 = findViewById(R.id.btnx5);
        btnx6 = findViewById(R.id.btnx6);
        btnx7 = findViewById(R.id.btnx7);
        btnx8 = findViewById(R.id.btnx8);
        btnx9 = findViewById(R.id.btnx9);

        //endregion

        //region parte o
        btno1 = findViewById(R.id.btno1);
        btno2 = findViewById(R.id.btno2);
        btno3 = findViewById(R.id.btno3);
        btno4 = findViewById(R.id.btno4);
        btno5 = findViewById(R.id.btno5);
        btno6 = findViewById(R.id.btno6);
        btno7 = findViewById(R.id.btno7);
        btno8 = findViewById(R.id.btno8);
        btno9 = findViewById(R.id.btno9);

        //endregion

        //region parte n

        tvxn1 = findViewById(R.id.tvxn1);
        tvxn2 = findViewById(R.id.tvxn2);
        tvxn3 = findViewById(R.id.tvxn3);
        tvxn4 = findViewById(R.id.tvxn4);
        tvxn5 = findViewById(R.id.tvxn5);
        tvxn6 = findViewById(R.id.tvxn6);
        tvxn7 = findViewById(R.id.tvxn7);
        tvxn8 = findViewById(R.id.tvxn8);
        tvxn9 = findViewById(R.id.tvxn9);

        //endregion

        //region parte x
        btnx1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvxn1.setText("x");
                tvxn1.setVisibility(View.VISIBLE);

            }
        });

        btnx2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvxn2.setText("x");
                tvxn2.setVisibility(View.VISIBLE);
            }
        });

        btnx3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvxn3.setText("x");
                tvxn3.setVisibility(View.VISIBLE);

            }
        });

        btnx4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvxn4.setText("x");
                tvxn4.setVisibility(View.VISIBLE);
            }
        });

        btnx5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvxn5.setText("x");
                tvxn5.setVisibility(View.VISIBLE);

            }
        });

        btnx6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvxn6.setText("x");
                tvxn6.setVisibility(View.VISIBLE);

            }
        });

        btnx7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvxn7.setText("x");
                tvxn7.setVisibility(View.VISIBLE);
            }
        });

        btnx8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvxn8.setText("x");
                tvxn8.setVisibility(View.VISIBLE);

            }
        });

        btnx9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvxn9.setText("x");
                tvxn9.setVisibility(View.VISIBLE);
            }
        });

        //endregion

        //region parte 0

        btno1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvxn1.setText("o");
                tvxn1.setVisibility(View.VISIBLE);

            }
        });

        btno2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvxn2.setText("o");
                tvxn2.setVisibility(View.VISIBLE);

            }
        });

        btno3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvxn3.setText("o");
                tvxn3.setVisibility(View.VISIBLE);

            }
        });

        btno4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvxn4.setText("o");
                tvxn4.setVisibility(View.VISIBLE);

            }
        });

        btno5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvxn5.setText("o");
                tvxn5.setVisibility(View.VISIBLE);

            }
        });

        btno6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvxn6.setText("o");
                tvxn6.setVisibility(View.VISIBLE);

            }
        });

        btno7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvxn7.setText("o");
                tvxn7.setVisibility(View.VISIBLE);

            }
        });

        btno8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvxn8.setText("o");
                tvxn8.setVisibility(View.VISIBLE);

            }
        });

        btno9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvxn9.setText("o");
                tvxn9.setVisibility(View.VISIBLE);

            }
        });

        //endregion
    }

}