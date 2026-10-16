package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;

/* renamed from: androidx.recyclerview.widget.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1468f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f18852a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18853b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f18854c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f18856e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1472j f18857f;

    public C1468f(C1472j c1472j, m0 m0Var, int i5, View view, int i10, ViewPropertyAnimator viewPropertyAnimator) {
        this.f18857f = c1472j;
        this.f18852a = m0Var;
        this.f18853b = i5;
        this.f18854c = view;
        this.f18855d = i10;
        this.f18856e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i5 = this.f18853b;
        View view = this.f18854c;
        if (i5 != 0) {
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (this.f18855d != 0) {
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f18856e.setListener(null);
        C1472j c1472j = this.f18857f;
        m0 m0Var = this.f18852a;
        c1472j.c(m0Var);
        c1472j.f18891p.remove(m0Var);
        c1472j.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f18857f.getClass();
    }
}
