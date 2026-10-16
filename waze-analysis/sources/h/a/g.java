package h.a;

import j$.util.List;
import j$.util.Spliterator;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class g<E> extends a<E> implements List<E>, j$.util.List<E>, h.g.b.a.a {
    public static final c Companion = new c();
    private static final int maxArraySize = 2147483639;

    protected g() {
    }

    @Override // java.util.List
    public void add(int i2, E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void addFirst(E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void addLast(E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        g<E> gVar = this;
        Collection collection = (Collection) obj;
        h.g.b.x.f(gVar, "c");
        h.g.b.x.f(collection, "other");
        if (gVar.size() != collection.size()) {
            return false;
        }
        Iterator<E> it = collection.iterator();
        Iterator<E> it2 = gVar.iterator();
        while (it2.hasNext()) {
            if (!h.g.b.x.n(it2.next(), it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract E get(int i2);

    @Override // h.a.a
    public abstract int getSize();

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        g<E> gVar = this;
        h.g.b.x.f(gVar, "c");
        Iterator<E> it = gVar.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            E next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    public int indexOf(Object obj) {
        Iterator<E> it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (h.g.b.x.n(it.next(), obj)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // h.a.a, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new d(this);
    }

    public int lastIndexOf(Object obj) {
        g<E> gVar = this;
        ListIterator<E> listIterator = gVar.listIterator(gVar.size());
        while (listIterator.hasPrevious()) {
            if (h.g.b.x.n(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new e(this, 0);
    }

    @Override // java.util.List
    public E remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, j$.util.List
    public void replaceAll(UnaryOperator<E> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i2, E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, j$.util.List
    public void sort(Comparator<? super E> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // h.a.a, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    public java.util.List<E> subList(int i2, int i3) {
        return new f(this, i2, i3);
    }

    public ListIterator<E> listIterator(int i2) {
        return new e(this, i2);
    }
}
