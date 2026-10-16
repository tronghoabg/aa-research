package E;

import kotlin.jvm.internal.AbstractC3340k;
import r0.InterfaceC3908m;
import r0.InterfaceC3909n;
import t0.C4070r;
import vf.AbstractC4345a;

/* renamed from: E.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0425o implements InterfaceC3909n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f2761a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z.d f2762b;

    public C0425o(Z.d dVar, boolean z2) {
        this.f2761a = z2;
        this.f2762b = dVar;
    }

    @Override // r0.InterfaceC3909n
    public final D0.b a(C4070r MeasurePolicy, P.a aVar, long j8) {
        int iG;
        int iF;
        r0.t tVarE;
        AbstractC3340k.e(MeasurePolicy, "$this$MeasurePolicy");
        P.d dVar = aVar.f8964a;
        if (dVar.i()) {
            return pd.f.j(MeasurePolicy, L0.a.g(j8), L0.a.f(j8), C0422l.k);
        }
        long jA = this.f2761a ? j8 : L0.a.a(0, 0, j8);
        int i5 = dVar.f8972c;
        Z.d dVar2 = this.f2762b;
        if (i5 == 1) {
            InterfaceC3908m interfaceC3908m = (InterfaceC3908m) aVar.get(0);
            Object objA = interfaceC3908m.a();
            C0420j c0420j = objA instanceof C0420j ? (C0420j) objA : null;
            if (c0420j != null ? c0420j.f2747c : false) {
                iG = L0.a.g(j8);
                iF = L0.a.f(j8);
                tVarE = interfaceC3908m.e(AbstractC4345a.r(L0.a.g(j8), L0.a.f(j8)));
            } else {
                tVarE = interfaceC3908m.e(jA);
                iG = Math.max(L0.a.g(j8), tVarE.f44307a);
                iF = Math.max(L0.a.f(j8), tVarE.f44308b);
            }
            int i10 = iF;
            int i11 = iG;
            return pd.f.j(MeasurePolicy, i11, i10, new C0424n(tVarE, interfaceC3908m, MeasurePolicy, i11, i10, dVar2));
        }
        r0.t[] tVarArr = new r0.t[i5];
        kotlin.jvm.internal.E e7 = new kotlin.jvm.internal.E();
        e7.f39738a = L0.a.g(j8);
        kotlin.jvm.internal.E e10 = new kotlin.jvm.internal.E();
        e10.f39738a = L0.a.f(j8);
        int i12 = dVar.f8972c;
        boolean z2 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            InterfaceC3908m interfaceC3908m2 = (InterfaceC3908m) aVar.get(i13);
            Object objA2 = interfaceC3908m2.a();
            C0420j c0420j2 = objA2 instanceof C0420j ? (C0420j) objA2 : null;
            if (c0420j2 != null ? c0420j2.f2747c : false) {
                z2 = true;
            } else {
                r0.t tVarE2 = interfaceC3908m2.e(jA);
                tVarArr[i13] = tVarE2;
                e7.f39738a = Math.max(e7.f39738a, tVarE2.f44307a);
                e10.f39738a = Math.max(e10.f39738a, tVarE2.f44308b);
            }
        }
        if (z2) {
            int i14 = e7.f39738a;
            int i15 = i14 != Integer.MAX_VALUE ? i14 : 0;
            int i16 = e10.f39738a;
            long jA2 = xg.g.a(i15, i14, i16 != Integer.MAX_VALUE ? i16 : 0, i16);
            int i17 = dVar.f8972c;
            for (int i18 = 0; i18 < i17; i18++) {
                InterfaceC3908m interfaceC3908m3 = (InterfaceC3908m) aVar.get(i18);
                Object objA3 = interfaceC3908m3.a();
                C0420j c0420j3 = objA3 instanceof C0420j ? (C0420j) objA3 : null;
                if (c0420j3 != null ? c0420j3.f2747c : false) {
                    tVarArr[i18] = interfaceC3908m3.e(jA2);
                }
            }
        }
        return pd.f.j(MeasurePolicy, e7.f39738a, e10.f39738a, new B.D(tVarArr, aVar, MeasurePolicy, e7, e10, dVar2));
    }
}
