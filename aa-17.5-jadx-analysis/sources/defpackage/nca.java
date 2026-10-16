package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class nca {
    public static final /* synthetic */ int a = 0;

    static {
        tby.B(new eqm(new Object()), new nag(18));
    }

    public static final ncd a(bym bymVar) {
        return (ncd) bymVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final com.google.android.apps.auto.components.graphics.icon.GhIcon r19, final java.lang.String r20, final java.lang.String r21, final long r22, defpackage.cfy r24, boolean r25, defpackage.bux r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nca.b(com.google.android.apps.auto.components.graphics.icon.GhIcon, java.lang.String, java.lang.String, long, cfy, boolean, bux, int, int):void");
    }

    public static final void c(cfy cfyVar, afec afecVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1947938887);
        int i4 = 4;
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i5 = 16;
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afecVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            eru eruVarA = esh.a(buxVarC);
            if (eruVarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ncr ncrVar = (ncr) epq.e(affw.b(ncr.class), eruVarA, null, null, ecw.g(eruVarA));
            boolean zE = buxVarC.E(ncrVar);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zE || objS == buw.a) {
                objS = new kyo(ncrVar, i4);
                bvvVar.ad(objS);
            }
            kmc.a(ncrVar, (mnd) objS, buxVarC, 8, 0);
            Object objS2 = bvvVar.S();
            Object obj = buw.a;
            if (objS2 == obj) {
                objS2 = new mto(i5);
                bvvVar.ad(objS2);
            }
            cfy cfyVarK = ebj.k(cfyVar, (afdr) objS2);
            Object objS3 = bvvVar.S();
            if (objS3 == obj) {
                objS3 = new mto(17);
                bvvVar.ad(objS3);
            }
            afdr afdrVar = (afdr) objS3;
            Object objS4 = bvvVar.S();
            if (objS4 == obj) {
                objS4 = new asg();
                bvvVar.ad(objS4);
            }
            ca.at(cfyVarK, null, bxc.i(-56396680, true, new nbz(afdrVar, afecVar, ncrVar), buxVarC), buxVarC, 3072, 6);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nad(cfyVar, afecVar, i, 2, null);
        }
    }

    public static final long d(ncd ncdVar, bux buxVar) {
        buxVar.v(-448285576);
        int i = ncdVar.d;
        long jN = i == 0 ? cjn.n() : cjn.i(((Context) buxVar.f(daa.b)).getColor(i));
        buxVar.o();
        return jN;
    }

    public static final cfy e(cfy cfyVar, avp avpVar, ncd ncdVar, avp avpVar2, bux buxVar) {
        cfy cfyVarG = asl.G(das.d(cfyVar, "suggestion"), avpVar);
        float f = mvz.a;
        cfy cfyVarL = ebj.l(kvc.a(cfyVarG, mvz.b, 0L, 0L, null, null, null, false, false, buxVar, 0, 254), avpVar);
        boolean zE = buxVar.E(ncdVar);
        Object objG = buxVar.g();
        if (zE || objG == buw.a) {
            objG = new ahq(ncdVar, 14);
            buxVar.x(objG);
        }
        return asl.G(afp.x(cfyVarL, true, null, null, (afdr) objG), avpVar2);
    }
}
