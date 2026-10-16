package com.waze.copilot;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g extends dm<h, g> implements fj {
    /* synthetic */ g(byte[] bArr) {
        super(h.DEFAULT_INSTANCE);
    }

    public final void a(float f2) {
        copyOnWrite();
        ((h) this.instance).setAmbientIntensity(f2);
    }

    public final void b(float f2) {
        copyOnWrite();
        ((h) this.instance).setDiffuseIntensity(f2);
    }

    private g() {
        throw null;
    }
}
