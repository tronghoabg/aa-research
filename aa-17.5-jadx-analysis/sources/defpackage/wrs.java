package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes3.dex */
final class wrs extends AnimatorListenerAdapter {
    final /* synthetic */ wrv a;

    public wrs(wrv wrvVar) {
        this.a = wrvVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        wrv wrvVar = this.a;
        wrvVar.a();
        fhh fhhVar = wrvVar.i;
        if (fhhVar != null) {
            fhhVar.b(wrvVar.j);
        }
    }
}
