package com.waze.bg.e.a;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dp extends com.google.v.dm<dr, dp> implements com.google.v.fj {
    /* synthetic */ dp(byte[] bArr) {
        super(dr.DEFAULT_INSTANCE);
    }

    public final void a(int i2, cx cxVar) {
        Objects.requireNonNull(cxVar);
        copyOnWrite();
        ((dr) this.instance).getMutableWaypointsMap().put(Integer.valueOf(i2), cxVar);
    }

    public final void b(eh ehVar) {
        copyOnWrite();
        ((dr) this.instance).setCurrentLocation(ehVar.build());
    }

    public final void c(String str) {
        copyOnWrite();
        ((dr) this.instance).setRouteUuid(str);
    }

    private dp() {
        throw null;
    }
}
