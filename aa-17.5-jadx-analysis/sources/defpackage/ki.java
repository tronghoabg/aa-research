package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class ki extends AnimatorListenerAdapter {
    final /* synthetic */ mo a;
    final /* synthetic */ int b;
    final /* synthetic */ View c;
    final /* synthetic */ int d;
    final /* synthetic */ ViewPropertyAnimator e;
    final /* synthetic */ mu f;

    public ki(mu muVar, mo moVar, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f = muVar;
        this.a = moVar;
        this.b = i;
        this.c = view;
        this.d = i2;
        this.e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.b != 0) {
            this.c.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        }
        if (this.d != 0) {
            this.c.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.e.setListener(null);
        mu muVar = this.f;
        mo moVar = this.a;
        muVar.p(moVar);
        muVar.f.remove(moVar);
        muVar.q();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
