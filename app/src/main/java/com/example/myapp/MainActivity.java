package com.example.myapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.FirebaseApp;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseApp.initializeApp(this);

        // Instantiate the Java class containing the checkSymptoms() method
        SymptomChecker symptomChecker = new SymptomChecker();
        // Call the checkSymptoms() method
        symptomChecker.checkSymptoms();

        // Accessing the TextView from the layout to set the greeting text
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView greetingTextView = findViewById(R.id.greeting_text_view);
        greetingTextView.setText("Welcome, Android!");
    }
}
