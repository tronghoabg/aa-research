package defpackage;

import android.net.Uri;
import androidx.car.app.model.CarLocation;

/* loaded from: classes2.dex */
public final /* synthetic */ class gjy {
    public static final Uri a(Uri uri) {
        if (uri == null) {
            return null;
        }
        CarLocation carLocationA = gkx.a(uri);
        if (carLocationA == null) {
            String strB = gkx.b(uri);
            if (strB == null) {
                return null;
            }
            gks.b("CarApp.H", "Intent data set using query data");
            return Uri.parse("geo:0,0?q=".concat(afyh.J(strB, "\\s", "+")));
        }
        gks.b("CarApp.H", "Intent data set using location [Latitude and Longitude] data");
        return Uri.parse("geo:" + carLocationA.getLatitude() + "," + carLocationA.getLongitude());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.fwm r15, defpackage.cfy r16, defpackage.hjw r17, defpackage.ckv r18, defpackage.bux r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gjy.b(fwm, cfy, hjw, ckv, bux, int, int):void");
    }

    public static final void c(gab gabVar, cfy cfyVar, afeg afegVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-324087591);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gabVar) : buxVarC.E(gabVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 128 : 256;
        }
        int i4 = i2;
        if (buxVarC.I((i4 & 147) != 146, i4 & 1)) {
            cfv cfvVar = cfy.e;
            cfy cfyVarC = awd.c(cfvVar, 1.0f);
            cfn cfnVar = cfl.a;
            ctp ctpVarB = atk.b(cfnVar, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarC);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            afeg afegVar2 = cwb.e;
            byq.c(buxVarC, ctpVarB, afegVar2);
            afeg afegVar3 = cwb.d;
            byq.c(buxVarC, ccxVarAh, afegVar3);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar4 = cwb.f;
            byq.c(buxVarC, numValueOf, afegVar4);
            afec afecVar = cwb.g;
            byq.b(buxVarC, afecVar);
            afeg afegVar5 = cwb.c;
            byq.c(buxVarC, cfyVarJ, afegVar5);
            ca.I(gabVar, null, ca.F(500, 0, null, 6), null, gpj.a, buxVarC, (i4 & 14) | 24968, 10);
            atk.c(awd.c(cfvVar, 1.0f).a(new aix(cjv.h(gux.c(buxVarC).I(), 0.75f), ckq.a)), buxVarC, 0);
            cfy cfyVarX = asl.x(awd.c(cfvVar, 1.0f).a(cfyVar), asl.v(buxVarC));
            ctp ctpVarB2 = atk.b(cfnVar, false);
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarX);
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB2, afegVar2);
            byq.c(buxVarC, ccxVarAh2, afegVar3);
            byq.c(buxVarC, Integer.valueOf(iG2), afegVar4);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ2, afegVar5);
            afegVar.invoke(buxVarC, Integer.valueOf((i4 >> 6) & 14));
            bvvVar.Y(true);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new cuw((Object) gabVar, (Object) cfyVar, (Object) afegVar, i, 17);
        }
    }
}
