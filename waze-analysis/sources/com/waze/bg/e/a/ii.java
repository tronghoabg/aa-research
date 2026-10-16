package com.waze.bg.e.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ii extends com.google.v.dm<ik, ii> implements il {
    /* synthetic */ ii(byte[] bArr) {
        super(ik.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((ik) this.instance).setJamId(j2);
    }

    public final void b(double d2) {
        copyOnWrite();
        ((ik) this.instance).setRelativeEndPositionInTime(d2);
    }

    public final void c(double d2) {
        copyOnWrite();
        ((ik) this.instance).setRelativeStartPositionInTime(d2);
    }

    public final void d(ij ijVar) {
        copyOnWrite();
        ((ik) this.instance).setTrafficSeverity(ijVar);
    }

    private ii() {
        throw null;
    }
}
