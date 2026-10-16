package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bsv extends com.google.v.dm<bsw, bsv> implements com.google.v.fj {
    /* synthetic */ bsv(byte[] bArr) {
        super(bsw.DEFAULT_INSTANCE);
    }

    public final void a(aoh aohVar) {
        copyOnWrite();
        ((bsw) this.instance).setContext(aohVar);
    }

    public final void b(auc aucVar) {
        copyOnWrite();
        ((bsw) this.instance).setRegulationFlags(aucVar);
    }

    private bsv() {
        throw null;
    }
}
