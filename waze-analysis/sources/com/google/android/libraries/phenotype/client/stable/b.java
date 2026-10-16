package com.google.android.libraries.phenotype.client.stable;

import com.google.v.dm;
import com.google.v.fj;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b extends dm<c, b> implements fj {
    /* synthetic */ b(byte[] bArr) {
        super(c.DEFAULT_INSTANCE);
    }

    public final List a() {
        return DesugarCollections.unmodifiableList(((c) this.instance).getValuesList());
    }

    public final void b(String str) {
        copyOnWrite();
        ((c) this.instance).addValues(str);
    }

    public final void c(String str) {
        copyOnWrite();
        ((c) this.instance).setLatestAccount(str);
    }

    private b() {
        throw null;
    }
}
