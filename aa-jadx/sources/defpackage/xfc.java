package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class xfc extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.xev a;
    final /* synthetic */ com.google.android.projection.gearhead.input.RotaryKeyboardLayout b;

    public xfc(com.google.android.projection.gearhead.input.RotaryKeyboardLayout rotaryKeyboardLayout, defpackage.xev xevVar) {
        this.a = xevVar;
        this.b = rotaryKeyboardLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        com.google.android.projection.gearhead.input.RotaryKeyboardLayout rotaryKeyboardLayout = this.b;
        defpackage.xev xevVar = this.a;
        rotaryKeyboardLayout.h = xevVar;
        int i = xevVar.j;
        if (i == -1) {
            i = xevVar.g;
        }
        rotaryKeyboardLayout.i = i;
        rotaryKeyboardLayout.h.j = -1;
        android.animation.ObjectAnimator objectAnimator = rotaryKeyboardLayout.n;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            rotaryKeyboardLayout.j = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        }
        rotaryKeyboardLayout.l = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        rotaryKeyboardLayout.k = 255;
        rotaryKeyboardLayout.g.start();
        rotaryKeyboardLayout.o = false;
    }
}
