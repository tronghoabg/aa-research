package com.waze.bg.a;

import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cm extends com.google.v.dm<cn, cm> implements fj {
    /* synthetic */ cm(byte[] bArr) {
        super(cn.DEFAULT_INSTANCE);
    }

    public final void a(int i2) {
        copyOnWrite();
        ((cn) this.instance).setAzimuth(i2);
    }

    public final void b(int i2) {
        copyOnWrite();
        ((cn) this.instance).setFromNodeId(i2);
    }

    public final void c(int i2) {
        copyOnWrite();
        ((cn) this.instance).setLatTimes1000000(i2);
    }

    public final void d(int i2) {
        copyOnWrite();
        ((cn) this.instance).setLonTimes1000000(i2);
    }

    public final void e(int i2) {
        copyOnWrite();
        ((cn) this.instance).setToNodeId(i2);
    }

    public final void f(bq bqVar) {
        copyOnWrite();
        ((cn) this.instance).setType(bqVar);
    }

    private cm() {
        throw null;
    }
}
