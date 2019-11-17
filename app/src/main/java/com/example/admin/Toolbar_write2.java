package com.example.admin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Toolbar_write2 extends AppCompatActivity {
    private Button resect;
    private static final int CHOOSE_PHOTO = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toolbar_write2);
        resect =(Button)findViewById(R.id.resect);
        resect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          /*在Activity Action里面有一个“ACTION_GET_CONTENT”字符串常量，
// 该常量让用户选择特定类型的数据，并返回该数据的URI.我们利用该常量，
//然后设置类型为“image/*”，就可获得Android手机内的所有image。*/
                Intent intent = new Intent();
                /* 开启Pictures画面Type设定为image */
                intent.setType("image/*");
                /* 使用Intent.ACTION_GET_CONTENT这个Action */
                intent.setAction(Intent.ACTION_GET_CONTENT);
                /* 取得相片后返回本画面 */
                startActivityForResult(intent, 1);


//Intent intent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
// startActivityForResult(intent, RESULT);
            }
        });


    }


}