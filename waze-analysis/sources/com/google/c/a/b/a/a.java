package com.google.c.a.b.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a extends dm<f, a> implements fj {
    /* synthetic */ a(byte[] bArr) {
        super(f.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((f) this.instance).addAllDisplayedPlaceResults(iterable);
    }

    public final void b() {
        copyOnWrite();
        ((f) this.instance).clearDisplayedPlaceResults();
    }

    private a() {
        throw null;
    }
}
