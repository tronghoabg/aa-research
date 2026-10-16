package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gef extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ android.view.View a;

    public gef(android.view.View view) {
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.performClick();
    }
}
