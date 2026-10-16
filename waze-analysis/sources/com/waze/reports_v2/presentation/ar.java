package com.waze.reports_v2.presentation;

import android.animation.Animator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ar implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f34827a;

    ar(h.g.a.a aVar) {
        this.f34827a = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        h.g.b.x.f(animator, "animation");
        this.f34827a.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h.g.b.x.f(animator, "animation");
        this.f34827a.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        h.g.b.x.f(animator, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        h.g.b.x.f(animator, "animation");
    }
}
