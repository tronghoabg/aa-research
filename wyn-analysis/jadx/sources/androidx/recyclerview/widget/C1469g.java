package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;

/* renamed from: androidx.recyclerview.widget.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1469g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18859a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1470h f18860b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f18861c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f18862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1472j f18863e;

    public /* synthetic */ C1469g(C1472j c1472j, C1470h c1470h, ViewPropertyAnimator viewPropertyAnimator, View view, int i5) {
        this.f18859a = i5;
        this.f18863e = c1472j;
        this.f18860b = c1470h;
        this.f18861c = viewPropertyAnimator;
        this.f18862d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f18859a) {
            case 0:
                this.f18861c.setListener(null);
                View view = this.f18862d;
                view.setAlpha(1.0f);
                view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                C1470h c1470h = this.f18860b;
                m0 m0Var = c1470h.f18871a;
                C1472j c1472j = this.f18863e;
                c1472j.c(m0Var);
                c1472j.f18893r.remove(c1470h.f18871a);
                c1472j.i();
                break;
            default:
                this.f18861c.setListener(null);
                View view2 = this.f18862d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                view2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                C1470h c1470h2 = this.f18860b;
                m0 m0Var2 = c1470h2.f18872b;
                C1472j c1472j2 = this.f18863e;
                c1472j2.c(m0Var2);
                c1472j2.f18893r.remove(c1470h2.f18872b);
                c1472j2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f18859a) {
            case 0:
                m0 m0Var = this.f18860b.f18871a;
                this.f18863e.getClass();
                break;
            default:
                m0 m0Var2 = this.f18860b.f18872b;
                this.f18863e.getClass();
                break;
        }
    }
}
