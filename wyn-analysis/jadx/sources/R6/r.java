package r6;

import E5.InterfaceC0453h;
import l8.AbstractC3414P;
import l8.AbstractC3437s;
import l8.e0;
import l8.j0;

/* loaded from: classes3.dex */
public class r implements InterfaceC0453h {

    /* renamed from: a, reason: collision with root package name */
    public final int f44493a;

    /* renamed from: b, reason: collision with root package name */
    public final int f44494b;

    /* renamed from: c, reason: collision with root package name */
    public final int f44495c;

    /* renamed from: d, reason: collision with root package name */
    public final int f44496d;

    /* renamed from: e, reason: collision with root package name */
    public final int f44497e;

    /* renamed from: f, reason: collision with root package name */
    public final int f44498f;

    /* renamed from: g, reason: collision with root package name */
    public final int f44499g;

    /* renamed from: h, reason: collision with root package name */
    public final int f44500h;

    /* renamed from: i, reason: collision with root package name */
    public final int f44501i;

    /* renamed from: j, reason: collision with root package name */
    public final int f44502j;
    public final boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final e0 f44503l;

    /* renamed from: m, reason: collision with root package name */
    public final int f44504m;

    /* renamed from: n, reason: collision with root package name */
    public final e0 f44505n;

    /* renamed from: o, reason: collision with root package name */
    public final int f44506o;

    /* renamed from: p, reason: collision with root package name */
    public final int f44507p;

    /* renamed from: q, reason: collision with root package name */
    public final int f44508q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f44509r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f44510s;

    /* renamed from: t, reason: collision with root package name */
    public final int f44511t;

    /* renamed from: u, reason: collision with root package name */
    public final int f44512u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f44513v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f44514w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f44515x;

    /* renamed from: y, reason: collision with root package name */
    public final j0 f44516y;

    /* renamed from: z, reason: collision with root package name */
    public final AbstractC3414P f44517z;

    static {
        new r(new q());
    }

    public r(q qVar) {
        this.f44493a = qVar.f44468a;
        this.f44494b = qVar.f44469b;
        this.f44495c = qVar.f44470c;
        this.f44496d = qVar.f44471d;
        this.f44497e = qVar.f44472e;
        this.f44498f = qVar.f44473f;
        this.f44499g = qVar.f44474g;
        this.f44500h = qVar.f44475h;
        this.f44501i = qVar.f44476i;
        this.f44502j = qVar.f44477j;
        this.k = qVar.k;
        this.f44503l = qVar.f44478l;
        this.f44504m = qVar.f44479m;
        this.f44505n = qVar.f44480n;
        this.f44506o = qVar.f44481o;
        this.f44507p = qVar.f44482p;
        this.f44508q = qVar.f44483q;
        this.f44509r = qVar.f44484r;
        this.f44510s = qVar.f44485s;
        this.f44511t = qVar.f44486t;
        this.f44512u = qVar.f44487u;
        this.f44513v = qVar.f44488v;
        this.f44514w = qVar.f44489w;
        this.f44515x = qVar.f44490x;
        this.f44516y = j0.a(qVar.f44491y);
        this.f44517z = AbstractC3414P.j(qVar.f44492z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f44493a != rVar.f44493a || this.f44494b != rVar.f44494b || this.f44495c != rVar.f44495c || this.f44496d != rVar.f44496d || this.f44497e != rVar.f44497e || this.f44498f != rVar.f44498f || this.f44499g != rVar.f44499g || this.f44500h != rVar.f44500h || this.k != rVar.k || this.f44501i != rVar.f44501i || this.f44502j != rVar.f44502j || !this.f44503l.equals(rVar.f44503l) || this.f44504m != rVar.f44504m || !this.f44505n.equals(rVar.f44505n) || this.f44506o != rVar.f44506o || this.f44507p != rVar.f44507p || this.f44508q != rVar.f44508q || !this.f44509r.equals(rVar.f44509r) || !this.f44510s.equals(rVar.f44510s) || this.f44511t != rVar.f44511t || this.f44512u != rVar.f44512u || this.f44513v != rVar.f44513v || this.f44514w != rVar.f44514w || this.f44515x != rVar.f44515x) {
            return false;
        }
        j0 j0Var = this.f44516y;
        j0Var.getClass();
        return AbstractC3437s.f(rVar.f44516y, j0Var) && this.f44517z.equals(rVar.f44517z);
    }

    public int hashCode() {
        return this.f44517z.hashCode() + ((this.f44516y.hashCode() + ((((((((((((this.f44510s.hashCode() + ((this.f44509r.hashCode() + ((((((((this.f44505n.hashCode() + ((((this.f44503l.hashCode() + ((((((((((((((((((((((this.f44493a + 31) * 31) + this.f44494b) * 31) + this.f44495c) * 31) + this.f44496d) * 31) + this.f44497e) * 31) + this.f44498f) * 31) + this.f44499g) * 31) + this.f44500h) * 31) + (this.k ? 1 : 0)) * 31) + this.f44501i) * 31) + this.f44502j) * 31)) * 31) + this.f44504m) * 31)) * 31) + this.f44506o) * 31) + this.f44507p) * 31) + this.f44508q) * 31)) * 31)) * 31) + this.f44511t) * 31) + this.f44512u) * 31) + (this.f44513v ? 1 : 0)) * 31) + (this.f44514w ? 1 : 0)) * 31) + (this.f44515x ? 1 : 0)) * 31)) * 31);
    }
}
