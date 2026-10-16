package com.waze.o;

import com.google.v.dm;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ag extends dm<ai, ag> implements aj {
    /* synthetic */ ag(byte[] bArr) {
        super(ai.DEFAULT_INSTANCE);
    }

    public final void a(ce ceVar) {
        copyOnWrite();
        ((ai) this.instance).setAddress(ceVar);
    }

    public final void b(ah ahVar) {
        copyOnWrite();
        ((ai) this.instance).setFavoriteType(ahVar);
    }

    public final void c(String str) {
        copyOnWrite();
        ((ai) this.instance).setName(str);
    }

    private ag() {
        throw null;
    }
}
