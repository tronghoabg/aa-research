package h;

import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p<A, B, C> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Object f48283a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f48284b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f48285c;

    public p(Object obj, Object obj2, Object obj3) {
        this.f48283a = obj;
        this.f48284b = obj2;
        this.f48285c = obj3;
    }

    public final Object a() {
        return this.f48283a;
    }

    public final Object b() {
        return this.f48284b;
    }

    public final Object c() {
        return this.f48285c;
    }

    public final Object d() {
        return this.f48283a;
    }

    public final Object e() {
        return this.f48284b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return h.g.b.x.n(this.f48283a, pVar.f48283a) && h.g.b.x.n(this.f48284b, pVar.f48284b) && h.g.b.x.n(this.f48285c, pVar.f48285c);
    }

    public final Object f() {
        return this.f48285c;
    }

    public final int hashCode() {
        Object obj = this.f48283a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f48284b;
        int iHashCode2 = obj2 == null ? 0 : obj2.hashCode();
        int i2 = iHashCode * 31;
        Object obj3 = this.f48285c;
        return ((i2 + iHashCode2) * 31) + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f48283a + ", " + this.f48284b + ", " + this.f48285c + ")";
    }
}
