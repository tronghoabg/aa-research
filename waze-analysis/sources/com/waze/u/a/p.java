package com.waze.u.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class p extends dm<r, p> implements fj {
    /* synthetic */ p(byte[] bArr) {
        super(r.DEFAULT_INSTANCE);
    }

    public final void a(b bVar) {
        copyOnWrite();
        ((r) this.instance).setAudio(bVar);
    }

    public final void b(q qVar) {
        copyOnWrite();
        ((r) this.instance).setRecognizer(qVar);
    }

    private p() {
        throw null;
    }
}
