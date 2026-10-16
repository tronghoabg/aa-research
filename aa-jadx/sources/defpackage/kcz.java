package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kcz extends defpackage.omg {
    final /* synthetic */ defpackage.kdb a;
    final /* synthetic */ java.lang.Runnable b;

    public kcz(defpackage.kdb kdbVar, java.lang.Runnable runnable) {
        this.a = kdbVar;
        this.b = runnable;
    }

    @Override // defpackage.omg, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation animation) {
        animation.getClass();
        this.a.a.setVisibility(8);
        java.lang.Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
