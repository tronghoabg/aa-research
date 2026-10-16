package com.waze.sharedui.views;

import android.animation.ValueAnimator;
import android.graphics.DashPathEffect;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class t implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ValueAnimator f39275a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f39276b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ OvalButton f39277c;

    t(OvalButton ovalButton, ValueAnimator valueAnimator, Runnable runnable) {
        this.f39275a = valueAnimator;
        this.f39276b = runnable;
        Objects.requireNonNull(ovalButton);
        this.f39277c = ovalButton;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        OvalButton ovalButton = this.f39277c;
        if (ovalButton.u == 0 && fFloatValue != 0.0f) {
            this.f39275a.end();
            ovalButton.removeCallbacks(this.f39276b);
            fFloatValue = 0.0f;
        }
        ovalButton.p.setPathEffect(new DashPathEffect(new float[]{ovalButton.z, ovalButton.z}, fFloatValue * ovalButton.z));
        ovalButton.invalidate();
    }
}
