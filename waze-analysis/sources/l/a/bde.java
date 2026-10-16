package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bde extends com.google.v.dm<bdg, bde> implements com.google.v.fj {
    /* synthetic */ bde(byte[] bArr) {
        super(bdg.DEFAULT_INSTANCE);
    }

    public final void a(bck bckVar) {
        copyOnWrite();
        ((bdg) this.instance).setShareDriveDrawerClicked(bckVar);
    }

    public final void b(bcm bcmVar) {
        copyOnWrite();
        ((bdg) this.instance).setShareDriveDrawerShown(bcmVar);
    }

    public final void c(bdi bdiVar) {
        copyOnWrite();
        ((bdg) this.instance).setShareLocationDrawerClicked(bdiVar);
    }

    public final void d(bdk bdkVar) {
        copyOnWrite();
        ((bdg) this.instance).setShareLocationDrawerShown(bdkVar);
    }

    private bde() {
        throw null;
    }
}
