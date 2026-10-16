package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bsr extends com.google.v.dm<bss, bsr> implements com.google.v.fj {
    /* synthetic */ bsr(byte[] bArr) {
        super(bss.DEFAULT_INSTANCE);
    }

    public final auc a() {
        return ((bss) this.instance).getRegulationFlags();
    }

    public final void b(bsq bsqVar) {
        copyOnWrite();
        ((bss) this.instance).setAction(bsqVar);
    }

    public final void c(aoh aohVar) {
        copyOnWrite();
        ((bss) this.instance).setContext(aohVar);
    }

    public final void d(auc aucVar) {
        copyOnWrite();
        ((bss) this.instance).setRegulationFlags(aucVar);
    }

    private bsr() {
        throw null;
    }
}
