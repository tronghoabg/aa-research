package defpackage;

import java.util.AbstractSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class afaw<E> extends AbstractSet<E> implements Set<E>, afgh {
    protected afaw() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean add(E e);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
