package com.waze.location;

import android.content.ComponentCallbacks;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class m implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ComponentCallbacks f25409a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f25410b;

    public m(ComponentCallbacks componentCallbacks, int i2) {
        this.f25410b = i2;
        this.f25409a = componentCallbacks;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f25410b;
        if (i2 == 0) {
            org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(this.f25409a);
            int i3 = h.g.b.ar.f48106a;
            return bVarD.a(new h.g.b.m(com.waze.app_nav.w.class), null, null);
        }
        ComponentCallbacks componentCallbacks = this.f25409a;
        if (i2 != 1) {
            org.a.d.k.b bVarD2 = org.chromium.support_lib_boundary.a.b.d(componentCallbacks);
            int i4 = h.g.b.ar.f48106a;
            return bVarD2.a(new h.g.b.m(q.class), null, null);
        }
        org.a.d.k.b bVarD3 = org.chromium.support_lib_boundary.a.b.d(componentCallbacks);
        int i5 = h.g.b.ar.f48106a;
        return bVarD3.a(new h.g.b.m(b.class), null, null);
    }
}
