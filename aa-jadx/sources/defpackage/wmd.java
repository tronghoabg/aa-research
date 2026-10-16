package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wmd extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ android.view.View a;
    final /* synthetic */ com.google.android.material.behavior.HideBottomViewOnScrollBehavior b;

    public wmd(com.google.android.material.behavior.HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior, android.view.View view) {
        this.a = view;
        this.b = hideBottomViewOnScrollBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        com.google.android.material.behavior.HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = this.b;
        hideBottomViewOnScrollBehavior.d = null;
        if (hideBottomViewOnScrollBehavior.c == 1) {
            android.view.View view = this.a;
            if (view.getVisibility() == 0) {
                view.setVisibility(4);
            }
        }
    }
}
