package android.support.v4.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewGroup f339a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f340b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f341c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ cz f342d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ j f343e;

    i(ViewGroup viewGroup, View view, boolean z, cz czVar, j jVar) {
        this.f339a = viewGroup;
        this.f340b = view;
        this.f341c = z;
        this.f342d = czVar;
        this.f343e = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h.g.b.x.f(animator, "anim");
        ViewGroup viewGroup = this.f339a;
        View view = this.f340b;
        viewGroup.endViewTransition(view);
        if (this.f341c || this.f342d.e() == cy.f305c) {
            cy cyVarE = this.f342d.e();
            h.g.b.x.c(view);
            cyVarE.a(view, viewGroup);
        }
        j jVar = this.f343e;
        jVar.a().b().j(jVar);
        if (bv.aM(2)) {
            Log.v("FragmentManager", "Animator from operation " + this.f342d + " has ended.");
        }
    }
}
