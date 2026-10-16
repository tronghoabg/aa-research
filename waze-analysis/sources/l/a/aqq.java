package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aqq extends com.google.v.dm<aqr, aqq> implements com.google.v.fj {
    /* synthetic */ aqq(byte[] bArr) {
        super(aqr.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((aqr) this.instance).setCollapsed(z);
    }

    public final void b(afx afxVar) {
        copyOnWrite();
        ((aqr) this.instance).setDestinationCoordinates(afxVar);
    }

    public final void c(long j2) {
        copyOnWrite();
        ((aqr) this.instance).setNumPhotos(j2);
    }

    public final void d(String str) {
        copyOnWrite();
        ((aqr) this.instance).setVenueId(str);
    }

    private aqq() {
        throw null;
    }
}
