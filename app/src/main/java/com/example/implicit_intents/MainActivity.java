package com.example.implicit_intents;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.EditText;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.app.ShareCompat;

public class MainActivity extends AppCompatActivity {
    private EditText etWebsite;
    private EditText etLocation;
    private EditText etText;
    private EditText etPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        etWebsite = findViewById(R.id.etWebsite);
        etLocation = findViewById(R.id.etLocation);
        etText = findViewById(R.id.etText);
        etPhone = findViewById(R.id.etPhone);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void openWebsite(View view) {

        String website = etWebsite.getText().toString().trim();

        if (website.isEmpty()) {
            etWebsite.setError("Enter website!");
            return;
        }

        if (!website.startsWith("http://") &&
                !website.startsWith("https://")) {

            website = "https://" + website;
        }

        Uri webpage = Uri.parse(website);

        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void openLocation(View view) {
        String location = etLocation.getText().toString();
        Uri addressUri = Uri.parse("geo:0,0?q=" + Uri.encode(location));
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void shareText(View view) {
        String text = etText.getText().toString();

        ShareCompat.IntentBuilder
                .from(this)
                .setType("text/plain")
                .setChooserTitle("Share text")
                .setText(text)
                .startChooser();
    }
    public void callPhone(View view) {
        String phoneNumber = etPhone.getText().toString();
        Uri phoneUri = Uri.parse("tel:" + phoneNumber);
        Intent intent = new Intent(Intent.ACTION_DIAL, phoneUri);
        startActivity(intent);
    }

}