package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wwi extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ com.google.android.material.snackbar.BaseTransientBottomBar a;

    public wwi(com.google.android.material.snackbar.BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.e();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        com.google.android.material.snackbar.BaseTransientBottomBar baseTransientBottomBar = this.a;
        com.google.android.material.snackbar.SnackbarContentLayout snackbarContentLayout = baseTransientBottomBar.r;
        snackbarContentLayout.a.setAlpha(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        android.view.ViewPropertyAnimator viewPropertyAnimatorAlpha = snackbarContentLayout.a.animate().alpha(1.0f);
        int i = baseTransientBottomBar.c;
        long j = i;
        android.view.ViewPropertyAnimator duration = viewPropertyAnimatorAlpha.setDuration(j);
        android.animation.TimeInterpolator timeInterpolator = snackbarContentLayout.c;
        android.view.ViewPropertyAnimator interpolator = duration.setInterpolator(timeInterpolator);
        long j2 = baseTransientBottomBar.e - i;
        interpolator.setStartDelay(j2).start();
        if (snackbarContentLayout.b.getVisibility() == 0) {
            snackbarContentLayout.b.setAlpha(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
            snackbarContentLayout.b.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
        }
    }
}
