package com.waze.view.navbar;

import android.view.ViewTreeObserver;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f45078a;

    g(i iVar) {
        Objects.requireNonNull(iVar);
        this.f45078a = iVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        i iVar = this.f45078a;
        iVar.f45086f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        iVar.l();
    }
}
