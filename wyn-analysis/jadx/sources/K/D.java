package K;

import E.AbstractC0426p;
import N.C0718d;
import N.C0740o;
import e0.InterfaceC2442E;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;
import r0.InterfaceC3909n;
import t0.C4054b;
import t0.C4056d;
import t0.InterfaceC4055c;
import u0.InterfaceC4193p0;

/* loaded from: classes.dex */
public final class D extends AbstractC3343n implements tf.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Z.i f6152i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2442E f6153j;
    public final /* synthetic */ long k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f6154l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f6155m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f6156n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ V.d f6157o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(Z.i iVar, InterfaceC2442E interfaceC2442E, long j8, float f10, int i5, float f11, V.d dVar) {
        super(2);
        this.f6152i = iVar;
        this.f6153j = interfaceC2442E;
        this.k = j8;
        this.f6154l = f10;
        this.f6155m = i5;
        this.f6156n = f11;
        this.f6157o = dVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C0740o c0740o = (C0740o) obj;
        int iIntValue = ((Number) obj2).intValue() & 11;
        C2515C c2515c = C2515C.f34653a;
        if (iIntValue == 2 && c0740o.x()) {
            c0740o.I();
            return c2515c;
        }
        o oVar = (o) c0740o.j(q.f6287a);
        int i5 = this.f6155m;
        Z.k kVarA = p0.w.a(Fe.g.J(Fe.g.n(this.f6152i, this.f6153j, Fe.g.o(this.k, oVar, this.f6154l, c0740o, (i5 >> 6) & 14), null, this.f6156n), false, B.f6150j), c2515c, new C(2, null));
        c0740o.M(733328855);
        InterfaceC3909n interfaceC3909nC = AbstractC0426p.c(Z.a.f16900a, true, c0740o);
        c0740o.M(-1323940314);
        L0.b bVar = (L0.b) c0740o.j(u0.M.f46143e);
        L0.i iVar = (L0.i) c0740o.j(u0.M.k);
        InterfaceC4193p0 interfaceC4193p0 = (InterfaceC4193p0) c0740o.j(u0.M.f46152o);
        InterfaceC4055c.g9.getClass();
        C4056d c4056d = C4054b.f45453b;
        V.d dVarY = S3.f.y(kVarA);
        c0740o.O();
        if (c0740o.f7843O) {
            c0740o.k(c4056d);
        } else {
            c0740o.X();
        }
        c0740o.f7867x = false;
        C0718d.M(c0740o, interfaceC3909nC, C4054b.f45456e);
        C0718d.M(c0740o, bVar, C4054b.f45455d);
        C0718d.M(c0740o, iVar, C4054b.f45457f);
        wg.b.d(0, dVarY, wg.b.b(c0740o, interfaceC4193p0, C4054b.f45458g, c0740o), c0740o, 2058660585);
        c0740o.M(-2137368960);
        c0740o.M(1539610176);
        this.f6157o.invoke(c0740o, Integer.valueOf((i5 >> 18) & 14));
        c0740o.p(false);
        c0740o.p(false);
        wg.b.e(c0740o, false, true, false, false);
        return c2515c;
    }
}
