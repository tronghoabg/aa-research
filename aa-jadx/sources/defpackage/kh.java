package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class kh extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.mr a;
    final /* synthetic */ android.view.ViewPropertyAnimator b;
    final /* synthetic */ android.view.View c;
    final /* synthetic */ defpackage.mx d;

    public kh(defpackage.mx mxVar, defpackage.mr mrVar, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.d = mxVar;
        this.a = mrVar;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        defpackage.mx mxVar = this.d;
        defpackage.mr mrVar = this.a;
        mxVar.a(mrVar);
        mxVar.g.remove(mrVar);
        mxVar.q();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
    }
}
