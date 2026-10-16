package com.waze.i;

import com.google.v.dm;
import com.google.v.fj;
import i.b.l.ao;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class q extends dm<s, q> implements fj {
    /* synthetic */ q(byte[] bArr) {
        super(s.DEFAULT_INSTANCE);
    }

    public final void a(ao aoVar) {
        copyOnWrite();
        ((s) this.instance).setClientInfo(aoVar);
    }

    public final void b(ae aeVar) {
        copyOnWrite();
        ((s) this.instance).setPasswordCredential(aeVar);
    }

    public final void c(String str) {
        copyOnWrite();
        ((s) this.instance).setRefreshToken(str);
    }

    private q() {
        throw null;
    }
}
