package com.waze.ce;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q extends dm<r, q> implements fj {
    /* synthetic */ q(byte[] bArr) {
        super(r.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((r) this.instance).setVoiceId(str);
    }

    public final void b(int i2) {
        copyOnWrite();
        ((r) this.instance).setVoiceVersion(i2);
    }

    private q() {
        throw null;
    }
}
