package com.waze.bg.a.b;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f extends dm<h, f> implements fj {
    /* synthetic */ f(byte[] bArr) {
        super(h.DEFAULT_INSTANCE);
    }

    public final void a(t tVar) {
        copyOnWrite();
        ((h) this.instance).setRole(tVar);
    }

    public final void b(String str) {
        copyOnWrite();
        ((h) this.instance).setTextMessage(str);
    }

    private f() {
        throw null;
    }
}
