package com.waze.o;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class at extends dm<au, at> implements fj {
    /* synthetic */ at(byte[] bArr) {
        super(au.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((au) this.instance).setIsSuccessful(z);
    }

    private at() {
        throw null;
    }
}
