package Ef;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: Ef.q0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0509q0 extends Jf.j implements U, InterfaceC0491h0 {

    /* renamed from: d, reason: collision with root package name */
    public z0 f3762d;

    @Override // Ef.InterfaceC0491h0
    public final C0 b() {
        return null;
    }

    @Override // Ef.U
    public final void dispose() {
        z0 z0VarH = h();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z0.f3793a;
            Object obj = atomicReferenceFieldUpdater.get(z0VarH);
            if (obj instanceof AbstractC0509q0) {
                if (obj != this) {
                    return;
                }
                W w2 = H.f3677j;
                while (!atomicReferenceFieldUpdater.compareAndSet(z0VarH, obj, w2)) {
                    if (atomicReferenceFieldUpdater.get(z0VarH) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof InterfaceC0491h0) || ((InterfaceC0491h0) obj).b() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = Jf.j.f6120a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof Jf.o) {
                    Jf.j jVar = ((Jf.o) obj2).f6133a;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                Jf.j jVar2 = (Jf.j) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = Jf.j.f6122c;
                Jf.o oVar = (Jf.o) atomicReferenceFieldUpdater3.get(jVar2);
                if (oVar == null) {
                    oVar = new Jf.o(jVar2);
                    atomicReferenceFieldUpdater3.set(jVar2, oVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, oVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                jVar2.d();
                return;
            }
        }
    }

    public InterfaceC0501m0 getParent() {
        return h();
    }

    public final z0 h() {
        z0 z0Var = this.f3762d;
        if (z0Var != null) {
            return z0Var;
        }
        AbstractC3340k.m("job");
        throw null;
    }

    public abstract boolean i();

    @Override // Ef.InterfaceC0491h0
    public final boolean isActive() {
        return true;
    }

    public abstract void j(Throwable th);

    @Override // Jf.j
    public final String toString() {
        return getClass().getSimpleName() + '@' + H.t(this) + "[job@" + H.t(h()) + ']';
    }
}
