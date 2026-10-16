package com.waze.ca;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d extends dm<e, d> implements fj {
    /* synthetic */ d(byte[] bArr) {
        super(e.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((e) this.instance).setSeconds(j2);
    }

    private d() {
        throw null;
    }
}
