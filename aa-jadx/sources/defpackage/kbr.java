package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kbr extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.hlu a;
    final /* synthetic */ android.view.View b;
    final /* synthetic */ android.view.ViewGroup c;
    final /* synthetic */ android.view.View d;
    final /* synthetic */ android.view.ViewPropertyAnimator e;
    final /* synthetic */ defpackage.up f;

    public kbr(defpackage.up upVar, defpackage.hlu hluVar, android.view.View view, android.view.ViewGroup viewGroup, android.view.View view2, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.a = hluVar;
        this.b = view;
        this.c = viewGroup;
        this.d = view2;
        this.e = viewPropertyAnimator;
        this.f = upVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        defpackage.hlu hluVar = this.a;
        hluVar.getClass();
        if (hluVar.ek()) {
            this.f.a--;
        }
        if (this.f.a <= 0) {
            this.b.setVisibility(8);
        }
        this.c.removeView(this.d);
        this.e.setListener(null);
    }
}
