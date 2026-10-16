package com.waze.settings;

import android.content.ComponentCallbacks;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cf implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ComponentCallbacks f36961a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f36962b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f36963c;

    public cf(ComponentCallbacks componentCallbacks, h.g.a.a aVar, int i2) {
        this.f36963c = i2;
        this.f36961a = componentCallbacks;
        this.f36962b = aVar;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f36963c;
        ComponentCallbacks componentCallbacks = this.f36961a;
        if (i2 != 0) {
            org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(componentCallbacks);
            int i3 = h.g.b.ar.f48106a;
            return bVarD.a(new h.g.b.m(cu.class), null, this.f36962b);
        }
        org.a.d.k.b bVarD2 = org.chromium.support_lib_boundary.a.b.d(componentCallbacks);
        int i4 = h.g.b.ar.f48106a;
        return bVarD2.a(new h.g.b.m(cu.class), null, this.f36962b);
    }
}
