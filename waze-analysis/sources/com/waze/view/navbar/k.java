package com.waze.view.navbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f45095a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f45096b;

    k(l lVar, m mVar) {
        this.f45095a = mVar;
        Objects.requireNonNull(lVar);
        this.f45096b = lVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        p pVar = (p) this.f45096b.f45097a;
        pVar.f45107b.removeView(this.f45095a);
        pVar.f45106a.getDecorView().setBackground(pVar.f45110e);
        pVar.z(pVar.f45112g);
    }
}
