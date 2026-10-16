package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wmk extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ android.view.View a;
    final /* synthetic */ com.google.android.material.behavior.HideViewOnScrollBehavior b;

    public wmk(com.google.android.material.behavior.HideViewOnScrollBehavior hideViewOnScrollBehavior, android.view.View view) {
        this.a = view;
        this.b = hideViewOnScrollBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        com.google.android.material.behavior.HideViewOnScrollBehavior hideViewOnScrollBehavior = this.b;
        hideViewOnScrollBehavior.d = null;
        if (hideViewOnScrollBehavior.c == 1) {
            android.view.View view = this.a;
            if (view.getVisibility() == 0) {
                view.setVisibility(4);
            }
        }
    }
}
