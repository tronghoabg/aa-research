package com.waze.sharedrive.f.a;

import com.google.v.dm;
import com.google.v.fj;
import com.google.v.gc;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b extends dm<c, b> implements fj {
    /* synthetic */ b(byte[] bArr) {
        super(c.DEFAULT_INSTANCE);
    }

    public final void a(gc gcVar) {
        copyOnWrite();
        ((c) this.instance).setEta(gcVar);
    }

    public final void b(i.b.s sVar) {
        copyOnWrite();
        ((c) this.instance).setLocation(sVar);
    }

    public final void c(String str) {
        copyOnWrite();
        ((c) this.instance).setRouteUuid(str);
    }

    private b() {
        throw null;
    }
}
