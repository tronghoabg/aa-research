package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kda extends defpackage.omg {
    final /* synthetic */ java.lang.Runnable a;

    public kda(java.lang.Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.omg, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation animation) {
        animation.getClass();
        this.a.run();
    }
}
