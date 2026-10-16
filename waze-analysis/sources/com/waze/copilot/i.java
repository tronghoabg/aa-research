package com.waze.copilot;

import com.google.v.dm;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i extends dm<j, i> implements k {
    /* synthetic */ i(byte[] bArr) {
        super(j.DEFAULT_INSTANCE);
    }

    public final void a(f fVar) {
        copyOnWrite();
        ((j) this.instance).setCar3DInfo(fVar);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((j) this.instance).setCarId(j2);
    }

    public final void c(String str) {
        copyOnWrite();
        ((j) this.instance).setCarName(str);
    }

    public final void d(b bVar) {
        copyOnWrite();
        ((j) this.instance).setDownloadable(bVar);
    }

    public final void e(d dVar) {
        copyOnWrite();
        ((j) this.instance).setPreview(dVar);
    }

    private i() {
        throw null;
    }
}
