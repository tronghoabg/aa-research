package com.waze.view.navbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ float f45093a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f45094b;

    j(p pVar, float f2) {
        this.f45093a = f2;
        Objects.requireNonNull(pVar);
        this.f45094b = pVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f45094b.A((int) this.f45093a, 0.0f);
    }
}
