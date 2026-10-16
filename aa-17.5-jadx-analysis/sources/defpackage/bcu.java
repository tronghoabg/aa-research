package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class bcu {
    public static final aezu a;

    static {
        afbe afbeVar = afbe.a;
        a = new aezu(afbeVar, afbeVar);
    }

    public static final void a(deu deuVar, List list, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1794596951);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(deuVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        char c = ' ';
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(list) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            int size = list.size();
            int i4 = 0;
            while (i4 < size) {
                det detVar = (det) list.get(i4);
                afeh afehVar = (afeh) detVar.a;
                int i5 = detVar.b;
                int i6 = detVar.c;
                bvv bvvVar = (bvv) buxVarC;
                Object objS = bvvVar.S();
                if (objS == buw.a) {
                    objS = atj.c;
                    bvvVar.ad(objS);
                }
                ctp ctpVar = (ctp) objS;
                cfv cfvVar = cfy.e;
                int i7 = i4;
                long j = bvvVar.u;
                long j2 = j ^ (j >>> c);
                ccx ccxVarAh = bvvVar.ah();
                cfy cfyVarJ = bzi.j(buxVarC, cfvVar);
                afdr afdrVar = cwb.a;
                buxVarC.w();
                if (bvvVar.t) {
                    buxVarC.j(afdrVar);
                } else {
                    buxVarC.y();
                }
                byq.c(buxVarC, ctpVar, cwb.e);
                byq.c(buxVarC, ccxVarAh, cwb.d);
                byq.c(buxVarC, Integer.valueOf((int) j2), cwb.f);
                buxVarC.i(afak.a, new alx(cwb.g, 16));
                byq.c(buxVarC, cfyVarJ, cwb.c);
                afehVar.invoke(deuVar.subSequence(i5, i6).b, buxVarC, 0);
                bvvVar.Y(true);
                i4 = i7 + 1;
                c = ' ';
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afz(deuVar, list, i, 6);
        }
    }
}
