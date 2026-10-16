package defpackage;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
final class zcn<K, V> extends yec<Collection<V>> {
    final Collection a;
    final Set b;

    public zcn(Collection collection, Set set) {
        this.a = collection;
        this.b = set;
    }

    @Override // defpackage.yec
    /* renamed from: a */
    protected final Collection d() {
        return this.a;
    }

    @Override // defpackage.yec, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return e(obj);
    }

    @Override // defpackage.yec, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return ysi.l(this, collection);
    }

    @Override // defpackage.yel
    protected final /* synthetic */ Object d() {
        return this.a;
    }

    @Override // defpackage.yec, java.util.Collection, java.lang.Iterable
    public final Iterator<Collection<V>> iterator() {
        return new zcm(this.b.iterator());
    }

    @Override // defpackage.yec, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Iterator<Collection<V>> it = iterator();
        while (it.hasNext()) {
            if (Objects.equals(it.next(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.yec, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        return yrm.af(iterator(), collection);
    }

    @Override // defpackage.yec, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return yrm.ag(iterator(), collection);
    }

    @Override // defpackage.yec, java.util.Collection
    public final Object[] toArray() {
        return f();
    }

    @Override // defpackage.yec, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) yrm.z(this, tArr);
    }
}
