package defpackage;

import android.animation.ObjectAnimator;
import android.view.animation.Animation;
import com.google.android.projection.gearhead.input.RotaryKeyboardLayout;

/* loaded from: classes3.dex */
public final class xec extends oln {
    final /* synthetic */ xdx a;
    final /* synthetic */ RotaryKeyboardLayout b;

    public xec(RotaryKeyboardLayout rotaryKeyboardLayout, xdx xdxVar) {
        this.a = xdxVar;
        this.b = rotaryKeyboardLayout;
    }

    @Override // defpackage.oln, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        RotaryKeyboardLayout rotaryKeyboardLayout = this.b;
        ObjectAnimator objectAnimator = rotaryKeyboardLayout.f;
        objectAnimator.removeAllListeners();
        objectAnimator.addListener(new xed(rotaryKeyboardLayout, this.a));
        objectAnimator.start();
    }
}
