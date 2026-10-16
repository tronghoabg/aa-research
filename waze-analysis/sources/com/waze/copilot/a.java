package com.waze.copilot;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a extends dm<b, a> implements fj {
    /* synthetic */ a(byte[] bArr) {
        super(b.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((b) this.instance).setAssetsZipFileUrl(str);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((b) this.instance).setLastChangedTimestampSec(j2);
    }

    private a() {
        throw null;
    }
}
