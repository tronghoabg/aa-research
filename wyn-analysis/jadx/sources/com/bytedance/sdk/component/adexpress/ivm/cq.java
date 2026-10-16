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
public class cq extends FrameLayout {
    private TextView ivm;
    private boolean lw;
    private AnimatorSet moa;

    /* renamed from: oa, reason: collision with root package name */
    private ImageView f24898oa;
    private Context uef;
    private moa yo;

    public cq(Context context) {
        super(context);
        this.lw = true;
        this.uef = context;
        this.moa = new AnimatorSet();
        yo();
        moa();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ivm.cq.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) cq.this.f24898oa.getLayoutParams();
                layoutParams.topMargin = ((int) ((cq.this.yo.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.moa.xs.uef(cq.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(cq.this.uef, 20.0f));
                layoutParams.leftMargin = ((int) ((cq.this.yo.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.moa.xs.uef(cq.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(cq.this.uef, 20.0f));
                layoutParams.bottomMargin = (int) (com.bytedance.sdk.component.adexpress.moa.xs.uef(cq.this.getContext(), 5.0f) + ((-cq.this.yo.getMeasuredHeight()) / 2.0f));
                layoutParams.rightMargin = (int) (com.bytedance.sdk.component.adexpress.moa.xs.uef(cq.this.getContext(), 5.0f) + ((-cq.this.yo.getMeasuredWidth()) / 2.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                cq.this.f24898oa.setLayoutParams(layoutParams);
            }
        });
    }

    public void setGuideText(String str) {
        this.ivm.setText(str);
    }

    public void setGuideTextColor(int i5) {
        this.ivm.setTextColor(i5);
    }

    private void moa() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f24898oa, "scaleX", 1.0f, 0.8f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.ivm.cq.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (cq.this.lw) {
                    cq.this.yo.uef();
                    cq.this.yo.setAlpha(1.0f);
                } else {
                    cq.this.yo.oa();
                    cq.this.yo.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                cq.this.lw = !r2.lw;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(cq.this.f24898oa, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat2.start();
                cq.this.f24898oa.setVisibility(0);
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f24898oa, "scaleY", 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.moa.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    private void yo() {
        this.yo = new moa(this.uef);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.uef, 80.0f), (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.uef, 80.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.uef, 20.0f);
        int iUef = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.uef, 20.0f);
        layoutParams.leftMargin = iUef;
        layoutParams.setMarginStart(iUef);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.yo, layoutParams);
        this.yo.uef();
        this.f24898oa = new ImageView(this.uef);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.uef, 80.0f), (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.uef, 80.0f));
        this.f24898oa.setImageResource(com.bytedance.sdk.component.utils.orq.moa(this.uef, "tt_splash_hand"));
        addView(this.f24898oa, layoutParams2);
        TextView textView = new TextView(this.uef);
        this.ivm = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.uef, 10.0f);
        addView(this.ivm, layoutParams3);
    }

    public void oa() {
        AnimatorSet animatorSet = this.moa;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        moa moaVar = this.yo;
        if (moaVar != null) {
            moaVar.oa();
        }
    }

    public void uef() {
        this.moa.start();
    }
}
