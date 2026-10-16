package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wsb extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.wsc a;

    public wsb(defpackage.wsc wscVar) {
        this.a = wscVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        defpackage.wsc wscVar = this.a;
        wscVar.a.setTranslationY(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        wscVar.g(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
    }
}
