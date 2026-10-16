package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* loaded from: classes2.dex */
public final class kbo extends AnimatorListenerAdapter {
    final /* synthetic */ hlo a;
    final /* synthetic */ View b;
    final /* synthetic */ ViewGroup c;
    final /* synthetic */ View d;
    final /* synthetic */ ViewPropertyAnimator e;
    final /* synthetic */ uk f;

    public kbo(uk ukVar, hlo hloVar, View view, ViewGroup viewGroup, View view2, ViewPropertyAnimator viewPropertyAnimator) {
        this.a = hloVar;
        this.b = view;
        this.c = viewGroup;
        this.d = view2;
        this.e = viewPropertyAnimator;
        this.f = ukVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        hlo hloVar = this.a;
        hloVar.getClass();
        if (hloVar.fc()) {
            uk ukVar = this.f;
            ukVar.a--;
        }
        if (this.f.a <= 0) {
            this.b.setVisibility(8);
        }
        this.c.removeView(this.d);
        this.e.setListener(null);
    }
}
