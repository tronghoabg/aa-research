package com.google.firebase.perf.f;

import com.google.v.dm;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j extends dm<k, j> implements l {
    /* synthetic */ j(byte[] bArr) {
        super(k.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((k) this.instance).setClientTimeUs(j2);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((k) this.instance).setSystemTimeUs(j2);
    }

    public final void c(long j2) {
        copyOnWrite();
        ((k) this.instance).setUserTimeUs(j2);
    }

    private j() {
        throw null;
    }
}
