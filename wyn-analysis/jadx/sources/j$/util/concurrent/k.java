package j$.util.concurrent;

import java.util.Map;

/* loaded from: classes2.dex */
final class k implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    final Object f37830a;

    /* renamed from: b, reason: collision with root package name */
    Object f37831b;

    /* renamed from: c, reason: collision with root package name */
    final ConcurrentHashMap f37832c;

    k(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.f37830a = obj;
        this.f37831b = obj2;
        this.f37832c = concurrentHashMap;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f37830a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f37831b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f37830a.hashCode() ^ this.f37831b.hashCode();
    }

    public final String toString() {
        return u.b(this.f37830a, this.f37831b);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (value = entry.getValue()) == null) {
            return false;
        }
        Object obj2 = this.f37830a;
        if (key != obj2 && !key.equals(obj2)) {
            return false;
        }
        Object obj3 = this.f37831b;
        return value == obj3 || value.equals(obj3);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        Object obj2 = this.f37831b;
        this.f37831b = obj;
        this.f37832c.put(this.f37830a, obj);
        return obj2;
    }
}
