package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vkj extends defpackage.vkh {
    protected final android.animation.Animator a;
    public final java.lang.Runnable b;
    public int d;
    private final defpackage.vkl e = new defpackage.vki(this);
    public final int c = -1;

    public vkj(android.animation.Animator animator, java.lang.Runnable runnable) {
        this.a = animator;
        this.b = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        if (a(animator)) {
            return;
        }
        defpackage.vkn.c().a(this.e);
    }
}
