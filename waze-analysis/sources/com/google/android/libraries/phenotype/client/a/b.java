package com.google.android.libraries.phenotype.client.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b extends dm<e, b> implements fj {
    /* synthetic */ b(byte[] bArr) {
        super(e.DEFAULT_INSTANCE);
    }

    public final void a(c cVar) {
        copyOnWrite();
        ((e) this.instance).setError(cVar);
    }

    public final void b(d dVar) {
        copyOnWrite();
        ((e) this.instance).setSource(dVar);
    }

    private b() {
        throw null;
    }
}
