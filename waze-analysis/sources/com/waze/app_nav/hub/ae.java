package com.waze.app_nav.hub;

import android.content.ComponentCallbacks;
import com.waze.map.ed;
import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ae implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ComponentCallbacks f15244a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f15245b;

    public ae(ComponentCallbacks componentCallbacks, int i2) {
        this.f15245b = i2;
        this.f15244a = componentCallbacks;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f15245b;
        if (i2 == 0) {
            org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(this.f15244a);
            int i3 = ar.f48106a;
            return bVarD.a(new h.g.b.m(ed.class), null, null);
        }
        ComponentCallbacks componentCallbacks = this.f15244a;
        if (i2 != 1) {
            org.a.d.k.b bVarD2 = org.chromium.support_lib_boundary.a.b.d(componentCallbacks);
            int i4 = ar.f48106a;
            return bVarD2.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
        }
        org.a.d.k.b bVarD3 = org.chromium.support_lib_boundary.a.b.d(componentCallbacks);
        int i5 = ar.f48106a;
        return bVarD3.a(new h.g.b.m(ah.class), null, null);
    }
}
