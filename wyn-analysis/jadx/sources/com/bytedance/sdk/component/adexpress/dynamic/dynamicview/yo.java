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
public class yo extends ivm {
    private int dhk;

    /* renamed from: oa, reason: collision with root package name */
    ObjectAnimator f24835oa;
    private Runnable orq;
    private boolean tpx;
    ObjectAnimator uef;

    public yo(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        super(context, dynamicRootView, bccVar);
        this.dhk = 0;
        this.tpx = false;
        this.orq = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.yo.1
            @Override // java.lang.Runnable
            public void run() {
                yo.this.uef();
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
        ObjectAnimator objectAnimator2 = this.f24835oa;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.f24835oa.cancel();
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
        if (childAt2 == null) {
            return;
        }
        int i5 = this.dhk;
        if (i5 == 0) {
            this.tpx = false;
        }
        if (i5 + 1 >= getChildCount() || ((ViewGroup) getChildAt(this.dhk + 1)).getChildCount() <= 0) {
            this.tpx = true;
            childAt = getChildAt(this.dhk - 1);
            this.uef = ObjectAnimator.ofFloat(childAt2, "translationX", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (getChildAt(this.dhk).getWidth() + this.xs) / 2);
        } else {
            childAt = getChildAt(this.dhk + 1);
            this.uef = ObjectAnimator.ofFloat(childAt2, "translationX", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (-(getChildAt(this.dhk).getWidth() + this.xs)) / 2);
        }
        if (childAt == null) {
            return;
        }
        this.uef.setInterpolator(new LinearInterpolator());
        this.uef.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.yo.2
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
            this.f24835oa = ObjectAnimator.ofFloat(childAt, "translationX", (-(childAt.getWidth() + this.xs)) / 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            this.f24835oa = ObjectAnimator.ofFloat(childAt, "translationX", (childAt.getWidth() + this.xs) / 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        this.f24835oa.setInterpolator(new LinearInterpolator());
        this.f24835oa.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.yo.3
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
        this.f24835oa.setDuration(500L);
        this.uef.start();
        this.f24835oa.start();
        if (this.tpx) {
            this.dhk--;
        } else {
            this.dhk++;
        }
        postDelayed(this.orq, 2000L);
    }
}
