package V;

import A.U;
import A.Z;
import N.C0718d;
import N.C0740o;
import Z.k;
import ef.C2515C;
import ef.InterfaceC2521e;
import kotlin.jvm.internal.AbstractC3343n;
import tf.p;
import z.C4597b;
import z.C4605j;
import z.C4606k;

/* loaded from: classes.dex */
public final class b extends AbstractC3343n implements p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f12840i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f12841j;
    public final /* synthetic */ Object k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f12842l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f12843m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f12844n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f12845o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(U u10, k kVar, Object obj, Object obj2, d dVar, int i5, int i10) {
        super(2);
        this.f12840i = i10;
        this.k = u10;
        this.f12843m = kVar;
        this.f12844n = obj;
        this.f12845o = obj2;
        this.f12841j = dVar;
        this.f12842l = i5;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12840i) {
            case 0:
                ((Number) obj2).intValue();
                int iQ = C0718d.Q(this.f12842l) | 1;
                Object obj3 = this.f12844n;
                Object obj4 = this.f12845o;
                this.f12841j.f(this.k, this.f12843m, obj3, obj4, (C0740o) obj, iQ);
                break;
            case 1:
                ((Number) obj2).intValue();
                this.f12841j.b((Boolean) this.f12843m, this.k, (InterfaceC2521e) this.f12844n, (InterfaceC2521e) this.f12845o, (C0740o) obj, C0718d.Q(this.f12842l) | 1);
                break;
            case 2:
                ((Number) obj2).intValue();
                int i5 = this.f12842l | 1;
                d dVar = this.f12841j;
                Fe.c.a((U) this.k, (k) this.f12843m, (C4605j) this.f12844n, (C4606k) this.f12845o, dVar, (C0740o) obj, i5);
                break;
            default:
                ((Number) obj2).intValue();
                int i10 = this.f12842l | 1;
                d dVar2 = this.f12841j;
                U u10 = (U) this.k;
                Z z2 = (Z) this.f12844n;
                Fe.g.b(u10, (k) this.f12843m, z2, (C4597b) this.f12845o, dVar2, (C0740o) obj, i10);
                break;
        }
        return C2515C.f34653a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Boolean bool, Object obj, InterfaceC2521e interfaceC2521e, InterfaceC2521e interfaceC2521e2, int i5) {
        super(2);
        this.f12840i = 1;
        this.f12841j = dVar;
        this.f12843m = bool;
        this.k = obj;
        this.f12844n = interfaceC2521e;
        this.f12845o = interfaceC2521e2;
        this.f12842l = i5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Object obj, Object obj2, Object obj3, Object obj4, int i5) {
        super(2);
        this.f12840i = 0;
        this.f12841j = dVar;
        this.k = obj;
        this.f12843m = obj2;
        this.f12844n = obj3;
        this.f12845o = obj4;
        this.f12842l = i5;
    }
}
