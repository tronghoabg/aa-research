package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wso extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.wss a;

    public wso(defpackage.wss wssVar) {
        this.a = wssVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
        super.onAnimationRepeat(animator);
        defpackage.wss wssVar = this.a;
        wssVar.f = (wssVar.f + 4) % wssVar.e.e.length;
    }
}
