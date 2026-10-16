package com.bytedance.sdk.component.adexpress.ivm;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class tpx extends RelativeLayout {
    private AnimatorSet bcc;
    private AnimatorSet cz;
    private int dj;
    private AnimatorSet ivm;
    private TextView lw;
    private TextView moa;

    /* renamed from: oa, reason: collision with root package name */
    private ImageView f24912oa;
    private ImageView uef;
    private AnimatorSet xs;
    private ImageView yo;
    private String zjm;

    public tpx(Context context) {
        super(context);
        this.ivm = new AnimatorSet();
        this.xs = new AnimatorSet();
        this.bcc = new AnimatorSet();
        this.cz = new AnimatorSet();
        this.dj = 100;
        uef(context);
    }

    public AnimatorSet getSlideUpAnimatorSet() {
        return this.ivm;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        oa();
    }

    public void setGuideText(String str) {
        TextView textView = this.moa;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setSlideText(String str) {
        if (this.lw != null) {
            if (TextUtils.isEmpty(str)) {
                this.lw.setText("");
            } else {
                this.lw.setText(str);
            }
        }
    }

    public void yo() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.uef, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.uef, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.uef, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.bytedance.sdk.component.adexpress.moa.xs.uef(getContext(), -this.dj));
        objectAnimatorOfFloat3.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, 1.0f));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(getContext(), this.dj));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.ivm.tpx.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (tpx.this.yo != null) {
                    Integer num = (Integer) valueAnimator.getAnimatedValue();
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) tpx.this.yo.getLayoutParams();
                    layoutParams.height = num.intValue();
                    tpx.this.yo.setLayoutParams(layoutParams);
                }
            }
        });
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.yo, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.yo, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f24912oa, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.f24912oa, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.f24912oa, "scaleX", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.f24912oa, "scaleY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(this.f24912oa, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.bytedance.sdk.component.adexpress.moa.xs.uef(getContext(), -this.dj));
        objectAnimatorOfFloat10.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, 1.0f));
        this.xs.setDuration(50L);
        this.cz.setDuration(1500L);
        this.bcc.setDuration(50L);
        this.xs.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat7, objectAnimatorOfFloat5);
        this.bcc.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat6, objectAnimatorOfFloat8, objectAnimatorOfFloat9, objectAnimatorOfFloat4);
        this.cz.playTogether(objectAnimatorOfFloat3, valueAnimatorOfInt, objectAnimatorOfFloat10);
        this.ivm.playSequentially(this.bcc, this.cz, this.xs);
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
            AnimatorSet animatorSet3 = this.xs;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.cz;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Exception e7) {
            e7.getMessage();
        }
    }

    public void uef(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.moa.uef();
        }
        if ("5".equals(this.zjm)) {
            addView(com.bytedance.sdk.component.adexpress.yo.uef.ivm(context));
            this.dj = (int) (this.dj * 1.25d);
        } else {
            addView(com.bytedance.sdk.component.adexpress.yo.uef.lw(context));
        }
        this.uef = (ImageView) findViewById(2097610734);
        this.f24912oa = (ImageView) findViewById(2097610735);
        this.moa = (TextView) findViewById(2097610730);
        this.yo = (ImageView) findViewById(2097610733);
        this.lw = (TextView) findViewById(2097610731);
    }

    public tpx(Context context, String str) {
        super(context);
        this.ivm = new AnimatorSet();
        this.xs = new AnimatorSet();
        this.bcc = new AnimatorSet();
        this.cz = new AnimatorSet();
        this.dj = 100;
        setClipChildren(false);
        this.zjm = str;
        uef(context);
    }

    public void uef() {
        yo();
        this.ivm.start();
        this.ivm.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.ivm.tpx.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                tpx.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ivm.tpx.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        tpx.this.ivm.start();
                    }
                }, 200L);
            }
        });
    }
}
