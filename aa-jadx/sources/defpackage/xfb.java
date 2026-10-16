package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xfb extends defpackage.omg {
    final /* synthetic */ defpackage.xev a;
    final /* synthetic */ com.google.android.projection.gearhead.input.RotaryKeyboardLayout b;

    public xfb(com.google.android.projection.gearhead.input.RotaryKeyboardLayout rotaryKeyboardLayout, defpackage.xev xevVar) {
        this.a = xevVar;
        this.b = rotaryKeyboardLayout;
    }

    @Override // defpackage.omg, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation animation) {
        com.google.android.projection.gearhead.input.RotaryKeyboardLayout rotaryKeyboardLayout = this.b;
        android.animation.ObjectAnimator objectAnimator = rotaryKeyboardLayout.f;
        objectAnimator.removeAllListeners();
        objectAnimator.addListener(new defpackage.xfc(rotaryKeyboardLayout, this.a));
        objectAnimator.start();
    }
}
