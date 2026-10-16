package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes3.dex */
final class wsr extends AnimatorListenerAdapter {
    final /* synthetic */ wsu a;

    public wsr(wsu wsuVar) {
        this.a = wsuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        wsu wsuVar = this.a;
        wsuVar.e = (wsuVar.e + 1) % wsuVar.d.e.length;
        wsuVar.f = true;
    }
}
