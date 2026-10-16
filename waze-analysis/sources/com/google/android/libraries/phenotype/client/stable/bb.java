package com.google.android.libraries.phenotype.client.stable;

import com.google.v.dm;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bb extends dm<bd, bb> implements be {
    /* synthetic */ bb(byte[] bArr) {
        super(bd.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((bd) this.instance).setBooleanValue(z);
    }

    public final void b(com.google.v.v vVar) {
        copyOnWrite();
        ((bd) this.instance).setBytesValue(vVar);
    }

    public final void c(double d2) {
        copyOnWrite();
        ((bd) this.instance).setDoubleValue(d2);
    }

    public final void d(long j2) {
        copyOnWrite();
        ((bd) this.instance).setLongValue(j2);
    }

    public final void e(String str) {
        copyOnWrite();
        ((bd) this.instance).setName(str);
    }

    public final void f(String str) {
        copyOnWrite();
        ((bd) this.instance).setStringValue(str);
    }

    private bb() {
        throw null;
    }
}
