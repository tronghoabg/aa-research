package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wsp extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.wss a;

    public wsp(defpackage.wss wssVar) {
        this.a = wssVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        defpackage.wss wssVar = this.a;
        wssVar.a();
        defpackage.fhn fhnVar = wssVar.i;
        if (fhnVar != null) {
            fhnVar.b(wssVar.j);
        }
    }
}
