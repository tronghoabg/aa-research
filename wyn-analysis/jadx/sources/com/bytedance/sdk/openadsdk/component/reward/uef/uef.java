package com.bytedance.sdk.openadsdk.component.reward.uef;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;

/* loaded from: classes3.dex */
public class uef {
    private com.bytedance.sdk.openadsdk.core.widget.xs ivm;
    protected com.bytedance.sdk.openadsdk.core.yo.lw lw;
    com.bytedance.sdk.openadsdk.core.widget.bcc moa;

    /* renamed from: oa, reason: collision with root package name */
    protected final Context f25431oa;
    protected final gzw uef;
    private AnimatorSet xs;
    protected final int yo;

    public uef(Context context, gzw gzwVar, int i5) {
        this.f25431oa = context;
        this.uef = gzwVar;
        this.yo = i5;
    }

    public View lw() {
        return this.ivm;
    }

    public void moa() {
        com.bytedance.sdk.openadsdk.core.widget.xs xsVar = this.ivm;
        if (xsVar != null) {
            xsVar.setVisibility(8);
        }
    }

    public void oa() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(1, 80);
        valueAnimatorOfInt.setDuration(2000L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.uef.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                com.bytedance.sdk.openadsdk.core.widget.bcc bccVar = uef.this.moa;
                if (bccVar != null) {
                    bccVar.setProgress(iIntValue);
                }
            }
        });
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(81, 99);
        valueAnimatorOfInt2.setDuration(3000L);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.uef.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                com.bytedance.sdk.openadsdk.core.widget.bcc bccVar = uef.this.moa;
                if (bccVar != null) {
                    bccVar.setProgress(iIntValue);
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.xs = animatorSet;
        animatorSet.play(valueAnimatorOfInt).before(valueAnimatorOfInt2);
        this.xs.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.uef.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
            }
        });
        this.xs.start();
    }

    public void uef(com.bytedance.sdk.openadsdk.core.yo.lw lwVar) {
        this.lw = lwVar;
    }

    public void yo() {
        AnimatorSet animatorSet = this.xs;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void uef() {
        try {
            if (cp.yo(this.uef)) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.widget.xs xsVar = new com.bytedance.sdk.openadsdk.core.widget.xs(this.f25431oa);
            this.ivm = xsVar;
            this.moa = xsVar.getLoadingProgressBar();
            com.bytedance.sdk.openadsdk.core.ivm.bcc downloadButton = this.ivm.getDownloadButton();
            if (downloadButton != null) {
                downloadButton.setOnClickListener(this.lw);
            }
            this.ivm.uef(this.uef, this.yo);
        } catch (Throwable unused) {
        }
    }
}
