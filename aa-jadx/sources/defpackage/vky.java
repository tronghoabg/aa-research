package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class vky extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.vla a;

    public vky(defpackage.vla vlaVar) {
        this.a = vlaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        android.animation.AnimatorSet animatorSet = this.a.a;
        if (animatorSet.isStarted()) {
            return;
        }
        animatorSet.start();
    }
}
