package com.google.e.a.h;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bq extends dm<bu, bq> implements fj {
    /* synthetic */ bq(byte[] bArr) {
        super(bu.DEFAULT_INSTANCE);
    }

    public final void a(bs bsVar) {
        copyOnWrite();
        ((bu) this.instance).addKey(bsVar);
    }

    public final void b(int i2) {
        copyOnWrite();
        ((bu) this.instance).setPrimaryKeyId(i2);
    }

    private bq() {
        throw null;
    }
}
