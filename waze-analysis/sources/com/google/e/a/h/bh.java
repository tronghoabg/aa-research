package com.google.e.a.h;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bh extends dm<bj, bh> implements fj {
    /* synthetic */ bh(byte[] bArr) {
        super(bj.DEFAULT_INSTANCE);
    }

    public final void a(bi biVar) {
        copyOnWrite();
        ((bj) this.instance).setKeyMaterialType(biVar);
    }

    public final void b(String str) {
        copyOnWrite();
        ((bj) this.instance).setTypeUrl(str);
    }

    public final void c(com.google.v.v vVar) {
        copyOnWrite();
        ((bj) this.instance).setValue(vVar);
    }

    private bh() {
        throw null;
    }
}
