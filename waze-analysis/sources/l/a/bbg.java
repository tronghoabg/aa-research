package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bbg extends com.google.v.dm<bbj, bbg> implements com.google.v.fj {
    /* synthetic */ bbg(byte[] bArr) {
        super(bbj.DEFAULT_INSTANCE);
    }

    public final void a(bbh bbhVar) {
        copyOnWrite();
        ((bbj) this.instance).setLocationStatus(bbhVar);
    }

    public final void b(bbi bbiVar) {
        copyOnWrite();
        ((bbj) this.instance).setLocationType(bbiVar);
    }

    private bbg() {
        throw null;
    }
}
