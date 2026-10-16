package com.waze.design_components.button.timer;

import android.animation.Animator;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WazeButtonTimer f23374a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f23375b;

    c(WazeButtonTimer wazeButtonTimer) {
        this.f23374a = wazeButtonTimer;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        x.f(animator, "animator");
        this.f23375b = true;
        this.f23374a.a(0.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        x.f(animator, "animator");
        if (this.f23375b) {
            return;
        }
        WazeButtonTimer wazeButtonTimer = this.f23374a;
        wazeButtonTimer.a(1.0f);
        d dVar = wazeButtonTimer.f23368a;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        x.f(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        x.f(animator, "animator");
        this.f23375b = false;
        this.f23374a.a(0.0f);
    }
}
