package defpackage;

import android.content.Context;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;

/* loaded from: classes2.dex */
public final class jtq {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.fxl r17, defpackage.cfy r18, defpackage.ktf r19, defpackage.bmr r20, defpackage.bux r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jtq.a(fxl, cfy, ktf, bmr, bux, int, int):void");
    }

    public static final void b(gbx gbxVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        cfy cfyVar2;
        bvv bvvVar;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1932802905);
        if (i3 == 0) {
            i2 = i | (true != buxVarC.E(gbxVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            cfv cfvVar = cfy.e;
            bvv bvvVar2 = (bvv) buxVarC;
            Object objS = bvvVar2.S();
            Object obj = buw.a;
            if (objS == obj) {
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = new ParcelableSnapshotMutableIntState(gbxVar.d);
                bvvVar2.ad(parcelableSnapshotMutableIntState);
                objS = parcelableSnapshotMutableIntState;
            }
            byd bydVar = (byd) objS;
            float f = gjk.a.k;
            asx asxVarG = atd.g(f);
            cfr cfrVar = cfl.n;
            cfy cfyVarH = asl.H(cfvVar.a(new aix(kfn.i(buxVarC).G(), ckq.a)), f);
            ctp ctpVarA = avv.a(asxVarG, cfrVar, buxVarC, 48);
            int iG = a.g(bvvVar2.u);
            ccx ccxVarAh = bvvVar2.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarH);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar2.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            gfk gfkVar = gbxVar.b;
            boolean zE = buxVarC.E(gbxVar);
            Object objS2 = bvvVar2.S();
            byte[] bArr = null;
            if (zE || objS2 == obj) {
                objS2 = new hgl(gbxVar, bydVar, 10, bArr);
                bvvVar2.ad(objS2);
            }
            fyf fyfVar = new fyf(null, gfkVar, (afdr) objS2, false, null, false, false, 505);
            float f2 = gjk.e.k;
            juc.a(fyfVar, das.d(asl.J(cfvVar, f, f, f2, f), "DecrementButtonTest"), buxVarC, 8);
            brp.b(String.valueOf(bydVar.e()), das.d(cfvVar, "numberDisplay"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, czz.av(buxVarC).c, buxVarC, 48, 0, 131068);
            buxVar2 = buxVarC;
            gfk gfkVar2 = gbxVar.a;
            boolean zE2 = buxVar2.E(gbxVar);
            Object objS3 = bvvVar2.S();
            if (zE2 || objS3 == obj) {
                objS3 = new hgl(gbxVar, bydVar, 11, bArr);
                bvvVar = bvvVar2;
                bvvVar.ad(objS3);
            } else {
                bvvVar = bvvVar2;
            }
            cfyVar2 = cfvVar;
            juc.a(new fyf(null, gfkVar2, (afdr) objS3, false, null, false, false, 505), das.d(asl.J(cfyVar2, f2, f, f, f), "IncrementButtonTest"), buxVar2, 8);
            bvvVar.Y(true);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            cfyVar2 = cfyVar;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new jtt(gbxVar, cfyVar2, i, 9);
        }
    }

    public static int c(Context context, float f) {
        if (context.getResources() == null) {
            return 0;
        }
        return (int) (r1.getDisplayMetrics().widthPixels * ((1.0f - f) / 2.0f));
    }

    public static final ghe d(geu geuVar) {
        geuVar.getClass();
        return (ghe) geuVar.l(ghe.class);
    }
}
