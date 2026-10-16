package com.waze.sharedrive.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends dm<j, i> implements fj {
    /* synthetic */ i(byte[] bArr) {
        super(j.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((j) this.instance).setName(str);
    }

    private i() {
        throw null;
    }
}
