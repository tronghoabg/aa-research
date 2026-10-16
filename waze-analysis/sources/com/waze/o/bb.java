package com.waze.o;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bb extends dm<bc, bb> implements fj {
    /* synthetic */ bb(byte[] bArr) {
        super(bc.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((bc) this.instance).setIsSuccessful(z);
    }

    private bb() {
        throw null;
    }
}
