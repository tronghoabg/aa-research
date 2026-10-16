package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fgc extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.fgj a;

    public fgc(defpackage.fgj fgjVar) {
        this.a = fgjVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.s();
        animator.removeListener(this);
    }
}
