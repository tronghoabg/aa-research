package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public /* synthetic */ class tv {
    public static List a(csq csqVar) {
        csqVar.getClass();
        cxb cxbVarL = ((cxr) csqVar).L();
        boolean zH = h(cxbVarL);
        List listX = cxbVarL.x();
        ArrayList arrayList = new ArrayList(listX.size());
        int size = listX.size();
        for (int i = 0; i < size; i++) {
            cxb cxbVar = (cxb) listX.get(i);
            arrayList.add(zH ? cxbVar.t() : cxbVar.u());
        }
        return arrayList;
    }

    public static int b(cxk cxkVar, crw crwVar) {
        cxk cxkVarN = cxkVar.N();
        if (cxkVarN == null) {
            crt.c(a.bm(cxkVar, "Child of ", " cannot be null when calculating alignment line"));
        }
        if (cxkVar.K().f().containsKey(crwVar)) {
            Integer num = (Integer) cxkVar.K().f().get(crwVar);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int iEB = cxkVarN.eB(crwVar);
        if (iEB == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = cxkVar.l;
        boolean z2 = cxkVar.m;
        cxkVarN.l = true;
        cxkVar.m = true;
        cxkVar.S();
        cxkVarN.l = z;
        cxkVar.m = z2;
        return iEB + ((int) (crwVar instanceof csl ? cxkVarN.I() & 4294967295L : cxkVarN.I() >> 32));
    }

    public static int c(cwu cwuVar, csq csqVar, csp cspVar, int i) {
        return ty.d(new cwt(cwuVar), csqVar, cspVar, i);
    }

    public static int d(cwu cwuVar, csq csqVar, csp cspVar, int i) {
        return ty.e(new cwt(cwuVar), csqVar, cspVar, i);
    }

    public static int e(cwu cwuVar, csq csqVar, csp cspVar, int i) {
        return ty.f(new cwt(cwuVar), csqVar, cspVar, i);
    }

    public static int f(cwu cwuVar, csq csqVar, csp cspVar, int i) {
        return ty.g(new cwt(cwuVar), csqVar, cspVar, i);
    }

    public static long g(float f, boolean z, boolean z2) {
        return (true != z ? 0L : 1L) | (true == z2 ? 2L : 0L) | (Float.floatToRawIntBits(f) << 32);
    }

    private static boolean h(cxb cxbVar) {
        int iAv = cxbVar.av();
        int i = iAv - 1;
        if (iAv == 0) {
            throw null;
        }
        if (i == 0) {
            return false;
        }
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new aezs();
                }
                cxb cxbVarL = cxbVar.l();
                if (cxbVarL != null) {
                    return h(cxbVarL);
                }
                throw new IllegalArgumentException("no parent for idle node");
            }
        }
        return true;
    }
}
