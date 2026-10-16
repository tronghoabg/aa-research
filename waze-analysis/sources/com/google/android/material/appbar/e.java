package com.google.android.material.appbar;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f6186a;

    /* renamed from: b, reason: collision with root package name */
    private final CoordinatorLayout f6187b;

    /* renamed from: c, reason: collision with root package name */
    private final View f6188c;

    e(f fVar, CoordinatorLayout coordinatorLayout, View view) {
        Objects.requireNonNull(fVar);
        this.f6186a = fVar;
        this.f6187b = coordinatorLayout;
        this.f6188c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar;
        OverScroller overScroller;
        View view = this.f6188c;
        if (view == null || (overScroller = (fVar = this.f6186a).f6189a) == null) {
            return;
        }
        if (!overScroller.computeScrollOffset()) {
            fVar.d(view);
        } else {
            fVar.e(this.f6187b, view, fVar.f6189a.getCurrY(), Integer.MAX_VALUE);
            view.postOnAnimation(this);
        }
    }
}
