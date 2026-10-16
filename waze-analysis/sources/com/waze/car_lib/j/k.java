package com.waze.car_lib.j;

import androidx.car.app.navigation.NavigationManagerCallback;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k implements NavigationManagerCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f20226a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.af f20227b;

    k(r rVar, kotlinx.coroutines.af afVar) {
        this.f20226a = rVar;
        this.f20227b = afVar;
    }

    @Override // androidx.car.app.navigation.NavigationManagerCallback
    public final void onAutoDriveEnabled() {
        kotlinx.coroutines.aj.z(this.f20227b, null, null, new j(this.f20226a, null), 3);
    }

    @Override // androidx.car.app.navigation.NavigationManagerCallback
    public final void onStopNavigation() {
        Object objA;
        r rVar = this.f20226a;
        try {
            rVar.f20260e.e("NavigationManagerCallback::onStopNavigation");
            rVar.f20257b.f();
            objA = h.ab.f48028a;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        r rVar2 = this.f20226a;
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            rVar2.f20260e.b("Failed to stop navigation on onStopNavigation callback: ".concat(String.valueOf(thC.getMessage())));
        }
    }
}
