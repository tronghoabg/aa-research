package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public abstract class yef<E> extends yec<E> implements List<E> {
    protected yef() {
    }

    @Override // defpackage.yec
    protected /* bridge */ /* synthetic */ Collection a() {
        throw null;
    }

    @Override // java.util.List
    public void add(int i, E e) {
        c().add(i, e);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        return c().addAll(i, collection);
    }

    protected abstract List c();

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return obj == this || c().equals(obj);
    }

    @Override // java.util.List
    public final E get(int i) {
        return (E) c().get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return c().hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return c().indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return c().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return c().listIterator();
    }

    @Override // java.util.List
    public final E remove(int i) {
        return (E) c().remove(i);
    }

    @Override // java.util.List
    public E set(int i, E e) {
        return (E) c().set(i, e);
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        return c().subList(i, i2);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return c().listIterator(i);
    }
}
