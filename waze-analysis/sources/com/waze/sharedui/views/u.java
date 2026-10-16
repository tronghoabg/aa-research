package com.waze.sharedui.views;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class u implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    final ArgbEvaluator f39278a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f39279b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ OvalButton f39280c;

    u(OvalButton ovalButton, int i2) {
        this.f39279b = i2;
        Objects.requireNonNull(ovalButton);
        this.f39280c = ovalButton;
        this.f39278a = new ArgbEvaluator();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        OvalButton ovalButton = this.f39280c;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ovalButton.f39140b = ((Integer) this.f39278a.evaluate(animatedFraction, Integer.valueOf(ovalButton.f39139a), Integer.valueOf(this.f39279b))).intValue();
        ovalButton.f39149k = (int) (ovalButton.f39148j * (1.0f - animatedFraction));
        float f2 = 1.0f - (animatedFraction * 0.100000024f);
        ovalButton.setScaleX(f2);
        ovalButton.setScaleY(f2);
        ovalButton.u();
        ovalButton.invalidate();
    }
}
