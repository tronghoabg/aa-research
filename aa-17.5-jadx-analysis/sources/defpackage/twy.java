package defpackage;

import android.util.SparseIntArray;

/* loaded from: classes3.dex */
public final class twy implements ufe {
    public final typ a;
    public wnq b;

    static {
        int i = udg.a;
    }

    public twy(typ typVar) {
        this.a = typVar;
        this.b = typVar.q();
    }

    private final ukf f(udx udxVar, aekf aekfVar) {
        abcs abcsVarN = udxVar.n();
        abcy abcyVarO = udxVar.o();
        wnq wnqVarS = udxVar.S();
        ukf ukfVar = ukf.a;
        int i = abcyVarO.c;
        if (i != 0) {
            if (wnqVarS == null) {
                wnqVarS = this.b;
            }
            ukf ukfVarH = h(g(i, wnqVarS).b, aekfVar, wnqVarS);
            long j = ukfVarH.b;
            return ukfVarH;
        }
        int i2 = abcsVarN.b;
        if ((i2 & 8192) == 0) {
            return (i2 & 4096) == 0 ? ukfVar : this.a.j(udxVar.c()).j(abcsVarN.l);
        }
        ukf ukfVarH2 = h(abcsVarN.m, aekfVar, wnqVarS);
        long j2 = abcsVarN.m;
        long j3 = ukfVarH2.b;
        return ukfVarH2;
    }

    private static ukf g(int i, wnq wnqVar) {
        return wnqVar == null ? ukf.a : ((ukh) wnqVar.c).b(i);
    }

    private static ukf h(long j, aekf aekfVar, wnq wnqVar) {
        if (wnqVar == null) {
            return ukf.a;
        }
        yob yobVar = typ.a;
        if (!aekfVar.isEmpty()) {
            j = ((ukj) ((rhj) wnqVar.e).a).a(j, aekfVar);
        }
        return ((ukh) wnqVar.c).c(j);
    }

    @Override // defpackage.ufe
    public final ujf a(abcn abcnVar, udx udxVar, int i) {
        aekf aekfVarB = qrv.B(udxVar.n());
        aekg aekgVar = aekj.a;
        return b(abcnVar, udxVar, new aeki(aekfVarB), i);
    }

    @Override // defpackage.ufe
    public final ujf b(abcn abcnVar, udx udxVar, aekf aekfVar, int i) {
        ukf ukfVarJ;
        int iMax = Math.max(0, i);
        abcs abcsVarN = udxVar.n();
        wnq wnqVarS = udxVar.S();
        abnh abnhVar = abcz.e;
        abcnVar.j(abnhVar);
        Object objJ = abcnVar.w.j(abnhVar.d);
        abcy abcyVar = (abcy) (objJ == null ? abnhVar.b : abnhVar.c(objJ));
        int i2 = abcyVar.c;
        if (i2 != 0) {
            if (wnqVarS == null) {
                wnqVarS = this.b;
            }
            ukfVarJ = h(g(i2, wnqVarS).b, aekfVar, wnqVarS);
            int i3 = abcyVar.c;
            long j = ukfVarJ.b;
        } else {
            int i4 = abcnVar.b;
            if ((i4 & 16) != 0) {
                ukf ukfVarF = f(udxVar, aekfVar);
                int i5 = abcnVar.g;
                SparseIntArray sparseIntArray = ukfVarF.e;
                int i6 = sparseIntArray != null ? sparseIntArray.get(i5, -1) : -1;
                if (wnqVarS == null) {
                    wnqVarS = this.b;
                }
                ukfVarJ = h(i6, aekj.a, wnqVarS);
                int i7 = abcnVar.g;
                long j2 = ukfVarJ.b;
            } else if ((i4 & 4) != 0) {
                if ((i4 & 8) != 0 && wnqVarS != null) {
                    if (wnqVarS.a != abcnVar.f) {
                        return ukf.a.d();
                    }
                }
                ukfVarJ = h(abcnVar.e, aekfVar, wnqVarS);
                long j3 = abcnVar.e;
                long j4 = ukfVarJ.b;
            } else {
                if ((i4 & 2) == 0) {
                    return ukf.a.d();
                }
                ukfVarJ = this.a.j(udxVar.c()).j(abcnVar.d);
            }
        }
        ujf ujfVarG = ukfVarJ.g(iMax);
        abnh abnhVar2 = abhx.b;
        abcsVarN.j(abnhVar2);
        abnl abnlVar = abcsVarN.w;
        abnu abnuVar = abnhVar2.d;
        Object objJ2 = abnlVar.j(abnuVar);
        if ((((abhu) (objJ2 == null ? abnhVar2.b : abnhVar2.c(objJ2))).b & 2) != 0) {
            abcsVarN.j(abnhVar2);
            Object objJ3 = abcsVarN.w.j(abnuVar);
            abhv abhvVar = ((abhu) (objJ3 == null ? abnhVar2.b : abnhVar2.c(objJ3))).c;
            if (abhvVar == null) {
                abhvVar = abhv.a;
            }
            if (ujfVarG.q()) {
                ukm ukmVar = new ukm(ujfVarG.r);
                if ((abhvVar.b & 1) != 0) {
                    ukmVar.c(abhvVar.c);
                }
                if ((abhvVar.b & 2) != 0) {
                    ukmVar.b(abhvVar.d);
                }
                uje ujeVarF = ujfVarG.f();
                ujeVarF.n = ukmVar.a();
                return new ujf(ujeVarF);
            }
        }
        return ujfVarG;
    }

    @Override // defpackage.ufe
    public final ujf c(abco abcoVar, udx udxVar, int i) {
        abcs abcsVarN = udxVar.n();
        int iMax = Math.max(0, i);
        aekf aekfVarB = qrv.B(abcsVarN);
        aekg aekgVar = aekj.a;
        aeki aekiVar = new aeki(aekfVarB);
        wnq wnqVarS = udxVar.S();
        abnh abnhVar = abcz.d;
        abcoVar.j(abnhVar);
        Object objJ = abcoVar.w.j(abnhVar.d);
        int i2 = ((abcy) (objJ == null ? abnhVar.b : abnhVar.c(objJ))).c;
        if (i2 == 0) {
            int i3 = abcoVar.b;
            return (i3 & 2) != 0 ? h(abcoVar.e, aekiVar, wnqVarS).g(iMax) : (i3 & 1) != 0 ? this.a.j(udxVar.c()).j(abcoVar.d).g(iMax) : ukf.a.d();
        }
        if (wnqVarS == null) {
            wnqVarS = this.b;
        }
        return h(g(i2, wnqVarS).b, aekiVar, wnqVarS).g(iMax);
    }

    @Override // defpackage.ufe
    public final ujf d(udx udxVar, aekf aekfVar, int i) {
        int iMax = Math.max(0, i);
        ukf ukfVarF = f(udxVar, aekfVar);
        if (ukfVarF.b != -1) {
            udxVar.n();
        }
        return ukfVarF.g(iMax);
    }

    @Override // defpackage.ufe
    public final zdg e(udx udxVar) {
        return udxVar.S() != null ? (zdg) udxVar.S().f : zdg.a;
    }
}
