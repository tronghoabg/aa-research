package com.waze.mywaze;

import android.content.ComponentCallbacks;
import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class j implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ComponentCallbacks f30589a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f30590b;

    public j(ComponentCallbacks componentCallbacks, int i2) {
        this.f30590b = i2;
        this.f30589a = componentCallbacks;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f30590b;
        if (i2 == 0) {
            org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(this.f30589a);
            int i3 = ar.f48106a;
            return bVarD.a(new h.g.b.m(com.waze.shared_infra.q.r.class), null, null);
        }
        ComponentCallbacks componentCallbacks = this.f30589a;
        if (i2 != 1) {
            org.a.d.k.b bVarD2 = org.chromium.support_lib_boundary.a.b.d(componentCallbacks);
            int i4 = ar.f48106a;
            return bVarD2.a(new h.g.b.m(ah.class), null, null);
        }
        org.a.d.k.b bVarD3 = org.chromium.support_lib_boundary.a.b.d(componentCallbacks);
        int i5 = ar.f48106a;
        return bVarD3.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
    }
}
