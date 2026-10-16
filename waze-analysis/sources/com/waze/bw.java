package com.waze;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bw extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cd f17563a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f17564b;

    bw(FreeMapAppActivity freeMapAppActivity, cd cdVar, Runnable runnable) {
        this.f17563a = cdVar;
        this.f17564b = runnable;
        Objects.requireNonNull(freeMapAppActivity);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f17563a.d();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f17563a.e();
        Runnable runnable = this.f17564b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
