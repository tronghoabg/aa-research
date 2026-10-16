package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class afbr<E> extends defpackage.afbm<E> implements java.util.List<E>, j$.util.List<E>, defpackage.afhc {
    protected afbr() {
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection<? extends E> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addFirst(java.lang.Object obj) {
        defpackage.a.m();
    }

    public final void addLast(java.lang.Object obj) {
        defpackage.a.m();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.List)) {
            return false;
        }
        java.util.Collection collection = (java.util.Collection) obj;
        collection.getClass();
        if (size() != collection.size()) {
            return false;
        }
        java.util.Iterator<E> it = collection.iterator();
        java.util.Iterator<E> it2 = iterator();
        while (it2.hasNext()) {
            if (!defpackage.afga.f(it2.next(), it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public abstract E get(int i);

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        java.util.Iterator<E> it = iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            E next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object obj) {
        java.util.Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (defpackage.afga.f(it.next(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<E> iterator() {
        return new defpackage.afbo(this);
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        java.util.ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (defpackage.afga.f(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator() {
        return new afbp(this, 0);
    }

    @Override // java.util.List
    public final E remove(int i) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final java.lang.Object removeFirst() {
        return defpackage.a.aU();
    }

    public final java.lang.Object removeLast() {
        return defpackage.a.aU();
    }

    @Override // java.util.List
    public final void replaceAll(java.util.function.UnaryOperator<E> unaryOperator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final E set(int i, E e) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void sort(java.util.Comparator<? super E> comparator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.afbm, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ j$.util.Spliterator spliterator() {
        return j$.util.List.-CC.$default$spliterator(this);
    }

    @Override // java.util.List
    public java.util.List subList(int i, int i2) {
        return new afbq(this, i, i2);
    }

    @Override // java.util.List
    public java.util.ListIterator<E> listIterator(int i) {
        return new afbp(this, i);
    }
}
