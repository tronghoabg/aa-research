package com.waze.sharedrive.f.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a extends dm<i, a> implements fj {
    /* synthetic */ a(byte[] bArr) {
        super(i.DEFAULT_INSTANCE);
    }

    public final void a(c cVar) {
        copyOnWrite();
        ((i) this.instance).setDriver(cVar);
    }

    public final void b(f fVar) {
        copyOnWrite();
        ((i) this.instance).setViewer(fVar);
    }

    public final void c(h hVar) {
        copyOnWrite();
        ((i) this.instance).setViewerSharingLocation(hVar);
    }

    private a() {
        throw null;
    }
}
