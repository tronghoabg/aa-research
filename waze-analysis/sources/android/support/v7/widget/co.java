package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class co extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cq f1255a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1256b = false;

    co(cq cqVar) {
        this.f1255a = cqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f1256b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f1256b) {
            this.f1256b = false;
            return;
        }
        cq cqVar = this.f1255a;
        if (((Float) cqVar.f1268i.getAnimatedValue()).floatValue() == 0.0f) {
            cqVar.f1269j = 0;
            cqVar.c(0);
        } else {
            cqVar.f1269j = 2;
            cqVar.b();
        }
    }
}
