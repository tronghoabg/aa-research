package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wto extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.wtr a;

    public wto(defpackage.wtr wtrVar) {
        this.a = wtrVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
        super.onAnimationRepeat(animator);
        defpackage.wtr wtrVar = this.a;
        wtrVar.e = (wtrVar.e + 1) % wtrVar.d.e.length;
        wtrVar.f = true;
    }
}
