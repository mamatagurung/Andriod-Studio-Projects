package com.example.simplecalculatorlab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class CalculatorFragment extends Fragment implements View.OnClickListener {

    private TextView displayTextView;
    private StringBuilder currentNumber;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculator, container, false);

        displayTextView = view.findViewById(R.id.display_text_view);
        currentNumber = new StringBuilder();

        // Set click listeners for buttons
        int[] buttonIds = {R.id.btn_0, R.id.btn_1, R.id.btn_2, R.id.btn_3, R.id.btn_4, R.id.btn_5, R.id.btn_6, R.id.btn_7,
                R.id.btn_8, R.id.btn_9, R.id.btn_dot, R.id.btn_equals, R.id.btn_plus, R.id.btn_minus, R.id.btn_multiply,
                R.id.btn_divide, R.id.btn_clear, R.id.btn_delete};

        for (int buttonId : buttonIds) {
            Button button = view.findViewById(buttonId);
            button.setOnClickListener(this);
        }

        return view;
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        String buttonText = ((Button) v).getText().toString();

        if (viewId == R.id.btn_equals) {
            calculateResult();
        } else if (viewId == R.id.btn_clear) {
            currentNumber.setLength(0);
            displayTextView.setText("0");
        } else if (viewId == R.id.btn_delete) {
            if (currentNumber.length() > 0) {
                currentNumber.deleteCharAt(currentNumber.length() - 1);
                if (currentNumber.length() == 0) {
                    displayTextView.setText("0");
                } else {
                    displayTextView.setText(currentNumber.toString());
                }
            }
        } else {
            currentNumber.append(buttonText);
            displayTextView.setText(currentNumber.toString());
        }

    }

    private void calculateResult() {
        // Implement your calculation logic here
        // For simplicity, this example only displays the current number
        displayTextView.setText(currentNumber.toString());
    }
}

