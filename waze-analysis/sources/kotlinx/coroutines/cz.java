package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
class cz extends a implements cq {
    public cz(h.c.j jVar, boolean z) {
        super(jVar, z);
    }

    @Override // kotlinx.coroutines.cf
    protected final boolean O(Throwable th) {
        h.f.s.h(getContext(), th);
        return true;
    }

    @Override // h.c.b.a.d
    public final /* bridge */ h.c.b.a.d getCallerFrame() {
        return aj.T(this);
    }

    @Override // h.c.b.a.d
    public final /* bridge */ StackTraceElement getStackTraceElement() {
        return cw.a(this);
    }

    @Override // kotlinx.coroutines.cy
    public final /* bridge */ StackTraceElement j() {
        return cy.f51826b.c();
    }
}
