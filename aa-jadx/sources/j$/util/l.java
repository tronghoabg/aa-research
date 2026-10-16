package j$.util;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends j$.util.k implements java.util.SortedSet, j$.util.SortedSet {
    private static final long serialVersionUID = 8695801310862127406L;
    public final java.util.SortedSet c;

    public l(java.util.SortedSet sortedSet) {
        super(sortedSet);
        this.c = sortedSet;
    }

    @Override // java.util.SortedSet
    public final java.util.Comparator comparator() {
        java.util.Comparator comparator;
        synchronized (this.b) {
            comparator = this.c.comparator();
        }
        return comparator;
    }

    @Override // java.util.SortedSet
    public final java.lang.Object first() {
        java.lang.Object objFirst;
        synchronized (this.b) {
            objFirst = this.c.first();
        }
        return objFirst;
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet headSet(java.lang.Object obj) {
        j$.util.l lVar;
        synchronized (this.b) {
            lVar = new j$.util.l(this.c.headSet(obj), this.b);
        }
        return lVar;
    }

    @Override // java.util.SortedSet
    public final java.lang.Object last() {
        java.lang.Object objLast;
        synchronized (this.b) {
            objLast = this.c.last();
        }
        return objLast;
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
        j$.util.l lVar;
        synchronized (this.b) {
            lVar = new j$.util.l(this.c.subSet(obj, obj2), this.b);
        }
        return lVar;
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet tailSet(java.lang.Object obj) {
        j$.util.l lVar;
        synchronized (this.b) {
            lVar = new j$.util.l(this.c.tailSet(obj), this.b);
        }
        return lVar;
    }

    public l(java.util.SortedSet sortedSet, java.lang.Object obj) {
        super(sortedSet, obj);
        this.c = sortedSet;
    }
}
