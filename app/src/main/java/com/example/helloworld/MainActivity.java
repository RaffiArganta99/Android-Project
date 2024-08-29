package com.example.helloworld;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // Apply window insets to adjust padding for system bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void onRegisterBtnClick (View view) {
        TextView txtFirstName = findViewById(R.id.txtFirstName);
        TextView txtLastName = findViewById(R.id.txtLastName);
        TextView txtEmail = findViewById(R.id.txtEmail);

        EditText edttxtFirstName = findViewById(R.id.edtTxtFirstName);
        EditText edttxtLastName = findViewById(R.id.edtTxtlastName);
        EditText edttxtEmail = findViewById(R.id.edtTxtEmail);

        txtFirstName.setText("First Name: " + edttxtFirstName.getText().toString());
        txtLastName.setText("Last Name: " + edttxtLastName.getText().toString());
        txtEmail.setText("Email: " + edttxtEmail.getText().toString());
    }
}
