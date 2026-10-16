package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes3.dex */
public final class wph extends AnimatorListenerAdapter {
    final /* synthetic */ wpl a;
    private boolean b;

    public wph(wpl wplVar) {
        this.a = wplVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        wpl wplVar = this.a;
        wplVar.A = 0;
        wplVar.v = null;
        if (this.b) {
            return;
        }
        wplVar.B.g(4, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        wpl wplVar = this.a;
        wplVar.B.g(0, false);
        wplVar.A = 1;
        wplVar.v = animator;
        this.b = false;
    }
}
