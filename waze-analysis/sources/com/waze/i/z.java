package com.waze.i;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class z extends dm<aa, z> implements fj {
    /* synthetic */ z(byte[] bArr) {
        super(aa.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((aa) this.instance).setAuthenticationToken(str);
    }

    private z() {
        throw null;
    }
}
