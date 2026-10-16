package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wst extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.wsx a;

    public wst(defpackage.wsx wsxVar) {
        this.a = wsxVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
        super.onAnimationRepeat(animator);
        defpackage.wsx wsxVar = this.a;
        int i = wsxVar.e;
        int length = defpackage.wsx.a.length;
        wsxVar.e = (i + 4) % wsxVar.d.e.length;
    }
}
