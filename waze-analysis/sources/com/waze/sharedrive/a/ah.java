package com.waze.sharedrive.a;

import com.google.v.dm;
import com.google.v.fj;
import com.google.v.gc;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ah extends dm<ai, ah> implements fj {
    /* synthetic */ ah(byte[] bArr) {
        super(ai.DEFAULT_INSTANCE);
    }

    public final void a(gc gcVar) {
        copyOnWrite();
        ((ai) this.instance).setEta(gcVar);
    }

    public final void b(String str) {
        copyOnWrite();
        ((ai) this.instance).setName(str);
    }

    public final void c(String str) {
        copyOnWrite();
        ((ai) this.instance).setRouteUuid(str);
    }

    private ah() {
        throw null;
    }
}
