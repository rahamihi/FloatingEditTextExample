package com.example.mamun.floatingedittextexample;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextInputLayout userNameTextInputLayout,emailTextInputLayout;
    private EditText username,email;
    private Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userNameTextInputLayout = (TextInputLayout) findViewById(R.id.userNameTextInputLayout);
        emailTextInputLayout = (TextInputLayout) findViewById(R.id.emailTextInputLayout);

        username = (EditText) findViewById(R.id.username);
        email = (EditText) findViewById(R.id.email);
       submit = (Button) findViewById(R.id.submit);

       submit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(validate(username,userNameTextInputLayout) && validate(email,emailTextInputLayout)){
                   Toast.makeText(getApplicationContext(),"Thank you",Toast.LENGTH_LONG).show();
               }
           }
       });





    }

    private boolean validate(EditText editText,TextInputLayout  textInputLayout){

        if(editText.getText().toString().trim().length() > 0 ){
            return true;
        }
        editText.requestFocus();
        textInputLayout.setError("Please fill this ...");

        return false;
    }
}
