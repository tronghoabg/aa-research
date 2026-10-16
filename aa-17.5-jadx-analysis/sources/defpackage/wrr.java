package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes3.dex */
final class wrr extends AnimatorListenerAdapter {
    final /* synthetic */ wrv a;

    public wrr(wrv wrvVar) {
        this.a = wrvVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        wrv wrvVar = this.a;
        wrvVar.f = (wrvVar.f + 4) % wrvVar.e.e.length;
    }
}
