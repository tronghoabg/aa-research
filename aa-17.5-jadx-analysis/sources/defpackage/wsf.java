package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class wsf extends AnimatorListenerAdapter {
    final /* synthetic */ wsh a;

    public wsf(wsh wshVar) {
        this.a = wshVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        wsh wshVar = this.a;
        super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
        List list = wshVar.k;
        if (list == null || wshVar.l) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((fhh) it.next()).b(wshVar);
        }
    }
}
