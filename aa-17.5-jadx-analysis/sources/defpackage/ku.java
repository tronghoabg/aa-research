package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
final class ku extends AnimatorListenerAdapter {
    final /* synthetic */ kv a;
    private boolean b = false;

    public ku(kv kvVar) {
        this.a = kvVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b) {
            this.b = false;
            return;
        }
        kv kvVar = this.a;
        if (((Float) kvVar.p.getAnimatedValue()).floatValue() == BitmapDescriptorFactory.HUE_RED) {
            kvVar.q = 0;
            kvVar.e(0);
        } else {
            kvVar.q = 2;
            kvVar.d();
        }
    }
}
