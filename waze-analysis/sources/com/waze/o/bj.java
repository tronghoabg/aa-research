package com.waze.o;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bj extends dm<bx, bj> implements fj {
    /* synthetic */ bj(byte[] bArr) {
        super(bx.DEFAULT_INSTANCE);
    }

    public final void a(bl blVar) {
        copyOnWrite();
        ((bx) this.instance).setNewUser(blVar);
    }

    public final void b(bw bwVar) {
        copyOnWrite();
        ((bx) this.instance).setUserInitiated(bwVar);
    }

    private bj() {
        throw null;
    }
}
