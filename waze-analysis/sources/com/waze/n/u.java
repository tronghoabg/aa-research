package com.waze.n;

import com.google.v.dm;
import com.google.v.fj;
import com.google.v.gc;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class u extends dm<v, u> implements fj {
    /* synthetic */ u(byte[] bArr) {
        super(v.DEFAULT_INSTANCE);
    }

    public final void a() {
        copyOnWrite();
        ((v) this.instance).setClientVersion("5.20.90.901");
    }

    public final void b(m mVar) {
        copyOnWrite();
        ((v) this.instance).setDisplayInfo(mVar);
    }

    public final void c(p pVar) {
        copyOnWrite();
        ((v) this.instance).setDrivingInfo(pVar);
    }

    public final void d(gc gcVar) {
        copyOnWrite();
        ((v) this.instance).setEventClientTimestamp(gcVar);
    }

    public final void e(t tVar) {
        copyOnWrite();
        ((v) this.instance).setProjectedPlatform(tVar);
    }

    public final void f(int i2) {
        copyOnWrite();
        ((v) this.instance).setSequenceNumber(i2);
    }

    private u() {
        throw null;
    }
}
