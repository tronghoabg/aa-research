package com.waze.copilot.presentation;

import android.content.ComponentCallbacks;
import com.waze.app_nav.w;
import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class d implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComponentCallbacks f23112a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f23113b;

    public d(ComponentCallbacks componentCallbacks, int i2) {
        this.f23113b = i2;
        this.f23112a = componentCallbacks;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f23113b;
        if (i2 == 0) {
            return n.o((n) this.f23112a);
        }
        ComponentCallbacks componentCallbacks = this.f23112a;
        if (i2 != 1) {
            org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(componentCallbacks);
            int i3 = ar.f48106a;
            return bVarD.a(new h.g.b.m(com.waze.app_nav.hub.b.c.class), null, null);
        }
        org.a.d.k.b bVarD2 = org.chromium.support_lib_boundary.a.b.d(componentCallbacks);
        int i4 = ar.f48106a;
        return bVarD2.a(new h.g.b.m(w.class), null, null);
    }

    public /* synthetic */ d(n nVar, int i2) {
        this.f23113b = i2;
        this.f23112a = nVar;
    }
}
