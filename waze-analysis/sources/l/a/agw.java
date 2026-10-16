package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class agw extends com.google.v.dm<agy, agw> implements com.google.v.fj {
    /* synthetic */ agw(byte[] bArr) {
        super(agy.DEFAULT_INSTANCE);
    }

    public final void a(at atVar) {
        copyOnWrite();
        ((agy) this.instance).setAddressChangedPopupClicked(atVar);
    }

    public final void b(av avVar) {
        copyOnWrite();
        ((agy) this.instance).setAddressChangedPopupShown(avVar);
    }

    public final void c(ax axVar) {
        copyOnWrite();
        ((agy) this.instance).setAddressPreviewClicked(axVar.build());
    }

    public final void d(az azVar) {
        copyOnWrite();
        ((agy) this.instance).setAddressPreviewClicked(azVar);
    }

    public final void e(bc bcVar) {
        copyOnWrite();
        ((agy) this.instance).setAddressPreviewInformationShown(bcVar);
    }

    public final void f(be beVar) {
        copyOnWrite();
        ((agy) this.instance).setAddressPreviewLatency(beVar);
    }

    public final void g(bg bgVar) {
        copyOnWrite();
        ((agy) this.instance).setAddressPreviewOnsiteParkingShown(bgVar);
    }

    public final void h(bh bhVar) {
        copyOnWrite();
        ((agy) this.instance).setAddressPreviewShown(bhVar.build());
    }

    public final void i(bj bjVar) {
        copyOnWrite();
        ((agy) this.instance).setAddressPreviewSuggestedParkingShown(bjVar.build());
    }

    private agw() {
        throw null;
    }
}
