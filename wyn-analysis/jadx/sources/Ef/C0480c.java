package Ef;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Ef.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0480c extends AbstractC0509q0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3716h = AtomicReferenceFieldUpdater.newUpdater(C0480c.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final C0502n f3717e;

    /* renamed from: f, reason: collision with root package name */
    public U f3718f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0484e f3719g;

    public C0480c(C0484e c0484e, C0502n c0502n) {
        this.f3719g = c0484e;
        this.f3717e = c0502n;
    }

    @Override // Ef.AbstractC0509q0
    public final boolean i() {
        return false;
    }

    @Override // Ef.AbstractC0509q0
    public final void j(Throwable th) throws N {
        C0502n c0502n = this.f3717e;
        if (th != null) {
            c0502n.getClass();
            H6.g gVarE = c0502n.E(new C0517x(false, th), null);
            if (gVarE != null) {
                c0502n.o(gVarE);
                C0482d c0482d = (C0482d) f3716h.get(this);
                if (c0482d != null) {
                    c0482d.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0484e.f3725b;
        C0484e c0484e = this.f3719g;
        if (atomicIntegerFieldUpdater.decrementAndGet(c0484e) == 0) {
            K[] kArr = c0484e.f3726a;
            ArrayList arrayList = new ArrayList(kArr.length);
            for (K k : kArr) {
                arrayList.add(k.getCompleted());
            }
            c0502n.resumeWith(arrayList);
        }
    }
}
