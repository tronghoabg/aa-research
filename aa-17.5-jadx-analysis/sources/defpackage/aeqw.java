package defpackage;

import j$.util.Set;
import j$.util.Spliterator;

/* loaded from: classes3.dex */
public abstract class aeqw<K> extends aeqq<K> implements Cloneable, Set<K>, aeum {
    protected aeqw() {
    }

    @Override // defpackage.aeqq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public abstract aety iterator();

    @Override // defpackage.aeqq, defpackage.aetv
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
    public int hashCode() {
        aety it = iterator();
        int iHashCode = 0;
        for (int size = size(); size != 0; size--) {
            K next = it.next();
            iHashCode += next == null ? 0 : next.hashCode();
        }
        return iHashCode;
    }

    @Override // defpackage.aeqq, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ Spliterator spliterator() {
        return b();
    }
}
