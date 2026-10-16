package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.input.RotaryKeyboardLayout;

/* loaded from: classes3.dex */
final class xed extends AnimatorListenerAdapter {
    final /* synthetic */ xdx a;
    final /* synthetic */ RotaryKeyboardLayout b;

    public xed(RotaryKeyboardLayout rotaryKeyboardLayout, xdx xdxVar) {
        this.a = xdxVar;
        this.b = rotaryKeyboardLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        RotaryKeyboardLayout rotaryKeyboardLayout = this.b;
        xdx xdxVar = this.a;
        rotaryKeyboardLayout.h = xdxVar;
        int i = xdxVar.j;
        if (i == -1) {
            i = xdxVar.g;
        }
        rotaryKeyboardLayout.i = i;
        rotaryKeyboardLayout.h.j = -1;
        ObjectAnimator objectAnimator = rotaryKeyboardLayout.n;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            rotaryKeyboardLayout.j = BitmapDescriptorFactory.HUE_RED;
        }
        rotaryKeyboardLayout.l = BitmapDescriptorFactory.HUE_RED;
        rotaryKeyboardLayout.k = 255;
        rotaryKeyboardLayout.g.start();
        rotaryKeyboardLayout.o = false;
    }
}
