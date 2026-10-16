package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes3.dex */
public final class wpi extends AnimatorListenerAdapter {
    final /* synthetic */ wpl a;

    public wpi(wpl wplVar) {
        this.a = wplVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        wpl wplVar = this.a;
        wplVar.A = 0;
        wplVar.v = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        wpl wplVar = this.a;
        wplVar.B.g(0, false);
        wplVar.A = 2;
        wplVar.v = animator;
    }
}
