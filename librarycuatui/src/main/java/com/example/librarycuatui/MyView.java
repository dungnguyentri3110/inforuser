package com.example.librarycuatui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyView extends LinearLayout {
    private EditText editText;
    private Button btn;

    public MyView(Context context) {
        super(context);
        initView(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context){
        inflate(context, R.layout.my_view, this);
        editText = findViewById(R.id.edt_text);
        btn= findViewById(R.id.btn_click);

        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText.getText().toString();
                String message = "THIS IS NAME: " + name;
                Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
