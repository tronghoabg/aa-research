package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bgp extends com.google.v.dm<bgs, bgp> implements com.google.v.fj {
    /* synthetic */ bgp(byte[] bArr) {
        super(bgs.DEFAULT_INSTANCE);
    }

    public final void a(bgq bgqVar) {
        copyOnWrite();
        ((bgs) this.instance).setCardTrigger(bgqVar);
    }

    public final void b(afx afxVar) {
        copyOnWrite();
        ((bgs) this.instance).setDestinationCoordinates(afxVar);
    }

    public final void c(bgr bgrVar) {
        copyOnWrite();
        ((bgs) this.instance).setDestinationType(bgrVar);
    }

    public final void d(awz awzVar) {
        copyOnWrite();
        ((bgs) this.instance).setRtInfo(awzVar);
    }

    public final void e(String str) {
        copyOnWrite();
        ((bgs) this.instance).setVenueId(str);
    }

    private bgp() {
        throw null;
    }
}
