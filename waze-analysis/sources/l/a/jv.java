package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class jv extends com.google.v.dm<jw, jv> implements com.google.v.fj {
    /* synthetic */ jv(byte[] bArr) {
        super(jw.DEFAULT_INSTANCE);
    }

    public final void a(ju juVar) {
        copyOnWrite();
        ((jw) this.instance).setAction(juVar);
    }

    public final void b(aoh aohVar) {
        copyOnWrite();
        ((jw) this.instance).setContext(aohVar);
    }

    public final void c(auc aucVar) {
        copyOnWrite();
        ((jw) this.instance).setRegulationFlags(aucVar);
    }

    private jv() {
        throw null;
    }
}
