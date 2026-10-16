package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wwj extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ com.google.android.material.snackbar.BaseTransientBottomBar a;

    public wwj(com.google.android.material.snackbar.BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.j();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        com.google.android.material.snackbar.BaseTransientBottomBar baseTransientBottomBar = this.a;
        com.google.android.material.snackbar.SnackbarContentLayout snackbarContentLayout = baseTransientBottomBar.r;
        snackbarContentLayout.a.setAlpha(1.0f);
        android.view.ViewPropertyAnimator viewPropertyAnimatorAlpha = snackbarContentLayout.a.animate().alpha(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        long j = baseTransientBottomBar.d;
        android.view.ViewPropertyAnimator duration = viewPropertyAnimatorAlpha.setDuration(j);
        android.animation.TimeInterpolator timeInterpolator = snackbarContentLayout.c;
        duration.setInterpolator(timeInterpolator).setStartDelay(0L).start();
        if (snackbarContentLayout.b.getVisibility() == 0) {
            snackbarContentLayout.b.setAlpha(1.0f);
            snackbarContentLayout.b.animate().alpha(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(0L).start();
        }
    }
}
