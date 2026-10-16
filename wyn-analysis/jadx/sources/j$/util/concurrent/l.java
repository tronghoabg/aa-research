package j$.util.concurrent;

import java.util.Map;

/* loaded from: classes2.dex */
class l implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    final int f37833a;

    /* renamed from: b, reason: collision with root package name */
    final Object f37834b;

    /* renamed from: c, reason: collision with root package name */
    volatile Object f37835c;

    /* renamed from: d, reason: collision with root package name */
    volatile l f37836d;

    l(int i5, Object obj, Object obj2) {
        this.f37833a = i5;
        this.f37834b = obj;
        this.f37835c = obj2;
    }

    l(int i5, Object obj, Object obj2, l lVar) {
        this(i5, obj, obj2);
        this.f37836d = lVar;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f37834b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f37835c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f37834b.hashCode() ^ this.f37835c.hashCode();
    }

    public final String toString() {
        return u.b(this.f37834b, this.f37835c);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (value = entry.getValue()) == null) {
            return false;
        }
        Object obj2 = this.f37834b;
        if (key != obj2 && !key.equals(obj2)) {
            return false;
        }
        Object obj3 = this.f37835c;
        return value == obj3 || value.equals(obj3);
    }

    l a(int i5, Object obj) {
        Object obj2;
        l lVar = this;
        do {
            if (lVar.f37833a == i5 && ((obj2 = lVar.f37834b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return lVar;
            }
            lVar = lVar.f37836d;
        } while (lVar != null);
        return null;
    }
}
