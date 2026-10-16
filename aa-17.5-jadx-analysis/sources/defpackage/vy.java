package defpackage;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public /* synthetic */ class vy {
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(defpackage.cfy r19, defpackage.ckv r20, defpackage.bmv r21, defpackage.bmw r22, defpackage.ajh r23, defpackage.afeh r24, defpackage.bux r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vy.a(cfy, ckv, bmv, bmw, ajh, afeh, bux, int, int):void");
    }

    public static void b(cfy cfyVar, ckv ckvVar, bmv bmvVar, bmw bmwVar, ajh ajhVar, afeh afehVar, bux buxVar, int i) {
        cfy cfyVar2;
        int i2;
        ckv ckvVar2;
        bmv bmvVar2;
        bmw bmwVar2;
        bmv bmvVar3;
        ckv ckvVar3;
        bmv bmvVar4;
        bmw bmwVar3;
        bux buxVarC = buxVar.c(-1945643296);
        if ((i & 6) == 0) {
            cfyVar2 = cfyVar;
            i2 = (true != buxVarC.C(cfyVar2) ? 2 : 4) | i;
        } else {
            cfyVar2 = cfyVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.C(ajhVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.E(afehVar) ? 65536 : 131072;
        }
        if (buxVarC.I((74899 & i2) != 74898, i2 & 1)) {
            ((bvv) buxVarC).ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                bvf bvfVar = boh.a;
                ckv ckvVarAq = czz.aq(((bog) buxVarC.f(bvfVar)).c, 13);
                bng bngVar = ((bog) buxVarC.f(bvfVar)).a;
                bmv bmvVar5 = bngVar.Z;
                if (bmvVar5 == null) {
                    bmvVar3 = new bmv(bnh.e(bngVar, 35), bnh.a(bngVar, bnh.e(bngVar, 35)), bnh.e(bngVar, 35), cjv.h(bnh.a(bngVar, bnh.e(bngVar, 35)), 0.38f));
                    bngVar.Z = bmvVar3;
                } else {
                    bmvVar3 = bmvVar5;
                }
                ckvVar3 = ckvVarAq;
                bmvVar4 = bmvVar3;
                bmwVar3 = new bmw(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            } else {
                buxVarC.s();
                ckvVar3 = ckvVar;
                bmvVar4 = bmvVar;
                bmwVar3 = bmwVar;
            }
            buxVarC.l();
            a(cfyVar2, ckvVar3, bmvVar4, bmwVar3, ajhVar, afehVar, buxVarC, i2 & 516110, 0);
            ckvVar2 = ckvVar3;
            bmvVar2 = bmvVar4;
            bmwVar2 = bmwVar3;
        } else {
            buxVarC.s();
            ckvVar2 = ckvVar;
            bmvVar2 = bmvVar;
            bmwVar2 = bmwVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bpj(cfyVar, ckvVar2, bmvVar2, bmwVar2, ajhVar, afehVar, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0403 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x042d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0434 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021a  */
    /* JADX WARN: Type inference failed for: r35v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r38v13 */
    /* JADX WARN: Type inference failed for: r38v14 */
    /* JADX WARN: Type inference failed for: r38v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.view.ViewStructure r42, defpackage.cxb r43, android.view.autofill.AutofillId r44, java.lang.String r45, defpackage.dei r46) {
        /*
            Method dump skipped, instructions count: 1077
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vy.c(android.view.ViewStructure, cxb, android.view.autofill.AutofillId, java.lang.String, dei):void");
    }

    public static cgm d(String str) {
        return new cgg(woy.aO(str));
    }

    public static String[] e(cgm cgmVar) {
        cgmVar.getClass();
        return (String[]) ((cgg) cgmVar).a.toArray(new String[0]);
    }

    public static String f(int i) {
        return i != 0 ? "bottom" : "top";
    }

    public static String g(int i) {
        return i != -2 ? i != -1 ? i != 0 ? "right" : "left" : "end" : "start";
    }

    public static Object h(zgp zgpVar, afck afckVar) throws Throwable {
        try {
            if (zgpVar.isDone()) {
                int i = dnv.c;
                return a.L(zgpVar);
            }
            aitg aitgVar = new aitg(affa.s(afckVar), 1);
            aitgVar.z();
            zgpVar.c(new fku(zgpVar, aitgVar, 1), dob.a);
            aitgVar.d(new dmz(zgpVar, 3));
            return aitgVar.k();
        } catch (ExecutionException e) {
            throw i(e);
        }
    }

    public static Throwable i(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        cause.getClass();
        return cause;
    }

    public static void l(afdr afdrVar, dnk dnkVar, afeg afegVar, bux buxVar, int i) {
        afdr afdrVar2;
        int i2;
        boolean z;
        boolean z2;
        bux buxVarC = buxVar.c(826668973);
        if ((i & 6) == 0) {
            afdrVar2 = afdrVar;
            i2 = (true != buxVarC.E(afdrVar2) ? 2 : 4) | i;
        } else {
            afdrVar2 = afdrVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(dnkVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 128 : 256;
        }
        int i3 = i2;
        if (buxVarC.I((i3 & 147) != 146, i3 & 1)) {
            View view = (View) buxVarC.f(daa.f);
            dlg dlgVar = (dlg) buxVarC.f(dbc.d);
            dlr dlrVar = (dlr) buxVarC.f(dbc.i);
            bvb bvbVarD = buxVarC.d();
            bym bymVarC = byx.c(afegVar, buxVarC);
            Object[] objArr = new Object[0];
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new blz(17);
                bvvVar.ad(objS);
            }
            UUID uuid = (UUID) byx.q(objArr, (afdr) objS, buxVarC);
            boolean zC = buxVarC.C(view) | buxVarC.C(dlgVar) | buxVarC.A(2) | buxVarC.C(null);
            Object objS2 = bvvVar.S();
            if (zC || objS2 == obj) {
                z = false;
                dnm dnmVar = new dnm(afdrVar2, dnkVar, view, dlrVar, dlgVar, uuid);
                z2 = true;
                dnmVar.c.k(bvbVarD, new cct(-1338939603, true, new bly(bymVarC, 10)));
                bvvVar.ad(dnmVar);
                objS2 = dnmVar;
            } else {
                z2 = true;
                z = false;
            }
            dnm dnmVar2 = (dnm) objS2;
            boolean zE = buxVarC.E(dnmVar2);
            Object objS3 = bvvVar.S();
            if (zE || objS3 == obj) {
                objS3 = new ddz(dnmVar2, 8);
                bvvVar.ad(objS3);
            }
            bvq.c(dnmVar2, (afec) objS3, buxVarC);
            boolean zE2 = buxVarC.E(dnmVar2) | ((i3 & 14) == 4 ? z2 : z);
            if ((i3 & 112) == 32) {
                z = z2;
            }
            boolean zA = zE2 | z | buxVarC.A(dlrVar.ordinal()) | buxVarC.C(dlgVar);
            Object objS4 = bvvVar.S();
            if (zA || objS4 == obj) {
                dmu dmuVar = new dmu(dnmVar2, afdrVar, dnkVar, dlrVar, dlgVar, 1);
                bvvVar.ad(dmuVar);
                objS4 = dmuVar;
            }
            buxVarC.r((afdr) objS4);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new cuw(afdrVar, dnkVar, afegVar, i, 2);
        }
    }

    public static void m(cfy cfyVar, afeg afegVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1090521195);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 16 : 32;
        }
        int i4 = 3;
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                objS = dna.b;
                bvvVar.ad(objS);
            }
            ctp ctpVar = (ctp) objS;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVar);
            int i5 = (((((i2 << 3) & 112) | (((i2 >> 3) & 14) | 384)) << 6) & 896) | 6;
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVar, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            afegVar.invoke(buxVarC, Integer.valueOf((i5 >> 6) & 14));
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bro(cfyVar, afegVar, i, i4);
        }
    }

    public void j(View view, Rect rect) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public void k(View view, int i, int i2) {
    }
}
