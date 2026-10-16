package Va;

import java.util.List;

/* renamed from: Va.ja, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1025ja {

    /* renamed from: a, reason: collision with root package name */
    public Class f14319a;

    /* renamed from: b, reason: collision with root package name */
    public Class f14320b;

    /* renamed from: c, reason: collision with root package name */
    public Class f14321c;

    /* renamed from: d, reason: collision with root package name */
    public List f14322d;

    /* renamed from: e, reason: collision with root package name */
    public int f14323e;

    /* renamed from: f, reason: collision with root package name */
    public int f14324f;

    /* renamed from: g, reason: collision with root package name */
    public int f14325g;

    /* renamed from: h, reason: collision with root package name */
    public int f14326h;

    /* renamed from: i, reason: collision with root package name */
    public int f14327i;

    /* renamed from: j, reason: collision with root package name */
    public int f14328j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f14329l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f14330m;

    /* renamed from: n, reason: collision with root package name */
    public C1126r8 f14331n;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1025ja.class != obj.getClass()) {
            return false;
        }
        C1025ja c1025ja = (C1025ja) obj;
        if (this.f14323e != c1025ja.f14323e || this.f14324f != c1025ja.f14324f || this.f14325g != c1025ja.f14325g || this.f14326h != c1025ja.f14326h || this.f14327i != c1025ja.f14327i || this.f14328j != c1025ja.f14328j || this.k != c1025ja.k || this.f14329l != c1025ja.f14329l || this.f14330m != c1025ja.f14330m) {
            return false;
        }
        Class cls = this.f14319a;
        if (cls != null) {
            if (!cls.equals(c1025ja.f14319a)) {
                return false;
            }
        } else if (c1025ja.f14319a != null) {
            return false;
        }
        Class cls2 = this.f14320b;
        if (cls2 != null) {
            if (!cls2.equals(c1025ja.f14320b)) {
                return false;
            }
        } else if (c1025ja.f14320b != null) {
            return false;
        }
        Class cls3 = this.f14321c;
        if (cls3 != null) {
            if (!cls3.equals(c1025ja.f14321c)) {
                return false;
            }
        } else if (c1025ja.f14321c != null) {
            return false;
        }
        List list = this.f14322d;
        if (list != null) {
            if (!list.equals(c1025ja.f14322d)) {
                return false;
            }
        } else if (c1025ja.f14322d != null) {
            return false;
        }
        C1126r8 c1126r8 = this.f14331n;
        C1126r8 c1126r82 = c1025ja.f14331n;
        return c1126r8 != null ? c1126r8.equals(c1126r82) : c1126r82 == null;
    }

    public final int hashCode() {
        Class cls = this.f14319a;
        int iHashCode = (cls != null ? cls.hashCode() : 0) * 31;
        Class cls2 = this.f14320b;
        int iHashCode2 = (iHashCode + (cls2 != null ? cls2.hashCode() : 0)) * 31;
        Class cls3 = this.f14321c;
        int iHashCode3 = (iHashCode2 + (cls3 != null ? cls3.hashCode() : 0)) * 31;
        List list = this.f14322d;
        int iHashCode4 = (((((((((((((((((((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31) + this.f14323e) * 31) + this.f14324f) * 31) + this.f14325g) * 31) + this.f14326h) * 31) + this.f14327i) * 31) + this.f14328j) * 31) + this.k) * 31) + this.f14329l) * 31) + (this.f14330m ? 1 : 0)) * 31;
        C1126r8 c1126r8 = this.f14331n;
        return iHashCode4 + (c1126r8 != null ? c1126r8.hashCode() : 0);
    }
}
