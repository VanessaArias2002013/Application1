package com.example.application1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText textName;
    TextView label;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        textName=findViewById(R.id.txtNombre);
        label=findViewById(R.id.textView);


    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bottom:
                label.setText(textName.getText());
                break;

                
        }

    }
}