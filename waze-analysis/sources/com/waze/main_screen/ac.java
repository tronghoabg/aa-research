package com.waze.main_screen;

import android.content.ComponentCallbacks;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ac implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ComponentCallbacks f25668a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f25669b;

    public ac(ComponentCallbacks componentCallbacks, int i2) {
        this.f25669b = i2;
        this.f25668a = componentCallbacks;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f25669b;
        ComponentCallbacks componentCallbacks = this.f25668a;
        if (i2 != 0) {
            org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(componentCallbacks);
            int i3 = h.g.b.ar.f48106a;
            return bVarD.a(new h.g.b.m(com.waze.app_nav.w.class), null, null);
        }
        org.a.d.k.b bVarD2 = org.chromium.support_lib_boundary.a.b.d(componentCallbacks);
        int i4 = h.g.b.ar.f48106a;
        return bVarD2.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
    }
}
