package i0;

import B.C0318i;
import N.C0718d;
import N.C0729i0;
import N.C0736m;
import N.C0740o;
import N.C0744s;
import N.InterfaceC0742p;
import N.Y;
import ba.C1521a;
import d0.C2384c;
import e0.InterfaceC2463o;
import g0.InterfaceC2663d;
import h0.AbstractC2765c;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class L extends AbstractC2765c {

    /* renamed from: f, reason: collision with root package name */
    public final Y f36536f;

    /* renamed from: g, reason: collision with root package name */
    public final Y f36537g;

    /* renamed from: h, reason: collision with root package name */
    public final D f36538h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC0742p f36539i;

    /* renamed from: j, reason: collision with root package name */
    public final Y f36540j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public e0.r f36541l;

    public L() {
        d0.f fVar = new d0.f(d0.f.f33949b);
        N.P p10 = N.P.f7730f;
        this.f36536f = C0718d.G(fVar, p10);
        this.f36537g = C0718d.G(Boolean.FALSE, p10);
        D d3 = new D();
        d3.f36469e = new A0.p(this, 23);
        this.f36538h = d3;
        this.f36540j = C0718d.G(Boolean.TRUE, p10);
        this.k = 1.0f;
    }

    @Override // h0.AbstractC2765c
    public final boolean a(float f10) {
        this.k = f10;
        return true;
    }

    @Override // h0.AbstractC2765c
    public final boolean b(e0.r rVar) {
        this.f36541l = rVar;
        return true;
    }

    @Override // h0.AbstractC2765c
    public final long f() {
        return ((d0.f) this.f36536f.getValue()).f33952a;
    }

    @Override // h0.AbstractC2765c
    public final void g(InterfaceC2663d interfaceC2663d) {
        AbstractC3340k.e(interfaceC2663d, "<this>");
        e0.r rVar = this.f36541l;
        D d3 = this.f36538h;
        if (rVar == null) {
            rVar = (e0.r) d3.f36470f.getValue();
        }
        if (((Boolean) this.f36537g.getValue()).booleanValue() && interfaceC2663d.getLayoutDirection() == L0.i.f6807b) {
            long jX = interfaceC2663d.x();
            C1521a c1521aU = interfaceC2663d.u();
            long jY = c1521aU.y();
            c1521aU.v().m();
            InterfaceC2463o interfaceC2463oV = ((C1521a) ((ad.L) c1521aU.f19414b).f17515b).v();
            interfaceC2463oV.f(C2384c.b(jX), C2384c.c(jX));
            interfaceC2463oV.d();
            interfaceC2463oV.f(-C2384c.b(jX), -C2384c.c(jX));
            d3.e(interfaceC2663d, this.k, rVar);
            c1521aU.v().restore();
            c1521aU.J(jY);
        } else {
            d3.e(interfaceC2663d, this.k, rVar);
        }
        Y y10 = this.f36540j;
        if (((Boolean) y10.getValue()).booleanValue()) {
            y10.setValue(Boolean.FALSE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.jvm.internal.n, tf.a] */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlin.jvm.internal.n, tf.a] */
    public final void h(String str, float f10, float f11, V.d dVar, C0740o c0740o, int i5) {
        c0740o.N(1264894527);
        D d3 = this.f36538h;
        d3.getClass();
        C2823a root = d3.f36466b;
        root.getClass();
        root.f36581i = str;
        root.c();
        if (d3.f36471g != f10) {
            d3.f36471g = f10;
            d3.f36467c = true;
            d3.f36469e.invoke();
        }
        if (d3.f36472h != f11) {
            d3.f36472h = f11;
            d3.f36467c = true;
            d3.f36469e.invoke();
        }
        C0736m c0736mH = C0718d.H(c0740o);
        InterfaceC0742p c0744s = this.f36539i;
        if (c0744s == null || c0744s.a()) {
            AbstractC3340k.e(root, "root");
            c0744s = new C0744s(c0736mH, new C(root));
        }
        this.f36539i = c0744s;
        c0744s.b(new V.d(-1916507005, true, new C0318i(3, dVar, this)));
        C0718d.c(c0744s, new B.F(c0744s, 16), c0740o);
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R == null) {
            return;
        }
        c0729i0R.f7788d = new K(this, str, f10, f11, dVar, i5);
    }
}
