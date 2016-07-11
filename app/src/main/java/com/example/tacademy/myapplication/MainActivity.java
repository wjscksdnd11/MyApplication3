package com.example.tacademy.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


        EditText inputView;
        TextView messageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputView  = (EditText)findViewById(R.id.editText);
        messageView = (TextView)findViewById(R.id.text_title) ;

        Button btn = (Button)findViewById(R.id.btn_send);

        btn.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                String text = inputView.getText().toString();
                messageView.setText(text);
            }
        });

        btn=(Button)findViewById(R.id.btn_toast);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

//                String text = getResources().getString(R.string.toast_messaege);  이렇게 쓸수도 있다.
                Toast.makeText(MainActivity.this,R.string.toast_messaege,Toast.LENGTH_SHORT).show();//익명클래스니까 아우터 클래스의 객체를 참조하기 위해서
            }
        });



        btn=(Button)findViewById(R.id.btn_google);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                //인텐트는 액티비티

                startActivity(intent);
            }
        });


        btn=(Button)findViewById(R.id.btn_dial);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:010-1234-1234"));
                //인텐트는 액티비티

                startActivity(intent);
            }
        });
    }
}
