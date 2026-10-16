package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* loaded from: classes3.dex */
final class vkb extends AnimatorListenerAdapter {
    final /* synthetic */ vkd a;

    public vkb(vkd vkdVar) {
        this.a = vkdVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        AnimatorSet animatorSet = this.a.a;
        if (animatorSet.isStarted()) {
            return;
        }
        animatorSet.start();
    }
}
