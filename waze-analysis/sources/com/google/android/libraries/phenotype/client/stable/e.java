package com.google.android.libraries.phenotype.client.stable;

import com.google.v.dm;
import com.google.v.fj;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e extends dm<f, e> implements fj {
    /* synthetic */ e(byte[] bArr) {
        super(f.DEFAULT_INSTANCE);
    }

    public final void a(String str, c cVar) {
        Objects.requireNonNull(str);
        Objects.requireNonNull(cVar);
        copyOnWrite();
        ((f) this.instance).getMutableAccountListsMap().put(str, cVar);
    }

    private e() {
        throw null;
    }
}
