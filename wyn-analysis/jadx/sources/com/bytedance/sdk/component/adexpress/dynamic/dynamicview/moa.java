package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class moa extends ivm {
    private int dhk;

    /* renamed from: oa, reason: collision with root package name */
    ObjectAnimator f24824oa;
    private Runnable tpx;
    ObjectAnimator uef;

    public moa(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        super(context, dynamicRootView, bccVar);
        this.dhk = 0;
        this.tpx = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.moa.1
            @Override // java.lang.Runnable
            public void run() {
                moa.this.uef();
            }
        };
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.oyt
    public void oa() {
        removeCallbacks(this.tpx);
        ObjectAnimator objectAnimator = this.uef;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.uef.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f24824oa;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.f24824oa.cancel();
        }
        super.oa();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.topMargin = (this.bcc - layoutParams.height) / 2;
            childAt.setLayoutParams(layoutParams);
            if (i5 != 0) {
                childAt.setVisibility(8);
            }
        }
        postDelayed(this.tpx, 2500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef() {
        final View childAt = getChildAt(this.dhk);
        final View childAt2 = getChildAt((this.dhk + 1) % getChildCount());
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (-(getChildAt(this.dhk).getHeight() + this.bcc)) / 2);
        this.uef = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.uef.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.moa.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                childAt.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(childAt2, "translationY", (childAt2.getHeight() + this.bcc) / 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f24824oa = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        this.f24824oa.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.moa.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                childAt2.setVisibility(0);
            }
        });
        this.uef.setDuration(500L);
        this.f24824oa.setDuration(500L);
        this.uef.start();
        this.f24824oa.start();
        int i5 = this.dhk + 1;
        this.dhk = i5;
        this.dhk = i5 % getChildCount();
        postDelayed(this.tpx, 2000L);
    }
}
