package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yob<K, V> extends defpackage.yol<java.util.Map.Entry<K, java.util.Collection<V>>> {
    private static final long serialVersionUID = 0;

    @Override // defpackage.yoe, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        boolean zContains;
        synchronized (this.g) {
            zContains = !(obj instanceof java.util.Map.Entry) ? false : a().contains(defpackage.ysr.M((java.util.Map.Entry) obj));
        }
        return zContains;
    }

    @Override // defpackage.yoe, java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection collection) {
        boolean zAH;
        synchronized (this.g) {
            zAH = defpackage.ysr.aH(a(), collection);
        }
        return zAH;
    }

    @Override // defpackage.yol, java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        boolean zV;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            zV = defpackage.ysr.v(a(), obj);
        }
        return zV;
    }

    @Override // defpackage.yoe, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> iterator() {
        return new defpackage.yoa(this, super.iterator());
    }

    @Override // defpackage.yoe, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        boolean zRemove;
        synchronized (this.g) {
            zRemove = !(obj instanceof java.util.Map.Entry) ? false : a().remove(defpackage.ysr.M((java.util.Map.Entry) obj));
        }
        return zRemove;
    }

    @Override // defpackage.yoe, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection collection) {
        boolean zAf;
        synchronized (this.g) {
            zAf = defpackage.ysr.af(a().iterator(), collection);
        }
        return zAf;
    }

    @Override // defpackage.yoe, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection collection) {
        boolean zAg;
        synchronized (this.g) {
            zAg = defpackage.ysr.ag(a().iterator(), collection);
        }
        return zAg;
    }

    @Override // defpackage.yoe, java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray() {
        java.lang.Object[] objArr;
        synchronized (this.g) {
            java.util.Set setA = a();
            objArr = new java.lang.Object[setA.size()];
            defpackage.ysr.C(setA, objArr);
        }
        return objArr;
    }

    @Override // defpackage.yoe, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        T[] tArr2;
        synchronized (this.g) {
            tArr2 = (T[]) defpackage.ysr.z(a(), tArr);
        }
        return tArr2;
    }
}
