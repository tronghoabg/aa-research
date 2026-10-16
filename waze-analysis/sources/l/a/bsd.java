package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bsd extends com.google.v.dm<bse, bsd> implements com.google.v.fj {
    /* synthetic */ bsd(byte[] bArr) {
        super(bse.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((bse) this.instance).setSilent(z);
    }

    public final void b(brz brzVar) {
        copyOnWrite();
        ((bse) this.instance).setWazeAsksInfo(brzVar);
    }

    private bsd() {
        throw null;
    }
}
