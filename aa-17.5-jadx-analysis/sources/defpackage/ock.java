package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes2.dex */
public final class ock extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ oco b;

    public ock(oco ocoVar, View view) {
        this.a = view;
        this.b = ocoVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.b.h.d(this.a, 1.0f);
    }
}
