package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ue extends com.google.v.dm<ug, ue> implements com.google.v.fj {
    /* synthetic */ ue(byte[] bArr) {
        super(ug.DEFAULT_INSTANCE);
    }

    public final void a(ud udVar) {
        copyOnWrite();
        ((ug) this.instance).setAction(udVar);
    }

    public final void b(uj ujVar) {
        copyOnWrite();
        ((ug) this.instance).setEncouragementInfo(ujVar);
    }

    public final void c(boolean z) {
        copyOnWrite();
        ((ug) this.instance).setOptOut(z);
    }

    public final void d(bmq bmqVar) {
        copyOnWrite();
        ((ug) this.instance).setUcommInfo(bmqVar);
    }

    private ue() {
        throw null;
    }
}
