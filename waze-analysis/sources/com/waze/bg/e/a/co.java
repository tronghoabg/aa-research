package com.waze.bg.e.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class co extends com.google.v.dm<cq, co> implements com.google.v.fj {
    /* synthetic */ co(byte[] bArr) {
        super(cq.DEFAULT_INSTANCE);
    }

    public final void a(cn cnVar) {
        copyOnWrite();
        ((cq) this.instance).setCustomFavorite(cnVar);
    }

    public final void b(cs csVar) {
        copyOnWrite();
        ((cq) this.instance).setHomeFavorite(csVar);
    }

    public final void c(cw cwVar) {
        copyOnWrite();
        ((cq) this.instance).setWorkFavorite(cwVar);
    }

    private co() {
        throw null;
    }
}
