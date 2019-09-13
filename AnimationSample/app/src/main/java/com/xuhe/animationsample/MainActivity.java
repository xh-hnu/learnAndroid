package com.xuhe.animationsample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    private Animation mAnimation;
    private CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardView = findViewById(R.id.card_view);
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.scale_btn:
                mAnimation = AnimationUtils.loadAnimation(this, R.anim.scale_anim);
                cardView.startAnimation(mAnimation);
                break;
            case R.id.alpha_btn:
                //todo
                mAnimation = AnimationUtils.loadAnimation(this, R.anim.alpha_anim);
                cardView.startAnimation(mAnimation);
                break;
            case R.id.translate_btn:
                //todo
                mAnimation = AnimationUtils.loadAnimation(this, R.anim.translate_anim);
                cardView.startAnimation(mAnimation);
                break;
            case R.id.rotate_btn:
                mAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate_anim);
                cardView.startAnimation(mAnimation);
                break;
            case R.id.set_btn:
                //todo
                mAnimation = AnimationUtils.loadAnimation(this, R.anim.set_anim);
                cardView.startAnimation(mAnimation);
                break;
                default:
                    break;
        }
    }
}
