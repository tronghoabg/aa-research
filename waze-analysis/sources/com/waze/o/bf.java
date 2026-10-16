package com.waze.o;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bf extends dm<bg, bf> implements fj {
    /* synthetic */ bf(byte[] bArr) {
        super(bg.DEFAULT_INSTANCE);
    }

    public final void a() {
        copyOnWrite();
        ((bg) this.instance).setIsSuccessful(true);
    }

    private bf() {
        throw null;
    }
}
