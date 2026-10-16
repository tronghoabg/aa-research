package com.waze.n;

import com.google.v.dm;
import com.google.v.fj;
import com.google.v.gc;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends dm<d, c> implements fj {
    /* synthetic */ c(byte[] bArr) {
        super(d.DEFAULT_INSTANCE);
    }

    public final void a(i iVar) {
        copyOnWrite();
        ((d) this.instance).setAppInfo(iVar);
    }

    public final void b(k kVar) {
        copyOnWrite();
        ((d) this.instance).setDeviceInfo(kVar);
    }

    public final void c(r rVar) {
        copyOnWrite();
        ((d) this.instance).setLocation(rVar);
    }

    public final void d(String str) {
        copyOnWrite();
        ((d) this.instance).setRequestClientTimeZone(str);
    }

    public final void e(gc gcVar) {
        copyOnWrite();
        ((d) this.instance).setRequestClientTimestamp(gcVar);
    }

    public final void f(f fVar) {
        copyOnWrite();
        ((d) this.instance).setSessionInfo(fVar);
    }

    private c() {
        throw null;
    }
}
