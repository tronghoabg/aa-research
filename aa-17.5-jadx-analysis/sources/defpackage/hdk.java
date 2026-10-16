package defpackage;

import android.service.personalcontext.insight.ContextInsight;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class hdk {
    public static final void a(hdl hdlVar, cfy cfyVar, bux buxVar, int i) {
        bux buxVarC = buxVar.c(-536628843);
        int i2 = (i & 6) == 0 ? (true != ((i & 8) == 0 ? buxVarC.C(hdlVar) : buxVarC.E(hdlVar)) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            bym bymVarE = byx.e(hdlVar.c, true, null, null, buxVarC, 6);
            cfy cfyVarR = awd.r(cfyVar);
            ctp ctpVarA = atp.a(atd.c, cfl.j, buxVarC, 0);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarR);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            gcq gcqVar = hdlVar.a;
            long jT = gux.c(buxVarC).T();
            dfw dfwVar = czz.av(buxVarC).k;
            boolean z = hdlVar.d;
            fzc.g(gcqVar, null, 2, 0, jT, dfwVar, 0L, null, 0, 0, z ? die.e : null, null, null, false, false, buxVarC, 392, 0, 64458);
            buxVarC = buxVarC;
            List list = hdlVar.b;
            if (list.isEmpty()) {
                buxVarC.v(-1780002749);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-1781177091);
                int size = ((Boolean) bymVarE.a()).booleanValue() ? 2 : list.size();
                int i3 = (((Boolean) bymVarE.a()).booleanValue() && list.size() == 1) ? 2 : ((Boolean) bymVarE.a()).booleanValue() ? 1 : 4;
                for (gcq gcqVar2 : woy.cd(list, size)) {
                    asl.A(awd.d(cfy.e, gjk.a.k), buxVarC);
                    bux buxVar2 = buxVarC;
                    fzc.g(gcqVar2, null, i3, 0, gux.c(buxVarC).U(), czz.av(buxVarC).l, 0L, null, 0, 0, z ? die.e : null, null, null, false, false, buxVar2, 8, 0, 64458);
                    buxVarC = buxVar2;
                }
                bvvVar.Y(false);
            }
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new hcx(hdlVar, cfyVar, i, 10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.hbj b(defpackage.haf r17, defpackage.geu r18) {
        /*
            r0 = r17
            r1 = r18
            r0.getClass()
            androidx.car.app.model.Shape r2 = r0.e
            r3 = 0
            if (r2 == 0) goto L11
            gzw r2 = defpackage.hbv.e(r2)
            goto L12
        L11:
            r2 = r3
        L12:
            r4 = 1
            boolean r5 = r2 instanceof defpackage.hke
            if (r4 == r5) goto L18
            r2 = r3
        L18:
            fyj r4 = r0.f
            if (r4 == 0) goto L21
            fwl r4 = defpackage.fwl.g(r4)
            goto L22
        L21:
            r4 = r3
        L22:
            boolean r5 = r4 instanceof defpackage.fyt
            if (r5 == 0) goto L29
            fyt r4 = (defpackage.fyt) r4
            goto L2a
        L29:
            r4 = r3
        L2a:
            androidx.car.app.model.CarText r5 = r0.a
            if (r5 == 0) goto L34
            gcq r5 = defpackage.fzc.m(r5, r1)
            r7 = r5
            goto L35
        L34:
            r7 = r3
        L35:
            androidx.car.app.model.CarText r5 = r0.b
            if (r5 == 0) goto L46
            gby r6 = r0.g
            if (r6 == 0) goto L3e
            r5 = r3
        L3e:
            if (r5 == 0) goto L46
            gcq r5 = defpackage.fzc.m(r5, r1)
            r8 = r5
            goto L47
        L46:
            r8 = r3
        L47:
            gag r5 = r0.c
            if (r5 == 0) goto L51
            gbg r5 = defpackage.fxy.d(r5)
            r9 = r5
            goto L52
        L51:
            r9 = r3
        L52:
            int r5 = r0.j
            gag r6 = r0.d
            if (r6 == 0) goto L5e
            gbg r6 = defpackage.fxy.d(r6)
            r11 = r6
            goto L5f
        L5e:
            r11 = r3
        L5f:
            int r6 = r0.k
            if (r4 != 0) goto L65
            fym r4 = defpackage.fym.a
        L65:
            r13 = r4
            if (r2 != 0) goto L6a
            hkb r2 = defpackage.hkb.a
        L6a:
            gby r4 = r0.g
            if (r4 == 0) goto L72
            gcb r3 = defpackage.fyh.c(r4, r1)
        L72:
            r15 = r3
            int r12 = c(r6)
            int r10 = c(r5)
            afdr r0 = r0.h
            hbj r6 = new hbj
            r14 = r2
            hke r14 = (defpackage.hke) r14
            r16 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hdk.b(haf, geu):hbj");
    }

    public static final int c(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            return i2 != 1 ? 3 : 2;
        }
        return 1;
    }

    public static List d(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new hqn((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public static final hqe e(ContextInsight contextInsight, String str) {
        str.getClass();
        return new hqe(str, contextInsight);
    }
}
