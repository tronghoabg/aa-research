package com.waze.ce;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m extends dm<n, m> implements fj {
    /* synthetic */ m(byte[] bArr) {
        super(n.DEFAULT_INSTANCE);
    }

    public final void a(i.b.s sVar) {
        copyOnWrite();
        ((n) this.instance).setCoordinate(sVar);
    }

    public final void b(String str) {
        copyOnWrite();
        ((n) this.instance).setText(str);
    }

    public final void c(r rVar) {
        copyOnWrite();
        ((n) this.instance).setVoice(rVar);
    }

    private m() {
        throw null;
    }
}
