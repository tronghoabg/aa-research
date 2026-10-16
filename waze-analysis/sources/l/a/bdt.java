package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bdt extends com.google.v.dm<bdu, bdt> implements com.google.v.fj {
    /* synthetic */ bdt(byte[] bArr) {
        super(bdu.DEFAULT_INSTANCE);
    }

    public final void a(aoh aohVar) {
        copyOnWrite();
        ((bdu) this.instance).setContext(aohVar);
    }

    public final void b(auc aucVar) {
        copyOnWrite();
        ((bdu) this.instance).setRegulationFlags(aucVar);
    }

    public final void c(aol aolVar) {
        copyOnWrite();
        ((bdu) this.instance).setType(aolVar);
    }

    private bdt() {
        throw null;
    }
}
