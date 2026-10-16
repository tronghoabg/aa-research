package defpackage;

/* JADX INFO: loaded from: classes3.dex */
abstract class ylp extends defpackage.ynr {
    public abstract java.util.Map a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        a().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Object key = entry.getKey();
            java.lang.Object objJ = defpackage.ysr.J(a(), key);
            if (j$.util.Objects.equals(objJ, entry.getValue())) {
                return objJ != null || a().containsKey(key);
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object obj) {
        if (contains(obj) && (obj instanceof java.util.Map.Entry)) {
            return a().keySet().remove(((java.util.Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // defpackage.ynr, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection collection) {
        try {
            collection.getClass();
            return defpackage.ysr.w(this, collection);
        } catch (java.lang.UnsupportedOperationException unused) {
            return defpackage.ysr.x(this, collection.iterator());
        }
    }

    @Override // defpackage.ynr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (java.lang.UnsupportedOperationException unused) {
            java.util.HashSet hashSetR = defpackage.ysr.r(collection.size());
            for (java.lang.Object obj : collection) {
                if (contains(obj) && (obj instanceof java.util.Map.Entry)) {
                    hashSetR.add(((java.util.Map.Entry) obj).getKey());
                }
            }
            return a().keySet().retainAll(hashSetR);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return a().size();
    }
}
