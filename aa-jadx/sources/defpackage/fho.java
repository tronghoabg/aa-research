package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fho extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.fhr a;

    public fho(defpackage.fhr fhrVar) {
        this.a = fhrVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        defpackage.fhr fhrVar = this.a;
        java.util.ArrayList arrayList = new java.util.ArrayList(fhrVar.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.fhn) arrayList.get(i)).b(fhrVar);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        defpackage.fhr fhrVar = this.a;
        java.util.ArrayList arrayList = new java.util.ArrayList(fhrVar.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.fhn) arrayList.get(i)).c(fhrVar);
        }
    }
}
