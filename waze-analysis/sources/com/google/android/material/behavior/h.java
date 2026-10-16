package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class h extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f6259a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ HideViewOnScrollBehavior f6260b;

    h(HideViewOnScrollBehavior hideViewOnScrollBehavior, View view) {
        this.f6259a = view;
        Objects.requireNonNull(hideViewOnScrollBehavior);
        this.f6260b = hideViewOnScrollBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        HideViewOnScrollBehavior hideViewOnScrollBehavior = this.f6260b;
        hideViewOnScrollBehavior.f6242k = null;
        if (hideViewOnScrollBehavior.f6241j == 1) {
            View view = this.f6259a;
            if (view.getVisibility() == 0) {
                view.setVisibility(4);
            }
        }
    }
}
