package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes2.dex */
final class ebz extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ lds b;

    public ebz(lds ldsVar, View view) {
        this.b = ldsVar;
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        lds ldsVar = this.b;
        ldsVar.W(1.0f);
        ecb.d(this.a, ldsVar);
    }
}
