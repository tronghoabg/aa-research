package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wlj extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.wll a;

    public wlj(defpackage.wll wllVar) {
        this.a = wllVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.d();
    }
}
