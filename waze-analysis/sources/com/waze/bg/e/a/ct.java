package com.waze.bg.e.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ct extends com.google.v.dm<cu, ct> implements com.google.v.fj {
    /* synthetic */ ct(byte[] bArr) {
        super(cu.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((cu) this.instance).setVenueId(str);
    }

    public final void b(String str) {
        copyOnWrite();
        ((cu) this.instance).setVenueName(str);
    }

    private ct() {
        throw null;
    }
}
