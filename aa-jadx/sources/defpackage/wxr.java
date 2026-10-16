package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wxr extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.wxs a;

    public wxr(defpackage.wxs wxsVar) {
        this.a = wxsVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        defpackage.wxs wxsVar = this.a;
        wxsVar.x();
        wxsVar.d.start();
    }
}
