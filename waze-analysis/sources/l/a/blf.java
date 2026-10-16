package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class blf extends com.google.v.dm<blg, blf> implements blh {
    /* synthetic */ blf(byte[] bArr) {
        super(blg.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((blg) this.instance).addAllAlerts(iterable);
    }

    public final void b(Iterable iterable) {
        copyOnWrite();
        ((blg) this.instance).addAllInsights(iterable);
    }

    public final void c(Iterable iterable) {
        copyOnWrite();
        ((blg) this.instance).addAllRestrictions(iterable);
    }

    public final void d(String str) {
        copyOnWrite();
        ((blg) this.instance).setAlternativeRouteUuid(str);
    }

    public final void e(boolean z) {
        copyOnWrite();
        ((blg) this.instance).setIsBest(z);
    }

    public final void f(boolean z) {
        copyOnWrite();
        ((blg) this.instance).setIsPreferred(z);
    }

    public final void g(long j2) {
        copyOnWrite();
        ((blg) this.instance).setRouteAltId(j2);
    }

    public final void h(biu biuVar) {
        copyOnWrite();
        ((blg) this.instance).setTollInformation(biuVar);
    }

    public final void i() {
        copyOnWrite();
        ((blg) this.instance).setGhgEmissionShown(true);
    }

    private blf() {
        throw null;
    }
}
