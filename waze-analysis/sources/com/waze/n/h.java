package com.waze.n;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h extends dm<i, h> implements fj {
    /* synthetic */ h(byte[] bArr) {
        super(i.DEFAULT_INSTANCE);
    }

    public final void a(g gVar) {
        copyOnWrite();
        ((i) this.instance).setApp(gVar);
    }

    public final void b() {
        copyOnWrite();
        ((i) this.instance).setClientVersion("5.20.90.901");
    }

    private h() {
        throw null;
    }
}
