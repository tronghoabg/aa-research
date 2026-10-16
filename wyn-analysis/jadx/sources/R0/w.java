package r0;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3340k;
import t0.AbstractC4066n;
import t0.C4070r;

/* loaded from: classes.dex */
public final class w extends AbstractC4066n {

    /* renamed from: a, reason: collision with root package name */
    public static final w f44315a = new w();

    @Override // r0.InterfaceC3909n
    public final D0.b a(C4070r measure, P.a aVar, long j8) {
        AbstractC3340k.e(measure, "$this$measure");
        P.d dVar = aVar.f8964a;
        if (dVar.i()) {
            return pd.f.j(measure, L0.a.g(j8), L0.a.f(j8), u.k);
        }
        if (dVar.f8972c == 1) {
            t tVarE = ((InterfaceC3908m) aVar.get(0)).e(j8);
            return pd.f.j(measure, xg.g.u(tVarE.f44307a, j8), xg.g.t(tVarE.f44308b, j8), new E.w(tVarE, 6));
        }
        ArrayList arrayList = new ArrayList(dVar.f8972c);
        int i5 = dVar.f8972c;
        for (int i10 = 0; i10 < i5; i10++) {
            arrayList.add(((InterfaceC3908m) aVar.get(i10)).e(j8));
        }
        int size = arrayList.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            t tVar = (t) arrayList.get(i11);
            iMax = Math.max(tVar.f44307a, iMax);
            iMax2 = Math.max(tVar.f44308b, iMax2);
        }
        return pd.f.j(measure, xg.g.u(iMax, j8), xg.g.t(iMax2, j8), new I.g(arrayList, 1));
    }
}
