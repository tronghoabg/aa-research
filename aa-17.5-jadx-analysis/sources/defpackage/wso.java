package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes3.dex */
final class wso extends AnimatorListenerAdapter {
    final /* synthetic */ wsq a;

    public wso(wsq wsqVar) {
        this.a = wsqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        wsq wsqVar = this.a;
        wsqVar.c = (wsqVar.c + 1) % wsqVar.b.e.length;
        wsqVar.d = true;
    }
}
