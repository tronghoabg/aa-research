package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes2.dex */
final class ffv extends AnimatorListenerAdapter {
    final /* synthetic */ fgc a;

    public ffv(fgc fgcVar) {
        this.a = fgcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.t();
        animator.removeListener(this);
    }
}
