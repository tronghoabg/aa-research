package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class wi extends com.google.v.dm<wj, wi> implements com.google.v.fj {
    /* synthetic */ wi(byte[] bArr) {
        super(wj.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((wj) this.instance).setFavoritesCount(j2);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((wj) this.instance).setHomeAvailable(z);
    }

    public final void c(boolean z) {
        copyOnWrite();
        ((wj) this.instance).setWorkAvailable(z);
    }

    private wi() {
        throw null;
    }
}
