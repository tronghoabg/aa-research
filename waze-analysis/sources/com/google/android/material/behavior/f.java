package com.google.android.material.behavior;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f6254a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout.Behavior f6255b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f6256c;

    public /* synthetic */ f(CoordinatorLayout.Behavior behavior, View view, int i2) {
        this.f6256c = i2;
        this.f6255b = behavior;
        this.f6254a = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        if (this.f6256c != 0) {
            if (z) {
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f6255b;
                if (hideBottomViewOnScrollBehavior.e()) {
                    hideBottomViewOnScrollBehavior.d(this.f6254a);
                    return;
                }
                return;
            }
            return;
        }
        if (z) {
            HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f6255b;
            if (hideViewOnScrollBehavior.e()) {
                hideViewOnScrollBehavior.d(this.f6254a);
            }
        }
    }
}
