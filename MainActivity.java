package com.example.whatsapp;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.text.MessageFormat;


public class MainActivity extends AppCompatActivity {

    private TextView number;
    private TextView text;
    private Button send;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = findViewById(R.id.phone_number);
        text = findViewById(R.id.message);
        send = findViewById(R.id.send);


    protected boolean numberValidation() {
        return number.getText().toString().matches("[1-9]{2}9[0-9]{4}[0-9]{4}");
    }

    protected void sendMessage() {
        Uri whatsAppLink = Uri.parse(MessageFormat.format("https://wa.me/55{0}?text={1}", number.getText(), mensagem.getText()));
        Intent whatsApp = new Intent(Intent.ACTION_VIEW, whatsAppLink);
        startActivity(whatsApp);
    }

}