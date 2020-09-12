package com.sabkayar.praveen.hellotoast;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.sabkayar.praveen.hellotoast.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
    }

    public void countUp(View view) {
        int count = Integer.parseInt(mBinding.textViewCount.getText().toString());
        mBinding.textViewCount.setText(String.valueOf(count + 1));
    }

    public void showToast(View view) {
        Toast.makeText(getApplicationContext(), R.string.toast_message, Toast.LENGTH_SHORT).show();
    }
}