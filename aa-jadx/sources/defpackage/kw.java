package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class kw extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.kx a;
    private boolean b = false;

    public kw(defpackage.kx kxVar) {
        this.a = kxVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        if (this.b) {
            this.b = false;
            return;
        }
        defpackage.kx kxVar = this.a;
        if (((java.lang.Float) kxVar.p.getAnimatedValue()).floatValue() == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            kxVar.q = 0;
            kxVar.e(0);
        } else {
            kxVar.q = 2;
            kxVar.d();
        }
    }
}
