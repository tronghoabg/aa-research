package c0;

import A7.B0;
import B.F;
import N.C0718d;
import N.P;
import N.Y;
import Va.M6;
import a2.v;
import kotlin.jvm.internal.AbstractC3340k;
import s0.InterfaceC3987a;
import u0.C4186m;

/* loaded from: classes.dex */
public final class n extends B0 implements InterfaceC3987a, s0.b {

    /* renamed from: b, reason: collision with root package name */
    public final F f19526b;

    /* renamed from: c, reason: collision with root package name */
    public final Y f19527c;

    /* renamed from: d, reason: collision with root package name */
    public final v f19528d;

    public n(F f10) {
        super((tf.l) C4186m.f46256l);
        this.f19526b = f10;
        this.f19527c = C0718d.G(null, P.f7730f);
        this.f19528d = m.f19525a;
    }

    public final void e0(l focusProperties) {
        AbstractC3340k.e(focusProperties, "focusProperties");
        this.f19526b.invoke(focusProperties);
        n nVar = (n) this.f19527c.getValue();
        if (nVar != null) {
            nVar.e0(focusProperties);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return AbstractC3340k.a(this.f19526b, ((n) obj).f19526b);
        }
        return false;
    }

    @Override // Z.k
    public final /* synthetic */ Z.k g(Z.k kVar) {
        return M6.f(this, kVar);
    }

    @Override // s0.b
    public final v getKey() {
        return this.f19528d;
    }

    @Override // Z.k
    public final Object h(Object obj, tf.p pVar) {
        return pVar.invoke(this, obj);
    }

    public final int hashCode() {
        return this.f19526b.hashCode();
    }

    @Override // s0.InterfaceC3987a
    public final void o(s0.c scope) {
        AbstractC3340k.e(scope, "scope");
        this.f19527c.setValue((n) scope.a(m.f19525a));
    }

    @Override // Z.k
    public final Object p(Object obj, tf.p pVar) {
        return pVar.invoke(obj, this);
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
