package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class gi extends com.google.v.dm<gj, gi> implements com.google.v.fj {
    /* synthetic */ gi(byte[] bArr) {
        super(gj.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((gj) this.instance).setIndex(j2);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((gj) this.instance).setMeterDistance(j2);
    }

    public final void c(long j2) {
        copyOnWrite();
        ((gj) this.instance).setQueryCharactersCount(j2);
    }

    public final void d(String str) {
        copyOnWrite();
        ((gj) this.instance).setVenueId(str);
    }

    public final void e(String str) {
        copyOnWrite();
        ((gj) this.instance).setVenueName(str);
    }

    private gi() {
        throw null;
    }
}
