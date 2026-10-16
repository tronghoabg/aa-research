package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class tcn<T> implements List<T>, afgd, afgc {
    public final List b;

    public tcn(List list) {
        list.getClass();
        this.b = list;
    }

    protected abstract void a();

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        boolean zAdd = this.b.add(t);
        a();
        return zAdd;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        collection.getClass();
        boolean zAddAll = this.b.addAll(i, collection);
        a();
        return zAddAll;
    }

    public final int b() {
        return this.b.size();
    }

    public final Object c(int i) {
        Object objRemove = this.b.remove(i);
        a();
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.b.clear();
        a();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.b.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.b.containsAll(collection);
    }

    @Override // java.util.List
    public final T get(int i) {
        return (T) this.b.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.b.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new tco(this, this.b.listIterator(i));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        boolean zRemove = this.b.remove(obj);
        a();
        return zRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        boolean zRemoveAll = this.b.removeAll(collection);
        a();
        return zRemoveAll;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean zRetainAll = this.b.retainAll(collection);
        a();
        return zRetainAll;
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        T t2 = (T) this.b.set(i, t);
        a();
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return b();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new tcm(this, this.b.subList(i, i2));
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) afet.b(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return afet.a(this);
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        this.b.add(i, t);
        a();
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        return (T) c(i);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        collection.getClass();
        boolean zAddAll = this.b.addAll(collection);
        a();
        return zAddAll;
    }
}
