package com.waze.n;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e extends dm<f, e> implements fj {
    /* synthetic */ e(byte[] bArr) {
        super(f.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((f) this.instance).setClientSessionId(str);
    }

    public final void b(String str) {
        copyOnWrite();
        ((f) this.instance).setSessionId(str);
    }

    public final void c(boolean z) {
        copyOnWrite();
        ((f) this.instance).setStealth(z);
    }

    private e() {
        throw null;
    }
}
