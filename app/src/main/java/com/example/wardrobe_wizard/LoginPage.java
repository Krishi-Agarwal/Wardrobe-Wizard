//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.wardrobe_wizard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.wardrobe_wizard.R.id;
import com.example.wardrobe_wizard.R.layout;

public class LoginPage extends AppCompatActivity {
    private EditText nameText;
    private EditText passText;
    private Button button;
    private String name;
    private String pass;

    public LoginPage() {
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(layout.activity_login_page);
        this.nameText = (EditText)this.findViewById(id.editTextTextEmailAddress);
        this.passText = (EditText)this.findViewById(id.editTextTextPassword);
        this.button = (Button)this.findViewById(id.button);
        this.button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                LoginPage.this.sendData();
            }
        });
    }

    public void sendData() {
        this.name = this.nameText.getText().toString().trim();
        this.pass = this.passText.getText().toString().trim();
        if (this.pass.equals("hello123")) {
            Intent i = new Intent(this, HomePage.class);
            i.putExtra("NAME", this.name);
            this.startActivity(i);
        } else {
            Toast.makeText(this, "Invalid password", Toast.LENGTH_SHORT).show();
        }

    }
}
