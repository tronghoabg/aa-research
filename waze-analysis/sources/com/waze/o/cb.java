package com.waze.o;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cb extends dm<cc, cb> implements fj {
    /* synthetic */ cb(byte[] bArr) {
        super(cc.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((cc) this.instance).setIsSucceeded(z);
    }

    private cb() {
        throw null;
    }
}
