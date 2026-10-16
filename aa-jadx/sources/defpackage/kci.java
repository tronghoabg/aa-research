package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class kci extends defpackage.omg {
    final /* synthetic */ defpackage.kcj a;

    public kci(defpackage.kcj kcjVar) {
        this.a = kcjVar;
    }

    @Override // defpackage.omg, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation animation) {
        android.view.ViewGroup viewGroup = this.a.b;
        viewGroup.clearAnimation();
        viewGroup.setVisibility(8);
    }
}
