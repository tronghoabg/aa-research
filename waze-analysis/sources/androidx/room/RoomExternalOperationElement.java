package androidx.room;

import h.c.h;
import h.c.i;
import h.c.j;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class RoomExternalOperationElement implements h, i {
    public static final RoomExternalOperationElement INSTANCE = new RoomExternalOperationElement();

    private RoomExternalOperationElement() {
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
    public i<RoomExternalOperationElement> getKey() {
        return INSTANCE;
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
