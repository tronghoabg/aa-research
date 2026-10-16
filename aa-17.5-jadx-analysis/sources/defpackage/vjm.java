package defpackage;

import android.animation.Animator;

/* loaded from: classes3.dex */
public final class vjm extends vjk {
    protected final Animator a;
    public final Runnable b;
    public int d;
    private final vjo e = new vjl(this);
    public final int c = -1;

    public vjm(Animator animator, Runnable runnable) {
        this.a = animator;
        this.b = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            return;
        }
        vjq.c().a(this.e);
    }
}
