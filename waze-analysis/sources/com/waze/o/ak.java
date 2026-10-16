package com.waze.o;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ak extends dm<al, ak> implements fj {
    /* synthetic */ ak(byte[] bArr) {
        super(al.DEFAULT_INSTANCE);
    }

    public final void a(ce ceVar) {
        copyOnWrite();
        ((al) this.instance).setDestination(ceVar);
    }

    public final void b(ao aoVar) {
        copyOnWrite();
        ((al) this.instance).setRouteDescription(aoVar);
    }

    public final void c(ce ceVar) {
        copyOnWrite();
        ((al) this.instance).setWaypoint(ceVar);
    }

    private ak() {
        throw null;
    }
}
