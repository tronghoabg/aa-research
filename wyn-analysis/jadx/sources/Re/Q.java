package Re;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class Q extends He.c {

    /* renamed from: b, reason: collision with root package name */
    public final He.c f10695b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f10696c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10697d;

    /* renamed from: e, reason: collision with root package name */
    public final N f10698e;

    public Q(N n10, He.c cVar, AtomicReference atomicReference, int i5) {
        this.f10698e = n10;
        this.f10695b = cVar;
        this.f10696c = atomicReference;
        this.f10697d = i5;
    }

    @Override // He.c
    public final void e(He.f fVar) {
        this.f10698e.a(fVar);
    }

    public final void f() {
        P p10;
        loop0: while (true) {
            AtomicReference atomicReference = this.f10696c;
            p10 = (P) atomicReference.get();
            if (p10 != null && !p10.f()) {
                break;
            }
            P p11 = new P(atomicReference, this.f10697d);
            while (!atomicReference.compareAndSet(p10, p11)) {
                if (atomicReference.get() != p10) {
                    break;
                }
            }
            p10 = p11;
            break loop0;
        }
        AtomicBoolean atomicBoolean = p10.f10690d;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        this.f10695b.d(p10);
    }
}
