package c0;

import A7.B0;
import Va.M6;
import a2.v;
import kotlin.jvm.internal.AbstractC3340k;
import m0.C3475a;
import n0.AbstractC3566e;
import n0.C3564c;
import q0.AbstractC3853c;
import r0.AbstractC3900e;
import s0.InterfaceC3987a;
import t0.InterfaceC4045J;
import t0.t;
import t0.y;
import u0.C4186m;
import u0.C4188n;

/* renamed from: c0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1542g extends B0 implements InterfaceC3987a, s0.b, InterfaceC4045J, r0.q {

    /* renamed from: b, reason: collision with root package name */
    public C1542g f19498b;

    /* renamed from: c, reason: collision with root package name */
    public final P.d f19499c;

    /* renamed from: d, reason: collision with root package name */
    public r f19500d;

    /* renamed from: e, reason: collision with root package name */
    public C1542g f19501e;

    /* renamed from: f, reason: collision with root package name */
    public C1539d f19502f;

    /* renamed from: g, reason: collision with root package name */
    public C3475a f19503g;

    /* renamed from: h, reason: collision with root package name */
    public n f19504h;

    /* renamed from: i, reason: collision with root package name */
    public final l f19505i;

    /* renamed from: j, reason: collision with root package name */
    public q f19506j;
    public y k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f19507l;

    /* renamed from: m, reason: collision with root package name */
    public C3564c f19508m;

    /* renamed from: n, reason: collision with root package name */
    public final P.d f19509n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1542g() {
        super((tf.l) C4186m.f46256l);
        r rVar = r.f19539f;
        this.f19499c = new P.d(new C1542g[16]);
        this.f19500d = rVar;
        l lVar = new l();
        lVar.f19516a = true;
        o oVar = o.f19529b;
        lVar.f19517b = oVar;
        lVar.f19518c = oVar;
        lVar.f19519d = oVar;
        lVar.f19520e = oVar;
        lVar.f19521f = oVar;
        lVar.f19522g = oVar;
        lVar.f19523h = oVar;
        lVar.f19524i = oVar;
        this.f19505i = lVar;
        this.f19509n = new P.d(new C3564c[16]);
    }

    public final void e0(r rVar) {
        this.f19500d = rVar;
        C1539d c1539d = this.f19502f;
        if (c1539d != null) {
            c1539d.c();
        }
    }

    @Override // Z.k
    public final /* synthetic */ Z.k g(Z.k kVar) {
        return M6.f(this, kVar);
    }

    @Override // s0.b
    public final v getKey() {
        return k.f19514a;
    }

    @Override // Z.k
    public final Object h(Object obj, tf.p pVar) {
        return pVar.invoke(this, obj);
    }

    @Override // t0.InterfaceC4045J
    public final boolean n() {
        return this.f19498b != null;
    }

    @Override // s0.InterfaceC3987a
    public final void o(s0.c scope) {
        P.d dVar;
        P.d dVar2;
        int iOrdinal;
        y yVar;
        t tVar;
        C4188n c4188n;
        InterfaceC1540e focusManager;
        AbstractC3340k.e(scope, "scope");
        C1542g c1542g = (C1542g) scope.a(k.f19514a);
        if (!AbstractC3340k.a(c1542g, this.f19498b)) {
            if (c1542g == null && (((iOrdinal = this.f19500d.ordinal()) == 0 || iOrdinal == 2) && (yVar = this.k) != null && (tVar = yVar.f45561e) != null && (c4188n = tVar.f45517g) != null && (focusManager = c4188n.getFocusManager()) != null)) {
                ((b7.k) focusManager).p(true);
            }
            C1542g c1542g2 = this.f19498b;
            if (c1542g2 != null && (dVar2 = c1542g2.f19499c) != null) {
                dVar2.k(this);
            }
            if (c1542g != null && (dVar = c1542g.f19499c) != null) {
                dVar.b(this);
            }
        }
        this.f19498b = c1542g;
        C1539d c1539d = (C1539d) scope.a(AbstractC1538c.f19492a);
        if (!AbstractC3340k.a(c1539d, this.f19502f)) {
            C1539d c1539d2 = this.f19502f;
            if (c1539d2 != null) {
                c1539d2.d(this);
            }
            if (c1539d != null) {
                c1539d.a(this);
            }
        }
        this.f19502f = c1539d;
        q qVar = (q) scope.a(p.f19531a);
        if (!AbstractC3340k.a(qVar, this.f19506j)) {
            q qVar2 = this.f19506j;
            if (qVar2 != null) {
                qVar2.c(this);
            }
            if (qVar != null) {
                qVar.a(this);
            }
        }
        this.f19506j = qVar;
        this.f19503g = (C3475a) scope.a(AbstractC3853c.f43960a);
        if (scope.a(AbstractC3900e.f44294a) != null) {
            throw new ClassCastException();
        }
        this.f19508m = (C3564c) scope.a(AbstractC3566e.f40757a);
        this.f19504h = (n) scope.a(m.f19525a);
        m.a(this);
    }

    @Override // Z.k
    public final Object p(Object obj, tf.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // r0.q
    public final void r(y coordinates) {
        AbstractC3340k.e(coordinates, "coordinates");
        boolean z2 = this.k == null;
        this.k = coordinates;
        if (z2) {
            m.a(this);
        }
        if (this.f19507l) {
            this.f19507l = false;
            xg.g.M(this);
        }
    }

    @Override // Z.k
    public final /* synthetic */ boolean v() {
        return M6.a(this, Z.h.f16921i);
    }

    @Override // s0.b
    public final Object getValue() {
        return this;
    }
}
