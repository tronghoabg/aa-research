package com.google.e.a.h;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a extends dm<b, a> implements fj {
    /* synthetic */ a(byte[] bArr) {
        super(b.DEFAULT_INSTANCE);
    }

    public final void a(com.google.v.v vVar) {
        copyOnWrite();
        ((b) this.instance).setKeyValue(vVar);
    }

    public final void b(f fVar) {
        copyOnWrite();
        ((b) this.instance).setParams(fVar);
    }

    private a() {
        throw null;
    }
}
