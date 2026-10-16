package com.waze.reports_v2.presentation.a;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.airbnb.lottie.LottieAnimationView;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CompletableDeferred f34726a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f34727b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ LottieAnimationView f34728c;

    j(CompletableDeferred completableDeferred, k kVar, LottieAnimationView lottieAnimationView) {
        this.f34726a = completableDeferred;
        this.f34727b = kVar;
        this.f34728c = lottieAnimationView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        h.g.b.x.f(animator, "animation");
        this.f34727b.f34729a.b();
        LottieAnimationView lottieAnimationView = this.f34728c;
        lottieAnimationView.j();
        lottieAnimationView.i();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h.g.b.x.f(animator, "animation");
        this.f34727b.f34729a.b();
        LottieAnimationView lottieAnimationView = this.f34728c;
        lottieAnimationView.j();
        lottieAnimationView.i();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        h.g.b.x.f(animator, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        h.g.b.x.f(animator, "animation");
        this.f34727b.f34729a.c();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        h.g.b.x.f(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue != null ? ((Float) animatedValue).floatValue() : 0.0f) >= 0.9f) {
            this.f34726a.a(h.ab.f48028a);
        }
    }
}
