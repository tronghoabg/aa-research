package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class wse extends AnimatorListenerAdapter {
    final /* synthetic */ wsh a;

    public wse(wsh wshVar) {
        this.a = wshVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        wsh wshVar = this.a;
        List list = wshVar.k;
        if (list == null || wshVar.l) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((fhh) it.next()).c(wshVar);
        }
    }
}
