package com.waze.bg.e.a;

import i.b.l.on;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ch extends com.google.v.dm<ck, ch> implements com.google.v.fj {
    /* synthetic */ ch(byte[] bArr) {
        super(ck.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((ck) this.instance).addAllPermitIds(iterable);
    }

    public final void b(on onVar) {
        copyOnWrite();
        ((ck) this.instance).setEvData(onVar);
    }

    public final void c(String str) {
        copyOnWrite();
        ((ck) this.instance).setLicensePlateSuffix(str);
    }

    public final void d(cj cjVar) {
        copyOnWrite();
        ((ck) this.instance).setVehicleType(cjVar);
    }

    private ch() {
        throw null;
    }
}
