package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class odf extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ android.view.View a;
    final /* synthetic */ defpackage.odj b;

    public odf(defpackage.odj odjVar, android.view.View view) {
        this.a = view;
        this.b = odjVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        this.b.h.d(this.a, 1.0f);
    }
}
