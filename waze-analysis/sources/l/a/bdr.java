package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bdr extends com.google.v.dm<bds, bdr> implements com.google.v.fj {
    /* synthetic */ bdr(byte[] bArr) {
        super(bds.DEFAULT_INSTANCE);
    }

    public final void a(bdq bdqVar) {
        copyOnWrite();
        ((bds) this.instance).setAction(bdqVar);
    }

    public final void b(aoh aohVar) {
        copyOnWrite();
        ((bds) this.instance).setContext(aohVar);
    }

    public final void c(auc aucVar) {
        copyOnWrite();
        ((bds) this.instance).setRegulationFlags(aucVar);
    }

    public final void d(aol aolVar) {
        copyOnWrite();
        ((bds) this.instance).setType(aolVar);
    }

    private bdr() {
        throw null;
    }
}
