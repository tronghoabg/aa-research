package com.google.e.a.h;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ay extends dm<az, ay> implements fj {
    /* synthetic */ ay(byte[] bArr) {
        super(az.DEFAULT_INSTANCE);
    }

    public final void a(com.google.v.v vVar) {
        copyOnWrite();
        ((az) this.instance).setEncryptedKeyset(vVar);
    }

    public final void b(bz bzVar) {
        copyOnWrite();
        ((az) this.instance).setKeysetInfo(bzVar);
    }

    private ay() {
        throw null;
    }
}
