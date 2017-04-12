package com.example.douzaer.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jump(View view){
        //读取编辑框值
        String data;
        EditText editText = (EditText)findViewById(R.id.edit_uri);
        data = editText.getText().toString();
        //data转换为uri
        Uri uri = Uri.parse(data);
        //跳转
        Intent intent = new Intent();
        //设置action
        intent.setAction(Intent.ACTION_VIEW);
        //设置值
        intent.setData(uri);
        //启动
        startActivity(intent);
    }
}
