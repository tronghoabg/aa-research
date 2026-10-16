package defpackage;

import j$.util.Set;
import j$.util.Spliterator;

/* loaded from: classes3.dex */
public abstract class aerm<K> extends aerf<K> implements Cloneable, Set<K>, aexn {
    protected aerm() {
    }

    @Override // defpackage.aerf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public abstract aety iterator();

    @Override // defpackage.aerf, defpackage.aexk
    public /* synthetic */ aeus b() {
        throw null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
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
        aety it = iterator();
        int iIdentityHashCode = 0;
        for (int size = size(); size != 0; size--) {
            iIdentityHashCode += System.identityHashCode(it.next());
        }
        return iIdentityHashCode;
    }

    @Override // defpackage.aerf, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ Spliterator spliterator() {
        return b();
    }
}
