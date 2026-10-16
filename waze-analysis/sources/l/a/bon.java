package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bon extends com.google.v.dm<boo, bon> implements com.google.v.fj {
    /* synthetic */ bon(byte[] bArr) {
        super(boo.DEFAULT_INSTANCE);
    }

    public final void a(bv bvVar) {
        copyOnWrite();
        ((boo) this.instance).setAgeScreenFlow(bvVar);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((boo) this.instance).setBirthdateTimestampSeconds(j2);
    }

    public final void c(bu buVar) {
        copyOnWrite();
        ((boo) this.instance).setContext(buVar);
    }

    public final void d(auc aucVar) {
        copyOnWrite();
        ((boo) this.instance).setRegulationFlags(aucVar);
    }

    private bon() {
        throw null;
    }
}
