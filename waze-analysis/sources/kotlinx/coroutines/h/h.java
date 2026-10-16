package kotlinx.coroutines.h;

import h.ab;
import h.g.b.au;
import java.util.Objects;
import kotlinx.coroutines.ai;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class h extends m implements a {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.a.d f52029a;

    public h(boolean z) {
        super(1, z ? 1 : 0);
        this.f52029a = h.e.b.h(z ? null : i.f52030a);
    }

    private final int h(Object obj) {
        while (isLocked()) {
            Object objB = this.f52029a.b();
            if (objB != i.f52030a) {
                return objB == obj ? 1 : 2;
            }
        }
        return 0;
    }

    @Override // kotlinx.coroutines.h.a
    public final kotlinx.coroutines.g.f<Object, a> getOnLock() {
        au.h(f.f52027a, 3);
        au.h(g.f52028a, 3);
        return new kotlinx.coroutines.g.g();
    }

    @Override // kotlinx.coroutines.h.a
    public final boolean holdsLock(Object obj) {
        return h(obj) == 1;
    }

    @Override // kotlinx.coroutines.h.a
    public final boolean isLocked() {
        return b() == 0;
    }

    @Override // kotlinx.coroutines.h.a
    public final Object lock(Object obj, h.c.e<? super ab> eVar) {
        if (tryLock(obj)) {
            return ab.f48028a;
        }
        kotlinx.coroutines.l lVarK = bo.k(h.c.a.h.d(eVar));
        try {
            e(new d(this, lVarK, obj));
            Object objJ = lVarK.j();
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (objJ == aVar) {
                h.d.b.c(eVar);
            }
            if (objJ != aVar) {
                objJ = ab.f48028a;
            }
            return objJ != aVar ? ab.f48028a : objJ;
        } catch (Throwable th) {
            lVarK.x();
            throw th;
        }
    }

    public final String toString() {
        kotlinx.a.d dVar = this.f52029a;
        return "Mutex@" + aj.b(this) + "[isLocked=" + isLocked() + ",owner=" + dVar.b() + "]";
    }

    @Override // kotlinx.coroutines.h.a
    public final boolean tryLock(Object obj) {
        while (!f()) {
            if (obj == null) {
                return false;
            }
            int iH = h(obj);
            if (iH == 1) {
                Objects.toString(obj);
                throw new IllegalStateException("This mutex is already locked by the specified owner: ".concat(obj.toString()));
            }
            if (iH == 2) {
                return false;
            }
        }
        int i2 = ai.f51347a;
        this.f52029a.d(obj);
        return true;
    }

    @Override // kotlinx.coroutines.h.a
    public final void unlock(Object obj) {
        while (isLocked()) {
            kotlinx.a.d dVar = this.f52029a;
            Object objB = dVar.b();
            if (objB != i.f52030a) {
                if (objB != obj && obj != null) {
                    throw new IllegalStateException("This mutex is locked by " + objB + ", but " + obj + " is expected");
                }
                if (dVar.e(objB, i.f52030a)) {
                    d();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }
}
