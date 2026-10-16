package com.waze.sharedrive.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m extends dm<n, m> implements fj {
    /* synthetic */ m(byte[] bArr) {
        super(n.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((n) this.instance).setToken(str);
    }

    private m() {
        throw null;
    }
}
