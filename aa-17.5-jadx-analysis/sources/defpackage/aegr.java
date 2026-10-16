package defpackage;

import j$.util.Set;
import j$.util.Spliterator;

/* loaded from: classes3.dex */
public abstract class aegr extends aegj implements Cloneable, Set, aekf {
    protected aegr() {
    }

    @Override // defpackage.aegj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public abstract aejr m();

    @Override // defpackage.aegj, java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public /* synthetic */ boolean add(Object obj) {
        return adzo.q(this, (Integer) obj);
    }

    @Override // defpackage.aegj, defpackage.aejf
    /* renamed from: b */
    public /* synthetic */ aekm spliterator() {
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
        return set instanceof aekf ? f((aekf) set) : containsAll(set);
    }

    @Override // defpackage.aegj, defpackage.aejf
    @Deprecated
    public final boolean g(int i) {
        return l(i);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        aejr aejrVarM = iterator();
        int iNextInt = 0;
        for (int size = size(); size != 0; size--) {
            iNextInt += aejrVarM.nextInt();
        }
        return iNextInt;
    }

    public boolean l(int i) {
        throw null;
    }

    @Override // defpackage.aegj, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }
}
