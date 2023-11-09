package com.example.testandroid021123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.testandroid021123.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = "MainActivity";
    private Button btnClickLeft;
    private Button btnClickRight;
    private TextView tvScore;
    private int score;

    private boolean leftIsRed;
    private boolean rightIsRed;

    private ActivityMainBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        score = 0;
        leftIsRed = true;
        rightIsRed = false;

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

      /*  btnClickLeft = findViewById(R.id.btn_click_left);
        btnClickRight = findViewById(R.id.btn_click_right);
        tvScore = findViewById(R.id.tv_score);*/

        btnClickLeft = binding.btnClickLeft;
        btnClickRight = binding.btnClickRight;
        tvScore = binding.tvScore;

        btnClickLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (leftIsRed) score--;
                else score++;

                tvScore.setText(String.valueOf(score));

                btnColorChange();
            }
        });

        btnClickRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rightIsRed) score--;
                else score++;

                tvScore.setText(String.valueOf(score));

                btnColorChange();
            }
        });

        Log.d(LOG_TAG, "onCreate");
    }

    public void btnColorChange() {
        if (Math.random() < 0.5) {
            btnClickRight.setBackgroundTintList(
                    ColorStateList.valueOf(
                            getColor(R.color.red)
                    )
            );
            rightIsRed = true;
            btnClickLeft.setBackgroundTintList(
                    ColorStateList.valueOf(
                            getColor(R.color.green)
                    )
            );
            leftIsRed = false;
        } else {
            btnClickRight.setBackgroundTintList(
                    ColorStateList.valueOf(
                            getColor(R.color.green)
                    )
            );
            rightIsRed = false;
            btnClickLeft.setBackgroundTintList(
                    ColorStateList.valueOf(
                            getColor(R.color.red)
                    )
            );
            leftIsRed = true;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(LOG_TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(LOG_TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(LOG_TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(LOG_TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(LOG_TAG, "onDestroy");
    }
}