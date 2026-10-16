package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f6743a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o f6744b;

    a(o oVar, int i2) {
        this.f6743a = i2;
        Objects.requireNonNull(oVar);
        this.f6744b = oVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f6744b.z();
    }
}
