package h;

import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k<A, B> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Object f48138a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f48139b;

    public k(Object obj, Object obj2) {
        this.f48138a = obj;
        this.f48139b = obj2;
    }

    public static /* synthetic */ k e(k kVar, Object obj, Object obj2, int i2) {
        if ((i2 & 1) != 0) {
            obj = kVar.f48138a;
        }
        if ((i2 & 2) != 0) {
            obj2 = kVar.f48139b;
        }
        return new k(obj, obj2);
    }

    public final Object a() {
        return this.f48138a;
    }

    public final Object b() {
        return this.f48139b;
    }

    public final Object c() {
        return this.f48138a;
    }

    public final Object d() {
        return this.f48139b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return h.g.b.x.n(this.f48138a, kVar.f48138a) && h.g.b.x.n(this.f48139b, kVar.f48139b);
    }

    public final int hashCode() {
        Object obj = this.f48138a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f48139b;
        return (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f48138a + ", " + this.f48139b + ")";
    }
}
