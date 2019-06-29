package com.rathana.style_selector;

import android.support.annotation.AnimRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class AnimationActivity extends AppCompatActivity {

    View mView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        mView=findViewById(R.id.view);

    }

    public void onDoAnimFadeOut(View view){
        Animation anim= AnimationUtils.loadAnimation(
                this,
                R.anim.fade_out_anim);
        mView.startAnimation(anim);
    }

    public void onDoAnimZoomIn(View view){
        doAnimation(mView,R.anim.zoom_in_anim);
    }


    private void doAnimation(View view,@AnimRes int anim) {
        Animation animation = AnimationUtils.loadAnimation(
                this,
                anim);
        view.startAnimation(animation);
    }
}
