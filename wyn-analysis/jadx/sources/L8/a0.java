package l8;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* loaded from: classes4.dex */
public final class a0 extends AbstractC3434p implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final transient Map f40081d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f40082e;

    /* renamed from: f, reason: collision with root package name */
    public transient Z f40083f;

    public a0(Map map) {
        Fe.e.q(map.isEmpty());
        this.f40081d = map;
    }

    @Override // l8.AbstractC3434p
    public final Map a() {
        Map map = this.f40154c;
        if (map != null) {
            return map;
        }
        Map map2 = this.f40081d;
        Map c3425g = map2 instanceof NavigableMap ? new C3425g(this, (NavigableMap) map2) : map2 instanceof SortedMap ? new C3428j(this, (SortedMap) map2) : new C3423e(this, map2);
        this.f40154c = c3425g;
        return c3425g;
    }

    public final void c() {
        Map map = this.f40081d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f40082e = 0;
    }

    public final Collection d() {
        return (List) this.f40083f.get();
    }

    public final boolean e(Double d3, Integer num) {
        Map map = this.f40081d;
        Collection collection = (Collection) map.get(d3);
        if (collection != null) {
            if (!collection.add(num)) {
                return false;
            }
            this.f40082e++;
            return true;
        }
        Collection collectionD = d();
        if (!collectionD.add(num)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f40082e++;
        map.put(d3, collectionD);
        return true;
    }

    public final Collection f() {
        Collection collection = this.f40153b;
        if (collection != null) {
            return collection;
        }
        C3433o c3433o = new C3433o(0, this);
        this.f40153b = c3433o;
        return c3433o;
    }
}
