package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: androidx.recyclerview.widget.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1467e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18846a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f18847b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f18848c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f18849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1472j f18850e;

    public C1467e(C1472j c1472j, m0 m0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f18850e = c1472j;
        this.f18847b = m0Var;
        this.f18849d = viewPropertyAnimator;
        this.f18848c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f18846a) {
            case 1:
                this.f18848c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f18846a) {
            case 0:
                this.f18849d.setListener(null);
                this.f18848c.setAlpha(1.0f);
                C1472j c1472j = this.f18850e;
                m0 m0Var = this.f18847b;
                c1472j.c(m0Var);
                c1472j.f18892q.remove(m0Var);
                c1472j.i();
                break;
            default:
                this.f18849d.setListener(null);
                C1472j c1472j2 = this.f18850e;
                m0 m0Var2 = this.f18847b;
                c1472j2.c(m0Var2);
                c1472j2.f18890o.remove(m0Var2);
                c1472j2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f18846a) {
            case 0:
                this.f18850e.getClass();
                break;
            default:
                this.f18850e.getClass();
                break;
        }
    }

    public C1467e(C1472j c1472j, m0 m0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f18850e = c1472j;
        this.f18847b = m0Var;
        this.f18848c = view;
        this.f18849d = viewPropertyAnimator;
    }
}
