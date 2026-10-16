package com.waze.ad.a;

import android.view.View;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f13895a;

    public h(Runnable runnable) {
        this.f13895a = runnable;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        x.f(view, "view");
        view.removeOnLayoutChangeListener(this);
        this.f13895a.run();
    }
}
