package com.waze.bg.e.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class eh extends com.google.v.dm<ei, eh> implements com.google.v.fj {
    /* synthetic */ eh(byte[] bArr) {
        super(ei.DEFAULT_INSTANCE);
    }

    public final void a(i.b.s sVar) {
        copyOnWrite();
        ((ei) this.instance).setCoordinate(sVar);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((ei) this.instance).setFromNode(j2);
    }

    public final void c(long j2) {
        copyOnWrite();
        ((ei) this.instance).setToNode(j2);
    }

    private eh() {
        throw null;
    }
}
