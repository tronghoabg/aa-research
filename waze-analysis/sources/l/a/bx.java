package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bx extends com.google.v.dm<by, bx> implements com.google.v.fj {
    /* synthetic */ bx(byte[] bArr) {
        super(by.DEFAULT_INSTANCE);
    }

    public final void a(bw bwVar) {
        copyOnWrite();
        ((by) this.instance).setAgeScreenFlow(bwVar);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((by) this.instance).setBirthdateTimestampSeconds(j2);
    }

    public final void c(boolean z) {
        copyOnWrite();
        ((by) this.instance).setClickableCta(z);
    }

    public final void d(bu buVar) {
        copyOnWrite();
        ((by) this.instance).setContext(buVar);
    }

    public final void e(auc aucVar) {
        copyOnWrite();
        ((by) this.instance).setRegulationFlags(aucVar);
    }

    public final void f(bz bzVar) {
        copyOnWrite();
        ((by) this.instance).setScreenType(bzVar);
    }

    private bx() {
        throw null;
    }
}
