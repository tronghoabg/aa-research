package com.waze.n;

import com.google.v.dm;
import com.google.v.fj;
import com.google.v.gc;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a extends dm<b, a> implements fj {
    /* synthetic */ a(byte[] bArr) {
        super(b.DEFAULT_INSTANCE);
    }

    public final void a() {
        copyOnWrite();
        ((b) this.instance).setClientVersion("5.20.90.901");
    }

    public final void b(m mVar) {
        copyOnWrite();
        ((b) this.instance).setDisplayInfo(mVar);
    }

    public final void c(p pVar) {
        copyOnWrite();
        ((b) this.instance).setDrivingInfo(pVar);
    }

    public final void d(gc gcVar) {
        copyOnWrite();
        ((b) this.instance).setEventClientTimestamp(gcVar);
    }

    public final void e(t tVar) {
        copyOnWrite();
        ((b) this.instance).setProjectedPlatform(tVar);
    }

    public final void f(int i2) {
        copyOnWrite();
        ((b) this.instance).setSequenceNumber(i2);
    }

    public final void g(f fVar) {
        copyOnWrite();
        ((b) this.instance).setSessionInfo(fVar);
    }

    private a() {
        throw null;
    }
}
