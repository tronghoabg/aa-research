package j$.util;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class l extends k implements java.util.SortedSet, SortedSet {
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
    public final Object first() {
        Object objFirst;
        synchronized (this.b) {
            objFirst = this.c.first();
        }
        return objFirst;
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet headSet(Object obj) {
        l lVar;
        synchronized (this.b) {
            lVar = new l(this.c.headSet(obj), this.b);
        }
        return lVar;
    }

    @Override // java.util.SortedSet
    public final Object last() {
        Object objLast;
        synchronized (this.b) {
            objLast = this.c.last();
        }
        return objLast;
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet subSet(Object obj, Object obj2) {
        l lVar;
        synchronized (this.b) {
            lVar = new l(this.c.subSet(obj, obj2), this.b);
        }
        return lVar;
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet tailSet(Object obj) {
        l lVar;
        synchronized (this.b) {
            lVar = new l(this.c.tailSet(obj), this.b);
        }
        return lVar;
    }

    public l(java.util.SortedSet sortedSet, Object obj) {
        super(sortedSet, obj);
        this.c = sortedSet;
    }
}
