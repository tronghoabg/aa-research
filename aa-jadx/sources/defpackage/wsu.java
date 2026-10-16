package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wsu extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.wsx a;

    public wsu(defpackage.wsx wsxVar) {
        this.a = wsxVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        defpackage.wsx wsxVar = this.a;
        wsxVar.a();
        defpackage.fhn fhnVar = wsxVar.h;
        if (fhnVar != null) {
            fhnVar.b(wsxVar.j);
        }
    }
}
