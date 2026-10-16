package com.waze.ch.a.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g extends dm<h, g> implements fj {
    /* synthetic */ g(byte[] bArr) {
        super(h.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((h) this.instance).addAllEvents(iterable);
    }

    private g() {
        throw null;
    }
}
