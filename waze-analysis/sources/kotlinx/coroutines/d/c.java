package kotlinx.coroutines.d;

import h.c.j;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.cq;
import kotlinx.coroutines.cw;
import kotlinx.coroutines.cy;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c extends kotlinx.coroutines.a implements cq {

    /* renamed from: c, reason: collision with root package name */
    public final b f51832c;

    public c(j jVar) {
        super(jVar, true);
        this.f51832c = new b(this);
    }

    @Override // kotlinx.coroutines.a
    protected final void bR(Throwable th, boolean z) {
        this.f51832c.b(th);
    }

    @Override // kotlinx.coroutines.a
    protected final void f(Object obj) {
        this.f51832c.a(obj);
    }

    @Override // h.c.b.a.d
    public final /* synthetic */ h.c.b.a.d getCallerFrame() {
        return aj.T(this);
    }

    @Override // h.c.b.a.d
    public final /* synthetic */ StackTraceElement getStackTraceElement() {
        return cw.a(this);
    }

    @Override // kotlinx.coroutines.cy
    public final /* synthetic */ StackTraceElement j() {
        return cy.f51826b.b();
    }
}
