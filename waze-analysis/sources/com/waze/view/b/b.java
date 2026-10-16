package com.waze.view.b;

import android.animation.Animator;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f44981a;

    b(c cVar) {
        Objects.requireNonNull(cVar);
        this.f44981a = cVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f44981a.setLevel(10000);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f44981a.setLevel(0);
    }
}
