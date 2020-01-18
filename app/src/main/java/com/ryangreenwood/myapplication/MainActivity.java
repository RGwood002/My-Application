package com.ryangreenwood.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView answerTextField;
    private Button submitButton;
    private TextView answerLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answerTextField = findViewById(R.id.answer_text_field);
        submitButton =findViewById(R.id.submit_button);
        submitButton.setOnClickListener(this);
        answerLabel = findViewById(R.id.answer_label);
    }

    @Override
    public void onClick(View v){
        String answerText = answerTextField.getText().toString();
        String correctAnswer = "42";
        if(answerText.equalsIgnoreCase(correctAnswer)){
           answerLabel.setText(R.string.answer_label_correct);
        }else{
            answerLabel.setText(R.string.answer_label_incorrect);
        }
    }
}
