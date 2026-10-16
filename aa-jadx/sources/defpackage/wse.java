package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wse extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ android.view.View a;

    public wse(android.view.View view) {
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        android.view.View view = this.a;
        if (view != null) {
            view.setVisibility(0);
        }
    }
}
