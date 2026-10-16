package t0;

import A.AbstractC0213f;
import A.C0208a;
import A.W;
import B.C0318i;
import E.C0421k;
import e0.InterfaceC2463o;
import ef.C2515C;
import ff.AbstractC2641B;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import r0.C3905j;
import r0.InterfaceC3908m;
import r0.InterfaceC3909n;
import u0.C4188n;
import u0.InterfaceC4193p0;

/* loaded from: classes.dex */
public final class t implements InterfaceC3908m, InterfaceC4045J, InterfaceC4055c, InterfaceC4043H {

    /* renamed from: R, reason: collision with root package name */
    public static final C4064l f45491R = new C4064l();

    /* renamed from: S, reason: collision with root package name */
    public static final C4063k f45492S = new C4063k();

    /* renamed from: T, reason: collision with root package name */
    public static final a2.v f45493T = AbstractC2641B.G(C4056d.f45460l);

    /* renamed from: U, reason: collision with root package name */
    public static final C4065m f45494U = new C4065m();

    /* renamed from: A, reason: collision with root package name */
    public y f45495A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f45496B;

    /* renamed from: C, reason: collision with root package name */
    public final C4038C f45497C;

    /* renamed from: D, reason: collision with root package name */
    public C4038C f45498D;

    /* renamed from: E, reason: collision with root package name */
    public Z.k f45499E;

    /* renamed from: F, reason: collision with root package name */
    public C0208a f45500F;

    /* renamed from: G, reason: collision with root package name */
    public W f45501G;

    /* renamed from: H, reason: collision with root package name */
    public P.d f45502H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f45503I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f45504J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f45505K;
    public boolean L;

    /* renamed from: M, reason: collision with root package name */
    public final q6.d f45506M;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f45511a;

    /* renamed from: b, reason: collision with root package name */
    public int f45512b;

    /* renamed from: d, reason: collision with root package name */
    public P.d f45514d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f45515e;

    /* renamed from: f, reason: collision with root package name */
    public t f45516f;

    /* renamed from: g, reason: collision with root package name */
    public C4188n f45517g;

    /* renamed from: h, reason: collision with root package name */
    public int f45518h;

    /* renamed from: s, reason: collision with root package name */
    public boolean f45528s;

    /* renamed from: v, reason: collision with root package name */
    public int f45531v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f45532w;

    /* renamed from: x, reason: collision with root package name */
    public final C4061i f45533x;

    /* renamed from: y, reason: collision with root package name */
    public final C4041F f45534y;

    /* renamed from: z, reason: collision with root package name */
    public float f45535z;

    /* renamed from: c, reason: collision with root package name */
    public final P.d f45513c = new P.d(new t[16]);

    /* renamed from: N, reason: collision with root package name */
    public int f45507N = 3;

    /* renamed from: i, reason: collision with root package name */
    public final P.d f45519i = new P.d(new C4036A[16]);

    /* renamed from: j, reason: collision with root package name */
    public final P.d f45520j = new P.d(new t[16]);
    public boolean k = true;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC3909n f45521l = f45491R;

    /* renamed from: m, reason: collision with root package name */
    public final C4062j f45522m = new C4062j(0);

    /* renamed from: n, reason: collision with root package name */
    public L0.b f45523n = new L0.c(1.0f, 1.0f);

    /* renamed from: o, reason: collision with root package name */
    public final C4070r f45524o = new C4070r(this);

    /* renamed from: p, reason: collision with root package name */
    public L0.i f45525p = L0.i.f6806a;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC4193p0 f45526q = f45492S;

    /* renamed from: r, reason: collision with root package name */
    public final u f45527r = new u(this);

    /* renamed from: t, reason: collision with root package name */
    public int f45529t = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: u, reason: collision with root package name */
    public int f45530u = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: O, reason: collision with root package name */
    public int f45508O = 3;

    /* renamed from: P, reason: collision with root package name */
    public int f45509P = 3;

    /* renamed from: Q, reason: collision with root package name */
    public int f45510Q = 3;

    public t(boolean z2) {
        this.f45511a = z2;
        C4061i c4061i = new C4061i(this);
        this.f45533x = c4061i;
        this.f45534y = new C4041F(this, c4061i);
        this.f45496B = true;
        C4038C c4038c = new C4038C(this, f45494U);
        this.f45497C = c4038c;
        this.f45498D = c4038c;
        this.f45499E = Z.i.f16922a;
        this.f45506M = new q6.d(21);
    }

