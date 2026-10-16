package com.bytedance.sdk.component.adexpress.ivm;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class wk extends FrameLayout {
    private TextView ivm;
    private boolean lw;
    private AnimatorSet moa;

    /* renamed from: oa, reason: collision with root package name */
    private ImageView f24914oa;
    private Context uef;
    private orq yo;

    public wk(Context context) {
        super(context);
        this.lw = true;
        this.uef = context;
        this.moa = new AnimatorSet();
        yo();
        moa();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ivm.wk.1
            @Override // java.lang.Runnable
            public void run() {
                int iUef = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(wk.this.uef, 50.0f);
                int iUef2 = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(wk.this.uef, 50.0f);
                if (wk.this.yo.getMeasuredHeight() > 0) {
                    iUef = wk.this.yo.getMeasuredHeight();
                }
                if (wk.this.yo.getMeasuredWidth() > 0) {
                    iUef2 = wk.this.yo.getMeasuredWidth();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) wk.this.f24914oa.getLayoutParams();
                layoutParams.topMargin = ((int) ((iUef / 2.0f) - com.bytedance.sdk.component.adexpress.moa.xs.uef(wk.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(wk.this.uef, 40.0f));
                layoutParams.leftMargin = ((int) ((iUef2 / 2.0f) - com.bytedance.sdk.component.adexpress.moa.xs.uef(wk.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(wk.this.uef, 20.0f));
                layoutParams.bottomMargin = (int) (com.bytedance.sdk.component.adexpress.moa.xs.uef(wk.this.getContext(), 5.0f) + ((-iUef) / 2.0f));
                layoutParams.rightMargin = (int) (com.bytedance.sdk.component.adexpress.moa.xs.uef(wk.this.getContext(), 5.0f) + ((-iUef2) / 2.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                wk.this.f24914oa.setLayoutParams(layoutParams);
            }
        });
    }

    public void setGuideText(String str) {
        this.ivm.setVisibility(0);
        this.ivm.setText(str);
    }

    public void setGuideTextColor(int i5) {
        this.ivm.setTextColor(i5);
    }

    private void moa() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f24914oa, "scaleX", 1.0f, 1.0f, 1.0f, 0.9f);
        objectAnimatorOfFloat.setDuration(600L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.ivm.wk.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (wk.this.lw) {
                    wk.this.yo.uef();
                }
                wk.this.lw = !r2.lw;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(wk.this.f24914oa, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat2.start();
                wk.this.f24914oa.setVisibility(0);
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f24914oa, "scaleY", 1.0f, 1.0f, 1.0f, 0.9f);
        objectAnimatorOfFloat2.setDuration(600L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.moa.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    private void yo() {
        this.yo = new orq(this.uef);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.uef, 50.0f), (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.uef, 50.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.uef, 40.0f);
        int iUef = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.uef, 20.0f);
        layoutParams.leftMargin = iUef;
        layoutParams.setMarginStart(iUef);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.yo, layoutParams);
        this.f24914oa = new ImageView(this.uef);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.uef, 78.0f), (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.uef, 78.0f));
        this.f24914oa.setImageResource(com.bytedance.sdk.component.utils.orq.moa(this.uef, "tt_splash_hand"));
        addView(this.f24914oa, layoutParams2);
        TextView textView = new TextView(this.uef);
        this.ivm = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.uef, 10.0f);
        addView(this.ivm, layoutParams3);
        this.ivm.setVisibility(8);
    }

    public void oa() {
        AnimatorSet animatorSet = this.moa;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        orq orqVar = this.yo;
        if (orqVar != null) {
            orqVar.oa();
        }
        ImageView imageView = this.f24914oa;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }

    public void uef() {
        this.moa.start();
    }
}
