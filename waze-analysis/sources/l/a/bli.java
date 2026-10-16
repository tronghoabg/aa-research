package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bli extends com.google.v.dm<bll, bli> implements com.google.v.fj {
    /* synthetic */ bli(byte[] bArr) {
        super(bll.DEFAULT_INSTANCE);
    }

    public final void a(blj bljVar) {
        copyOnWrite();
        ((bll) this.instance).addInCarContentElementTypes(bljVar);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((bll) this.instance).setRouteAltId(j2);
    }

    public final void c(String str) {
        copyOnWrite();
        ((bll) this.instance).setRouteUuid(str);
    }

    public final void d(blk blkVar) {
        copyOnWrite();
        ((bll) this.instance).setSelectionMethod(blkVar);
    }

    private bli() {
        throw null;
    }
}
