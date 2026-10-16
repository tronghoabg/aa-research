package z;

import A.C0212e;
import A.InterfaceC0216i;
import A.b0;
import Ef.H;
import kotlin.jvm.internal.AbstractC3340k;
import r0.InterfaceC3908m;
import t0.C4070r;

/* loaded from: classes.dex */
public final class s extends p {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0216i f48252a;

    /* renamed from: b, reason: collision with root package name */
    public final Kd.a f48253b;

    /* renamed from: c, reason: collision with root package name */
    public q f48254c;

    public s(InterfaceC0216i interfaceC0216i, Kd.a aVar) {
        this.f48252a = interfaceC0216i;
        this.f48253b = aVar;
    }

    @Override // r0.InterfaceC3907l
    public final D0.b q(C4070r measure, InterfaceC3908m measurable, long j8) {
        s sVar;
        AbstractC3340k.e(measure, "$this$measure");
        AbstractC3340k.e(measurable, "measurable");
        r0.t tVarE = measurable.e(j8);
        long jA = Ba.c.a(tVarE.f44307a, tVarE.f44308b);
        q qVar = this.f48254c;
        if (qVar != null) {
            C0212e c0212e = qVar.f48246a;
            if (L0.h.a(jA, ((L0.h) c0212e.f145e.getValue()).f6805a)) {
                sVar = this;
            } else {
                qVar.f48247b = ((L0.h) c0212e.d()).f6805a;
                sVar = this;
                H.D(sVar.f48253b, null, new r(qVar, jA, sVar, null), 3);
            }
        } else {
            sVar = this;
            qVar = new q(new C0212e(new L0.h(jA), b0.f135h, new L0.h(Ba.c.a(1, 1))), jA);
        }
        sVar.f48254c = qVar;
        long j10 = ((L0.h) qVar.f48246a.d()).f6805a;
        return pd.f.j(measure, (int) (j10 >> 32), (int) (j10 & 4294967295L), new E.w(tVarE, 7));
    }
}
