package com.google.firebase.perf.f;

import com.google.v.dm;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c extends dm<d, c> implements e {
    /* synthetic */ c(byte[] bArr) {
        super(d.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((d) this.instance).setClientTimeUs(j2);
    }

    public final void b(int i2) {
        copyOnWrite();
        ((d) this.instance).setUsedAppJavaHeapMemoryKb(i2);
    }

    private c() {
        throw null;
    }
}
