package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class pn extends com.google.v.dm<pq, pn> implements com.google.v.fj {
    /* synthetic */ pn(byte[] bArr) {
        super(pq.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((pq) this.instance).addAllPermit(iterable);
    }

    public final void b(Iterable iterable) {
        copyOnWrite();
        ((pq) this.instance).addAllRoutingOptions(iterable);
    }

    public final void c(oh ohVar) {
        copyOnWrite();
        ((pq) this.instance).addDestination(ohVar.build());
    }

    public final void d() {
        copyOnWrite();
        ((pq) this.instance).setAutoSelectRoute(false);
    }

    public final void e(on onVar) {
        copyOnWrite();
        ((pq) this.instance).setEvData(onVar);
    }

    public final void f(oq oqVar) {
        copyOnWrite();
        ((pq) this.instance).setFromLoc(oqVar.build());
    }

    public final void g(int i2) {
        copyOnWrite();
        ((pq) this.instance).setId(i2);
    }

    public final void h(String str) {
        copyOnWrite();
        ((pq) this.instance).setLicensePlateSuffix(str);
    }

    public final void i(int i2) {
        copyOnWrite();
        ((pq) this.instance).setMaxGeometries(i2);
    }

    public final void j() {
        copyOnWrite();
        ((pq) this.instance).setMaxPoints(-1);
    }

    public final void k(int i2) {
        copyOnWrite();
        ((pq) this.instance).setMaxRoutes(i2);
    }

    public final void l() {
        copyOnWrite();
        ((pq) this.instance).setReroute(false);
    }

    public final void m() {
        copyOnWrite();
        ((pq) this.instance).setRetry(false);
    }

    public final void n(boolean z) {
        copyOnWrite();
        ((pq) this.instance).setReturnClosureImpactInfo(z);
    }

    public final void o() {
        copyOnWrite();
        ((pq) this.instance).setReturnEventGeometry(true);
    }

    public final void p() {
        copyOnWrite();
        ((pq) this.instance).setReturnQuestions(true);
    }

    public final void q() {
        copyOnWrite();
        ((pq) this.instance).setReturnRouteInsights(true);
    }

    public final void r(pl plVar) {
        copyOnWrite();
        ((pq) this.instance).setRouteGeometryParams(plVar);
    }

    public final void s(i.c.a.a.l lVar) {
        copyOnWrite();
        ((pq) this.instance).setRoutingLocationInfo(lVar);
    }

    public final void t(long j2) {
        copyOnWrite();
        ((pq) this.instance).setStartTime(j2);
    }

    public final void u(String str) {
        copyOnWrite();
        ((pq) this.instance).setTripId(str);
    }

    public final void v(String str) {
        copyOnWrite();
        ((pq) this.instance).setUseCase(str);
    }

    public final void w(String str) {
        copyOnWrite();
        ((pq) this.instance).setVehicleType(str);
    }

    public final void x() {
        copyOnWrite();
        ((pq) this.instance).setWithInstructions(true);
    }

    private pn() {
        throw null;
    }
}
