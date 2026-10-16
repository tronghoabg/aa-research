package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes3.dex */
final class wrx extends AnimatorListenerAdapter {
    final /* synthetic */ wsa a;

    public wrx(wsa wsaVar) {
        this.a = wsaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        wsa wsaVar = this.a;
        wsaVar.a();
        fhh fhhVar = wsaVar.h;
        if (fhhVar != null) {
            fhhVar.b(wsaVar.j);
        }
    }
}
