package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bbp extends com.google.v.dm<bbr, bbp> implements com.google.v.fj {
    /* synthetic */ bbp(byte[] bArr) {
        super(bbr.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((bbr) this.instance).setDestVenueId(str);
    }

    public final void b(afx afxVar) {
        copyOnWrite();
        ((bbr) this.instance).setDestinationCoordinates(afxVar);
    }

    public final void c(bbq bbqVar) {
        copyOnWrite();
        ((bbr) this.instance).setMethod(bbqVar);
    }

    public final void d(afx afxVar) {
        copyOnWrite();
        ((bbr) this.instance).setUserCurrentCoordinates(afxVar);
    }

    private bbp() {
        throw null;
    }
}
