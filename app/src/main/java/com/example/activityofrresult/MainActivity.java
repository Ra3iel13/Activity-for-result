package com.example.activityofrresult;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

private EditText tv_text;
private Button btn_go;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       btn_go = findViewById(R.id.btn_go);
       tv_text = findViewById(R.id.tv_text);


       btn_go.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this,Main2Activity.class);
               startActivityForResult(intent,1);

           }
       });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode==1){
            if (resultCode==RESULT_OK){

                tv_text.setText(data.getStringExtra("result"));
                        //data.getStringArrayExtra("result"));

            }
            if (resultCode==RESULT_CANCELED){


            }

        }

    }
}

