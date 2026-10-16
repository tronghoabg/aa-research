package com.google.android.material.behavior;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class g implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CoordinatorLayout.Behavior f6257a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f6258b;

    g(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior, int i2) {
        this.f6258b = i2;
        Objects.requireNonNull(hideBottomViewOnScrollBehavior);
        this.f6257a = hideBottomViewOnScrollBehavior;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i2 = this.f6258b;
        CoordinatorLayout.Behavior behavior = this.f6257a;
        if (i2 != 0) {
            HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) behavior;
            if (hideBottomViewOnScrollBehavior.f6227h == null || hideBottomViewOnScrollBehavior.f6226g == null) {
                return;
            }
            hideBottomViewOnScrollBehavior.f6226g.removeTouchExplorationStateChangeListener(hideBottomViewOnScrollBehavior.f6227h);
            hideBottomViewOnScrollBehavior.f6227h = null;
            return;
        }
        HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) behavior;
        if (hideViewOnScrollBehavior.f6234c == null || hideViewOnScrollBehavior.f6233b == null) {
            return;
        }
        hideViewOnScrollBehavior.f6233b.removeTouchExplorationStateChangeListener(hideViewOnScrollBehavior.f6234c);
        hideViewOnScrollBehavior.f6234c = null;
    }

    g(HideViewOnScrollBehavior hideViewOnScrollBehavior, int i2) {
        this.f6258b = i2;
        Objects.requireNonNull(hideViewOnScrollBehavior);
        this.f6257a = hideViewOnScrollBehavior;
    }
}
