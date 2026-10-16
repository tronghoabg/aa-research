package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class kmc {
    public static final bvf a;
    public static final bvf b = new byo(new dba(11));
    public static final bvf c;

    static {
        byo byoVar = new byo(new dba(12));
        c = byoVar;
        a = byoVar;
    }

    public static final void a(Object obj, mnd mndVar, bux buxVar, int i, int i2) {
        int i3;
        mndVar.getClass();
        bux buxVarC = buxVar.c(1068974296);
        if (i2 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != buxVarC.E(obj) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != buxVarC.E(mndVar) ? 16 : 32;
        }
        if (buxVarC.I((i3 & 19) != 18, 1 & i3)) {
            if (i2 != 0) {
                obj = afak.a;
            }
            Set set = (Set) buxVarC.f(b);
            boolean zE = buxVarC.E(set) | buxVarC.E(mndVar);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zE || objS == buw.a) {
                objS = new jzi(set, mndVar, 3, null);
                bvvVar.ad(objS);
            }
            bvq.c(obj, (afec) objS, buxVarC);
        } else {
            buxVarC.s();
        }
        Object obj2 = obj;
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new fwz(obj2, mndVar, i, i2, 15);
        }
    }
}
