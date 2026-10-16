package com.waze.copilot;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends dm<d, c> implements fj {
    /* synthetic */ c(byte[] bArr) {
        super(d.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((d) this.instance).setPreviewImageUrl(str);
    }

    private c() {
        throw null;
    }
}
