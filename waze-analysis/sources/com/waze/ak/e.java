package com.waze.ak;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e extends dm<f, e> implements fj {
    /* synthetic */ e(byte[] bArr) {
        super(f.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((f) this.instance).setFavoriteName(str);
    }

    private e() {
        throw null;
    }
}
