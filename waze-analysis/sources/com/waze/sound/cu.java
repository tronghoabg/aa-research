package com.waze.sound;

import android.animation.ValueAnimator;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cu implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cw f39716a;

    cu(cw cwVar) {
        Objects.requireNonNull(cwVar);
        this.f39716a = cwVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction() * 1000.0f;
        cw cwVar = this.f39716a;
        int i2 = (int) animatedFraction;
        cwVar.f39724g.setProgress(i2);
        if (cwVar.n <= 0 || i2 < cwVar.n) {
            return;
        }
        cwVar.f39724g.setProgress(cwVar.n);
        cwVar.m.cancel();
    }
}
