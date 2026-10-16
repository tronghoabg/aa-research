package com.waze.ad.a;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f13896a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f13897b;

    i(View view, Runnable runnable) {
        this.f13896a = view;
        this.f13897b = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f13896a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f13897b.run();
    }
}
