package com.waze.reports;

import android.view.ViewTreeObserver;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ch implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cm f33776a;

    ch(cm cmVar) {
        Objects.requireNonNull(cmVar);
        this.f33776a = cmVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        cm cmVar = this.f33776a;
        cmVar.f33785e.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        cm.j(cmVar);
    }
}
