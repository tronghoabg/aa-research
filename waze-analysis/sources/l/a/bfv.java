package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bfv extends com.google.v.dm<bfy, bfv> implements com.google.v.fj {
    /* synthetic */ bfv(byte[] bArr) {
        super(bfy.DEFAULT_INSTANCE);
    }

    public final void a(bfw bfwVar) {
        copyOnWrite();
        ((bfy) this.instance).setChangeReason(bfwVar);
    }

    public final void b(sv svVar) {
        copyOnWrite();
        ((bfy) this.instance).setNewDrawerState(svVar);
    }

    public final void c(boolean z) {
        copyOnWrite();
        ((bfy) this.instance).setPortrait(z);
    }

    private bfv() {
        throw null;
    }
}
