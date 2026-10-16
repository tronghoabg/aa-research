package E;

import A7.B0;
import N.C0718d;
import N.Y;
import Va.M6;
import kotlin.jvm.internal.AbstractC3340k;
import p7.AbstractC3772b;
import r0.InterfaceC3907l;
import r0.InterfaceC3908m;
import s0.InterfaceC3987a;
import t0.C4070r;
import u0.C4186m;

/* loaded from: classes.dex */
public final class B extends B0 implements InterfaceC3907l, InterfaceC3987a, s0.b {

    /* renamed from: b, reason: collision with root package name */
    public final C0411a f2665b;

    /* renamed from: c, reason: collision with root package name */
    public final Y f2666c;

    /* renamed from: d, reason: collision with root package name */
    public final Y f2667d;

    /* JADX WARN: Illegal instructions before constructor call */
    public B(C0411a insets) {
        C4186m c4186m = C4186m.f46256l;
        AbstractC3340k.e(insets, "insets");
        super((tf.l) c4186m);
        this.f2665b = insets;
        N.P p10 = N.P.f7730f;
        this.f2666c = C0718d.G(insets, p10);
        this.f2667d = C0718d.G(insets, p10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof B) {
            return AbstractC3340k.a(((B) obj).f2665b, this.f2665b);
        }
        return false;
    }

    @Override // Z.k
    public final /* synthetic */ Z.k g(Z.k kVar) {
        return M6.f(this, kVar);
    }

    @Override // s0.b
    public final a2.v getKey() {
        return U.f2732a;
    }

    @Override // s0.b
    public final Object getValue() {
        return (Q) this.f2667d.getValue();
    }

    @Override // Z.k
    public final Object h(Object obj, tf.p pVar) {
        return pVar.invoke(this, obj);
    }

    public final int hashCode() {
        return this.f2665b.hashCode();
    }

    @Override // s0.InterfaceC3987a
    public final void o(s0.c scope) {
        AbstractC3340k.e(scope, "scope");
        Q insets = (Q) scope.a(U.f2732a);
        C0411a c0411a = this.f2665b;
        AbstractC3340k.e(c0411a, "<this>");
        AbstractC3340k.e(insets, "insets");
        this.f2666c.setValue(new C0431v(c0411a, insets));
        this.f2667d.setValue(AbstractC3772b.V(insets, c0411a));
    }

    @Override // Z.k
    public final Object p(Object obj, tf.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // r0.InterfaceC3907l
    public final D0.b q(C4070r measure, InterfaceC3908m measurable, long j8) {
        AbstractC3340k.e(measure, "$this$measure");
        AbstractC3340k.e(measurable, "measurable");
        Y y10 = this.f2666c;
        Q q4 = (Q) y10.getValue();
        t0.t tVar = measure.f45488a;
        int iB = q4.b(measure, tVar.f45525p);
        int iD = ((Q) y10.getValue()).d(measure);
        int iA = ((Q) y10.getValue()).a(measure, tVar.f45525p) + iB;
        int iC = ((Q) y10.getValue()).c(measure) + iD;
        r0.t tVarE = measurable.e(xg.g.C(-iA, -iC, j8));
        return pd.f.j(measure, xg.g.u(tVarE.f44307a + iA, j8), xg.g.t(tVarE.f44308b + iC, j8), new A(tVarE, iB, iD));
    }

    @Override // Z.k
    public final /* synthetic */ boolean v() {
        return M6.a(this, Z.h.f16921i);
    }
}
