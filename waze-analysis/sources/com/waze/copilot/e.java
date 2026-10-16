package com.waze.copilot;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e extends dm<f, e> implements fj {
    /* synthetic */ e(byte[] bArr) {
        super(f.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((f) this.instance).setHasNormalTexture(z);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((f) this.instance).setHasShareTexture(z);
    }

    public final void c(boolean z) {
        copyOnWrite();
        ((f) this.instance).setHasTaxiTexture(z);
    }

    public final void d(h hVar) {
        copyOnWrite();
        ((f) this.instance).setLighting(hVar);
    }

    public final void e(float f2) {
        copyOnWrite();
        ((f) this.instance).setScale(f2);
    }

    private e() {
        throw null;
    }
}
