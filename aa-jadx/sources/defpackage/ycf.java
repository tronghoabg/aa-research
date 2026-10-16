package defpackage;

/* JADX INFO: loaded from: classes.dex */
class ycf extends defpackage.yls {
    final /* synthetic */ defpackage.ycs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ycf(defpackage.ycs ycsVar, java.util.Map map) {
        super(map);
        this.a = ycsVar;
    }

    @Override // defpackage.yls, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        defpackage.ysr.ac(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection collection) {
        return this.d.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        return this == obj || this.d.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.keySet().hashCode();
    }

    @Override // defpackage.yls, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new defpackage.yce(this, this.d.entrySet().iterator());
    }

    @Override // defpackage.yls, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        java.util.Collection collection = (java.util.Collection) this.d.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.a.b -= size;
        return size > 0;
    }
}
