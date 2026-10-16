package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eca extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.ecb a;

    public eca(defpackage.ecb ecbVar) {
        this.a = ecbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        this.a.c();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        this.a.b();
    }
}
