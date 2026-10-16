package com.waze.ak;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m extends dm<o, m> implements fj {
    /* synthetic */ m(byte[] bArr) {
        super(o.DEFAULT_INSTANCE);
    }

    public final void a(f fVar) {
        copyOnWrite();
        ((o) this.instance).setCustomFavorite(fVar);
    }

    public final void b(u uVar) {
        copyOnWrite();
        ((o) this.instance).setHomeFavorite(uVar);
    }

    public final void c(ak akVar) {
        copyOnWrite();
        ((o) this.instance).setWorkFavorite(akVar);
    }

    private m() {
        throw null;
    }
}
