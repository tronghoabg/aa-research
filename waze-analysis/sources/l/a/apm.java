package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class apm extends com.google.v.dm<apo, apm> implements com.google.v.fj {
    /* synthetic */ apm(byte[] bArr) {
        super(apo.DEFAULT_INSTANCE);
    }

    public final void a(apa apaVar) {
        copyOnWrite();
        ((apo) this.instance).setParkingMarkPopupMenuClicked(apaVar);
    }

    public final void b(apc apcVar) {
        copyOnWrite();
        ((apo) this.instance).setParkingMarkSendLocationClick(apcVar);
    }

    public final void c(ape apeVar) {
        copyOnWrite();
        ((apo) this.instance).setParkingNearDestinationFindNearbyClicked(apeVar);
    }

    public final void d(api apiVar) {
        copyOnWrite();
        ((apo) this.instance).setParkingNearDestinationMenuClicked(apiVar);
    }

    public final void e(bbr bbrVar) {
        copyOnWrite();
        ((apo) this.instance).setSetParkingMark(bbrVar);
    }

    private apm() {
        throw null;
    }
}
