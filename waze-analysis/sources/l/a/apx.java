package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class apx extends com.google.v.dm<apz, apx> implements com.google.v.fj {
    /* synthetic */ apx(byte[] bArr) {
        super(apz.DEFAULT_INSTANCE);
    }

    public final void a(io ioVar) {
        copyOnWrite();
        ((apz) this.instance).setBootPerformance(ioVar.build());
    }

    public final void b(abj abjVar) {
        copyOnWrite();
        ((apz) this.instance).setHealthReport(abjVar);
    }

    private apx() {
        throw null;
    }
}
