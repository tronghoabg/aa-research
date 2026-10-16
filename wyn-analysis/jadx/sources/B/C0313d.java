package B;

import N.C0732k;
import N.C0740o;
import e0.AbstractC2461m;
import e0.InterfaceC2442E;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import r7.AbstractC3935e;
import t0.C4048M;

/* renamed from: B.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0313d extends AbstractC3343n implements tf.q {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f1418i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2442E f1419j;
    public final /* synthetic */ AbstractC2461m k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0313d(float f10, InterfaceC2442E interfaceC2442E, AbstractC2461m abstractC2461m) {
        super(3);
        this.f1418i = f10;
        this.f1419j = interfaceC2442E;
        this.k = abstractC2461m;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Z.k composed = (Z.k) obj;
        C0740o c0740o = (C0740o) obj2;
        ((Number) obj3).intValue();
        AbstractC3340k.e(composed, "$this$composed");
        c0740o.M(-1498088849);
        c0740o.M(-492369756);
        Object objF = c0740o.F();
        if (objF == C0732k.f7800a) {
            objF = new C4048M();
            c0740o.U(objF);
        }
        c0740o.p(false);
        Z.i iVar = Z.i.f16922a;
        AbstractC2461m abstractC2461m = this.k;
        Z.k kVarG = composed.g(AbstractC3935e.n(iVar, new G.f(new C0312c(this.f1418i, this.f1419j, (C4048M) objF, abstractC2461m), 1)));
        c0740o.p(false);
        return kVarG;
    }
}
