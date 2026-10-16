package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes3.dex */
final class wrw extends AnimatorListenerAdapter {
    final /* synthetic */ wsa a;

    public wrw(wsa wsaVar) {
        this.a = wsaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        wsa wsaVar = this.a;
        int i = wsaVar.e;
        int length = wsa.a.length;
        wsaVar.e = (i + 4) % wsaVar.d.e.length;
    }
}
