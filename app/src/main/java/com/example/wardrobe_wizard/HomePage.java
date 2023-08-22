//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.wardrobe_wizard;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.wardrobe_wizard.R.id;
import com.example.wardrobe_wizard.R.layout;

public class HomePage extends AppCompatActivity {
    public static final String NAME = "NAME";
    private TextView nameText;
    private String name;

    public HomePage() {
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(layout.activity_home_page);
        this.nameText = (TextView)this.findViewById(id.textView2);
        Intent i = this.getIntent();
        this.name = i.getStringExtra("NAME");
        this.nameText.setText(String.format("Welcome! %s", this.name));
        Button locateButton = (Button)this.findViewById(id.button2);
        locateButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String locationName = "Tapasi Temple Tower";
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + Uri.encode(locationName));
                Intent mapsIntent = new Intent("android.intent.action.VIEW", gmmIntentUri);
                mapsIntent.setPackage("com.google.android.apps.maps");
                HomePage.this.startActivity(mapsIntent);
            }
        });
        Button contactButton = (Button)this.findViewById(id.button3);
        contactButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String phoneNumber = "1234567890";
                Intent dialIntent = new Intent("android.intent.action.DIAL");
                dialIntent.setData(Uri.parse("tel:" + phoneNumber));
                HomePage.this.startActivity(dialIntent);
            }
        });
    }
}
