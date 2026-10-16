package K;

import E.AbstractC0419i;
import E.C0412b;
import E.O;
import N.C0718d;
import N.C0740o;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;
import r0.InterfaceC3909n;
import t0.C4054b;
import t0.C4056d;
import t0.InterfaceC4055c;
import u0.InterfaceC4193p0;

/* renamed from: K.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0677b extends AbstractC3343n implements tf.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6221i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ E.F f6222j;
    public final /* synthetic */ V.d k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6223l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0677b(E.F f10, V.d dVar, int i5, int i10) {
        super(2);
        this.f6221i = i10;
        this.f6222j = f10;
        this.k = dVar;
        this.f6223l = i5;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C2515C c2515c = C2515C.f34653a;
        int i5 = 0;
        int i10 = this.f6223l;
        E.F f10 = this.f6222j;
        V.d dVar = this.k;
        switch (this.f6221i) {
            case 0:
                C0740o c0740o = (C0740o) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0740o.x()) {
                    float f11 = AbstractC0676a.f6217b;
                    float f12 = AbstractC0676a.f6218c;
                    E.x xVar = E.L.f2700a;
                    Z.k kVarE0 = com.moloco.sdk.internal.publisher.H.e0(new O(f11, f12), f10);
                    C0412b c0412b = AbstractC0419i.f2745c;
                    int i11 = ((i10 >> 18) & 7168) | 432;
                    c0740o.M(693286680);
                    InterfaceC3909n interfaceC3909nA = E.J.a(c0412b, c0740o);
                    c0740o.M(-1323940314);
                    L0.b bVar = (L0.b) c0740o.j(u0.M.f46143e);
                    L0.i iVar = (L0.i) c0740o.j(u0.M.k);
                    InterfaceC4193p0 interfaceC4193p0 = (InterfaceC4193p0) c0740o.j(u0.M.f46152o);
                    InterfaceC4055c.g9.getClass();
                    C4056d c4056d = C4054b.f45453b;
                    V.d dVarY = S3.f.y(kVarE0);
                    c0740o.O();
                    if (c0740o.f7843O) {
                        c0740o.k(c4056d);
                    } else {
                        c0740o.X();
                    }
                    c0740o.f7867x = false;
                    C0718d.M(c0740o, interfaceC3909nA, C4054b.f45456e);
                    C0718d.M(c0740o, bVar, C4054b.f45455d);
                    C0718d.M(c0740o, iVar, C4054b.f45457f);
                    wg.b.d(0, dVarY, wg.b.b(c0740o, interfaceC4193p0, C4054b.f45458g, c0740o), c0740o, 2058660585);
                    c0740o.M(-678309503);
                    dVar.invoke(E.K.f2699a, c0740o, Integer.valueOf(((i11 >> 6) & 112) | 6));
                    wg.b.e(c0740o, false, false, true, false);
                    c0740o.p(false);
                    break;
                } else {
                    c0740o.I();
                    break;
                }
            default:
                C0740o c0740o2 = (C0740o) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0740o2.x()) {
                    I.a(((L) c0740o2.j(M.f6215a)).k, V.e.b(c0740o2, -630330208, new C0677b(f10, dVar, i10, i5)), c0740o2, 48);
                    break;
                } else {
                    c0740o2.I();
                    break;
                }
                break;
        }
        return c2515c;
    }
}
