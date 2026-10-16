package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wtp extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.wtr a;

    public wtp(defpackage.wtr wtrVar) {
        this.a = wtrVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        defpackage.wtr wtrVar = this.a;
        wtrVar.a();
        defpackage.fhn fhnVar = wtrVar.h;
        if (fhnVar != null) {
            fhnVar.b(wtrVar.j);
        }
    }
}
