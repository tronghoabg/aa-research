package Ef;

import ef.C2515C;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: Ef.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0506p extends AbstractC0509q0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3759e;

    /* renamed from: f, reason: collision with root package name */
    public final C0502n f3760f;

    public /* synthetic */ C0506p(C0502n c0502n, int i5) {
        this.f3759e = i5;
        this.f3760f = c0502n;
    }

    @Override // Ef.AbstractC0509q0
    public final boolean i() {
        switch (this.f3759e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // Ef.AbstractC0509q0
    public final void j(Throwable th) {
        switch (this.f3759e) {
            case 0:
                z0 z0VarH = h();
                C0502n c0502n = this.f3760f;
                Throwable thR = c0502n.r(z0VarH);
                if (c0502n.x()) {
                    Jf.f fVar = (Jf.f) c0502n.f3754d;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Jf.f.f6108h;
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        H6.g gVar = Jf.b.f6099c;
                        if (AbstractC3340k.a(obj, gVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, gVar, thR)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != gVar) {
                                    break;
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                c0502n.a(thR);
                if (!c0502n.x()) {
                    c0502n.p();
                    break;
                }
                break;
            default:
                this.f3760f.resumeWith(C2515C.f34653a);
                break;
        }
    }
}
