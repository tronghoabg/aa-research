package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class xy extends com.google.v.dm<xz, xy> implements com.google.v.fj {
    /* synthetic */ xy(byte[] bArr) {
        super(xz.DEFAULT_INSTANCE);
    }

    public final void a(xx xxVar) {
        copyOnWrite();
        ((xz) this.instance).setAction(xxVar);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((xz) this.instance).setAvailabilityChanged(z);
    }

    public final void c(boolean z) {
        copyOnWrite();
        ((xz) this.instance).setPricesChanged(z);
    }

    private xy() {
        throw null;
    }
}
