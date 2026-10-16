package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wql extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ com.google.android.material.focus.FocusRingDrawable a;

    public wql(com.google.android.material.focus.FocusRingDrawable focusRingDrawable) {
        this.a = focusRingDrawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        super.onAnimationCancel(animator);
        com.google.android.material.focus.FocusRingDrawable focusRingDrawable = this.a;
        focusRingDrawable.b = 1.0f;
        focusRingDrawable.invalidateSelf();
    }
}
