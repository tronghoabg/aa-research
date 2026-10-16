package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class by extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fe f1193a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ViewPropertyAnimator f1194b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ View f1195c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ eh f1196d;

    by(eh ehVar, fe feVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f1196d = ehVar;
        this.f1193a = feVar;
        this.f1194b = viewPropertyAnimator;
        this.f1195c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f1194b.setListener(null);
        this.f1195c.setAlpha(1.0f);
        eh ehVar = this.f1196d;
        fe feVar = this.f1193a;
        ehVar.b(feVar);
        ehVar.f1398g.remove(feVar);
        ehVar.h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
