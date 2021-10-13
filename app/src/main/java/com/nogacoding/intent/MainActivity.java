package com.nogacoding.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //memanggil button dan editText by id di activity_main.xml
        button =findViewById(R.id.button);
        editText=findViewById(R.id.editText);
        //memberikan Action click pada button visit
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            //Implementasi Intent, pada mainActivy.java memberikan Action pada submit button
            //membuat class onClick
            public void onClick(View view) {
                String url = editText.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
            });
        }
    }