    public final void A() {
        P.d dVarL = l();
        int i5 = dVarL.f8972c;
        if (i5 > 0) {
            Object[] objArr = dVarL.f8970a;
            int i10 = 0;
            do {
                t tVar = (t) objArr[i10];
                int i11 = tVar.f45510Q;
                tVar.f45509P = i11;
                if (i11 != 3) {
                    tVar.A();
                }
                i10++;
            } while (i10 < i5);
        }
    }

    public final void B(L0.b value) {
        AbstractC3340k.e(value, "value");
        if (AbstractC3340k.a(this.f45523n, value)) {
            return;
        }
        this.f45523n = value;
        z(false);
        t tVarJ = j();
        if (tVarJ != null) {
            tVarJ.o();
        }
        p();
    }

    public final void C(InterfaceC3909n value) {
        AbstractC3340k.e(value, "value");
        if (AbstractC3340k.a(this.f45521l, value)) {
            return;
        }
        this.f45521l = value;
        this.f45522m.getClass();
        z(false);
    }

    public final void D(Z.k value) {
        C4061i c4061i;
        P.d dVar;
        boolean z2;
        t tVarJ;
        t tVarJ2;
        C4188n c4188n;
        AbstractC3340k.e(value, "value");
        if (value.equals(this.f45499E)) {
            return;
        }
        if (!AbstractC3340k.a(this.f45499E, Z.i.f16922a) && this.f45511a) {
            throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes");
        }
        this.f45499E = value;
        boolean zE = E();
        C4041F c4041f = this.f45534y;
        y yVar = c4041f.f45436f;
        while (true) {
            c4061i = this.f45533x;
            boolean zA = AbstractC3340k.a(yVar, c4061i);
            dVar = this.f45519i;
            if (zA) {
                break;
            }
            C4036A c4036a = (C4036A) yVar;
            dVar.b(c4036a);
            yVar = c4036a.f45418z;
        }
        y yVarN = c4041f.f45436f;
        c4061i.getClass();
        while (true) {
            if (AbstractC3340k.a(yVarN, null) || yVarN == null) {
                break;
            }
            X0.E[] eArr = yVarN.f45574s;
            for (X0.E e7 : eArr) {
                for (; e7 != null; e7 = (X0.E) e7.f15790d) {
                    if (e7.f15787a) {
                        e7.h();
                    }
                }
            }
            int length = eArr.length;
            for (int i5 = 0; i5 < length; i5++) {
                eArr[i5] = null;
            }
            yVarN = yVarN.N();
        }
        int i10 = dVar.f8972c;
        if (i10 > 0) {
            Object[] objArr = dVar.f8970a;
            int i11 = 0;
            do {
                ((C4036A) objArr[i11]).f45417B = false;
                i11++;
            } while (i11 < i10);
        }
        value.p(C2515C.f34653a, new C4069q(this, 0));
        y yVar2 = c4041f.f45436f;
        if (S3.f.v(this) != null && r()) {
            C4188n c4188n2 = this.f45517g;
            AbstractC3340k.b(c4188n2);
            c4188n2.o();
        }
        boolean zBooleanValue = ((Boolean) this.f45499E.h(Boolean.FALSE, new C0421k(this.f45502H, 5))).booleanValue();
        P.d dVar2 = this.f45502H;
        if (dVar2 != null) {
            dVar2.e();
        }
        InterfaceC4042G interfaceC4042G = c4061i.f45577v;
        if (interfaceC4042G != null) {
            interfaceC4042G.invalidate();
        }
        y yVar3 = (y) this.f45499E.h(c4061i, new C4069q(this, 1));
        P.d dVar3 = new P.d(new C4037B[16]);
        C4038C c4038c = this.f45497C;
        for (C4038C c4038c2 = c4038c; c4038c2 != null; c4038c2 = c4038c2.f45426c) {
            int i12 = dVar3.f8972c;
            P.d dVar4 = c4038c2.f45429f;
            dVar3.c(i12, dVar4);
            dVar4.e();
        }
        C4038C c4038c3 = (C4038C) value.p(c4038c, new C0318i(5, this, dVar3));
        this.f45498D = c4038c3;
        c4038c3.f45426c = null;
        if (r()) {
            int i13 = dVar3.f8972c;
            if (i13 > 0) {
                Object[] objArr2 = dVar3.f8970a;
                int i14 = 0;
                while (true) {
                    C4037B c4037b = (C4037B) objArr2[i14];
                    z2 = zE;
                    c4037b.f45421b.o(C4037B.f45419e);
                    c4037b.f45423d = false;
                    i14++;
                    if (i14 >= i13) {
                        break;
                    } else {
                        zE = z2;
                    }
                }
            } else {
                z2 = zE;
            }
            for (C4038C c4038c4 = c4038c3.f45426c; c4038c4 != null; c4038c4 = c4038c4.f45426c) {
                c4038c4.a();
            }
            while (c4038c != null) {
                c4038c.f45428e = true;
                C4188n c4188n3 = c4038c.f45424a.f45517g;
                if (c4188n3 != null) {
                    c4188n3.r(c4038c);
                }
                P.d dVar5 = c4038c.f45429f;
                int i15 = dVar5.f8972c;
                if (i15 > 0) {
                    Object[] objArr3 = dVar5.f8970a;
                    int i16 = 0;
                    do {
                        C4037B c4037b2 = (C4037B) objArr3[i16];
                        c4037b2.f45423d = true;
                        C4188n c4188n4 = c4037b2.f45420a.f45424a.f45517g;
                        if (c4188n4 != null) {
                            c4188n4.r(c4037b2);
                        }
                        i16++;
                    } while (i16 < i15);
                }
                c4038c = c4038c.f45426c;
            }
        } else {
            z2 = zE;
        }
        t tVarJ3 = j();
        yVar3.f45562f = tVarJ3 != null ? tVarJ3.f45533x : null;
        c4041f.f45436f = yVar3;
        if (r()) {
            int i17 = dVar.f8972c;
            if (i17 > 0) {
                Object[] objArr4 = dVar.f8970a;
                int i18 = 0;
                do {
                    ((C4036A) objArr4[i18]).B();
                    i18++;
                } while (i18 < i17);
            }
            for (y yVarN2 = c4041f.f45436f; !AbstractC3340k.a(yVarN2, null) && yVarN2 != null; yVarN2 = yVarN2.N()) {
                if (yVarN2.S()) {
                    for (X0.E e10 : yVarN2.f45574s) {
                        for (; e10 != null; e10 = (X0.E) e10.f15790d) {
                            e10.g();
                        }
                    }
                } else {
                    yVarN2.s();
                }
            }
        }
        dVar.e();
        for (y yVarN3 = c4041f.f45436f; !AbstractC3340k.a(yVarN3, null) && yVarN3 != null; yVarN3 = yVarN3.N()) {
            InterfaceC4042G interfaceC4042G2 = yVarN3.f45577v;
            if (interfaceC4042G2 != null) {
                interfaceC4042G2.invalidate();
            }
        }
        if (!AbstractC3340k.a(yVar2, c4061i) || !yVar3.equals(c4061i)) {
            z(false);
        } else if (this.f45507N == 3 && !this.f45505K && zBooleanValue) {
            z(false);
        } else if (Fe.e.H(c4061i.f45574s, 4) && (c4188n = this.f45517g) != null) {
            z zVar = c4188n.f46265D;
            zVar.getClass();
            zVar.f45582e.b(this);
            c4188n.s(null);
        }
        Object obj = c4041f.f45441l;
        Object objA = c4041f.f45436f.a();
        c4041f.f45441l = objA;
        if (!AbstractC3340k.a(obj, objA) && (tVarJ2 = j()) != null) {
            tVarJ2.z(false);
        }
        if ((z2 || E()) && (tVarJ = j()) != null) {
            tVarJ.o();
        }
    }

