package com.bytedance.sdk.component.adexpress.ivm;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class dhk extends FrameLayout {
    private AnimatorSet bcc;
    private AnimatorSet cz;
    private AnimatorSet ivm;
    private TextView lw;
    private ImageView moa;

    /* renamed from: oa, reason: collision with root package name */
    private ImageView f24900oa;
    private Context uef;
    private AnimatorSet xs;
    private ImageView yo;

    public dhk(Context context) {
        super(context);
        this.ivm = new AnimatorSet();
        this.xs = new AnimatorSet();
        this.bcc = new AnimatorSet();
        this.cz = new AnimatorSet();
        this.uef = context;
        yo();
    }

    @Override // android.view.View
    public void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
    }

    public void setGuideText(String str) {
        this.lw.setText(str);
    }

    private void moa() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f24900oa, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.yo, "scaleX", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.yo, "scaleY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.moa, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        this.bcc.setDuration(300L);
        this.bcc.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f24900oa, "translationX", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.bytedance.sdk.component.adexpress.moa.xs.uef(getContext(), 90.0f));
        objectAnimatorOfFloat5.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, 1.0f));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(getContext(), 90.0f));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.ivm.dhk.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dhk.this.moa.getLayoutParams();
                layoutParams.width = num.intValue();
                dhk.this.moa.setLayoutParams(layoutParams);
            }
        });
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.yo, "translationX", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.bytedance.sdk.component.adexpress.moa.xs.uef(getContext(), 90.0f));
        objectAnimatorOfFloat6.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, 1.0f));
        this.cz.setDuration(1500L);
        this.cz.playTogether(objectAnimatorOfFloat5, valueAnimatorOfInt, objectAnimatorOfFloat6);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.f24900oa, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.moa, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.yo, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.xs.setDuration(50L);
        this.xs.playTogether(objectAnimatorOfFloat7, objectAnimatorOfFloat8, objectAnimatorOfFloat9);
        this.ivm.playSequentially(this.bcc, this.cz, this.xs);
    }

    private void yo() {
        ImageView imageView = new ImageView(this.uef);
        this.moa = imageView;
        imageView.setBackgroundResource(com.bytedance.sdk.component.utils.orq.moa(this.uef, "tt_splash_slide_right_bg"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        layoutParams.gravity = 48;
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.uef, 30.0f);
        addView(this.moa, layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView2 = new ImageView(this.uef);
        this.yo = imageView2;
        imageView2.setImageResource(com.bytedance.sdk.component.utils.orq.moa(this.uef, "tt_splash_slide_right_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.uef, 50.0f), (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.uef, 50.0f));
        layoutParams2.gravity = 48;
        layoutParams2.leftMargin = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.uef, 30.0f);
        addView(this.yo, layoutParams2);
        ImageView imageView3 = new ImageView(this.uef);
        this.f24900oa = imageView3;
        imageView3.setImageResource(com.bytedance.sdk.component.utils.orq.moa(this.uef, "tt_splash_hand2"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.uef, 80.0f), (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.uef, 80.0f));
        layoutParams3.gravity = 48;
        layoutParams3.leftMargin = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.uef, 30.0f);
        addView(this.f24900oa, layoutParams3);
        TextView textView = new TextView(this.uef);
        this.lw = textView;
        textView.setTextColor(-1);
        this.lw.setSingleLine();
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 80;
        addView(this.lw, layoutParams4);
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ivm.dhk.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) dhk.this.f24900oa.getLayoutParams();
                layoutParams5.topMargin = (int) ((dhk.this.yo.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.moa.xs.uef(dhk.this.getContext(), 7.0f));
                int iUef = (-dhk.this.yo.getMeasuredWidth()) + ((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(dhk.this.uef, 30.0f));
                layoutParams5.leftMargin = iUef;
                layoutParams5.setMarginStart(iUef);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                dhk.this.f24900oa.setLayoutParams(layoutParams5);
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) dhk.this.moa.getLayoutParams();
                layoutParams6.topMargin = (int) ((dhk.this.yo.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.moa.xs.uef(dhk.this.getContext(), 5.0f));
                layoutParams6.leftMargin = (int) ((dhk.this.yo.getMeasuredWidth() / 2.0f) + ((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(dhk.this.uef, 30.0f)));
                layoutParams5.setMarginStart(layoutParams5.leftMargin);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                dhk.this.moa.setLayoutParams(layoutParams6);
            }
        });
    }

    public void oa() {
        try {
            AnimatorSet animatorSet = this.ivm;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.bcc;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.cz;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.xs;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Throwable unused) {
        }
    }

    public void uef() {
        moa();
        this.ivm.start();
        this.ivm.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.ivm.dhk.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                dhk.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ivm.dhk.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        dhk.this.ivm.start();
                    }
                }, 200L);
            }
        });
    }
}
