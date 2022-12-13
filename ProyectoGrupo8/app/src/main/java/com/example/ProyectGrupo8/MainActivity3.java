package com.example.ProyectGrupo8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sprint1.R;

public class MainActivity3 extends AppCompatActivity {

    private Button btnProductInfo;
    private TextView textProductName,textProductDescription,textProductPrice;
    private ImageView imgProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btnProductInfo = (Button) findViewById(R.id.btnProductInfo);
        textProductName = (TextView) findViewById(R.id.textProductName);
        textProductPrice = (TextView) findViewById(R.id.textProductPrice);
        imgProduct = (ImageView) findViewById(R.id.imgProduct);
        textProductDescription = (TextView) findViewById(R.id.textProductDescription);

        Intent intentIn = getIntent();
        textProductName.setText(intentIn.getStringExtra("name"));

        textProductDescription.setText(intentIn.getStringExtra("description"));
        textProductPrice.setText(intentIn.getStringExtra("Price"));

        int codeImage = intentIn.getIntExtra("image",0);
        imgProduct.setImageResource(codeImage);


        btnProductInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}