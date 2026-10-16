package com.waze.i;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class af extends dm<ai, af> implements fj {
    /* synthetic */ af(byte[] bArr) {
        super(ai.DEFAULT_INSTANCE);
    }

    public final void a(ah ahVar) {
        copyOnWrite();
        ((ai) this.instance).setRevokeForDevice(ahVar);
    }

    public final void b(an anVar) {
        copyOnWrite();
        ((ai) this.instance).setUserCredentials(anVar);
    }

    private af() {
        throw null;
    }
}
