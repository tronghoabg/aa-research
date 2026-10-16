package j$.util.concurrent;

import java.util.Map;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public class k implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final int f50180a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f50181b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f50182c;

    /* renamed from: d, reason: collision with root package name */
    public volatile k f50183d;

    public k(int i2, Object obj, Object obj2) {
        this.f50180a = i2;
        this.f50181b = obj;
        this.f50182c = obj2;
    }

    public k a(int i2, Object obj) {
        Object obj2;
        do {
            if (this.f50180a == i2 && ((obj2 = this.f50181b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return this;
            }
            this = this.f50183d;
        } while (this != null);
        return null;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (value = entry.getValue()) == null) {
            return false;
        }
        Object obj2 = this.f50181b;
        if (key != obj2 && !key.equals(obj2)) {
            return false;
        }
        Object obj3 = this.f50182c;
        return value == obj3 || value.equals(obj3);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f50181b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f50182c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f50182c.hashCode() ^ this.f50181b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return j$.com.android.tools.r8.a.S(this.f50181b, this.f50182c);
    }

    public k(int i2, Object obj, Object obj2, k kVar) {
        this(i2, obj, obj2);
        this.f50183d = kVar;
    }
}
