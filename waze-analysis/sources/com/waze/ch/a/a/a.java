package com.waze.ch.a.a;

import com.google.v.dm;
import l.a.s;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a extends dm<b, a> implements c {
    /* synthetic */ a(byte[] bArr) {
        super(b.DEFAULT_INSTANCE);
    }

    public final void a(com.waze.n.b bVar) {
        copyOnWrite();
        ((b) this.instance).setMetadata(bVar);
    }

    public final void b(s sVar) {
        copyOnWrite();
        ((b) this.instance).setPayload(sVar);
    }

    private a() {
        throw null;
    }
}
