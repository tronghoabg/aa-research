package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes3.dex */
final class wwl extends AnimatorListenerAdapter {
    final /* synthetic */ wwn a;

    public wwl(wwn wwnVar) {
        this.a = wwnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.f.m(true);
    }
}
