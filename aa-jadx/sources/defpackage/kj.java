package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kj extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.mr a;
    final /* synthetic */ int b;
    final /* synthetic */ android.view.View c;
    final /* synthetic */ int d;
    final /* synthetic */ android.view.ViewPropertyAnimator e;
    final /* synthetic */ defpackage.mx f;

    public kj(defpackage.mx mxVar, defpackage.mr mrVar, int i, android.view.View view, int i2, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f = mxVar;
        this.a = mrVar;
        this.b = i;
        this.c = view;
        this.d = i2;
        this.e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        if (this.b != 0) {
            this.c.setTranslationX(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        }
        if (this.d != 0) {
            this.c.setTranslationY(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.e.setListener(null);
        defpackage.mx mxVar = this.f;
        defpackage.mr mrVar = this.a;
        mxVar.p(mrVar);
        mxVar.f.remove(mrVar);
        mxVar.q();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
    }
}
