package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ar implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TextInputLayout f6880a;

    ar(TextInputLayout textInputLayout) {
        Objects.requireNonNull(textInputLayout);
        this.f6880a = textInputLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6880a.f6800d.B(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
