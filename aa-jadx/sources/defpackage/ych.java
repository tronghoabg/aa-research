package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ych extends defpackage.yck implements java.util.NavigableSet {
    final /* synthetic */ defpackage.ycs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ych(defpackage.ycs ycsVar, java.util.NavigableMap navigableMap) {
        super(ycsVar, navigableMap);
        this.b = ycsVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.yck
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.util.NavigableMap b() {
        return (java.util.NavigableMap) super.b();
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object ceiling(java.lang.Object obj) {
        return b().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final java.util.Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet descendingSet() {
        return new defpackage.ych(this.b, b().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object floor(java.lang.Object obj) {
        return b().floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet headSet(java.lang.Object obj, boolean z) {
        return new defpackage.ych(this.b, b().headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object higher(java.lang.Object obj) {
        return b().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object lower(java.lang.Object obj) {
        return b().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object pollFirst() {
        return defpackage.ysr.Z(iterator());
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object pollLast() {
        return defpackage.ysr.Z(descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet subSet(java.lang.Object obj, boolean z, java.lang.Object obj2, boolean z2) {
        return new defpackage.ych(this.b, b().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet tailSet(java.lang.Object obj, boolean z) {
        return new defpackage.ych(this.b, b().tailMap(obj, z));
    }

    @Override // defpackage.yck, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ java.util.SortedSet headSet(java.lang.Object obj) {
        return headSet(obj, false);
    }

    @Override // defpackage.yck, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // defpackage.yck, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ java.util.SortedSet tailSet(java.lang.Object obj) {
        return tailSet(obj, true);
    }
}
