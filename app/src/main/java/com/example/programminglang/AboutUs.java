package com.example.programminglang;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_about_us);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        this.setTitle("About Developer");

        Button websiteButton = findViewById(R.id.contact_website);
        websiteButton.setOnClickListener(v -> openUrl("https://codemonkmi.vercel.app/"));

        Button linkedButton = findViewById(R.id.contact_linkedin);
        linkedButton.setOnClickListener(v -> openUrl("https://www.linkedin.com/in/codemonkmi/"));

        Button facebookButton = findViewById(R.id.contact_facebook);
        facebookButton.setOnClickListener(v -> openUrl("https://www.facecbook.com/codemonkmi/"));

        Button githubButton = findViewById(R.id.contact_github);
        githubButton.setOnClickListener(v -> openUrl("https://github.com/CodeMonkMI"));

        Button devdotButton = findViewById(R.id.contact_devdotto);
        devdotButton.setOnClickListener(v -> openUrl("https://www.dev.to/codemonkmi/"));

    }

    private void openUrl(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}