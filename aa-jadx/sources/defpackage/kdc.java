package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kdc extends defpackage.omg {
    final /* synthetic */ java.lang.Runnable a;
    final /* synthetic */ defpackage.lky b;

    public kdc(defpackage.lky lkyVar, java.lang.Runnable runnable) {
        this.b = lkyVar;
        this.a = runnable;
    }

    @Override // defpackage.omg, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation animation) {
        animation.getClass();
        ((com.google.android.apps.auto.components.apphost.view.widgets.common.BleedingCardView) this.b.d).setVisibility(8);
        java.lang.Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
