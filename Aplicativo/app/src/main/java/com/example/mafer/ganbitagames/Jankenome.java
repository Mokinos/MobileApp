package com.example.mafer.ganbitagames;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Jankenome extends AppCompatActivity {
    private Button btn_sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.jankenome);

        final EditText nameplayer = (EditText) findViewById(R.id.nameplayer);
        Button btn_sub = (Button) findViewById(R.id.btn_sub);

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent str = new Intent (getBaseContext(), telajanke.class);
                str.putExtra("nameplayer", nameplayer.getText().toString());
                Toast.makeText(getBaseContext(),nameplayer.getText().toString(), Toast.LENGTH_SHORT).show();
                startActivity(str);






            }
        });
    }
}
