package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ca extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fe f1202a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f1203b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ View f1204c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f1205d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ViewPropertyAnimator f1206e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ eh f1207f;

    ca(eh ehVar, fe feVar, int i2, View view, int i3, ViewPropertyAnimator viewPropertyAnimator) {
        this.f1207f = ehVar;
        this.f1202a = feVar;
        this.f1203b = i2;
        this.f1204c = view;
        this.f1205d = i3;
        this.f1206e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.f1203b != 0) {
            this.f1204c.setTranslationX(0.0f);
        }
        if (this.f1205d != 0) {
            this.f1204c.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f1206e.setListener(null);
        eh ehVar = this.f1207f;
        fe feVar = this.f1202a;
        ehVar.b(feVar);
        ehVar.f1397f.remove(feVar);
        ehVar.h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
