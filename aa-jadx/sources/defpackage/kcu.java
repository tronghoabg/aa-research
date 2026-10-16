package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kcu extends defpackage.omg {
    final /* synthetic */ defpackage.kcv a;
    final /* synthetic */ java.lang.Runnable b;

    public kcu(defpackage.kcv kcvVar, java.lang.Runnable runnable) {
        this.a = kcvVar;
        this.b = runnable;
    }

    @Override // defpackage.omg, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation animation) {
        animation.getClass();
        this.b.run();
    }

    @Override // defpackage.omg, android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(android.view.animation.Animation animation) {
        this.a.a.setVisibility(0);
    }
}
