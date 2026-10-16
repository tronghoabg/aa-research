package com.bytedance.sdk.component.adexpress.ivm;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class oa extends FrameLayout {
    private int bcc;
    private int cz;
    private View ivm;
    private View lw;
    private View moa;

    /* renamed from: oa, reason: collision with root package name */
    private ObjectAnimator f24907oa;
    private AnimatorSet uef;
    private ImageView xs;
    private boolean yo;
    private Context zjm;

    public oa(Context context, int i5, int i10) {
        super(context);
        this.yo = false;
        this.uef = new AnimatorSet();
        this.bcc = i5;
        this.cz = i10;
        this.zjm = context;
        yo();
        moa();
    }

    private void moa() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.moa, "scaleX", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.moa, "scaleY", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.lw, "scaleX", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.lw, "scaleY", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.ivm, "scaleX", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.ivm, "scaleY", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.xs, "rotation", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -20.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f24907oa = objectAnimatorOfFloat7;
        objectAnimatorOfFloat7.setDuration(1000L);
        this.uef.setDuration(1500L);
        this.uef.setInterpolator(new AccelerateDecelerateInterpolator());
        this.uef.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6);
        this.uef.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.ivm.oa.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                oa.this.yo = true;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (oa.this.yo) {
                    return;
                }
                oa.this.f24907oa.start();
                oa.this.uef.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
    }

    private void yo() {
        View view = new View(this.zjm);
        this.moa = view;
        view.setBackground(uef("#1A7BBEFF", "#337BBEFF"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (this.bcc * 0.45d), (int) (this.cz * 0.45d));
        layoutParams.gravity = 17;
        this.moa.setLayoutParams(layoutParams);
        addView(this.moa);
        View view2 = new View(this.zjm);
        this.lw = view2;
        view2.setBackground(uef("#337BBEFF", "#807BBEFF"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (this.bcc * 0.25d), (int) (this.cz * 0.25d));
        layoutParams2.gravity = 17;
        this.lw.setLayoutParams(layoutParams2);
        addView(this.lw);
        View view3 = new View(this.zjm);
        this.ivm = view3;
        view3.setBackground(uef("#807BBEFF", "#FF7BBEFF"));
        int i5 = this.bcc;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (i5 * 0.25d), (int) (i5 * 0.25d));
        layoutParams3.gravity = 17;
        this.ivm.setLayoutParams(layoutParams3);
        addView(this.ivm);
        ImageView imageView = new ImageView(this.zjm);
        this.xs = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.orq.moa(getContext(), "tt_blue_hand"));
        this.xs.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) (this.bcc * 0.62d), (int) (this.cz * 0.53d));
        layoutParams4.gravity = 17;
        layoutParams4.topMargin = (layoutParams4.width / 2) - 5;
        layoutParams4.leftMargin = (layoutParams4.height / 2) - 5;
        this.xs.setLayoutParams(layoutParams4);
        addView(this.xs);
    }

    public void oa() {
        this.yo = true;
        ObjectAnimator objectAnimator = this.f24907oa;
        if (objectAnimator == null || this.uef == null) {
            return;
        }
        objectAnimator.cancel();
        this.uef.cancel();
    }

    private GradientDrawable uef(String str, String str2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setStroke(1, Color.parseColor(str2));
        return gradientDrawable;
    }

    public void uef() {
        this.yo = false;
        ObjectAnimator objectAnimator = this.f24907oa;
        if (objectAnimator == null || this.uef == null) {
            return;
        }
        objectAnimator.start();
        this.uef.start();
    }
}
