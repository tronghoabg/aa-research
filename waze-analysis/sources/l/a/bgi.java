package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bgi extends com.google.v.dm<bgk, bgi> implements com.google.v.fj {
    /* synthetic */ bgi(byte[] bArr) {
        super(bgk.DEFAULT_INSTANCE);
    }

    public final void a(bfy bfyVar) {
        copyOnWrite();
        ((bgk) this.instance).setStartStateDrawerChanged(bfyVar);
    }

    public final void b(bgc bgcVar) {
        copyOnWrite();
        ((bgk) this.instance).setStartStateDrawerClicked(bgcVar);
    }

    public final void c(bgf bgfVar) {
        copyOnWrite();
        ((bgk) this.instance).setStartStateDrawerShown(bgfVar);
    }

    public final void d(bgh bghVar) {
        copyOnWrite();
        ((bgk) this.instance).setStartStateRtInfoUpdated(bghVar);
    }

    private bgi() {
        throw null;
    }
}
