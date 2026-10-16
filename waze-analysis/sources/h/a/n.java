package h.a;

import java.util.AbstractCollection;
import java.util.Collection;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class n<E> extends AbstractCollection<E> implements Collection<E>, h.g.b.a.b {
    protected n() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean add(E e2);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }
}
