package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class ab extends h.c.a implements h.c.g {
    public static final aa Key = new aa();

    public ab() {
        super(h.c.g.f48059a);
    }

    public static /* synthetic */ ab limitedParallelism$default(ab abVar, int i2, String str, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i3 & 2) != 0) {
            str = null;
        }
        return abVar.limitedParallelism(i2, str);
    }

    public abstract void dispatch(h.c.j jVar, Runnable runnable);

    public void dispatchYield(h.c.j jVar, Runnable runnable) {
        kotlinx.coroutines.e.k.c(this, jVar, runnable);
    }

    @Override // h.c.a, h.c.h, h.c.j
    public /* bridge */ <E extends h.c.h> E get(h.c.i<E> iVar) {
        h.g.b.x.f(iVar, "key");
        if (!(iVar instanceof h.c.b)) {
            if (h.c.g.f48059a == iVar) {
                return this;
            }
            return null;
        }
        h.c.b bVar = (h.c.b) iVar;
        if (!bVar.b(getKey())) {
            return null;
        }
        E e2 = (E) bVar.a(this);
        if (e2 instanceof h.c.h) {
            return e2;
        }
        return null;
    }

    @Override // h.c.g
    public final <T> h.c.e<T> interceptContinuation(h.c.e<? super T> eVar) {
        return new kotlinx.coroutines.e.j(this, eVar);
    }

    public boolean isDispatchNeeded(h.c.j jVar) {
        return true;
    }

    public ab limitedParallelism(int i2, String str) {
        h.g.b.au.m(i2);
        return new kotlinx.coroutines.e.v(this, i2, str);
    }

    @Override // h.c.a, h.c.j
    public /* bridge */ h.c.j minusKey(h.c.i<?> iVar) {
        h.g.b.x.f(iVar, "key");
        if (!(iVar instanceof h.c.b)) {
            return h.c.g.f48059a == iVar ? h.c.k.f48060a : this;
        }
        h.c.b bVar = (h.c.b) iVar;
        return (!bVar.b(getKey()) || bVar.a(this) == null) ? this : h.c.k.f48060a;
    }

    @Override // h.c.g
    public final void releaseInterceptedContinuation(h.c.e<?> eVar) {
        h.g.b.x.d(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((kotlinx.coroutines.e.j) eVar).d();
    }

    public String toString() {
        return aj.a(this) + "@" + aj.b(this);
    }

    public /* synthetic */ ab limitedParallelism(int i2) {
        return limitedParallelism(i2, null);
    }

    public final ab plus(ab abVar) {
        return abVar;
    }
}
