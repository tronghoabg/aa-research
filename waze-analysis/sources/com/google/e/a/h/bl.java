package com.google.e.a.h;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bl extends dm<bm, bl> implements fj {
    /* synthetic */ bl(byte[] bArr) {
        super(bm.DEFAULT_INSTANCE);
    }

    public final void a(ci ciVar) {
        copyOnWrite();
        ((bm) this.instance).setOutputPrefixType(ciVar);
    }

    public final void b(String str) {
        copyOnWrite();
        ((bm) this.instance).setTypeUrl(str);
    }

    public final void c(com.google.v.v vVar) {
        copyOnWrite();
        ((bm) this.instance).setValue(vVar);
    }

    private bl() {
        throw null;
    }
}
