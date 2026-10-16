package l8;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: l8.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3423e extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    public transient C3421c f40097a;

    /* renamed from: b, reason: collision with root package name */
    public transient C3433o f40098b;

    /* renamed from: c, reason: collision with root package name */
    public final transient Map f40099c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f40100d;

    public C3423e(a0 a0Var, Map map) {
        this.f40100d = a0Var;
        this.f40099c = map;
    }

    public final C3405G a(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        a0 a0Var = this.f40100d;
        a0Var.getClass();
        List list = (List) collection;
        return new C3405G(key, list instanceof RandomAccess ? new C3427i(a0Var, key, list, null) : new C3431m(a0Var, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        a0 a0Var = this.f40100d;
        if (this.f40099c == a0Var.f40081d) {
            a0Var.c();
            return;
        }
        C3422d c3422d = new C3422d(this);
        while (c3422d.hasNext()) {
            c3422d.next();
            c3422d.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f40099c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C3421c c3421c = this.f40097a;
        if (c3421c != null) {
            return c3421c;
        }
        C3421c c3421c2 = new C3421c(this);
        this.f40097a = c3421c2;
        return c3421c2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f40099c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f40099c;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        a0 a0Var = this.f40100d;
        a0Var.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new C3427i(a0Var, obj, list, null) : new C3431m(a0Var, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f40099c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        a0 a0Var = this.f40100d;
        Set set = a0Var.f40152a;
        if (set != null) {
            return set;
        }
        Map map = a0Var.f40081d;
        Set c3426h = map instanceof NavigableMap ? new C3426h(a0Var, (NavigableMap) map) : map instanceof SortedMap ? new C3429k(a0Var, (SortedMap) map) : new C3424f(a0Var, map);
        a0Var.f40152a = c3426h;
        return c3426h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f40099c.remove(obj);
        if (collection == null) {
            return null;
        }
        a0 a0Var = this.f40100d;
        Collection collectionD = a0Var.d();
        collectionD.addAll(collection);
        a0Var.f40082e -= collection.size();
        collection.clear();
        return collectionD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f40099c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f40099c.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C3433o c3433o = this.f40098b;
        if (c3433o != null) {
            return c3433o;
        }
        C3433o c3433o2 = new C3433o(this);
        this.f40098b = c3433o2;
        return c3433o2;
    }
}
