package i2;

import E5.C0441b;
import N1.C;
import N1.C0764m;
import N1.C0765n;
import N1.O;
import S1.A;
import S1.h;
import U1.a0;
import Z1.d;
import Z1.g;
import a9.C1342b;
import com.applovin.impl.Z0;
import java.util.AbstractList;
import java.util.ArrayList;
import k2.C3157n;
import k2.F;
import k2.InterfaceC3143E;
import k2.d0;
import k2.e0;
import k2.f0;
import k2.n0;
import l2.C3383h;
import l8.AbstractC3409K;
import l8.AbstractC3437s;
import l8.C3407I;
import n2.q;
import o2.e;
import o2.n;
import org.apache.tika.utils.StringUtils;
import wa.C4398a;

/* renamed from: i2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2842b implements F, e0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0441b f36728a;

    /* renamed from: b, reason: collision with root package name */
    public final A f36729b;

    /* renamed from: c, reason: collision with root package name */
    public final n f36730c;

    /* renamed from: d, reason: collision with root package name */
    public final g f36731d;

    /* renamed from: e, reason: collision with root package name */
    public final d f36732e;

    /* renamed from: f, reason: collision with root package name */
    public final ae.d f36733f;

    /* renamed from: g, reason: collision with root package name */
    public final d f36734g;

    /* renamed from: h, reason: collision with root package name */
    public final e f36735h;

    /* renamed from: i, reason: collision with root package name */
    public final n0 f36736i;

    /* renamed from: j, reason: collision with root package name */
    public final C1342b f36737j;
    public InterfaceC3143E k;

    /* renamed from: l, reason: collision with root package name */
    public j2.c f36738l;

    /* renamed from: m, reason: collision with root package name */
    public C3383h[] f36739m;

    /* renamed from: n, reason: collision with root package name */
    public C3157n f36740n;

    public C2842b(j2.c cVar, C0441b c0441b, A a5, C1342b c1342b, g gVar, d dVar, ae.d dVar2, d dVar3, n nVar, e eVar) {
        this.f36738l = cVar;
        this.f36728a = c0441b;
        this.f36729b = a5;
        this.f36730c = nVar;
        this.f36731d = gVar;
        this.f36732e = dVar;
        this.f36733f = dVar2;
        this.f36734g = dVar3;
        this.f36735h = eVar;
        this.f36737j = c1342b;
        O[] oArr = new O[cVar.f38600f.length];
        int i5 = 0;
        while (true) {
            j2.b[] bVarArr = cVar.f38600f;
            if (i5 >= bVarArr.length) {
                this.f36736i = new n0(oArr);
                this.f36739m = new C3383h[0];
                c1342b.getClass();
                C3407I c3407i = AbstractC3409K.f40056b;
                l8.e0 e0Var = l8.e0.f40101e;
                this.f36740n = new C3157n(e0Var, e0Var);
                return;
            }
            C0765n[] c0765nArr = bVarArr[i5].f38589j;
            C0765n[] c0765nArr2 = new C0765n[c0765nArr.length];
            for (int i10 = 0; i10 < c0765nArr.length; i10++) {
                C0765n c0765n = c0765nArr[i10];
                C0764m c0764mA = c0765n.a();
                c0764mA.f8182K = gVar.l(c0765n);
                C0765n c0765n2 = new C0765n(c0764mA);
                if (c0441b.f3290b && ((C4398a) c0441b.f3292d).d(c0765n2)) {
                    C0764m c0764mA2 = c0765n2.a();
                    c0764mA2.f8194m = C.m("application/x-media3-cues");
                    c0764mA2.f8179H = ((C4398a) c0441b.f3292d).g(c0765n2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(c0765n2.f8232n);
                    String str = c0765n2.k;
                    sb2.append(str != null ? StringUtils.SPACE.concat(str) : "");
                    c0764mA2.f8192j = sb2.toString();
                    c0764mA2.f8199r = Long.MAX_VALUE;
                    c0765n2 = new C0765n(c0764mA2);
                }
                c0765nArr2[i10] = c0765n2;
            }
            oArr[i5] = new O(Integer.toString(i5), c0765nArr2);
            i5++;
        }
    }

    @Override // k2.e0
    public final void a(f0 f0Var) {
        InterfaceC3143E interfaceC3143E = this.k;
        interfaceC3143E.getClass();
        interfaceC3143E.a(this);
    }

    @Override // k2.F
    public final long b(long j8, a0 a0Var) {
        for (C3383h c3383h : this.f36739m) {
            if (c3383h.f39903a == 2) {
                return c3383h.f39907e.b(j8, a0Var);
            }
        }
        return j8;
    }

    @Override // k2.f0
    public final long c() {
        return this.f36740n.c();
    }

    @Override // k2.F
    public final long d(long j8) throws Throwable {
        for (C3383h c3383h : this.f36739m) {
            c3383h.z(j8);
        }
        return j8;
    }

    @Override // k2.f0
    public final boolean e() {
        return this.f36740n.e();
    }

    @Override // k2.F
    public final long f() {
        return -9223372036854775807L;
    }

    @Override // k2.F
    public final void h() {
        this.f36730c.a();
    }

    @Override // k2.F
    public final void i(long j8) throws Throwable {
        for (C3383h c3383h : this.f36739m) {
            c3383h.i(j8);
        }
    }

    @Override // k2.F
    public final n0 j() {
        return this.f36736i;
    }

    @Override // k2.f0
    public final boolean k(U1.C c10) {
        return this.f36740n.k(c10);
    }

    @Override // k2.f0
    public final long n() {
        return this.f36740n.n();
    }

    @Override // k2.f0
    public final void o(long j8) {
        this.f36740n.o(j8);
    }

    @Override // k2.F
    public final void q(InterfaceC3143E interfaceC3143E, long j8) {
        this.k = interfaceC3143E;
        interfaceC3143E.l(this);
    }

    @Override // k2.F
    public final long r(q[] qVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j8) {
        int i5;
        q qVar;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < qVarArr.length) {
            d0 d0Var = d0VarArr[i10];
            if (d0Var != null) {
                C3383h c3383h = (C3383h) d0Var;
                q qVar2 = qVarArr[i10];
                if (qVar2 == null || !zArr[i10]) {
                    c3383h.y(null);
                    d0VarArr[i10] = null;
                } else {
                    ((C2841a) c3383h.f39907e).f36724e = qVar2;
                    arrayList.add(c3383h);
                }
            }
            if (d0VarArr[i10] != null || (qVar = qVarArr[i10]) == null) {
                i5 = i10;
            } else {
                int iB = this.f36736i.b(qVar.g());
                j2.c cVar = this.f36738l;
                C0441b c0441b = this.f36728a;
                h hVarB = ((S1.g) c0441b.f3291c).b();
                A a5 = this.f36729b;
                if (a5 != null) {
                    hVarB.C(a5);
                }
                C2841a c2841a = new C2841a(this.f36730c, cVar, iB, qVar, hVarB, (C4398a) c0441b.f3292d, c0441b.f3290b);
                i5 = i10;
                C3383h c3383h2 = new C3383h(this.f36738l.f38600f[iB].f38580a, null, null, c2841a, this, this.f36735h, j8, this.f36731d, this.f36732e, this.f36733f, this.f36734g, false);
                arrayList.add(c3383h2);
                d0VarArr[i5] = c3383h2;
                zArr2[i5] = true;
            }
            i10 = i5 + 1;
        }
        C3383h[] c3383hArr = new C3383h[arrayList.size()];
        this.f36739m = c3383hArr;
        arrayList.toArray(c3383hArr);
        AbstractList abstractListV = AbstractC3437s.v(arrayList, new Z0(26));
        this.f36737j.getClass();
        this.f36740n = new C3157n(arrayList, abstractListV);
        return j8;
    }
}
