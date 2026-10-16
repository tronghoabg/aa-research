package com.google.android.libraries.phenotype.client.b;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class m extends dm<n, m> implements fj {
    /* synthetic */ m(byte[] bArr) {
        super(n.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((n) this.instance).setLastFetchTimestampMillis(j2);
    }

    private m() {
        throw null;
    }
}
