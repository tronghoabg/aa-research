package com.waze.bg.a;

import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ay extends com.google.v.dm<az, ay> implements fj {
    /* synthetic */ ay(byte[] bArr) {
        super(az.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((az) this.instance).setAid(j2);
    }

    public final void b(String str) {
        copyOnWrite();
        ((az) this.instance).setAlertUuid(str);
    }

    private ay() {
        throw null;
    }
}
