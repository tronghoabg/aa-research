package defpackage;

/* JADX INFO: loaded from: classes3.dex */
class yck extends defpackage.ycf implements java.util.SortedSet {
    final /* synthetic */ defpackage.ycs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yck(defpackage.ycs ycsVar, java.util.SortedMap sortedMap) {
        super(ycsVar, sortedMap);
        this.c = ycsVar;
    }

    public java.util.SortedMap b() {
        return (java.util.SortedMap) this.d;
    }

    @Override // java.util.SortedSet
    public final java.util.Comparator comparator() {
        return b().comparator();
    }

    @Override // java.util.SortedSet
    public final java.lang.Object first() {
        return b().firstKey();
    }

    public java.util.SortedSet headSet(java.lang.Object obj) {
        return new defpackage.yck(this.c, b().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final java.lang.Object last() {
        return b().lastKey();
    }

    public java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
        return new defpackage.yck(this.c, b().subMap(obj, obj2));
    }

    public java.util.SortedSet tailSet(java.lang.Object obj) {
        return new defpackage.yck(this.c, b().tailMap(obj));
    }
}
