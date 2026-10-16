package j$.util.concurrent;

import java.util.Map;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class j implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f50177a;

    /* renamed from: b, reason: collision with root package name */
    public Object f50178b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f50179c;

    public j(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.f50177a = obj;
        this.f50178b = obj2;
        this.f50179c = concurrentHashMap;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (value = entry.getValue()) == null) {
            return false;
        }
        Object obj2 = this.f50177a;
        if (key != obj2 && !key.equals(obj2)) {
            return false;
        }
        Object obj3 = this.f50178b;
        return value == obj3 || value.equals(obj3);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f50177a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f50178b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f50178b.hashCode() ^ this.f50177a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        Object obj2 = this.f50178b;
        this.f50178b = obj;
        this.f50179c.put(this.f50177a, obj);
        return obj2;
    }

    public final String toString() {
        return j$.com.android.tools.r8.a.S(this.f50177a, this.f50178b);
    }
}
