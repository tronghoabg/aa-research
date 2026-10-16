package defpackage;

/* loaded from: classes3.dex */
public final class uqf {
    public static final /* synthetic */ int a = 0;

    static {
        abnp abnpVarN = abix.a.n();
        abnp abnpVarN2 = abik.a.n();
        abnpVarN2.t();
        abik abikVar = (abik) abnpVarN2.b;
        abikVar.c = 6;
        abikVar.b |= 1;
        abnpVarN2.t();
        abik abikVar2 = (abik) abnpVarN2.b;
        abikVar2.d = 3;
        abikVar2.b |= 2;
        abnpVarN.aT(abnpVarN2);
        abnp abnpVarN3 = abik.a.n();
        abnpVarN3.t();
        abik abikVar3 = (abik) abnpVarN3.b;
        abikVar3.c = 9;
        abikVar3.b |= 1;
        abnpVarN3.t();
        abik abikVar4 = (abik) abnpVarN3.b;
        abikVar4.d = 2;
        abikVar4.b |= 2;
        abnpVarN.aT(abnpVarN3);
        abnp abnpVarN4 = abik.a.n();
        abnpVarN4.t();
        abik abikVar5 = (abik) abnpVarN4.b;
        abikVar5.c = 1;
        abikVar5.b |= 1;
        abnpVarN4.t();
        abik abikVar6 = (abik) abnpVarN4.b;
        abikVar6.d = 3;
        abikVar6.b |= 2;
        abnpVarN.aT(abnpVarN4);
        abnp abnpVarN5 = abik.a.n();
        abnpVarN5.t();
        abik abikVar7 = (abik) abnpVarN5.b;
        abikVar7.c = 3;
        abikVar7.b |= 1;
        abnpVarN5.t();
        abik abikVar8 = (abik) abnpVarN5.b;
        abikVar8.d = 2;
        abikVar8.b |= 2;
        abnpVarN.aT(abnpVarN5);
        abnp abnpVarN6 = abik.a.n();
        abnpVarN6.t();
        abik abikVar9 = (abik) abnpVarN6.b;
        abikVar9.c = 12;
        abikVar9.b |= 1;
        abnpVarN6.t();
        abik abikVar10 = (abik) abnpVarN6.b;
        abikVar10.d = 3;
        abikVar10.b |= 2;
        abnpVarN.aT(abnpVarN6);
        abnp abnpVarN7 = abik.a.n();
        abnpVarN7.t();
        abik abikVar11 = (abik) abnpVarN7.b;
        abikVar11.c = 14;
        abikVar11.b |= 1;
        abnpVarN7.t();
        abik abikVar12 = (abik) abnpVarN7.b;
        abikVar12.d = 2;
        abikVar12.b |= 2;
        abnpVarN.aT(abnpVarN7);
    }

    public static long a(abcs abcsVar) {
        if (abcsVar == null) {
            return 0L;
        }
        abnh abnhVar = abbf.V;
        abcsVar.j(abnhVar);
        abnl abnlVar = abcsVar.w;
        abnu abnuVar = abnhVar.d;
        if (abnlVar.m(abnuVar)) {
            abcsVar.j(abnhVar);
            Object objJ = abcsVar.w.j(abnuVar);
            return ((abcd) (objJ == null ? abnhVar.b : abnhVar.c(objJ))).g;
        }
        abnh abnhVar2 = abbf.F;
        abcsVar.j(abnhVar2);
        Object objJ2 = abcsVar.w.j(abnhVar2.d);
        abkx abkxVar = ((abkg) (objJ2 == null ? abnhVar2.b : abnhVar2.c(objJ2))).b;
        if (abkxVar == null) {
            abkxVar = abkx.a;
        }
        if ((abkxVar.b & 2) != 0) {
            return toc.d(abkxVar.d).c;
        }
        return 0L;
    }

    public static abcd b(abcu abcuVar) {
        return (abcd) abcuVar.aY(abbf.V);
    }

    public static boolean c(int i, int i2) {
        return (i & i2) != 0;
    }

    public static boolean d(abcs abcsVar) {
        abcd abcdVarB = b(abcsVar);
        if (!abcdVarB.equals(abbf.V.b) && abcdVarB.k) {
            return true;
        }
        abnh abnhVar = abbf.R;
        abcsVar.j(abnhVar);
        if (abcsVar.w.m(abnhVar.d)) {
            return true;
        }
        return aclh.p(abcsVar).e;
    }
}
