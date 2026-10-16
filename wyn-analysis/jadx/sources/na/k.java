package na;

import java.util.Map;

/* loaded from: classes4.dex */
public final class k implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public k f40976a;

    /* renamed from: b, reason: collision with root package name */
    public k f40977b;

    /* renamed from: c, reason: collision with root package name */
    public k f40978c;

    /* renamed from: d, reason: collision with root package name */
    public k f40979d;

    /* renamed from: e, reason: collision with root package name */
    public k f40980e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f40981f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f40982g;

    /* renamed from: h, reason: collision with root package name */
    public Object f40983h;

    /* renamed from: i, reason: collision with root package name */
    public int f40984i;

    public k(boolean z2) {
        this.f40981f = null;
        this.f40982g = z2;
        this.f40980e = this;
        this.f40979d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f40981f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f40983h;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f40981f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f40983h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f40981f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f40983h;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f40982g) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f40983h;
        this.f40983h = obj;
        return obj2;
    }

    public final String toString() {
        return this.f40981f + "=" + this.f40983h;
    }

    public k(boolean z2, k kVar, Object obj, k kVar2, k kVar3) {
        this.f40976a = kVar;
        this.f40981f = obj;
        this.f40982g = z2;
        this.f40984i = 1;
        this.f40979d = kVar2;
        this.f40980e = kVar3;
        kVar3.f40979d = this;
        kVar2.f40980e = this;
    }
}
