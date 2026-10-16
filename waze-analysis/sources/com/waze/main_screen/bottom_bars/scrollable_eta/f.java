package com.waze.main_screen.bottom_bars.scrollable_eta;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class f extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f25960a;

    f(h hVar) {
        Objects.requireNonNull(hVar);
        this.f25960a = hVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), this.f25960a.p(16));
    }
}
