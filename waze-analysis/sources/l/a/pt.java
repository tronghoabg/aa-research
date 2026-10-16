package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class pt extends com.google.v.dm<px, pt> implements com.google.v.fj {
    /* synthetic */ pt(byte[] bArr) {
        super(px.DEFAULT_INSTANCE);
    }

    public final void a(pv pvVar) {
        copyOnWrite();
        ((px) this.instance).setCardTrigger(pvVar);
    }

    public final void b(afx afxVar) {
        copyOnWrite();
        ((px) this.instance).setDestinationCoordinates(afxVar);
    }

    public final void c(pw pwVar) {
        copyOnWrite();
        ((px) this.instance).setDestinationType(pwVar);
    }

    public final void d(String str) {
        copyOnWrite();
        ((px) this.instance).setVenueId(str);
    }

    private pt() {
        throw null;
    }
}
