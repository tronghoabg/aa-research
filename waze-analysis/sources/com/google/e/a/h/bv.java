package com.google.e.a.h;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bv extends dm<bz, bv> implements fj {
    /* synthetic */ bv(byte[] bArr) {
        super(bz.DEFAULT_INSTANCE);
    }

    public final void a(bx bxVar) {
        copyOnWrite();
        ((bz) this.instance).addKeyInfo(bxVar);
    }

    public final void b(int i2) {
        copyOnWrite();
        ((bz) this.instance).setPrimaryKeyId(i2);
    }

    private bv() {
        throw null;
    }
}
