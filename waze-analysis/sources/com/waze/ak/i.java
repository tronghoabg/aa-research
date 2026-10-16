package com.waze.ak;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i extends dm<j, i> implements fj {
    /* synthetic */ i(byte[] bArr) {
        super(j.DEFAULT_INSTANCE);
    }

    public final void a(o oVar) {
        copyOnWrite();
        ((j) this.instance).setFavoriteInfo(oVar);
    }

    public final void b(ae aeVar) {
        copyOnWrite();
        ((j) this.instance).setVenueInfo(aeVar);
    }

    private i() {
        throw null;
    }
}
