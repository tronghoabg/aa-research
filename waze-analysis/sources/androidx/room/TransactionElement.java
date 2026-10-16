package androidx.room;

import h.c.g;
import h.c.h;
import h.c.i;
import h.c.j;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class TransactionElement implements h {
    public static final Key Key = new Key(null);
    private final g transactionDispatcher;

    public TransactionElement(g gVar) {
        x.f(gVar, "transactionDispatcher");
        this.transactionDispatcher = gVar;
    }

    @Override // h.c.j
    public <R> R fold(R r, p<? super R, ? super h, ? extends R> pVar) {
        return (R) h.c.a.h.e(this, r, pVar);
    }

    @Override // h.c.h, h.c.j
    public <E extends h> E get(i<E> iVar) {
        return (E) h.c.a.h.f(this, iVar);
    }

    @Override // h.c.h
    public i<TransactionElement> getKey() {
        return Key;
    }

    public final g getTransactionDispatcher$room_runtime() {
        return this.transactionDispatcher;
    }

    @Override // h.c.j
    public j minusKey(i<?> iVar) {
        return h.c.a.h.g(this, iVar);
    }

    @Override // h.c.j
    public j plus(j jVar) {
        return h.c.a.h.h(this, jVar);
    }

    /* compiled from: WazeSource */
    public final class Key implements i<TransactionElement> {
        private Key() {
        }

        public /* synthetic */ Key(o oVar) {
            this();
        }
    }
}
