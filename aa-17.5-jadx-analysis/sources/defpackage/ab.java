package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class ab extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ boolean c;
    final /* synthetic */ cp d;
    final /* synthetic */ ac e;

    public ab(ViewGroup viewGroup, View view, boolean z, cp cpVar, ac acVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = cpVar;
        this.e = acVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        View view = this.b;
        ViewGroup viewGroup = this.a;
        viewGroup.endViewTransition(view);
        if (this.c || this.d.h == 3) {
            int i = this.d.h;
            view.getClass();
            ca.h(i, view, viewGroup);
        }
        ac acVar = this.e;
        acVar.a.a.f(acVar);
        if (bt.ac(2)) {
            Log.v("FragmentManager", "Animator from operation " + this.d + " has ended.");
        }
    }
}
