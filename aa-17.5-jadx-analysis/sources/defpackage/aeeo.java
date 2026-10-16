package defpackage;

import j$.util.Set;
import j$.util.Spliterator;

/* loaded from: classes3.dex */
public abstract class aeeo extends aeeg implements Cloneable, Set, aefx {
    protected aeeo() {
    }

    @Override // defpackage.aeeg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public abstract aefl iterator();

    @Override // defpackage.aeeg, java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final /* synthetic */ boolean add(Object obj) {
        return adzo.j(this, (Byte) obj);
    }

    @Override // defpackage.aeeg, defpackage.aeez
    public /* synthetic */ aefz b() {
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
        return set instanceof aefx ? f((aefx) set) : containsAll(set);
    }

    @Override // defpackage.aeeg, defpackage.aeez
    @Deprecated
    public final boolean g(byte b) {
        return k(b);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        aefl it = iterator();
        int iC = 0;
        for (int size = size(); size != 0; size--) {
            iC += it.c();
        }
        return iC;
    }

    public boolean k(byte b) {
        throw null;
    }

    @Override // defpackage.aeeg, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ Spliterator spliterator() {
        return b();
    }
}
