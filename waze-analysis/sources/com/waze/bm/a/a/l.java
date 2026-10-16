package com.waze.bm.a.a;

import com.google.v.dm;
import com.google.v.fj;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l extends dm<m, l> implements fj {
    /* synthetic */ l(byte[] bArr) {
        super(m.DEFAULT_INSTANCE);
    }

    public final List a() {
        return DesugarCollections.unmodifiableList(((m) this.instance).getCandidatesList());
    }

    public final void b(Iterable iterable) {
        copyOnWrite();
        ((m) this.instance).addAllCandidates(iterable);
    }

    private l() {
        throw null;
    }
}
