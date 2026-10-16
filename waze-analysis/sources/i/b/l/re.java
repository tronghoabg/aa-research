package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class re extends com.google.v.dm<rf, re> implements rg {
    /* synthetic */ re(byte[] bArr) {
        super(rf.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((rf) this.instance).addAllGeometryPoints(iterable);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((rf) this.instance).setAlertId(j2);
    }

    public final void c(i.b.j jVar) {
        copyOnWrite();
        ((rf) this.instance).setAlertSubType(jVar);
    }

    public final void d(i.b.l lVar) {
        copyOnWrite();
        ((rf) this.instance).setAlertType(lVar);
    }

    public final void e(int i2) {
        copyOnWrite();
        ((rf) this.instance).setDuration(i2);
    }

    public final void f(boolean z) {
        copyOnWrite();
        ((rf) this.instance).setIsMajorEvent(z);
    }

    public final void g(boolean z) {
        copyOnWrite();
        ((rf) this.instance).setIsPartialLaneClosure(z);
    }

    public final void h(long j2) {
        copyOnWrite();
        ((rf) this.instance).setJamId(j2);
    }

    public final void i(i.b.p pVar) {
        copyOnWrite();
        ((rf) this.instance).setLocation(pVar.build());
    }

    public final void j(i.b.s sVar) {
        copyOnWrite();
        ((rf) this.instance).setLocation(sVar);
    }

    public final void k(double d2) {
        copyOnWrite();
        ((rf) this.instance).setRatioOnRoadEnd(d2);
    }

    public final void l(double d2) {
        copyOnWrite();
        ((rf) this.instance).setRatioOnRoadStart(d2);
    }

    public final void m(int i2) {
        copyOnWrite();
        ((rf) this.instance).setRoadInfoSeverity(i2);
    }

    private re() {
        throw null;
    }
}
