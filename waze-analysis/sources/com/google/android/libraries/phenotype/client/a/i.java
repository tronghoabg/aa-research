package com.google.android.libraries.phenotype.client.a;

import com.google.v.dm;
import com.google.v.v;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i extends dm<k, i> implements l {
    /* synthetic */ i(byte[] bArr) {
        super(k.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((k) this.instance).setBoolValue(z);
    }

    public final void b(v vVar) {
        copyOnWrite();
        ((k) this.instance).setBytesValue(vVar);
    }

    public final void c(double d2) {
        copyOnWrite();
        ((k) this.instance).setDoubleValue(d2);
    }

    public final void d(long j2) {
        copyOnWrite();
        ((k) this.instance).setLongValue(j2);
    }

    public final void e(String str) {
        copyOnWrite();
        ((k) this.instance).setName(str);
    }

    public final void f(String str) {
        copyOnWrite();
        ((k) this.instance).setStringValue(str);
    }

    private i() {
        throw null;
    }
}
