package e0;

import A.W;
import A7.B0;
import Va.M6;
import kotlin.jvm.internal.AbstractC3340k;
import r0.InterfaceC3907l;
import r0.InterfaceC3908m;
import t0.C4070r;
import u0.C4186m;

/* renamed from: e0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2460l extends B0 implements InterfaceC3907l {

    /* renamed from: b, reason: collision with root package name */
    public final tf.l f34370b;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2460l(tf.l layerBlock) {
        C4186m c4186m = C4186m.f46256l;
        AbstractC3340k.e(layerBlock, "layerBlock");
        super((tf.l) c4186m);
        this.f34370b = layerBlock;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2460l)) {
            return false;
        }
        return AbstractC3340k.a(this.f34370b, ((C2460l) obj).f34370b);
    }

    @Override // Z.k
    public final /* synthetic */ Z.k g(Z.k kVar) {
        return M6.f(this, kVar);
    }

    @Override // Z.k
    public final Object h(Object obj, tf.p pVar) {
        return pVar.invoke(this, obj);
    }

    public final int hashCode() {
        return this.f34370b.hashCode();
    }

    @Override // Z.k
    public final Object p(Object obj, tf.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // r0.InterfaceC3907l
    public final D0.b q(C4070r measure, InterfaceC3908m measurable, long j8) {
        AbstractC3340k.e(measure, "$this$measure");
        AbstractC3340k.e(measurable, "measurable");
        r0.t tVarE = measurable.e(j8);
        return pd.f.j(measure, tVarE.f44307a, tVarE.f44308b, new W(19, tVarE, this));
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f34370b + ')';
    }

    @Override // Z.k
    public final /* synthetic */ boolean v() {
        return M6.a(this, Z.h.f16921i);
    }
}
