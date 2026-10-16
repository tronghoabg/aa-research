package kotlinx.coroutines.e;

import kotlinx.coroutines.dc;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aq<T> implements dc<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f51876a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadLocal f51877b;

    /* renamed from: c, reason: collision with root package name */
    private final h.c.i f51878c;

    public aq(Object obj, ThreadLocal threadLocal) {
        this.f51876a = obj;
        this.f51877b = threadLocal;
        this.f51878c = new ar(threadLocal);
    }

    @Override // h.c.j
    public final /* bridge */ <R> R fold(R r, h.g.a.p<? super R, ? super h.c.h, ? extends R> pVar) {
        return (R) h.c.a.h.e(this, r, pVar);
    }

    @Override // h.c.h, h.c.j
    public final <E extends h.c.h> E get(h.c.i<E> iVar) {
        if (h.g.b.x.n(this.f51878c, iVar)) {
            return this;
        }
        return null;
    }

    @Override // h.c.h
    public final h.c.i<?> getKey() {
        return this.f51878c;
    }

    @Override // h.c.j
    public final h.c.j minusKey(h.c.i<?> iVar) {
        return h.g.b.x.n(this.f51878c, iVar) ? h.c.k.f48060a : this;
    }

    @Override // h.c.j
    public final /* bridge */ h.c.j plus(h.c.j jVar) {
        return h.c.a.h.h(this, jVar);
    }

    @Override // kotlinx.coroutines.dc
    public final void restoreThreadContext(h.c.j jVar, T t) {
        this.f51877b.set(t);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f51876a + ", threadLocal = " + this.f51877b + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.dc
    public final T updateThreadContext(h.c.j jVar) {
        ThreadLocal threadLocal = this.f51877b;
        Object obj = this.f51876a;
        T t = (T) threadLocal.get();
        threadLocal.set(obj);
        return t;
    }
}
