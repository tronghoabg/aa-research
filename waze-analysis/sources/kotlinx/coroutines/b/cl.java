package kotlinx.coroutines.b;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class cl extends kotlinx.coroutines.b.a.d<cj<?>> {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f51662a = new AtomicReference(null);

    @Override // kotlinx.coroutines.b.a.d
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        AtomicReference atomicReference = this.f51662a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(ck.f51660a);
        return true;
    }

    @Override // kotlinx.coroutines.b.a.d
    public final /* bridge */ /* synthetic */ h.c.e[] b(Object obj) {
        this.f51662a.set(null);
        return kotlinx.coroutines.b.a.c.f51403a;
    }

    public final Object c(h.c.e eVar) {
        kotlinx.coroutines.l lVar = new kotlinx.coroutines.l(h.c.a.h.d(eVar), 1);
        lVar.u();
        kotlinx.coroutines.l lVar2 = lVar;
        int i2 = kotlinx.coroutines.ai.f51347a;
        if (!a.a.c(this.f51662a, ck.f51660a, lVar2)) {
            lVar2.resumeWith(h.ab.f48028a);
        }
        Object objJ = lVar.j();
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (objJ == aVar) {
            h.d.b.c(eVar);
        }
        return objJ == aVar ? objJ : h.ab.f48028a;
    }

    public final void d() {
        while (true) {
            AtomicReference atomicReference = this.f51662a;
            Object obj = atomicReference.get();
            if (obj == null || obj == ck.f51661b) {
                return;
            }
            if (obj == ck.f51660a) {
                if (a.a.c(atomicReference, obj, ck.f51661b)) {
                    return;
                }
            } else if (a.a.c(atomicReference, obj, ck.f51660a)) {
                ((kotlinx.coroutines.l) obj).resumeWith(h.ab.f48028a);
                return;
            }
        }
    }

    public final boolean e() {
        Object andSet = this.f51662a.getAndSet(ck.f51660a);
        if (andSet == null) {
            h.g.b.x.g();
        }
        int i2 = kotlinx.coroutines.ai.f51347a;
        return andSet == ck.f51661b;
    }
}
