package com.waze.bm.a.a;

import com.google.v.dm;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g extends dm<h, g> implements i {
    /* synthetic */ g(byte[] bArr) {
        super(h.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((h) this.instance).setCandidateOrdinalId(str);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((h) this.instance).setIsOnRoute(z);
    }

    public final void c(String str) {
        copyOnWrite();
        ((h) this.instance).setReferenceName(str);
    }

    public final void d(String str) {
        copyOnWrite();
        ((h) this.instance).setStreetName(str);
    }

    private g() {
        throw null;
    }
}
