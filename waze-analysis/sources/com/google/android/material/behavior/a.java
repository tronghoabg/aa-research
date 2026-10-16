package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f6252a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ HideBottomViewOnScrollBehavior f6253b;

    a(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior, View view) {
        this.f6252a = view;
        Objects.requireNonNull(hideBottomViewOnScrollBehavior);
        this.f6253b = hideBottomViewOnScrollBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = this.f6253b;
        hideBottomViewOnScrollBehavior.f6229j = null;
        if (hideBottomViewOnScrollBehavior.f6228i == 1) {
            View view = this.f6252a;
            if (view.getVisibility() == 0) {
                view.setVisibility(4);
            }
        }
    }
}
