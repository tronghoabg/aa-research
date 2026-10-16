package com.bytedance.sdk.component.adexpress.ivm;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class dz extends FrameLayout {
    private boolean lw;
    private AnimatorSet moa;

    /* renamed from: oa, reason: collision with root package name */
    private ImageView f24902oa;
    private Context uef;
    private orq yo;

    public dz(Context context) {
        super(context);
        this.lw = true;
        this.uef = context;
        this.moa = new AnimatorSet();
        yo();
        moa();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ivm.dz.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dz.this.f24902oa.getLayoutParams();
                layoutParams.topMargin = (int) ((dz.this.yo.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.moa.xs.uef(dz.this.getContext(), 5.0f));
                layoutParams.leftMargin = (int) ((dz.this.yo.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.moa.xs.uef(dz.this.getContext(), 5.0f));
                layoutParams.bottomMargin = (int) (com.bytedance.sdk.component.adexpress.moa.xs.uef(dz.this.getContext(), 5.0f) + ((-dz.this.yo.getMeasuredHeight()) / 2.0f));
                layoutParams.rightMargin = (int) (com.bytedance.sdk.component.adexpress.moa.xs.uef(dz.this.getContext(), 5.0f) + ((-dz.this.yo.getMeasuredWidth()) / 2.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                dz.this.f24902oa.setLayoutParams(layoutParams);
            }
        });
    }

    private void moa() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f24902oa, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.ivm.dz.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (dz.this.lw) {
                    dz.this.yo.uef();
                }
                dz.this.lw = !r2.lw;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(dz.this.f24902oa, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                objectAnimatorOfFloat2.start();
                dz.this.f24902oa.setVisibility(0);
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f24902oa, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setDuration(800L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.moa.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    private void yo() {
        this.yo = new orq(this.uef);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.uef, 40.0f), (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.uef, 40.0f));
        layoutParams.gravity = 8388627;
        addView(this.yo, layoutParams);
        this.f24902oa = new ImageView(this.uef);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.uef, 62.0f), (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.uef, 62.0f));
        layoutParams2.gravity = 16;
        this.f24902oa.setImageResource(com.bytedance.sdk.component.utils.orq.moa(this.uef, "tt_splash_hand"));
        addView(this.f24902oa, layoutParams2);
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
        ImageView imageView = this.f24902oa;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }

    public void uef() {
        this.moa.start();
    }
}
