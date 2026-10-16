package h.c;

import h.g.a.p;
import h.g.b.x;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k implements Serializable, j {

    /* renamed from: a, reason: collision with root package name */
    public static final k f48060a = new k();
    private static final long serialVersionUID = 0;

    private k() {
    }

    private final Object readResolve() {
        return f48060a;
    }

    @Override // h.c.j
    public final <R> R fold(R r, p<? super R, ? super h, ? extends R> pVar) {
        x.f(pVar, "operation");
        return r;
    }

    @Override // h.c.j
    public final <E extends h> E get(i<E> iVar) {
        x.f(iVar, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // h.c.j
    public final j minusKey(i<?> iVar) {
        x.f(iVar, "key");
        return this;
    }

    @Override // h.c.j
    public final j plus(j jVar) {
        x.f(jVar, "context");
        return jVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
