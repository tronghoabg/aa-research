package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes2.dex */
final class ffu extends AnimatorListenerAdapter {
    final /* synthetic */ yw a;
    final /* synthetic */ fgc b;

    public ffu(fgc fgcVar, yw ywVar) {
        this.b = fgcVar;
        this.a = ywVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.remove(animator);
        this.b.o.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.o.add(animator);
    }
}
