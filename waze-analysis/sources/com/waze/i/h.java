package com.waze.i;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h extends dm<i, h> implements fj {
    /* synthetic */ h(byte[] bArr) {
        super(i.DEFAULT_INSTANCE);
    }

    public final void a(s sVar) {
        copyOnWrite();
        ((i) this.instance).setGetTokenRequest(sVar);
    }

    public final void b(String str) {
        copyOnWrite();
        ((i) this.instance).setQrAuthenticationToken(str);
    }

    private h() {
        throw null;
    }
}
