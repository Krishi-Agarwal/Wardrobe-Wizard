//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.wardrobe_wizard;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.wardrobe_wizard.R.id;
import com.example.wardrobe_wizard.R.layout;
import com.example.wardrobe_wizard.R.raw;

public class SplashPage extends AppCompatActivity {
    VideoView vv;

    public SplashPage() {
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(layout.activity_splash_page);
        Toast.makeText(this, "Wardrobe Wizard", 0).show();
        int videoResourceID = raw.logo;
        this.vv = (VideoView)this.findViewById(id.videoView);
        Uri videoUri = Uri.parse("android.resource://" + this.getPackageName() + "/" + videoResourceID);
        this.vv.setVideoURI(videoUri);
        this.vv.start();
        (new Handler(Looper.getMainLooper())).postDelayed(new Runnable() {
            public void run() {
                SplashPage.this.startActivity(new Intent(SplashPage.this, LoginPage.class));
                SplashPage.this.finish();
            }
        }, 4000L);
    }
}
