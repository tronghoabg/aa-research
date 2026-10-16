package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aerw<K> extends defpackage.aerq<K> implements java.lang.Cloneable, j$.util.Set<K>, defpackage.aevm {
    protected aerw() {
    }

    @Override // defpackage.aerq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: a */
    public abstract defpackage.aeuy iterator();

    @Override // defpackage.aerq, defpackage.aeuv
    public /* synthetic */ defpackage.aevs b() {
        throw null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set = (java.util.Set) obj;
        if (set.size() != size()) {
            return false;
        }
        return containsAll(set);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        defpackage.aeuy it = iterator();
        int iHashCode = 0;
        for (int size = size(); size != 0; size--) {
            K next = it.next();
            iHashCode += next == null ? 0 : next.hashCode();
        }
        return iHashCode;
    }

    @Override // defpackage.aerq, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ j$.util.Spliterator spliterator() {
        return b();
    }
}
