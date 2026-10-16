package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kl extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.km a;
    final /* synthetic */ android.view.ViewPropertyAnimator b;
    final /* synthetic */ android.view.View c;
    final /* synthetic */ defpackage.mx d;

    public kl(defpackage.mx mxVar, defpackage.km kmVar, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.d = mxVar;
        this.a = kmVar;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.b.setListener(null);
        android.view.View view = this.c;
        view.setAlpha(1.0f);
        view.setTranslationX(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        view.setTranslationY(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        defpackage.mx mxVar = this.d;
        defpackage.km kmVar = this.a;
        mxVar.a(kmVar.b);
        mxVar.h.remove(kmVar.b);
        mxVar.q();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        defpackage.mr mrVar = this.a.b;
    }
}
