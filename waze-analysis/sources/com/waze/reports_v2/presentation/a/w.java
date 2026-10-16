package com.waze.reports_v2.presentation.a;

import android.animation.Animator;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class w implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CompletableDeferred f34758a;

    w(CompletableDeferred completableDeferred) {
        this.f34758a = completableDeferred;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        h.g.b.x.f(animator, "animation");
        this.f34758a.a(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h.g.b.x.f(animator, "animation");
        this.f34758a.a(true);
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
