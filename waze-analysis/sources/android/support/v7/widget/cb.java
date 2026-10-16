package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class cb extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cd f1208a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ViewPropertyAnimator f1209b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ View f1210c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ eh f1211d;

    cb(eh ehVar, cd cdVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f1211d = ehVar;
        this.f1208a = cdVar;
        this.f1209b = viewPropertyAnimator;
        this.f1210c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f1209b.setListener(null);
        View view = this.f1210c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        eh ehVar = this.f1211d;
        cd cdVar = this.f1208a;
        ehVar.b(cdVar.f1216a);
        ehVar.f1399h.remove(cdVar.f1216a);
        ehVar.h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        fe feVar = this.f1208a.f1216a;
    }
}
