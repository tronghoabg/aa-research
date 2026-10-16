package com.waze.bg.a;

import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bc extends com.google.v.dm<bd, bc> implements fj {
    /* synthetic */ bc(byte[] bArr) {
        super(bd.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((bd) this.instance).setAid(j2);
    }

    public final void b(String str) {
        copyOnWrite();
        ((bd) this.instance).setAlertUuid(str);
    }

    private bc() {
        throw null;
    }
}
