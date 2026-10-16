package com.waze.n;

import com.google.v.dm;
import com.google.v.fj;
import com.google.v.gc;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class w extends dm<x, w> implements fj {
    /* synthetic */ w(byte[] bArr) {
        super(x.DEFAULT_INSTANCE);
    }

    public final void a(i iVar) {
        copyOnWrite();
        ((x) this.instance).setAppInfo(iVar);
    }

    public final void b(k kVar) {
        copyOnWrite();
        ((x) this.instance).setDeviceInfo(kVar);
    }

    public final void c(r rVar) {
        copyOnWrite();
        ((x) this.instance).setLocation(rVar);
    }

    public final void d(String str) {
        copyOnWrite();
        ((x) this.instance).setRequestClientTimeZone(str);
    }

    public final void e(gc gcVar) {
        copyOnWrite();
        ((x) this.instance).setRequestClientTimestamp(gcVar);
    }

    private w() {
        throw null;
    }
}
