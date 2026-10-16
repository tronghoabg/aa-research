package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes3.dex */
final class wss extends AnimatorListenerAdapter {
    final /* synthetic */ wsu a;

    public wss(wsu wsuVar) {
        this.a = wsuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        wsu wsuVar = this.a;
        wsuVar.a();
        fhh fhhVar = wsuVar.h;
        if (fhhVar != null) {
            fhhVar.b(wsuVar.j);
        }
    }
}
