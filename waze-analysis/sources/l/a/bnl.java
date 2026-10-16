package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bnl extends com.google.v.dm<bnn, bnl> implements com.google.v.fj {
    /* synthetic */ bnl(byte[] bArr) {
        super(bnn.DEFAULT_INSTANCE);
    }

    public final void a(bad badVar) {
        copyOnWrite();
        ((bnn) this.instance).setSegmentInfo(badVar);
    }

    public final void b(bnm bnmVar) {
        copyOnWrite();
        ((bnn) this.instance).setSegmentSelectionMethod(bnmVar);
    }

    public final void c(boc bocVar) {
        copyOnWrite();
        ((bnn) this.instance).setUgcTypeInfo(bocVar);
    }

    private bnl() {
        throw null;
    }
}
