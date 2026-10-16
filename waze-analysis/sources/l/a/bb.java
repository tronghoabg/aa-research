package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bb extends com.google.v.dm<bc, bb> implements com.google.v.fj {
    /* synthetic */ bb(byte[] bArr) {
        super(bc.DEFAULT_INSTANCE);
    }

    public final String a() {
        return ((bc) this.instance).getAdBusinessName();
    }

    public final yn b() {
        return ((bc) this.instance).getAdBannerInformation();
    }

    public final zh c() {
        return ((bc) this.instance).getGoogleAdInformation();
    }

    public final void d(yn ynVar) {
        copyOnWrite();
        ((bc) this.instance).setAdBannerInformation(ynVar);
    }

    public final void e(String str) {
        copyOnWrite();
        ((bc) this.instance).setAdBusinessName(str);
    }

    public final void f(boolean z) {
        copyOnWrite();
        ((bc) this.instance).setBookParkingShown(z);
    }

    public final void g(tn tnVar) {
        copyOnWrite();
        ((bc) this.instance).setElectricVehicleChargingStationInformation(tnVar);
    }

    public final void h(zh zhVar) {
        copyOnWrite();
        ((bc) this.instance).setGoogleAdInformation(zhVar);
    }

    public final void i() {
        copyOnWrite();
        ((bc) this.instance).setIsAd(true);
    }

    public final void j(boolean z) {
        copyOnWrite();
        ((bc) this.instance).setParking(z);
    }

    public final void k(boolean z) {
        copyOnWrite();
        ((bc) this.instance).setParkingPricesShown(z);
    }

    public final void l(boolean z) {
        copyOnWrite();
        ((bc) this.instance).setResidential(z);
    }

    public final void m(bjz bjzVar) {
        copyOnWrite();
        ((bc) this.instance).setTriggeringPlatform(bjzVar);
    }

    public final void n(String str) {
        copyOnWrite();
        ((bc) this.instance).setVenueId(str);
    }

    public final void o(bps bpsVar) {
        copyOnWrite();
        ((bc) this.instance).setVenueOpeningInformation(bpsVar);
    }

    public final void p(long j2) {
        copyOnWrite();
        ((bc) this.instance).setVenuePriceInformation(j2);
    }

    public final void q(float f2) {
        copyOnWrite();
        ((bc) this.instance).setVenueRatingInformation(f2);
    }

    public final void r() {
        ((bc) this.instance).getIsAd();
    }

    private bb() {
        throw null;
    }
}
