package Nf;

import Ef.C0502n;
import Ef.InterfaceC0498l;
import Ef.N;
import Ef.R0;
import Jf.r;
import ef.C2515C;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jf.InterfaceC3108h;
import tf.q;

/* loaded from: classes5.dex */
public final class c implements InterfaceC0498l, R0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0502n f8678a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f8679b;

    public c(d dVar, C0502n c0502n) {
        this.f8679b = dVar;
        this.f8678a = c0502n;
    }

    @Override // Ef.InterfaceC0498l
    public final boolean a(Throwable th) {
        return this.f8678a.a(th);
    }

    @Override // Ef.R0
    public final void b(r rVar, int i5) {
        this.f8678a.b(rVar, i5);
    }

    @Override // Ef.InterfaceC0498l
    public final void g(Object obj, q qVar) throws N {
        C2515C c2515c = C2515C.f34653a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f8680h;
        d dVar = this.f8679b;
        atomicReferenceFieldUpdater.set(dVar, null);
        this.f8678a.n(c2515c, new Ff.d(1, dVar, this));
    }

    @Override // jf.InterfaceC3103c
    public final InterfaceC3108h getContext() {
        return this.f8678a.f3755e;
    }

    @Override // Ef.InterfaceC0498l
    public final boolean isActive() {
        return this.f8678a.isActive();
    }

    @Override // Ef.InterfaceC0498l
    public final H6.g m(Object obj, q qVar) {
        final d dVar = this.f8679b;
        q qVar2 = new q() { // from class: Nf.b
            @Override // tf.q
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f8680h;
                this.getClass();
                d dVar2 = dVar;
                atomicReferenceFieldUpdater.set(dVar2, null);
                dVar2.a(null);
                return C2515C.f34653a;
            }
        };
        H6.g gVarE = this.f8678a.E((C2515C) obj, qVar2);
        if (gVarE != null) {
            d.f8680h.set(dVar, null);
        }
        return gVarE;
    }

    @Override // Ef.InterfaceC0498l
    public final void n(Object obj, tf.l lVar) throws N {
        this.f8678a.n((C2515C) obj, lVar);
    }

    @Override // Ef.InterfaceC0498l
    public final void o(Object obj) throws N {
        this.f8678a.o(obj);
    }

    @Override // jf.InterfaceC3103c
    public final void resumeWith(Object obj) {
        this.f8678a.resumeWith(obj);
    }
}
