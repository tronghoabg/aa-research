package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class yec<E> extends yel implements Collection<E> {
    protected yec() {
    }

    protected abstract Collection a();

    public boolean add(E e) {
        return a().add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        return a().addAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        a().clear();
    }

    public boolean contains(Object obj) {
        return a().contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return a().containsAll(collection);
    }

    public final boolean e(Object obj) {
        return yrm.ae(iterator(), obj);
    }

    protected final Object[] f() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return a().iterator();
    }

    public boolean remove(Object obj) {
        return a().remove(obj);
    }

    public boolean removeAll(Collection collection) {
        return a().removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        return a().retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return a().size();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return a().toArray();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) a().toArray(tArr);
    }
}
