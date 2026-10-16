package l8;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: l8.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3424f extends q0 {

    /* renamed from: b, reason: collision with root package name */
    public final Map f40104b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f40105c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3424f(a0 a0Var, Map map) {
        super(0);
        this.f40105c = a0Var;
        map.getClass();
        this.f40104b = map;
    }

    @Override // l8.q0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C3422d c3422d = (C3422d) it;
            if (!c3422d.hasNext()) {
                return;
            }
            c3422d.next();
            c3422d.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f40104b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f40104b.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f40104b.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f40104b.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f40104b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C3422d(this, this.f40104b.entrySet().iterator());
    }

    @Override // l8.q0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int size;
        Collection collection = (Collection) this.f40104b.remove(obj);
        if (collection != null) {
            size = collection.size();
            collection.clear();
            this.f40105c.f40082e -= size;
        } else {
            size = 0;
        }
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f40104b.size();
    }
}
