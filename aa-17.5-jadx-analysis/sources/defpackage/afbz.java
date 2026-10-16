package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class afbz<K, V> extends afbq<Map.Entry<K, V>, K, V> {
    private final afby a;

    public afbz(afby afbyVar) {
        this.a = afbyVar;
    }

    @Override // defpackage.afbq
    public final boolean a(Map.Entry entry) {
        return this.a.i(entry);
    }

    @Override // defpackage.afaw, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        ((Map.Entry) obj).getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        collection.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.afbq
    public final boolean b(Map.Entry entry) {
        entry.getClass();
        afby afbyVar = this.a;
        afbyVar.f();
        int iB = afbyVar.b(entry.getKey());
        if (iB < 0) {
            return false;
        }
        Object[] objArr = afbyVar.c;
        objArr.getClass();
        if (!affa.f(objArr[iB], entry.getValue())) {
            return false;
        }
        afbyVar.g(iB);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.a.h(collection);
    }

    @Override // defpackage.afaw
    public final int getSize() {
        return this.a.g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new afbu(this.a);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.a.f();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.a.f();
        return super.retainAll(collection);
    }
}
