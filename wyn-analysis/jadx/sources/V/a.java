package V;

import A.AbstractC0226t;
import A.InterfaceC0227u;
import A.O;
import A.U;
import A.Z;
import A.b0;
import B.F;
import E.AbstractC0426p;
import N.C0718d;
import N.C0732k;
import N.C0740o;
import N.u0;
import Z.k;
import com.unity3d.services.UnityAdsConstants;
import e0.z;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import r0.InterfaceC3909n;
import t0.C4054b;
import t0.C4056d;
import t0.InterfaceC4055c;
import tf.l;
import tf.p;
import u0.M;

/* loaded from: classes.dex */
public final class a extends AbstractC3343n implements p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f12835i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f12836j;
    public final /* synthetic */ Object k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f12837l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f12838m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f12839n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(U u10, int i5, Z z2, Object obj, d dVar) {
        super(2);
        this.f12838m = u10;
        this.f12836j = i5;
        this.f12839n = z2;
        this.k = obj;
        this.f12837l = dVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12835i) {
            case 0:
                ((Number) obj2).intValue();
                this.f12837l.e(this.k, this.f12838m, this.f12839n, (C0740o) obj, C0718d.Q(this.f12836j) | 1);
                break;
            default:
                C0740o c0740o = (C0740o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0740o.x()) {
                    c0740o.I();
                } else {
                    G.f fVar = new G.f((Z) this.f12839n, 7);
                    c0740o.M(-1338768149);
                    S3.e eVar = b0.f128a;
                    c0740o.M(-142660079);
                    U u10 = (U) this.f12838m;
                    Object objB = u10.b();
                    c0740o.M(-438678252);
                    Object obj3 = this.k;
                    boolean zA = AbstractC3340k.a(objB, obj3);
                    float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    float f11 = zA ? 1.0f : 0.0f;
                    c0740o.p(false);
                    Float fValueOf = Float.valueOf(f11);
                    Object value = u10.f81c.getValue();
                    c0740o.M(-438678252);
                    if (AbstractC3340k.a(value, obj3)) {
                        f10 = 1.0f;
                    }
                    c0740o.p(false);
                    O oE = AbstractC0226t.e(u10, fValueOf, Float.valueOf(f10), (InterfaceC0227u) fVar.invoke(u10.c(), c0740o, 0), eVar, "FloatAnimation", c0740o);
                    c0740o.p(false);
                    c0740o.p(false);
                    Z.i iVar = Z.i.f16922a;
                    c0740o.M(1157296644);
                    boolean zE = c0740o.e(oE);
                    Object objF = c0740o.F();
                    if (zE || objF == C0732k.f7800a) {
                        objF = new F(oE, 23);
                        c0740o.U(objF);
                    }
                    c0740o.p(false);
                    k kVarJ = z.j(iVar, (l) objF);
                    c0740o.M(-1990474327);
                    InterfaceC3909n interfaceC3909nC = AbstractC0426p.c(Z.a.f16900a, false, c0740o);
                    c0740o.M(1376089335);
                    L0.b bVar = (L0.b) c0740o.j(M.f46143e);
                    L0.i iVar2 = (L0.i) c0740o.j(M.k);
                    InterfaceC4055c.g9.getClass();
                    C4056d c4056d = C4054b.f45453b;
                    d dVarY = S3.f.y(kVarJ);
                    c0740o.O();
                    if (c0740o.f7843O) {
                        c0740o.k(c4056d);
                    } else {
                        c0740o.X();
                    }
                    c0740o.f7867x = false;
                    C0718d.M(c0740o, interfaceC3909nC, C4054b.f45456e);
                    C0718d.M(c0740o, bVar, C4054b.f45455d);
                    C0718d.M(c0740o, iVar2, C4054b.f45457f);
                    c0740o.o();
                    wg.b.d(0, dVarY, new u0(c0740o), c0740o, 2058660585);
                    c0740o.M(-1253629305);
                    c0740o.M(-222715758);
                    this.f12837l.invoke(obj3, c0740o, Integer.valueOf((this.f12836j >> 9) & 112));
                    wg.b.e(c0740o, false, false, false, true);
                    c0740o.p(false);
                    c0740o.p(false);
                }
                break;
        }
        return C2515C.f34653a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, Object obj, Object obj2, Object obj3, int i5) {
        super(2);
        this.f12837l = dVar;
        this.k = obj;
        this.f12838m = obj2;
        this.f12839n = obj3;
        this.f12836j = i5;
    }
}
