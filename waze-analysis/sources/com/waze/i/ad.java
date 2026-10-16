package com.waze.i;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ad extends dm<ae, ad> implements fj {
    /* synthetic */ ad(byte[] bArr) {
        super(ae.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((ae) this.instance).setPassword(str);
    }

    public final void b(String str) {
        copyOnWrite();
        ((ae) this.instance).setUsername(str);
    }

    private ad() {
        throw null;
    }
}
