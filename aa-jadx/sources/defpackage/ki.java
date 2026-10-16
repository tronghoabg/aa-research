package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ki extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.mr a;
    final /* synthetic */ android.view.View b;
    final /* synthetic */ android.view.ViewPropertyAnimator c;
    final /* synthetic */ defpackage.mx d;

    public ki(defpackage.mx mxVar, defpackage.mr mrVar, android.view.View view, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.d = mxVar;
        this.a = mrVar;
        this.b = view;
        this.c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        this.b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.c.setListener(null);
        defpackage.mx mxVar = this.d;
        defpackage.mr mrVar = this.a;
        mxVar.a(mrVar);
        mxVar.e.remove(mrVar);
        mxVar.q();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
    }
}
