package com.waze.i;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class al extends dm<an, al> implements fj {
    /* synthetic */ al(byte[] bArr) {
        super(an.DEFAULT_INSTANCE);
    }

    public final void a(ae aeVar) {
        copyOnWrite();
        ((an) this.instance).setPasswordCredential(aeVar);
    }

    public final void b(String str) {
        copyOnWrite();
        ((an) this.instance).setRefreshToken(str);
    }

    private al() {
        throw null;
    }
}
