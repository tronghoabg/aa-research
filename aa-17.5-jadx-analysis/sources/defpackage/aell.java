package defpackage;

import j$.util.Set;
import j$.util.Spliterator;

/* loaded from: classes3.dex */
public abstract class aell extends aeld implements Cloneable, Set, aepx {
    protected aell() {
    }

    @Override // defpackage.aeld, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public abstract aepm m();

    @Override // defpackage.aeld, java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public /* synthetic */ boolean add(Object obj) {
        return adqq.as(this, (Long) obj);
    }

    @Override // defpackage.aeld, defpackage.aepb
    /* renamed from: b */
    public /* synthetic */ aeqd spliterator() {
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
        return set instanceof aepx ? f((aepx) set) : containsAll(set);
    }

    @Override // defpackage.aeld, defpackage.aepb
    @Deprecated
    public final boolean g(long j) {
        return l(j);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        aepm aepmVarM = m();
        int iG = 0;
        for (int size = size(); size != 0; size--) {
            iG += a.g(aepmVarM.nextLong());
        }
        return iG;
    }

    public boolean l(long j) {
        throw null;
    }

    @Override // defpackage.aeld, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }
}
