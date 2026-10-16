package l8;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: l8.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3433o extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40148a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f40149b;

    public /* synthetic */ C3433o(int i5, Serializable serializable) {
        this.f40148a = i5;
        this.f40149b = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f40148a) {
            case 0:
                ((a0) this.f40149b).c();
                break;
            case 1:
                ((C3441w) this.f40149b).clear();
                break;
            default:
                ((C3423e) this.f40149b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f40148a) {
            case 0:
                return ((a0) this.f40149b).b(obj);
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((C3423e) this.f40149b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f40148a) {
            case 2:
                return ((C3423e) this.f40149b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f40148a) {
            case 0:
                return new C3420b((a0) this.f40149b);
            case 1:
                C3441w c3441w = (C3441w) this.f40149b;
                Map mapD = c3441w.d();
                return mapD != null ? mapD.values().iterator() : new C3438t(c3441w, 2);
            default:
                return new Y(((C3423e) this.f40149b).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f40148a) {
            case 2:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    C3423e c3423e = (C3423e) this.f40149b;
                    for (Map.Entry entry : c3423e.entrySet()) {
                        if (Fe.b.v(obj, entry.getValue())) {
                            c3423e.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f40148a) {
            case 2:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C3423e c3423e = (C3423e) this.f40149b;
                    for (Map.Entry entry : c3423e.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c3423e.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f40148a) {
            case 2:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C3423e c3423e = (C3423e) this.f40149b;
                    for (Map.Entry entry : c3423e.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c3423e.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f40148a) {
            case 0:
                return ((a0) this.f40149b).f40082e;
            case 1:
                return ((C3441w) this.f40149b).size();
            default:
                return ((C3423e) this.f40149b).f40099c.size();
        }
    }

    public C3433o(C3423e c3423e) {
        this.f40148a = 2;
        this.f40149b = c3423e;
    }
}
