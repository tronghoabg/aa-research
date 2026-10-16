package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class vo extends com.google.v.dm<vq, vo> implements com.google.v.fj {
    /* synthetic */ vo(byte[] bArr) {
        super(vq.DEFAULT_INSTANCE);
    }

    public final void a(is isVar) {
        copyOnWrite();
        ((vq) this.instance).setBottomPaneClicked(isVar);
    }

    public final void b(vi viVar) {
        copyOnWrite();
        ((vq) this.instance).setEtaDrawerClicked(viVar);
    }

    public final void c(vk vkVar) {
        copyOnWrite();
        ((vq) this.instance).setEtaDrawerShown(vkVar.build());
    }

    public final void d(aox aoxVar) {
        copyOnWrite();
        ((vq) this.instance).setOverviewBarClicked(aoxVar);
    }

    private vo() {
        throw null;
    }
}