    public final boolean E() {
        this.f45533x.getClass();
        for (y yVarN = this.f45534y.f45436f; !AbstractC3340k.a(yVarN, null) && yVarN != null; yVarN = yVarN.N()) {
            if (yVarN.f45577v != null) {
                return false;
            }
            if (Fe.e.H(yVarN.f45574s, 0)) {
                return true;
            }
        }
        return true;
    }

    @Override // r0.InterfaceC3908m
    public final Object a() {
        return this.f45534y.f45441l;
    }

    public final void b(C4188n owner) {
        AbstractC3340k.e(owner, "owner");
        if (this.f45517g != null) {
            throw new IllegalStateException(("Cannot attach " + this + " as it already is attached.  Tree: " + f(0)).toString());
        }
        t tVar = this.f45516f;
        if (tVar != null && !AbstractC3340k.a(tVar.f45517g, owner)) {
            StringBuilder sb2 = new StringBuilder("Attaching to a different owner(");
            sb2.append(owner);
            sb2.append(") than the parent's owner(");
            t tVarJ = j();
            sb2.append(tVarJ != null ? tVarJ.f45517g : null);
            sb2.append("). This tree: ");
            sb2.append(f(0));
            sb2.append(" Parent tree: ");
            t tVar2 = this.f45516f;
            sb2.append(tVar2 != null ? tVar2.f(0) : null);
            throw new IllegalStateException(sb2.toString().toString());
        }
        t tVarJ2 = j();
        if (tVarJ2 == null) {
            this.f45528s = true;
        }
        this.f45517g = owner;
        this.f45518h = (tVarJ2 != null ? tVarJ2.f45518h : -1) + 1;
        if (S3.f.v(this) != null) {
            owner.o();
        }
        P.d dVar = this.f45513c;
        int i5 = dVar.f8972c;
        if (i5 > 0) {
            Object[] objArr = dVar.f8970a;
            int i10 = 0;
            do {
                ((t) objArr[i10]).b(owner);
                i10++;
            } while (i10 < i5);
        }
        z(false);
        if (tVarJ2 != null) {
            tVarJ2.z(false);
        }
        this.f45533x.getClass();
        for (y yVarN = this.f45534y.f45436f; !AbstractC3340k.a(yVarN, null) && yVarN != null; yVarN = yVarN.N()) {
            yVarN.s();
        }
        for (C4038C c4038c = this.f45497C; c4038c != null; c4038c = c4038c.f45426c) {
            c4038c.f45428e = true;
            c4038c.c(c4038c.f45425b.getKey(), false);
            P.d dVar2 = c4038c.f45429f;
            int i11 = dVar2.f8972c;
            if (i11 > 0) {
                Object[] objArr2 = dVar2.f8970a;
                int i12 = 0;
                do {
                    C4037B c4037b = (C4037B) objArr2[i12];
                    c4037b.f45423d = true;
                    c4037b.b();
                    i12++;
                } while (i12 < i11);
            }
        }
        C0208a c0208a = this.f45500F;
        if (c0208a != null) {
            c0208a.invoke(owner);
        }
    }

