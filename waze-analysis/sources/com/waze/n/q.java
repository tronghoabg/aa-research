package com.waze.n;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class q extends dm<r, q> implements fj {
    /* synthetic */ q(byte[] bArr) {
        super(r.DEFAULT_INSTANCE);
    }

    public final void a(double d2) {
        copyOnWrite();
        ((r) this.instance).setLatitude(d2);
    }

    public final void b(double d2) {
        copyOnWrite();
        ((r) this.instance).setLongitude(d2);
    }

    private q() {
        throw null;
    }
}
