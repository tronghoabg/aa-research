package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class kmc extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.kmd a;

    public kmc(defpackage.kmd kmdVar) {
        this.a = kmdVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.a();
    }
}
