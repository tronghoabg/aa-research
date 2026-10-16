package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bno extends com.google.v.dm<bnr, bno> implements com.google.v.fj {
    /* synthetic */ bno(byte[] bArr) {
        super(bnr.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((bnr) this.instance).addAllAvailableSubtypes(iterable);
    }

    public final void b(Iterable iterable) {
        copyOnWrite();
        ((bnr) this.instance).addAllAvailableTypes(iterable);
    }

    public final void c(boolean z) {
        copyOnWrite();
        ((bnr) this.instance).setConversationalReportingButtonVisible(z);
    }

    public final void d(bny bnyVar) {
        copyOnWrite();
        ((bnr) this.instance).setLevel(bnyVar);
    }

    private bno() {
        throw null;
    }
}
