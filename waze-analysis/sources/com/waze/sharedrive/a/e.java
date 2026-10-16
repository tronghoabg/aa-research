package com.waze.sharedrive.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e extends dm<f, e> implements fj {
    /* synthetic */ e(byte[] bArr) {
        super(f.DEFAULT_INSTANCE);
    }

    public final void a(com.waze.sharedrive.f.a.c cVar) {
        copyOnWrite();
        ((f) this.instance).setDriver(cVar);
    }

    private e() {
        throw null;
    }
}
