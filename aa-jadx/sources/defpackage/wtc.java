package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wtc extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.wte a;

    public wtc(defpackage.wte wteVar) {
        this.a = wteVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        defpackage.wte wteVar = this.a;
        super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
        java.util.List list = wteVar.k;
        if (list == null || wteVar.l) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((defpackage.fhn) it.next()).b(wteVar);
        }
    }
}
