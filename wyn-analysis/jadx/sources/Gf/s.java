package Gf;

import Ef.AbstractC0476a;
import Ef.C0503n0;
import Ef.H;
import Ef.z0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;

/* loaded from: classes5.dex */
public final class s extends AbstractC0476a implements t, i {

    /* renamed from: d, reason: collision with root package name */
    public final e f4839d;

    public s(InterfaceC3108h interfaceC3108h, e eVar) {
        super(interfaceC3108h, true);
        this.f4839d = eVar;
    }

    @Override // Ef.AbstractC0476a
    public final void Y(boolean z2, Throwable th) {
        if (this.f4839d.k(false, th) || z2) {
            return;
        }
        H.w(this.f3710c, th);
    }

    @Override // Ef.AbstractC0476a
    public final void Z(Object obj) {
        this.f4839d.h(null);
    }

    public final boolean b0(Throwable th) {
        return this.f4839d.k(false, th);
    }

    @Override // Gf.w
    public final Object c(Object obj) {
        return this.f4839d.c(obj);
    }

    public final void c0(r rVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        e eVar = this.f4839d;
        eVar.getClass();
        do {
            atomicReferenceFieldUpdater = e.f4801j;
            if (atomicReferenceFieldUpdater.compareAndSet(eVar, null, rVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(eVar) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(eVar);
            H6.g gVar = g.f4819q;
            if (obj != gVar) {
                if (obj == g.f4820r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            H6.g gVar2 = g.f4820r;
            while (!atomicReferenceFieldUpdater.compareAndSet(eVar, gVar, gVar2)) {
                if (atomicReferenceFieldUpdater.get(eVar) != gVar) {
                    break;
                }
            }
            rVar.invoke(eVar.p());
            return;
        }
    }

    @Override // Ef.z0, Ef.InterfaceC0501m0
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C0503n0(this, t(), null);
        }
        r(cancellationException);
    }

    @Override // Gf.v
    public final Object e(If.t tVar) {
        e eVar = this.f4839d;
        eVar.getClass();
        Object objB = e.B(eVar, tVar);
        kf.a aVar = kf.a.f39711a;
        return objB;
    }

    @Override // Gf.v
    public final Object f() {
        return this.f4839d.f();
    }

    @Override // Gf.w
    public final Object i(Object obj, InterfaceC3103c interfaceC3103c) {
        return this.f4839d.i(obj, interfaceC3103c);
    }

    @Override // Gf.v
    public final Object j(InterfaceC3103c interfaceC3103c) {
        return this.f4839d.j(interfaceC3103c);
    }

    @Override // Ef.z0
    public final void r(CancellationException cancellationException) {
        CancellationException cancellationExceptionV = z0.V(this, cancellationException);
        this.f4839d.k(true, cancellationExceptionV);
        q(cancellationExceptionV);
    }
}
