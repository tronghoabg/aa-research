package kotlinx.coroutines.a;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.cf;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class p extends kotlinx.coroutines.a implements o {

    /* renamed from: c, reason: collision with root package name */
    private final o f51320c;

    public p(h.c.j jVar, o oVar) {
        super(jVar, true);
        this.f51320c = oVar;
    }

    @Override // kotlinx.coroutines.a.af
    public final kotlinx.coroutines.g.e A() {
        return this.f51320c.A();
    }

    @Override // kotlinx.coroutines.a.af
    public final kotlinx.coroutines.g.e B() {
        return this.f51320c.B();
    }

    @Override // kotlinx.coroutines.cf
    public final void H(Throwable th) throws Throwable {
        CancellationException cancellationExceptionT = cf.T(this, th);
        this.f51320c.s(cancellationExceptionT);
        M(cancellationExceptionT);
    }

    @Override // kotlinx.coroutines.a.af
    public final Object d(h.c.e eVar) {
        return this.f51320c.d(eVar);
    }

    @Override // kotlinx.coroutines.a.af
    public final Object e(h.c.e eVar) {
        Object objE = this.f51320c.e(eVar);
        h.c.a.a aVar = h.c.a.a.f48038a;
        return objE;
    }

    @Override // kotlinx.coroutines.a.ag
    public final Object g(Object obj, h.c.e eVar) {
        return this.f51320c.g(obj, eVar);
    }

    @Override // kotlinx.coroutines.a.af
    public final Object h() {
        return this.f51320c.h();
    }

    @Override // kotlinx.coroutines.a.ag
    public final Object i(Object obj) {
        return this.f51320c.i(obj);
    }

    protected final o j() {
        return this.f51320c;
    }

    @Override // kotlinx.coroutines.a.af
    public final q p() {
        return this.f51320c.p();
    }

    @Override // kotlinx.coroutines.cf, kotlinx.coroutines.br, kotlinx.coroutines.a.af
    public final void s(CancellationException cancellationException) throws Throwable {
        if (u()) {
            return;
        }
        if (cancellationException == null) {
            p pVar = this;
            cancellationException = new bs(pVar.bO(), null, pVar);
        }
        H(cancellationException);
    }

    @Override // kotlinx.coroutines.a.ag
    public final void t(h.g.a.l lVar) {
        this.f51320c.t(lVar);
    }

    @Override // kotlinx.coroutines.a.ag
    public final boolean v(Throwable th) {
        return this.f51320c.v(th);
    }

    @Override // kotlinx.coroutines.a.ag
    public final boolean y() {
        return this.f51320c.y();
    }
}
