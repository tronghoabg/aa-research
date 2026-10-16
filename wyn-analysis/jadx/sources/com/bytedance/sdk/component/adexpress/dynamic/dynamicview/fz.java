package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class fz extends ivm {
    private int dhk;

    /* renamed from: oa, reason: collision with root package name */
    ObjectAnimator f24812oa;
    private Runnable orq;
    private boolean tpx;
    ObjectAnimator uef;

    public fz(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        super(context, dynamicRootView, bccVar);
        this.dhk = 0;
        this.tpx = false;
        this.orq = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fz.1
            @Override // java.lang.Runnable
            public void run() {
                fz.this.uef();
            }
        };
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.oyt
    public void oa() {
        removeCallbacks(this.orq);
        ObjectAnimator objectAnimator = this.uef;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.uef.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f24812oa;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.f24812oa.cancel();
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
        postDelayed(this.orq, 2500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef() {
        final View childAt;
        final View childAt2 = getChildAt(this.dhk);
        int i5 = this.dhk;
        if (i5 == 0) {
            this.tpx = false;
        }
        boolean z2 = i5 + 1 >= getChildCount() || ((ViewGroup) getChildAt(this.dhk + 1)).getChildCount() <= 0;
        if (this.cq.zjm().lw().uef() || !z2) {
            View childAt3 = z2 ? getChildAt((this.dhk + 2) % getChildCount()) : getChildAt((this.dhk + 1) % getChildCount());
            this.uef = ObjectAnimator.ofFloat(childAt2, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (-(getChildAt(this.dhk).getHeight() + this.bcc)) / 2);
            if (z2) {
                this.dhk++;
            }
            childAt = childAt3;
        } else {
            this.tpx = true;
            childAt = getChildAt(this.dhk - 1);
            this.uef = ObjectAnimator.ofFloat(childAt2, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (getChildAt(this.dhk).getHeight() + this.bcc) / 2);
        }
        this.uef.setInterpolator(new LinearInterpolator());
        this.uef.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fz.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                childAt2.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        if (this.tpx) {
            this.f24812oa = ObjectAnimator.ofFloat(childAt, "translationY", (-(childAt.getHeight() + this.bcc)) / 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            this.f24812oa = ObjectAnimator.ofFloat(childAt, "translationY", (childAt.getHeight() + this.bcc) / 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        this.f24812oa.setInterpolator(new LinearInterpolator());
        this.f24812oa.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fz.3
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
                childAt.setVisibility(0);
            }
        });
        this.uef.setDuration(500L);
        this.f24812oa.setDuration(500L);
        this.uef.start();
        this.f24812oa.start();
        if (this.tpx) {
            this.dhk--;
        } else {
            int i10 = this.dhk + 1;
            this.dhk = i10;
            this.dhk = i10 % getChildCount();
        }
        postDelayed(this.orq, 3000L);
    }
}
