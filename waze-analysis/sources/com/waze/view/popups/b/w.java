package com.waze.view.popups.b;

import android.content.ComponentCallbacks;
import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class w implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComponentCallbacks f45285a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f45286b;

    public w(ComponentCallbacks componentCallbacks, int i2) {
        this.f45286b = i2;
        this.f45285a = componentCallbacks;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f45286b;
        if (i2 == 0) {
            return z.b((z) this.f45285a);
        }
        ComponentCallbacks componentCallbacks = this.f45285a;
        if (i2 != 1) {
            org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(componentCallbacks);
            int i3 = ar.f48106a;
            return bVarD.a(new h.g.b.m(m.class), null, null);
        }
        org.a.d.k.b bVarD2 = org.chromium.support_lib_boundary.a.b.d(componentCallbacks);
        int i4 = ar.f48106a;
        return bVarD2.a(new h.g.b.m(m.class), null, null);
    }

    public /* synthetic */ w(z zVar, int i2) {
        this.f45286b = i2;
        this.f45285a = zVar;
    }
}
