package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class yii<E> extends defpackage.yhx<E> implements java.util.NavigableSet<E>, j$.util.SortedSet<E>, defpackage.ynw {
    private static final long serialVersionUID = 912559;
    final transient java.util.Comparator a;
    transient defpackage.yii b;

    public yii(java.util.Comparator comparator) {
        this.a = comparator;
    }

    static defpackage.yne F(java.util.Comparator comparator) {
        if (defpackage.ymn.a.equals(comparator)) {
            return defpackage.yne.c;
        }
        int i = defpackage.ygw.d;
        return new defpackage.yne(defpackage.ymx.a, comparator);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    public static defpackage.yii w(java.util.Comparator comparator, int i, java.lang.Object... objArr) {
        if (i == 0) {
            return F(comparator);
        }
        defpackage.ysr.B(objArr, i);
        java.util.Arrays.sort(objArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            java.lang.Object obj = objArr[i3];
            if (comparator.compare(obj, objArr[i2 - 1]) != 0) {
                objArr[i2] = obj;
                i2++;
            }
        }
        java.util.Arrays.fill(objArr, i2, i, (java.lang.Object) null);
        if (i2 < (objArr.length >> 1)) {
            objArr = java.util.Arrays.copyOf(objArr, i2);
        }
        return new defpackage.yne(defpackage.ygw.l(objArr, i2), comparator);
    }

    public abstract defpackage.yii A(java.lang.Object obj, boolean z);

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final defpackage.yii subSet(java.lang.Object obj, boolean z, java.lang.Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        defpackage.ysr.aX(this.a.compare(obj, obj2) <= 0);
        return C(obj, z, obj2, z2);
    }

    public abstract defpackage.yii C(java.lang.Object obj, boolean z, java.lang.Object obj2, boolean z2);

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final defpackage.yii tailSet(java.lang.Object obj, boolean z) {
        obj.getClass();
        return E(obj, z);
    }

    public abstract defpackage.yii E(java.lang.Object obj, boolean z);

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: G */
    public abstract defpackage.yot descendingIterator();

    @java.lang.Deprecated
    public final void addFirst(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public final void addLast(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public java.lang.Object ceiling(java.lang.Object obj) {
        return defpackage.ysr.au(tailSet(obj, true));
    }

    @Override // java.util.SortedSet, defpackage.ynw
    public final java.util.Comparator comparator() {
        return this.a;
    }

    @Override // defpackage.yhx, defpackage.ygm, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: e */
    public abstract defpackage.yot iterator();

    @Override // java.util.SortedSet
    public java.lang.Object first() {
        return iterator().next();
    }

    @Override // java.util.NavigableSet
    public java.lang.Object floor(java.lang.Object obj) {
        return defpackage.ysr.ai(headSet(obj, true).descendingIterator());
    }

    public final E getFirst() {
        return (E) first();
    }

    public final E getLast() {
        return (E) last();
    }

    final int h(java.lang.Object obj, java.lang.Object obj2) {
        return this.a.compare(obj, obj2);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ java.util.SortedSet headSet(java.lang.Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public java.lang.Object higher(java.lang.Object obj) {
        return defpackage.ysr.au(tailSet(obj, false));
    }

    @Override // java.util.SortedSet
    public java.lang.Object last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    public java.lang.Object lower(java.lang.Object obj) {
        return defpackage.ysr.ai(headSet(obj, false).descendingIterator());
    }

    @Override // java.util.NavigableSet
    @java.lang.Deprecated
    public final java.lang.Object pollFirst() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @java.lang.Deprecated
    public final java.lang.Object pollLast() {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public final java.lang.Object removeFirst() {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public final java.lang.Object removeLast() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ java.util.SortedSet tailSet(java.lang.Object obj) {
        return tailSet(obj, true);
    }

    @Override // defpackage.yhx, defpackage.ygm
    public java.lang.Object writeReplace() {
        return new yih(this.a, toArray());
    }

    public abstract defpackage.yii x();

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final defpackage.yii descendingSet() {
        defpackage.yii yiiVar = this.b;
        if (yiiVar != null) {
            return yiiVar;
        }
        defpackage.yii yiiVarX = x();
        this.b = yiiVarX;
        yiiVarX.b = this;
        return yiiVarX;
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final defpackage.yii headSet(java.lang.Object obj, boolean z) {
        obj.getClass();
        return A(obj, z);
    }
}
