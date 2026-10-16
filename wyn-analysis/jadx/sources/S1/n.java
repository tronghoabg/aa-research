package S1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l8.AbstractC3437s;
import l8.Y;

/* loaded from: classes.dex */
public final class n implements Map {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10889a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f10890b;

    public /* synthetic */ n(int i5, Map map) {
        this.f10889a = i5;
        this.f10890b = map;
    }

    public final boolean a(Object obj) {
        return d().containsKey(obj);
    }

    public final boolean c(Object obj) {
        return d().containsValue(obj);
    }

    @Override // java.util.Map
    public final void clear() {
        d().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        switch (this.f10889a) {
            case 0:
                return obj != null && a(obj);
            case 1:
                return obj != null && a(obj);
            default:
                return a(obj);
        }
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        switch (this.f10889a) {
            case 0:
                return m(obj);
            case 1:
                return m(obj);
            default:
                return c(obj);
        }
    }

    public final Map d() {
        switch (this.f10889a) {
            case 0:
                return this.f10890b;
            case 1:
                return this.f10890b;
            default:
                return (HashMap) this.f10890b;
        }
    }

    public double e() {
        HashMap map = (HashMap) this.f10890b;
        if (map.isEmpty()) {
            return 0.0d;
        }
        Iterator it = map.values().iterator();
        int i5 = 0;
        int i10 = 0;
        while (it.hasNext()) {
            i10++;
            if (((vd.k) it.next()).d()) {
                i5++;
            }
        }
        return (i5 / i10) * 100.0d;
    }

    @Override // java.util.Map
    public Set entrySet() {
        switch (this.f10889a) {
            case 0:
                return AbstractC3437s.h(f(), new m(0));
            case 1:
                return AbstractC3437s.h(f(), new m(3));
            default:
                return f();
        }
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        switch (this.f10889a) {
            case 0:
                return obj != null && AbstractC3437s.f(obj, this);
            case 1:
                return obj != null && AbstractC3437s.f(obj, this);
            default:
                return g(obj);
        }
    }

    public final Set f() {
        return d().entrySet();
    }

    public final boolean g(Object obj) {
        return obj == this || d().equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        switch (this.f10889a) {
            case 0:
                if (obj == null) {
                    return null;
                }
                return (List) h(obj);
            case 1:
                if (obj == null) {
                    return null;
                }
                return (List) h(obj);
            default:
                return h(obj);
        }
    }

    public final Object h(Object obj) {
        return d().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        switch (this.f10889a) {
            case 0:
                return AbstractC3437s.k(entrySet());
            case 1:
                return AbstractC3437s.k(entrySet());
            default:
                return i();
        }
    }

    public final int i() {
        return d().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        switch (this.f10889a) {
            case 0:
                if (j()) {
                    return true;
                }
                return l() == 1 && a(null);
            case 1:
                if (j()) {
                    return true;
                }
                return l() == 1 && a(null);
            default:
                return j();
        }
    }

    public final boolean j() {
        return d().isEmpty();
    }

    public final Set k() {
        return d().keySet();
    }

    @Override // java.util.Map
    public Set keySet() {
        switch (this.f10889a) {
            case 0:
                return AbstractC3437s.h(k(), new m(1));
            case 1:
                return AbstractC3437s.h(k(), new m(2));
            default:
                return k();
        }
    }

    public final int l() {
        return d().size();
    }

    public final boolean m(Object obj) {
        Y y10 = new Y(entrySet().iterator());
        if (obj == null) {
            while (y10.hasNext()) {
                if (y10.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (y10.hasNext()) {
            if (obj.equals(y10.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return d().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        d().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return d().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        switch (this.f10889a) {
            case 0:
                return l() - (a(null) ? 1 : 0);
            case 1:
                return l() - (a(null) ? 1 : 0);
            default:
                return l();
        }
    }

    public final String toString() {
        Object obj;
        switch (this.f10889a) {
            case 0:
                obj = this.f10890b;
                break;
            case 1:
                obj = this.f10890b;
                break;
            default:
                obj = (HashMap) this.f10890b;
                break;
        }
        return obj.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return d().values();
    }

    public n() {
        this.f10889a = 2;
        this.f10890b = new HashMap();
    }
}
