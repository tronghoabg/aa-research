package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wsg extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ int b;
    final /* synthetic */ defpackage.wsh c;

    public wsg(defpackage.wsh wshVar, boolean z, int i) {
        this.a = z;
        this.b = i;
        this.c = wshVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        defpackage.wsh wshVar = this.c;
        wshVar.a.setTranslationX(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        wshVar.g(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, this.a, this.b);
    }
}
