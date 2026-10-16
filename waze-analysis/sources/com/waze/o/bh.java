package com.waze.o;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bh extends dm<bi, bh> implements fj {
    /* synthetic */ bh(byte[] bArr) {
        super(bi.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((bi) this.instance).setCurrencyCode(str);
    }

    public final void b(double d2) {
        copyOnWrite();
        ((bi) this.instance).setPrice(d2);
    }

    public final void c(String str) {
        copyOnWrite();
        ((bi) this.instance).setRoadName(str);
    }

    private bh() {
        throw null;
    }
}
