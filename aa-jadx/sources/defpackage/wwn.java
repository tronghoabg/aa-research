package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wwn extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ com.google.android.material.snackbar.BaseTransientBottomBar a;

    public wwn(com.google.android.material.snackbar.BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.e();
    }
}
