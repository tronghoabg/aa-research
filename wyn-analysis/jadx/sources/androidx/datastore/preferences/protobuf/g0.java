package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class g0 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f18207a;

    /* renamed from: b, reason: collision with root package name */
    public Object f18208b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f18209c;

    public g0(d0 d0Var, Comparable comparable, Object obj) {
        this.f18209c = d0Var;
        this.f18207a = comparable;
        this.f18208b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f18207a.compareTo(((g0) obj).f18207a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f18207a;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f18208b;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f18207a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f18208b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f18207a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f18208b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f18209c.c();
        Object obj2 = this.f18208b;
        this.f18208b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f18207a + "=" + this.f18208b;
    }
}
