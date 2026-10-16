package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aesm<K> extends defpackage.aesf<K> implements java.lang.Cloneable, j$.util.Set<K>, defpackage.aeyn {
    protected aesm() {
    }

    @Override // defpackage.aesf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: a */
    public abstract defpackage.aeuy iterator();

    @Override // defpackage.aesf, defpackage.aeyk
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
    public final int hashCode() {
        defpackage.aeuy it = iterator();
        int iIdentityHashCode = 0;
        for (int size = size(); size != 0; size--) {
            iIdentityHashCode += java.lang.System.identityHashCode(it.next());
        }
        return iIdentityHashCode;
    }

    @Override // defpackage.aesf, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ j$.util.Spliterator spliterator() {
        return b();
    }
}
