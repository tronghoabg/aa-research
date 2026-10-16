package com.waze.main_screen.bottom_bars.scrollable_eta;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class g extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f25961a;

    g(h hVar) {
        Objects.requireNonNull(hVar);
        this.f25961a = hVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        h hVar = this.f25961a;
        outline.setOval(0, 0, hVar.m.getMeasuredWidth(), hVar.m.getMeasuredHeight());
    }
}
