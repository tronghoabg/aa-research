package com.google.android.material.behavior;

import android.view.View;
import androidx.customview.widget.ViewDragHelper;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SwipeDismissBehavior f6265a;

    /* renamed from: b, reason: collision with root package name */
    private final View f6266b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f6267c;

    n(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        Objects.requireNonNull(swipeDismissBehavior);
        this.f6265a = swipeDismissBehavior;
        this.f6266b = view;
        this.f6267c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar;
        SwipeDismissBehavior swipeDismissBehavior = this.f6265a;
        ViewDragHelper viewDragHelper = swipeDismissBehavior.f6244a;
        if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
            this.f6266b.postOnAnimation(this);
        } else {
            if (!this.f6267c || (mVar = swipeDismissBehavior.f6245b) == null) {
                return;
            }
            mVar.a(this.f6266b);
        }
    }
}
