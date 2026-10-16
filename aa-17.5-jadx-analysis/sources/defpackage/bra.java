package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
final class bra implements ctp {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bra(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ctp
    public final /* synthetic */ int a(csq csqVar, List list, int i) {
        return this.b != 0 ? tr.u(this, csqVar, list, i) : tr.u(this, csqVar, list, i);
    }

    @Override // defpackage.ctp
    public final /* synthetic */ int b(csq csqVar, List list, int i) {
        return this.b != 0 ? tr.v(this, csqVar, list, i) : tr.v(this, csqVar, list, i);
    }

    @Override // defpackage.ctp
    public final /* synthetic */ int c(csq csqVar, List list, int i) {
        return this.b != 0 ? tr.w(this, csqVar, list, i) : tr.w(this, csqVar, list, i);
    }

    @Override // defpackage.ctp
    public final /* synthetic */ int d(csq csqVar, List list, int i) {
        return this.b != 0 ? tr.x(this, csqVar, list, i) : tr.x(this, csqVar, list, i);
    }

    @Override // defpackage.ctp
    public final ctq e(cts ctsVar, List list, long j) {
        cuo cuoVarV;
        int iMax;
        int iMax2;
        int i;
        int i2;
        if (this.b == 0) {
            if (this.a != null) {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    cto ctoVar = (cto) list.get(i3);
                    if (affa.f(bzi.D(ctoVar), "text")) {
                        cuoVarV = ctoVar.v(dle.m(j, 0, 0, 0, 0, 11));
                    }
                }
                dlz.a("Collection contains no element matching the predicate.");
                throw new aezp();
            }
            cuoVarV = null;
            int iMax3 = Math.max(cuoVarV != null ? cuoVarV.a : 0, 0);
            int iMax4 = Math.max(ctsVar.eF(brb.a), (cuoVarV != null ? cuoVarV.b : 0) + ctsVar.eE(brb.c));
            if (cuoVarV != null) {
                cuoVarV.eB(crz.a);
            }
            if (cuoVarV != null) {
                cuoVarV.eB(crz.b);
            }
            return ctsVar.eK(iMax3, iMax4, afbf.a, new aia(cuoVarV, iMax4, 2));
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            cto ctoVar2 = (cto) list.get(i4);
            if (bzi.D(ctoVar2) == bpw.a) {
                final cuo cuoVarV2 = ctoVar2.v(j);
                int size3 = list.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    cto ctoVar3 = (cto) list.get(i5);
                    if (bzi.D(ctoVar3) == bpw.b) {
                        bqj bqjVar = (bqj) this.a;
                        api apiVar = bqjVar.f;
                        api apiVar2 = api.a;
                        final cuo cuoVarV3 = apiVar == apiVar2 ? ctoVar3.v(dle.m(dlf.h(j, 0, -cuoVarV2.b), 0, 0, 0, 0, 14)) : ctoVar3.v(dle.m(dlf.h(j, -cuoVarV2.a, 0), 0, 0, 0, 0, 11));
                        final afft afftVar = new afft();
                        final afft afftVar2 = new afft();
                        float fA = bqjVar.a();
                        float[] fArr = bqjVar.c;
                        cuoVarV3.eB(bqh.c);
                        int i6 = cuoVarV2.a;
                        int i7 = cuoVarV2.b;
                        if (bqjVar.f == apiVar2) {
                            iMax = Math.max(cuoVarV3.a, i6);
                            int i8 = cuoVarV3.b;
                            iMax2 = i7 + i8;
                            i = (iMax - cuoVarV3.a) / 2;
                            i2 = i7 / 2;
                            afftVar.a = (iMax - cuoVarV2.a) / 2;
                            afftVar2.a = afgi.k(i8 * fA) + (i2 - (cuoVarV2.b / 2));
                        } else {
                            iMax = cuoVarV3.a + i6;
                            iMax2 = Math.max(cuoVarV3.b, i7);
                            i = i6 / 2;
                            i2 = (iMax2 - cuoVarV3.b) / 2;
                            afftVar.a = (afgi.k(cuoVarV3.a * fA) + i) - (cuoVarV2.a / 2);
                            afftVar2.a = (iMax2 - cuoVarV2.b) / 2;
                        }
                        final int i9 = i2;
                        final int i10 = i;
                        bqjVar.i.h(iMax);
                        bqjVar.j.h(iMax2);
                        return ctsVar.eK(iMax, iMax2, afbf.a, new afec() { // from class: bqd
                            @Override // defpackage.afec
                            public final Object invoke(Object obj) {
                                cun cunVar = (cun) obj;
                                cunVar.x(cuoVarV3, i10, i9);
                                cunVar.x(cuoVarV2, afftVar.a, afftVar2.a);
                                return afak.a;
                            }
                        });
                    }
                }
                dlz.a("Collection contains no element matching the predicate.");
                throw new aezp();
            }
        }
        dlz.a("Collection contains no element matching the predicate.");
        throw new aezp();
    }
}
