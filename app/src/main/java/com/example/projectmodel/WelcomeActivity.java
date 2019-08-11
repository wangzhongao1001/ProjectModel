package com.example.projectmodel;

import android.content.Intent;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.sx.base.BaseActivity;

public class WelcomeActivity extends BaseActivity {

    private ImageView mWelcoImg;
    private Button mWelcoClick;
    private CountDownTimer mStart;

    @Override
    protected int getlayoutID() {
        return R.layout.activity_welcome;
    }

    @Override
    protected void initViewAndData() {
        super.initViewAndData();
        initView();
    }

    private void initView() {
        mWelcoClick = findViewById(R.id.welco_click);
        mWelcoImg = findViewById(R.id.welco_img);
        RequestOptions requestOptions  = RequestOptions.placeholderOf(R.drawable.qidongtu).error(R.drawable.qidongtu)
                .diskCacheStrategy(DiskCacheStrategy.NONE);

        Glide.with(this).load("https://app.yiyanmeng.com//Public//lunbo//15640206976348.jpg")
                .apply(requestOptions)
                .into(mWelcoImg);

        mStart = new CountDownTimer(4000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mWelcoClick.setText(millisUntilFinished / 1000 + "s跳转");

            }

            @Override
            public void onFinish() {
                startActivity(new Intent(WelcomeActivity.this, MainActivity.class));

            }
        }.start();

        mWelcoClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStart.cancel();
                startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
                finish();
            }
        });


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
     if (mStart!=null){
         mStart.cancel();
     }
    }
}
