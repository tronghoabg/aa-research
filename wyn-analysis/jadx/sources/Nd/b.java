package Nd;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4295e;

/* loaded from: classes5.dex */
public final class b implements Map, InterfaceC4295e {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f8656a = new LinkedHashMap();

    @Override // java.util.Map
    public final void clear() {
        this.f8656a.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String key = (String) obj;
        AbstractC3340k.e(key, "key");
        return this.f8656a.containsKey(new c(key));
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f8656a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new e(this.f8656a.entrySet(), new Ad.g(20), new Ad.g(21));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        return AbstractC3340k.a(((b) obj).f8656a, this.f8656a);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        AbstractC3340k.e(key, "key");
        return this.f8656a.get(A6.c.l(key));
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f8656a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f8656a.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new e(this.f8656a.keySet(), new Ad.g(22), new Ad.g(23));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object value) {
        String key = (String) obj;
        AbstractC3340k.e(key, "key");
        AbstractC3340k.e(value, "value");
        return this.f8656a.put(A6.c.l(key), value);
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        AbstractC3340k.e(from, "from");
        for (Map.Entry entry : from.entrySet()) {
            String key = (String) entry.getKey();
            Object value = entry.getValue();
            AbstractC3340k.e(key, "key");
            AbstractC3340k.e(value, "value");
            this.f8656a.put(A6.c.l(key), value);
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        AbstractC3340k.e(key, "key");
        return this.f8656a.remove(A6.c.l(key));
    }

    @Override // java.util.Map
    public final int size() {
        return this.f8656a.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f8656a.values();
    }
}
