package com.example.naloga3;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button mButtonZero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        View mainView = findViewById(R.id.main);
        if (mainView != null) {
            ViewCompat.setOnApplyWindowInsetsListener(mainView, (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });
        }

        mShowCount = findViewById(R.id.show_count);
        mButtonZero = findViewById(R.id.button_zero);

        if (mButtonZero != null) {
            mButtonZero.setBackgroundColor(Color.GRAY);
        }
    }

    public void showToast(View view) {
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }

        // Spreminjanje barve gumba Count glede na to, ali je vrednost soda ali liha
        // Uporabljen je parameter 'view' (zahteve 7 in 8)
        if (mCount % 2 == 0) {
            view.setBackgroundColor(Color.GREEN);
        } else {
            view.setBackgroundColor(Color.CYAN);
        }

        // Nastavitev druge barve ozadja na gumbu Zero, ki nakazuje, da je aktiven (zahteva 9)
        if (mButtonZero != null) {
            mButtonZero.setBackgroundColor(Color.MAGENTA);
        }
    }

    public void zeroCount(View view) {
        mCount = 0;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }

        // Vračanje barve gumba Zero na sivo ob ponastavitvi (zahteva 10)
        view.setBackgroundColor(Color.GRAY);
    }
}