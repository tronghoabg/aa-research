package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class aace {
    public List a = new ArrayList();
    public boolean b = false;

    public static boolean b(trv trvVar) {
        abhj abhjVar = trvVar.a;
        int iAB = a.aB(abhjVar.d);
        if (iAB != 0 && iAB == 2 && !c(trvVar)) {
            int iAB2 = a.aB(abhjVar.d);
            if (iAB2 == 0 || iAB2 != 2) {
                return true;
            }
            abdl abdlVar = abhjVar.c;
            if (abdlVar == null) {
                abdlVar = abdl.a;
            }
            abnh abnhVar = aaez.a;
            abdlVar.j(abnhVar);
            abnl abnlVar = abdlVar.w;
            abnu abnuVar = abnhVar.d;
            if (!abnlVar.m(abnuVar)) {
                return true;
            }
            abdlVar.j(abnhVar);
            Object objJ = abdlVar.w.j(abnuVar);
            if (((aaey) (objJ == null ? abnhVar.b : abnhVar.c(objJ))).c != Integer.MAX_VALUE) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(trv trvVar) {
        abhj abhjVar = trvVar.a;
        int iAB = a.aB(abhjVar.d);
        if (iAB != 0 && iAB == 2) {
            abdl abdlVar = abhjVar.c;
            if (abdlVar == null) {
                abdlVar = abdl.a;
            }
            abnh abnhVar = aaez.a;
            abdlVar.j(abnhVar);
            abnl abnlVar = abdlVar.w;
            abnu abnuVar = abnhVar.d;
            if (abnlVar.m(abnuVar)) {
                abdlVar.j(abnhVar);
                Object objJ = abdlVar.w.j(abnuVar);
                int i = ((aaey) (objJ == null ? abnhVar.b : abnhVar.c(objJ))).c;
                return i == 2147483645 || i == 2147483646;
            }
        }
        return false;
    }

    public final void a() {
        this.a.clear();
    }
}
