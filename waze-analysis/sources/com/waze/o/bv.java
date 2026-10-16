package com.waze.o;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bv extends dm<bw, bv> implements fj {
    /* synthetic */ bv(byte[] bArr) {
        super(bw.DEFAULT_INSTANCE);
    }

    public final void a(com.waze.u.a.s sVar) {
        copyOnWrite();
        ((bw) this.instance).setUserPrompt(sVar);
    }

    private bv() {
        throw null;
    }
}
