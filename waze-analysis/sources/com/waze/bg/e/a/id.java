package com.waze.bg.e.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class id extends com.google.v.dm<ie, id> implements Cif {
    /* synthetic */ id(byte[] bArr) {
        super(ie.DEFAULT_INSTANCE);
    }

    public final void a(com.waze.bg.a.ej ejVar) {
        copyOnWrite();
        ((ie) this.instance).setAlertDetails(ejVar);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((ie) this.instance).setAlertId(j2);
    }

    public final void c(i.b.s sVar) {
        copyOnWrite();
        ((ie) this.instance).setPosition(sVar);
    }

    public final void d(double d2) {
        copyOnWrite();
        ((ie) this.instance).setRelativePositionInTime(d2);
    }

    private id() {
        throw null;
    }
}
