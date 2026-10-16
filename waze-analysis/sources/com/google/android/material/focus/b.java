package com.google.android.material.focus;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FocusRingDrawable f6527a;

    b(FocusRingDrawable focusRingDrawable) {
        Objects.requireNonNull(focusRingDrawable);
        this.f6527a = focusRingDrawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        FocusRingDrawable focusRingDrawable = this.f6527a;
        focusRingDrawable.o = 1.0f;
        focusRingDrawable.invalidateSelf();
    }
}
