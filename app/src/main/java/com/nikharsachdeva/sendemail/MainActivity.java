package com.nikharsachdeva.sendemail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button sendEmail;
    public static final String EMAIL = "xxx";
    public static final String PASS = "xxx";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendEmail = findViewById(R.id.sendEmail);

        sendEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emailFunc();
            }
        });
    }

    private void emailFunc() {
        String subject = "Hi! Testing";
        String body = "Success Woah! ";
        GMailSender email = new GMailSender(getApplicationContext(),"nikhars40@gmail.com", subject, body);
        email.execute();
    }
}