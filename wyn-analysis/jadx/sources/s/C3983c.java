package s;

import java.util.Map;

/* renamed from: s.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3983c implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f44814a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f44815b;

    /* renamed from: c, reason: collision with root package name */
    public C3983c f44816c;

    /* renamed from: d, reason: collision with root package name */
    public C3983c f44817d;

    public C3983c(Object obj, Object obj2) {
        this.f44814a = obj;
        this.f44815b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3983c)) {
            return false;
        }
        C3983c c3983c = (C3983c) obj;
        return this.f44814a.equals(c3983c.f44814a) && this.f44815b.equals(c3983c.f44815b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f44814a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f44815b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f44814a.hashCode() ^ this.f44815b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f44814a + "=" + this.f44815b;
    }
}
