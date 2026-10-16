package com.waze.settings;

import android.animation.Animator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ax extends ar {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ba f36804a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f36805b;

    ax(ba baVar, int i2) {
        this.f36804a = baVar;
        this.f36805b = i2;
    }

    @Override // com.waze.settings.ar, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h.g.b.x.f(animator, "var1");
        ba.s(this.f36804a, this.f36805b);
    }
}
