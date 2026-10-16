package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wtb extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.wte a;

    public wtb(defpackage.wte wteVar) {
        this.a = wteVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        super.onAnimationStart(animator);
        defpackage.wte wteVar = this.a;
        java.util.List list = wteVar.k;
        if (list == null || wteVar.l) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((defpackage.fhn) it.next()).c(wteVar);
        }
    }
}
