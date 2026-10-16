package com.waze.view.popups.a;

import android.view.ViewTreeObserver;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f45194a;

    f(h hVar) {
        Objects.requireNonNull(hVar);
        this.f45194a = hVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        h hVar = this.f45194a;
        hVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        hVar.S();
        if (hVar.f45203i != 1) {
            hVar.f45204j.focusCanvas(hVar.getHeight() / 2);
        }
    }
}
