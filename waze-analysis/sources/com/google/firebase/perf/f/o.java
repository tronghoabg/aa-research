package com.google.firebase.perf.f;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class o extends dm<p, o> implements fj {
    /* synthetic */ o(byte[] bArr) {
        super(p.DEFAULT_INSTANCE);
    }

    public final void a(int i2) {
        copyOnWrite();
        ((p) this.instance).setDeviceRamSizeKb(i2);
    }

    public final void b(int i2) {
        copyOnWrite();
        ((p) this.instance).setMaxAppJavaHeapMemoryKb(i2);
    }

    public final void c(int i2) {
        copyOnWrite();
        ((p) this.instance).setMaxEncouragedAppJavaHeapMemoryKb(i2);
    }

    private o() {
        throw null;
    }
}
