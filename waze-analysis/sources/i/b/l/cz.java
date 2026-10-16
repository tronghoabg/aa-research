package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class cz extends com.google.v.dm<da, cz> implements com.google.v.fj {
    /* synthetic */ cz(byte[] bArr) {
        super(da.DEFAULT_INSTANCE);
    }

    public final void a(i.b.r rVar) {
        copyOnWrite();
        ((da) this.instance).setCoordinate(rVar);
    }

    public final void b(double d2) {
        copyOnWrite();
        ((da) this.instance).setHorizontalAccuracyMeters(d2);
    }

    public final void c(long j2) {
        copyOnWrite();
        ((da) this.instance).setTimeEpochMs(j2);
    }

    private cz() {
        throw null;
    }
}
