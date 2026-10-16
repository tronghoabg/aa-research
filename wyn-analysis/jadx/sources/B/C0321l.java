package B;

import N.C0718d;
import N.C0732k;
import N.C0740o;
import ef.InterfaceC2521e;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import lf.AbstractC3471j;
import u0.InterfaceC4193p0;
import x0.C4435e;

/* renamed from: B.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0321l extends AbstractC3343n implements tf.q {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1440i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1441j;
    public final /* synthetic */ Object k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2521e f1442l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0321l(Object obj, Boolean bool, tf.p pVar) {
        super(3);
        this.f1441j = obj;
        this.k = bool;
        this.f1442l = (AbstractC3471j) pVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [lf.j, tf.p] */
    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f1440i) {
            case 0:
                Z.k composed = (Z.k) obj;
                C0740o c0740o = (C0740o) obj2;
                ((Number) obj3).intValue();
                AbstractC3340k.e(composed, "$this$composed");
                c0740o.M(-756081143);
                Z.i iVar = Z.i.f16922a;
                Q q4 = (Q) c0740o.j(U.f1404a);
                c0740o.M(-492369756);
                Object objF = c0740o.F();
                if (objF == C0732k.f7800a) {
                    objF = new D.i();
                    c0740o.U(objF);
                }
                c0740o.p(false);
                Z.k kVarP = com.moloco.sdk.internal.publisher.H.P(iVar, (D.i) objF, q4, true, (String) this.f1441j, (C4435e) this.k, (tf.a) this.f1442l);
                c0740o.p(false);
                return kVarP;
            default:
                Z.k composed2 = (Z.k) obj;
                C0740o c0740o2 = (C0740o) obj2;
                ((Number) obj3).intValue();
                AbstractC3340k.e(composed2, "$this$composed");
                c0740o2.M(1175567217);
                L0.b bVar = (L0.b) c0740o2.j(u0.M.f46143e);
                InterfaceC4193p0 interfaceC4193p0 = (InterfaceC4193p0) c0740o2.j(u0.M.f46152o);
                c0740o2.M(1157296644);
                boolean zE = c0740o2.e(bVar);
                Object objF2 = c0740o2.F();
                if (zE || objF2 == C0732k.f7800a) {
                    objF2 = new p0.t(interfaceC4193p0, bVar);
                    c0740o2.U(objF2);
                }
                c0740o2.p(false);
                p0.t tVar = (p0.t) objF2;
                p0.v vVar = new p0.v(tVar, (AbstractC3471j) this.f1442l, null);
                C0718d.e(tVar, this.f1441j, (Boolean) this.k, vVar, c0740o2);
                c0740o2.p(false);
                return tVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0321l(String str, C4435e c4435e, tf.a aVar) {
        super(3);
        this.f1441j = str;
        this.k = c4435e;
        this.f1442l = aVar;
    }
}
