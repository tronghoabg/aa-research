package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class gb extends dm<gc, gb> implements fj {
    /* synthetic */ gb(byte[] bArr) {
        super(gc.DEFAULT_INSTANCE);
    }

    public final void a(int i2) {
        copyOnWrite();
        ((gc) this.instance).setNanos(i2);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((gc) this.instance).setSeconds(j2);
    }

    private gb() {
        throw null;
    }
}
