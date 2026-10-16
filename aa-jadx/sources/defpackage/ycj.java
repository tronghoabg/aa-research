package defpackage;

/* JADX INFO: loaded from: classes3.dex */
class ycj extends defpackage.ycc implements java.util.SortedMap {
    java.util.SortedSet d;
    final /* synthetic */ defpackage.ycs e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ycj(defpackage.ycs ycsVar, java.util.SortedMap sortedMap) {
        super(ycsVar, sortedMap);
        this.e = ycsVar;
    }

    @Override // java.util.SortedMap
    public final java.util.Comparator comparator() {
        return h().comparator();
    }

    @Override // java.util.SortedMap
    public final java.lang.Object firstKey() {
        return h().firstKey();
    }

    public java.util.SortedMap h() {
        return (java.util.SortedMap) this.a;
    }

    public java.util.SortedMap headMap(java.lang.Object obj) {
        return new defpackage.ycj(this.e, h().headMap(obj));
    }

    @Override // defpackage.ylw
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public java.util.SortedSet g() {
        return new defpackage.yck(this.e, h());
    }

    @Override // defpackage.ycc, defpackage.ylw, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public java.util.SortedSet keySet() {
        java.util.SortedSet sortedSet = this.d;
        if (sortedSet != null) {
            return sortedSet;
        }
        java.util.SortedSet sortedSetG = g();
        this.d = sortedSetG;
        return sortedSetG;
    }

    @Override // java.util.SortedMap
    public final java.lang.Object lastKey() {
        return h().lastKey();
    }

    public java.util.SortedMap subMap(java.lang.Object obj, java.lang.Object obj2) {
        return new defpackage.ycj(this.e, h().subMap(obj, obj2));
    }

    public java.util.SortedMap tailMap(java.lang.Object obj) {
        return new defpackage.ycj(this.e, h().tailMap(obj));
    }
}
