package com.waze.view.a;

import android.view.ViewTreeObserver;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f44945a;

    c(f fVar) {
        Objects.requireNonNull(fVar);
        this.f44945a = fVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        f fVar = this.f44945a;
        fVar.f44950c.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        f.b(fVar);
    }
}
