package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes3.dex */
final class wwv extends AnimatorListenerAdapter {
    final /* synthetic */ www a;

    public wwv(www wwwVar) {
        this.a = wwwVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        www wwwVar = this.a;
        wwwVar.x();
        wwwVar.d.start();
    }
}
