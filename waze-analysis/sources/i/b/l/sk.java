package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class sk extends com.google.v.dm<sl, sk> implements sq {
    /* synthetic */ sk(byte[] bArr) {
        super(sl.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((sl) this.instance).addAllEventOnRoute(iterable);
    }

    public final void b(Iterable iterable) {
        copyOnWrite();
        ((sl) this.instance).addAllRoutePoint(iterable);
    }

    public final void c(i.b.p pVar) {
        copyOnWrite();
        ((sl) this.instance).addRoutePoint(pVar.build());
    }

    public final void d() {
        copyOnWrite();
        ((sl) this.instance).clearEventOnRoute();
    }

    public final void e(String str) {
        copyOnWrite();
        ((sl) this.instance).setAltDescription(str);
    }

    public final void f(long j2) {
        copyOnWrite();
        ((sl) this.instance).setAltId(j2);
    }

    public final void g(String str) {
        copyOnWrite();
        ((sl) this.instance).setAlternativeRouteUuid(str);
    }

    public final void h(rq rqVar) {
        copyOnWrite();
        ((sl) this.instance).setHovRouteInfo(rqVar);
    }

    public final void i(rz rzVar) {
        copyOnWrite();
        ((sl) this.instance).setRouteGeometry(rzVar);
    }

    public final void j(long j2) {
        copyOnWrite();
        ((sl) this.instance).setTotalLength(j2);
    }

    public final void k(long j2) {
        copyOnWrite();
        ((sl) this.instance).setTotalSeconds(j2);
    }

    private sk() {
        throw null;
    }
}
