package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class di extends com.google.v.dm<dk, di> implements dl {
    /* synthetic */ di(byte[] bArr) {
        super(dk.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((dk) this.instance).addAllAlerts(iterable);
    }

    public final void b(Iterable iterable) {
        copyOnWrite();
        ((dk) this.instance).addAllInsights(iterable);
    }

    public final void c(Iterable iterable) {
        copyOnWrite();
        ((dk) this.instance).addAllRestrictions(iterable);
    }

    public final void d(long j2) {
        copyOnWrite();
        ((dk) this.instance).setActualDurationDeltaSeconds(j2);
    }

    public final void e(String str) {
        copyOnWrite();
        ((dk) this.instance).setAlternativeRouteUuid(str);
    }

    public final void f(boolean z) {
        copyOnWrite();
        ((dk) this.instance).setCurrent(z);
    }

    public final void g(long j2) {
        copyOnWrite();
        ((dk) this.instance).setDistanceMeters(j2);
    }

    public final void h(long j2) {
        copyOnWrite();
        ((dk) this.instance).setDurationSeconds(j2);
    }

    public final void i(abl ablVar) {
        copyOnWrite();
        ((dk) this.instance).setHovInformation(ablVar);
    }

    public final void j(dj djVar) {
        copyOnWrite();
        ((dk) this.instance).setHovToggleState(djVar);
    }

    public final void k(long j2) {
        copyOnWrite();
        ((dk) this.instance).setPresentedDurationDeltaSeconds(j2);
    }

    public final void l(long j2) {
        copyOnWrite();
        ((dk) this.instance).setRouteIndexInList(j2);
    }

    public final void m(boolean z) {
        copyOnWrite();
        ((dk) this.instance).setStop(z);
    }

    public final void n(biu biuVar) {
        copyOnWrite();
        ((dk) this.instance).setTollInformation(biuVar);
    }

    private di() {
        throw null;
    }
}
