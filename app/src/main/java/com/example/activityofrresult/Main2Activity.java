package com.example.activityofrresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private EditText tx_name;
    private Button btn_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn_result = findViewById(R.id.btn_result);
        tx_name=findViewById(R.id.tx_name);

        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendBackname();
            }
        });
    }
    private void sendBackname(){
        Intent intent = new Intent();
        intent.putExtra("result",tx_name.getText().toString());
        setResult(RESULT_OK,intent);
        finish();

    }
}