    public final void c() {
        this.f45510Q = this.f45509P;
        this.f45509P = 3;
        P.d dVarL = l();
        int i5 = dVarL.f8972c;
        if (i5 > 0) {
            Object[] objArr = dVarL.f8970a;
            int i10 = 0;
            do {
                t tVar = (t) objArr[i10];
                if (tVar.f45509P != 3) {
                    tVar.c();
                }
                i10++;
            } while (i10 < i5);
        }
    }

    public final void d() {
        this.f45510Q = this.f45509P;
        this.f45509P = 3;
        P.d dVarL = l();
        int i5 = dVarL.f8972c;
        if (i5 > 0) {
            Object[] objArr = dVarL.f8970a;
            int i10 = 0;
            do {
                t tVar = (t) objArr[i10];
                if (tVar.f45509P == 2) {
                    tVar.d();
                }
                i10++;
            } while (i10 < i5);
        }
    }

    @Override // r0.InterfaceC3908m
    public final r0.t e(long j8) {
        if (this.f45509P == 3) {
            c();
        }
        C4041F c4041f = this.f45534y;
        c4041f.e(j8);
        return c4041f;
    }

    public final String f(int i5) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < i5; i10++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        P.d dVarL = l();
        int i11 = dVarL.f8972c;
        if (i11 > 0) {
            Object[] objArr = dVarL.f8970a;
            int i12 = 0;
            do {
                sb2.append(((t) objArr[i12]).f(i5 + 1));
                i12++;
            } while (i12 < i11);
        }
        String string = sb2.toString();
        AbstractC3340k.d(string, "tree.toString()");
        if (i5 != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        AbstractC3340k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final void g() {
        C4188n c4188n = this.f45517g;
        if (c4188n == null) {
            StringBuilder sb2 = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            t tVarJ = j();
            sb2.append(tVarJ != null ? tVarJ.f(0) : null);
            throw new IllegalStateException(sb2.toString().toString());
        }
        t tVarJ2 = j();
        if (tVarJ2 != null) {
            tVarJ2.o();
            tVarJ2.z(false);
        }
        u uVar = this.f45527r;
        uVar.f45537b = true;
        uVar.f45538c = false;
        uVar.f45539d = false;
        uVar.f45540e = false;
        uVar.f45541f = null;
        W w2 = this.f45501G;
        if (w2 != null) {
            w2.invoke(c4188n);
        }
        for (C4038C c4038c = this.f45497C; c4038c != null; c4038c = c4038c.f45426c) {
            c4038c.a();
        }
        this.f45533x.getClass();
        for (y yVarN = this.f45534y.f45436f; !AbstractC3340k.a(yVarN, null) && yVarN != null; yVarN = yVarN.N()) {
            yVarN.B();
        }
        if (S3.f.v(this) != null) {
            c4188n.o();
        }
        z zVar = c4188n.f46265D;
        zVar.getClass();
        zVar.f45579b.B(this);
        c4188n.f46317u = true;
        this.f45517g = null;
        this.f45518h = 0;
        P.d dVar = this.f45513c;
        int i5 = dVar.f8972c;
        if (i5 > 0) {
            Object[] objArr = dVar.f8970a;
            int i10 = 0;
            do {
                ((t) objArr[i10]).g();
                i10++;
            } while (i10 < i5);
        }
        this.f45529t = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f45530u = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f45528s = false;
    }

    public final void h(InterfaceC2463o canvas) {
        AbstractC3340k.e(canvas, "canvas");
        this.f45534y.f45436f.D(canvas);
    }

    public final P.a i() {
        P.d dVarL = l();
        P.a aVar = dVarL.f8971b;
        if (aVar != null) {
            return aVar;
        }
        P.a aVar2 = new P.a(dVarL);
        dVarL.f8971b = aVar2;
        return aVar2;
    }

    public final t j() {
        t tVar = this.f45516f;
        return (tVar == null || !tVar.f45511a) ? tVar : tVar.j();
    }

    public final P.d k() {
        boolean z2 = this.k;
        P.d dVar = this.f45520j;
        if (z2) {
            dVar.e();
            dVar.c(dVar.f8972c, l());
            dVar.n(this.f45506M);
            this.k = false;
        }
        return dVar;
    }

    public final P.d l() {
        int i5 = this.f45512b;
        P.d dVar = this.f45513c;
        if (i5 == 0) {
            return dVar;
        }
        if (this.f45515e) {
            int i10 = 0;
            this.f45515e = false;
            P.d dVar2 = this.f45514d;
            if (dVar2 == null) {
                dVar2 = new P.d(new t[16]);
                this.f45514d = dVar2;
            }
            dVar2.e();
            int i11 = dVar.f8972c;
            if (i11 > 0) {
                Object[] objArr = dVar.f8970a;
                do {
                    t tVar = (t) objArr[i10];
                    if (tVar.f45511a) {
                        dVar2.c(dVar2.f8972c, tVar.l());
                    } else {
                        dVar2.b(tVar);
                    }
                    i10++;
                } while (i10 < i11);
            }
        }
        P.d dVar3 = this.f45514d;
        AbstractC3340k.b(dVar3);
        return dVar3;
    }

    public final void m(long j8, C4060h hitTestResult, boolean z2, boolean z10) {
        AbstractC3340k.e(hitTestResult, "hitTestResult");
        C4041F c4041f = this.f45534y;
        c4041f.f45436f.P(y.f45559x, c4041f.f45436f.G(j8), hitTestResult, z2, z10);
    }

    @Override // t0.InterfaceC4045J
    public final boolean n() {
        return r();
    }

    public final void o() {
        if (this.f45496B) {
            y yVar = this.f45534y.f45436f.f45562f;
            this.f45495A = null;
            y yVar2 = this.f45533x;
            while (true) {
                if (AbstractC3340k.a(yVar2, yVar)) {
                    break;
                }
                if ((yVar2 != null ? yVar2.f45577v : null) != null) {
                    this.f45495A = yVar2;
                    break;
                }
                yVar2 = yVar2 != null ? yVar2.f45562f : null;
            }
        }
        y yVar3 = this.f45495A;
        if (yVar3 != null && yVar3.f45577v == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (yVar3 != null) {
            yVar3.R();
            return;
        }
        t tVarJ = j();
        if (tVarJ != null) {
            tVarJ.o();
        }
    }

    public final void p() {
        C4061i c4061i;
        y yVar = this.f45534y.f45436f;
        while (true) {
            c4061i = this.f45533x;
            if (AbstractC3340k.a(yVar, c4061i)) {
                break;
            }
            C4036A c4036a = (C4036A) yVar;
            InterfaceC4042G interfaceC4042G = c4036a.f45577v;
            if (interfaceC4042G != null) {
                interfaceC4042G.invalidate();
            }
            yVar = c4036a.f45418z;
        }
        InterfaceC4042G interfaceC4042G2 = c4061i.f45577v;
        if (interfaceC4042G2 != null) {
            interfaceC4042G2.invalidate();
        }
    }

    public final void q() {
        t tVarJ;
        if (this.f45512b > 0) {
            this.f45515e = true;
        }
        if (!this.f45511a || (tVarJ = j()) == null) {
            return;
        }
        tVarJ.f45515e = true;
    }

    public final boolean r() {
        return this.f45517g != null;
    }

    public final void s() {
        C4061i c4061i;
        P.d dVarL;
        int i5;
        boolean zQ;
        u uVar = this.f45527r;
        uVar.c();
        if (this.L && (i5 = (dVarL = l()).f8972c) > 0) {
            Object[] objArr = dVarL.f8970a;
            int i10 = 0;
            do {
                t tVar = (t) objArr[i10];
                if (tVar.f45505K && tVar.f45508O == 1) {
                    C4041F c4041f = tVar.f45534y;
                    L0.a aVar = c4041f.f45437g ? new L0.a(c4041f.f44310d) : null;
                    if (aVar != null) {
                        if (tVar.f45509P == 3) {
                            tVar.c();
                        }
                        zQ = c4041f.q(aVar.f6792a);
                    } else {
                        zQ = false;
                    }
                    if (zQ) {
                        z(false);
                    }
                }
                i10++;
            } while (i10 < i5);
        }
        if (this.L) {
            this.L = false;
            this.f45507N = 2;
            C4046K snapshotObserver = ((C4188n) S3.f.E(this)).getSnapshotObserver();
            C4068p c4068p = new C4068p(this, 0);
            snapshotObserver.getClass();
            snapshotObserver.a(this, snapshotObserver.f45444c, c4068p);
            this.f45507N = 3;
        }
        if (uVar.f45537b) {
            uVar.c();
            if (uVar.f45541f != null) {
                HashMap map = uVar.f45542g;
                map.clear();
                t tVar2 = uVar.f45536a;
                P.d dVarL2 = tVar2.l();
                int i11 = dVarL2.f8972c;
                C4061i c4061i2 = tVar2.f45533x;
                if (i11 > 0) {
                    Object[] objArr2 = dVarL2.f8970a;
                    int i12 = 0;
                    do {
                        t tVar3 = (t) objArr2[i12];
                        if (tVar3.f45528s) {
                            u uVar2 = tVar3.f45527r;
                            if (uVar2.f45537b) {
                                tVar3.s();
                            }
                            Iterator it = uVar2.f45542g.entrySet().iterator();
                            while (true) {
                                boolean zHasNext = it.hasNext();
                                c4061i = tVar3.f45533x;
                                if (!zHasNext) {
                                    break;
                                }
                                Map.Entry entry = (Map.Entry) it.next();
                                u.b(uVar, (C3905j) entry.getKey(), ((Number) entry.getValue()).intValue(), c4061i);
                            }
                            y yVar = c4061i.f45562f;
                            AbstractC3340k.b(yVar);
                            while (!yVar.equals(c4061i2)) {
                                for (C3905j c3905j : ((Map) yVar.I().f2261e).keySet()) {
                                    u.b(uVar, c3905j, yVar.H(c3905j), yVar);
                                }
                                yVar = yVar.f45562f;
                                AbstractC3340k.b(yVar);
                            }
                        }
                        i12++;
                    } while (i12 < i11);
                }
                map.putAll((Map) c4061i2.I().f2261e);
                uVar.f45537b = false;
            }
        }
    }

    public final void t() {
        this.f45528s = true;
        this.f45533x.getClass();
        for (y yVarN = this.f45534y.f45436f; !AbstractC3340k.a(yVarN, null) && yVarN != null; yVarN = yVarN.N()) {
            if (yVarN.f45576u) {
                yVarN.R();
            }
        }
        P.d dVarL = l();
        int i5 = dVarL.f8972c;
        if (i5 > 0) {
            Object[] objArr = dVarL.f8970a;
            int i10 = 0;
            do {
                t tVar = (t) objArr[i10];
                if (tVar.f45529t != Integer.MAX_VALUE) {
                    tVar.t();
                    if (AbstractC4067o.f45483a[AbstractC0213f.f(tVar.f45507N)] != 1) {
                        throw new IllegalStateException("Unexpected state ".concat(pd.f.t(tVar.f45507N)));
                    }
                    if (tVar.f45505K) {
                        tVar.z(true);
                    } else if (tVar.L) {
                        tVar.y(true);
                    }
                }
                i10++;
            } while (i10 < i5);
        }
    }

    public final String toString() {
        return u0.Q.j(this) + " children: " + i().f8964a.f8972c + " measurePolicy: " + this.f45521l;
    }

    public final void u() {
        if (this.f45528s) {
            int i5 = 0;
            this.f45528s = false;
            P.d dVarL = l();
            int i10 = dVarL.f8972c;
            if (i10 > 0) {
                Object[] objArr = dVarL.f8970a;
                do {
                    ((t) objArr[i5]).u();
                    i5++;
                } while (i5 < i10);
            }
        }
    }

    public final void v() {
        u uVar = this.f45527r;
        if (uVar.f45537b) {
            return;
        }
        uVar.f45537b = true;
        t tVarJ = j();
        if (tVarJ == null) {
            return;
        }
        if (uVar.f45538c) {
            tVarJ.y(false);
        }
        if (uVar.f45539d) {
            z(false);
        }
        if (uVar.f45540e) {
            tVarJ.y(false);
        }
        tVarJ.v();
    }

    public final void w(t tVar) {
        if (this.f45517g != null) {
            tVar.g();
        }
        tVar.f45516f = null;
        tVar.f45534y.f45436f.f45562f = null;
        if (tVar.f45511a) {
            this.f45512b--;
            P.d dVar = tVar.f45513c;
            int i5 = dVar.f8972c;
            if (i5 > 0) {
                Object[] objArr = dVar.f8970a;
                int i10 = 0;
                do {
                    ((t) objArr[i10]).f45534y.f45436f.f45562f = null;
                    i10++;
                } while (i10 < i5);
            }
        }
        q();
        x();
    }

    public final void x() {
        if (!this.f45511a) {
            this.k = true;
            return;
        }
        t tVarJ = j();
        if (tVarJ != null) {
            tVarJ.x();
        }
    }

    public final void y(boolean z2) {
        C4188n c4188n;
        if (this.f45511a || (c4188n = this.f45517g) == null || !c4188n.f46265D.e(this, z2)) {
            return;
        }
        c4188n.s(null);
    }

    public final void z(boolean z2) {
        C4188n c4188n;
        t tVarJ;
        if (this.f45511a || (c4188n = this.f45517g) == null) {
            return;
        }
        if (c4188n.f46265D.f(this, z2)) {
            c4188n.s(this);
        }
        t tVar = this.f45534y.f45435e;
        t tVarJ2 = tVar.j();
        int i5 = tVar.f45509P;
        if (tVarJ2 == null || i5 == 3) {
            return;
        }
        while (tVarJ2.f45509P == i5 && (tVarJ = tVarJ2.j()) != null) {
            tVarJ2 = tVarJ;
        }
        int iF = AbstractC0213f.f(i5);
        if (iF == 0) {
            tVarJ2.z(z2);
        } else {
            if (iF != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            tVarJ2.y(z2);
        }
    }
}
