package com.waze.sharedui.utils;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g implements ViewTreeObserver.OnWindowFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f39097a;

    g(View view) {
        this.f39097a = view;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        if (z) {
            View view = this.f39097a;
            f.o(view);
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }
    }
}
