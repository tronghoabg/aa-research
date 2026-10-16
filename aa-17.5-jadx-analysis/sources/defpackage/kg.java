package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes2.dex */
final class kg extends AnimatorListenerAdapter {
    final /* synthetic */ mo a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ mu d;

    public kg(mu muVar, mo moVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = muVar;
        this.a = moVar;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        mu muVar = this.d;
        mo moVar = this.a;
        muVar.a(moVar);
        muVar.g.remove(moVar);
        muVar.q();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
