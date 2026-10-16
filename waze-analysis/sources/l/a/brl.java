package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class brl extends com.google.v.dm<brn, brl> implements com.google.v.fj {
    /* synthetic */ brl(byte[] bArr) {
        super(brn.DEFAULT_INSTANCE);
    }

    public final void a(brm brmVar) {
        copyOnWrite();
        ((brn) this.instance).setReason(brmVar);
    }

    public final void b(brz brzVar) {
        copyOnWrite();
        ((brn) this.instance).setWazeAsksInfo(brzVar);
    }

    private brl() {
        throw null;
    }
}
