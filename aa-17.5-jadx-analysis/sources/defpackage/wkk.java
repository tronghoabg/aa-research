package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes3.dex */
final class wkk extends AnimatorListenerAdapter {
    final /* synthetic */ wkm a;

    public wkk(wkm wkmVar) {
        this.a = wkmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.d();
    }
}
