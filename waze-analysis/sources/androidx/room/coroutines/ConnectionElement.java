package androidx.room.coroutines;

import h.c.h;
import h.c.i;
import h.c.j;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ConnectionElement implements h {
    private final PooledConnectionImpl connectionWrapper;
    private final i<ConnectionElement> key;

    public ConnectionElement(i<ConnectionElement> iVar, PooledConnectionImpl pooledConnectionImpl) {
        x.f(iVar, "key");
        x.f(pooledConnectionImpl, "connectionWrapper");
        this.key = iVar;
        this.connectionWrapper = pooledConnectionImpl;
    }

    @Override // h.c.j
    public <R> R fold(R r, p<? super R, ? super h, ? extends R> pVar) {
        return (R) h.c.a.h.e(this, r, pVar);
    }

    @Override // h.c.h, h.c.j
    public <E extends h> E get(i<E> iVar) {
        return (E) h.c.a.h.f(this, iVar);
    }

    public final PooledConnectionImpl getConnectionWrapper() {
        return this.connectionWrapper;
    }

    @Override // h.c.h
    public i<ConnectionElement> getKey() {
        return this.key;
    }

    @Override // h.c.j
    public j minusKey(i<?> iVar) {
        return h.c.a.h.g(this, iVar);
    }

    @Override // h.c.j
    public j plus(j jVar) {
        return h.c.a.h.h(this, jVar);
    }
}
