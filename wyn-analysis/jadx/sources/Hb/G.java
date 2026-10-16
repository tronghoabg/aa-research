package hb;

import java.util.Map;

/* loaded from: classes4.dex */
public final class G implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public G f36250a;

    /* renamed from: b, reason: collision with root package name */
    public G f36251b;

    /* renamed from: c, reason: collision with root package name */
    public G f36252c;

    /* renamed from: d, reason: collision with root package name */
    public G f36253d;

    /* renamed from: e, reason: collision with root package name */
    public G f36254e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f36255f;

    /* renamed from: g, reason: collision with root package name */
    public final int f36256g;

    /* renamed from: h, reason: collision with root package name */
    public Object f36257h;

    /* renamed from: i, reason: collision with root package name */
    public int f36258i;

    public G() {
        this.f36255f = null;
        this.f36256g = -1;
        this.f36254e = this;
        this.f36253d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f36255f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f36257h;
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
        return this.f36255f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f36257h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f36255f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f36257h;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f36257h;
        this.f36257h = obj;
        return obj2;
    }

    public final String toString() {
        return this.f36255f + "=" + this.f36257h;
    }

    public G(G g9, Object obj, int i5, G g10, G g11) {
        this.f36250a = g9;
        this.f36255f = obj;
        this.f36256g = i5;
        this.f36258i = 1;
        this.f36253d = g10;
        this.f36254e = g11;
        g11.f36253d = this;
        g10.f36254e = this;
    }
}
