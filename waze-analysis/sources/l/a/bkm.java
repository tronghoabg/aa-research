package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bkm extends com.google.v.dm<bko, bkm> implements com.google.v.fj {
    /* synthetic */ bkm(byte[] bArr) {
        super(bko.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((bko) this.instance).setErrorCode(str);
    }

    public final void b(String str) {
        copyOnWrite();
        ((bko) this.instance).setErrorServerDescription(str);
    }

    public final void c(bfn bfnVar) {
        copyOnWrite();
        ((bko) this.instance).setSource(bfnVar);
    }

    public final void d(bkn bknVar) {
        copyOnWrite();
        ((bko) this.instance).setTriggeredFrom(bknVar);
    }

    private bkm() {
        throw null;
    }
}
