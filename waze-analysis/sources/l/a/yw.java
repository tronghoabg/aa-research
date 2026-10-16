package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class yw extends com.google.v.dm<yx, yw> implements com.google.v.fj {
    /* synthetic */ yw(byte[] bArr) {
        super(yx.DEFAULT_INSTANCE);
    }

    public final void a(zh zhVar) {
        copyOnWrite();
        ((yx) this.instance).setGoogleAdInformation(zhVar);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((yx) this.instance).setLogoDisplayed(z);
    }

    public final void c(bps bpsVar) {
        copyOnWrite();
        ((yx) this.instance).setVenueOpeningInformation(bpsVar);
    }

    public final void d(float f2) {
        copyOnWrite();
        ((yx) this.instance).setVenueRatingInformation(f2);
    }

    private yw() {
        throw null;
    }
}
