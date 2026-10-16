package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yom extends defpackage.yol implements java.util.SortedSet {
    private static final long serialVersionUID = 0;

    public yom(java.util.SortedSet sortedSet, java.lang.Object obj) {
        super(sortedSet, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.yol
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final java.util.SortedSet a() {
        return (java.util.SortedSet) super.a();
    }

    @Override // java.util.SortedSet
    public final java.util.Comparator comparator() {
        java.util.Comparator comparator;
        synchronized (this.g) {
            comparator = a().comparator();
        }
        return comparator;
    }

    @Override // java.util.SortedSet
    public final java.lang.Object first() {
        java.lang.Object objFirst;
        synchronized (this.g) {
            objFirst = a().first();
        }
        return objFirst;
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet headSet(java.lang.Object obj) {
        defpackage.yom yomVar;
        java.lang.Object obj2 = this.g;
        synchronized (obj2) {
            yomVar = new defpackage.yom(a().headSet(obj), obj2);
        }
        return yomVar;
    }

    @Override // java.util.SortedSet
    public final java.lang.Object last() {
        java.lang.Object objLast;
        synchronized (this.g) {
            objLast = a().last();
        }
        return objLast;
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.yom yomVar;
        java.lang.Object obj3 = this.g;
        synchronized (obj3) {
            yomVar = new defpackage.yom(a().subSet(obj, obj2), obj3);
        }
        return yomVar;
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet tailSet(java.lang.Object obj) {
        defpackage.yom yomVar;
        java.lang.Object obj2 = this.g;
        synchronized (obj2) {
            yomVar = new defpackage.yom(a().tailSet(obj), obj2);
        }
        return yomVar;
    }
}
