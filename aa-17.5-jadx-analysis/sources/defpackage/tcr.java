package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class tcr implements Set, afgh, afgc {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;
    final /* synthetic */ tcs c;
    private final /* synthetic */ Set d;

    public tcr(Set set, Set set2, tcs tcsVar) {
        this.a = set;
        this.b = set2;
        this.c = tcsVar;
        this.d = set;
    }

    public final void a() {
        Set set = this.a;
        Set set2 = this.b;
        set.retainAll(set2);
        set.addAll(set2);
        this.c.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        ((Map.Entry) obj).getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        collection.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.b.clear();
        a();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!affz.e(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        return this.d.contains(entry);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.d.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new tcq(this, this.c, this.b.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (!affz.e(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        boolean zRemove = this.b.remove(((tcp) entry).a);
        a();
        return zRemove;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getClass();
            arrayList.add(((tcp) entry).a);
        }
        boolean zRemoveAll = this.b.removeAll(woy.cl(arrayList));
        a();
        return zRemoveAll;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getClass();
            arrayList.add(((tcp) entry).a);
        }
        boolean zRetainAll = this.b.retainAll(woy.cl(arrayList));
        a();
        return zRetainAll;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return this.d.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) afet.b(this, tArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return afet.a(this);
    }
}
