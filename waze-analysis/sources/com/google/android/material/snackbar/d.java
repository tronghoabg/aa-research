package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f6748a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o f6749b;

    d(o oVar, int i2) {
        this.f6748a = i2;
        Objects.requireNonNull(oVar);
        this.f6749b = oVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f6749b.z();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        o oVar = this.f6749b;
        oVar.B.e(oVar.f6780k);
    }
}
