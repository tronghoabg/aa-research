package N1;

import l8.AbstractC3414P;
import l8.AbstractC3437s;
import l8.e0;
import l8.j0;

/* loaded from: classes.dex */
public class T {

    /* renamed from: a, reason: collision with root package name */
    public final int f8101a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8102b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8103c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8104d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8105e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8106f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8107g;

    /* renamed from: h, reason: collision with root package name */
    public final e0 f8108h;

    /* renamed from: i, reason: collision with root package name */
    public final e0 f8109i;

    /* renamed from: j, reason: collision with root package name */
    public final int f8110j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final e0 f8111l;

    /* renamed from: m, reason: collision with root package name */
    public final Q f8112m;

    /* renamed from: n, reason: collision with root package name */
    public final e0 f8113n;

    /* renamed from: o, reason: collision with root package name */
    public final int f8114o;

    /* renamed from: p, reason: collision with root package name */
    public final j0 f8115p;

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC3414P f8116q;

    static {
        new T(new S());
        Q1.x.E(1);
        Q1.x.E(2);
        Q1.x.E(3);
        Q1.x.E(4);
        N0.a.k(5, 6, 7, 8, 9);
        N0.a.k(10, 11, 12, 13, 14);
        N0.a.k(15, 16, 17, 18, 19);
        N0.a.k(20, 21, 22, 23, 24);
        N0.a.k(25, 26, 27, 28, 29);
        Q1.x.E(30);
        Q1.x.E(31);
    }

    public T(S s10) {
        this.f8101a = s10.f8085a;
        this.f8102b = s10.f8086b;
        this.f8103c = s10.f8087c;
        this.f8104d = s10.f8088d;
        this.f8105e = s10.f8089e;
        this.f8106f = s10.f8090f;
        this.f8107g = s10.f8091g;
        this.f8108h = s10.f8092h;
        this.f8109i = s10.f8093i;
        this.f8110j = s10.f8094j;
        this.k = s10.k;
        this.f8111l = s10.f8095l;
        this.f8112m = s10.f8096m;
        this.f8113n = s10.f8097n;
        this.f8114o = s10.f8098o;
        this.f8115p = j0.a(s10.f8099p);
        this.f8116q = AbstractC3414P.j(s10.f8100q);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        T t10 = (T) obj;
        if (this.f8101a != t10.f8101a || this.f8102b != t10.f8102b || this.f8103c != t10.f8103c || this.f8104d != t10.f8104d || this.f8107g != t10.f8107g || this.f8105e != t10.f8105e || this.f8106f != t10.f8106f || !this.f8108h.equals(t10.f8108h) || !this.f8109i.equals(t10.f8109i) || this.f8110j != t10.f8110j || this.k != t10.k || !this.f8111l.equals(t10.f8111l) || !this.f8112m.equals(t10.f8112m) || !this.f8113n.equals(t10.f8113n) || this.f8114o != t10.f8114o) {
            return false;
        }
        j0 j0Var = this.f8115p;
        j0Var.getClass();
        return AbstractC3437s.f(t10.f8115p, j0Var) && this.f8116q.equals(t10.f8116q);
    }

    public int hashCode() {
        return this.f8116q.hashCode() + ((this.f8115p.hashCode() + ((((this.f8113n.hashCode() + ((this.f8112m.hashCode() + ((this.f8111l.hashCode() + ((((((this.f8109i.hashCode() + ((this.f8108h.hashCode() + ((((((((((((((this.f8101a + 31) * 31) + this.f8102b) * 31) + this.f8103c) * 31) + this.f8104d) * 28629151) + (this.f8107g ? 1 : 0)) * 31) + this.f8105e) * 31) + this.f8106f) * 31)) * 961)) * 961) + this.f8110j) * 31) + this.k) * 31)) * 31)) * 31)) * 31) + this.f8114o) * 887503681)) * 31);
    }
}
