package com.waze.sharedrive.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g extends dm<h, g> implements fj {
    /* synthetic */ g(byte[] bArr) {
        super(h.DEFAULT_INSTANCE);
    }

    public final void a(com.waze.sharedrive.f.a.i iVar) {
        copyOnWrite();
        ((h) this.instance).setJoinAs(iVar);
    }

    public final void b(String str) {
        copyOnWrite();
        ((h) this.instance).setToken(str);
    }

    private g() {
        throw null;
    }
}
