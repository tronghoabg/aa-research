package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class bz extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fe f1197a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f1198b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ViewPropertyAnimator f1199c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ eh f1200d;

    bz(eh ehVar, fe feVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f1200d = ehVar;
        this.f1197a = feVar;
        this.f1198b = view;
        this.f1199c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f1198b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f1199c.setListener(null);
        eh ehVar = this.f1200d;
        fe feVar = this.f1197a;
        ehVar.b(feVar);
        ehVar.f1396e.remove(feVar);
        ehVar.h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
