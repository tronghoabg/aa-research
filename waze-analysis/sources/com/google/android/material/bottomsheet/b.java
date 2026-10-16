package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BottomSheetBehavior f6283a;

    b(BottomSheetBehavior bottomSheetBehavior) {
        Objects.requireNonNull(bottomSheetBehavior);
        this.f6283a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        BottomSheetBehavior bottomSheetBehavior = this.f6283a;
        if (bottomSheetBehavior.B != null) {
            bottomSheetBehavior.B.w(fFloatValue);
        }
    }
}
