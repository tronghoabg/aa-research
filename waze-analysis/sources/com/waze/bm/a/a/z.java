package com.waze.bm.a.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class z extends dm<aa, z> implements fj {
    /* synthetic */ z(byte[] bArr) {
        super(aa.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((aa) this.instance).setIsSucceeded(z);
    }

    private z() {
        throw null;
    }
}
