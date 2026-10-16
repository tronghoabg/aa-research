package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes3.dex */
final class wwm extends AnimatorListenerAdapter {
    final /* synthetic */ wwn a;

    public wwm(wwn wwnVar) {
        this.a = wwnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.f.m(false);
    }
}
