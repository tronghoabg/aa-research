package com.waze.app_nav.hub;

import android.view.ViewTreeObserver;
import android.view.Window;
import com.waze.map.ed;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ad implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ af f15243a;

    ad(af afVar) {
        this.f15243a = afVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        af afVar = this.f15243a;
        ed edVarBy = afVar.by();
        Window window = afVar.getWindow();
        h.g.b.x.e(window, "getWindow(...)");
        edVarBy.a(window);
    }
}
