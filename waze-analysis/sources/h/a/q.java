package h.a;

import java.util.AbstractSet;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class q<E> extends AbstractSet<E> implements Set<E>, h.g.b.a.f {
    protected q() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean add(E e2);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
