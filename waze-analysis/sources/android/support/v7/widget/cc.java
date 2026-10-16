package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class cc extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cd f1212a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ViewPropertyAnimator f1213b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ View f1214c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ eh f1215d;

    cc(eh ehVar, cd cdVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f1215d = ehVar;
        this.f1212a = cdVar;
        this.f1213b = viewPropertyAnimator;
        this.f1214c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f1213b.setListener(null);
        View view = this.f1214c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        eh ehVar = this.f1215d;
        cd cdVar = this.f1212a;
        ehVar.b(cdVar.f1217b);
        ehVar.f1399h.remove(cdVar.f1217b);
        ehVar.h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        fe feVar = this.f1212a.f1217b;
    }
}
