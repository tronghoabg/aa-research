package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aevb<K> implements java.io.Serializable, java.lang.Cloneable, j$.util.Iterator<K>, defpackage.aevi {
    private static final long serialVersionUID = -7046029254386353129L;

    protected aevb() {
    }

    private java.lang.Object readResolve() {
        return defpackage.aeve.a;
    }

    @Override // defpackage.aevi, java.util.ListIterator
    public final /* synthetic */ void add(java.lang.Object obj) {
        defpackage.adrs.aI();
    }

    public final java.lang.Object clone() {
        return defpackage.aeve.a;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.ListIterator, defpackage.aefd
    public final boolean hasPrevious() {
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final K next() {
        throw new java.util.NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return 0;
    }

    @Override // java.util.ListIterator, defpackage.aefd
    public final K previous() {
        throw new java.util.NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return -1;
    }

    @Override // defpackage.aevi, java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ void remove() {
        defpackage.adrs.aJ();
    }

    @Override // defpackage.aevi, java.util.ListIterator
    public final /* synthetic */ void set(java.lang.Object obj) {
        defpackage.adrs.aK();
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final void forEachRemaining(java.util.function.Consumer consumer) {
    }
}
