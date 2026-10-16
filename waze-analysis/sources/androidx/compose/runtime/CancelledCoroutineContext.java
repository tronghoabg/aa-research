package androidx.compose.runtime;

import h.c.h;
import h.c.i;
import h.c.j;
import h.g.a.p;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class CancelledCoroutineContext implements h {
    public static final Key Key = new Key(null);

    @Override // h.c.j
    public /* bridge */ <R> R fold(R r, p<? super R, ? super h, ? extends R> pVar) {
        return (R) h.c.a.h.e(this, r, pVar);
    }

    @Override // h.c.h, h.c.j
    public /* bridge */ <E extends h> E get(i<E> iVar) {
        return (E) h.c.a.h.f(this, iVar);
    }

    @Override // h.c.h
    public i<?> getKey() {
        return Key;
    }

    @Override // h.c.j
    public /* bridge */ j minusKey(i<?> iVar) {
        return h.c.a.h.g(this, iVar);
    }

    @Override // h.c.j
    public /* bridge */ j plus(j jVar) {
        return h.c.a.h.h(this, jVar);
    }

    /* compiled from: WazeSource */
    public final class Key implements i<CancelledCoroutineContext> {
        private Key() {
        }

        public /* synthetic */ Key(o oVar) {
            this();
        }
    }
}
