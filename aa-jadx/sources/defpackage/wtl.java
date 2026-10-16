package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wtl extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.wtn a;

    public wtl(defpackage.wtn wtnVar) {
        this.a = wtnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
        super.onAnimationRepeat(animator);
        defpackage.wtn wtnVar = this.a;
        wtnVar.c = (wtnVar.c + 1) % wtnVar.b.e.length;
        wtnVar.d = true;
    }
}
