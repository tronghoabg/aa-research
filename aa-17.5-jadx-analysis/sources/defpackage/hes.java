package defpackage;

import android.graphics.drawable.BitmapDrawable;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class hes {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.hfa r25, defpackage.cfy r26, defpackage.bux r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hes.a(hfa, cfy, bux, int, int):void");
    }

    public static final void b(String str, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-128703774);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            BitmapDrawable bitmapDrawableB = gux.b(str);
            bcm bcmVarB = bcr.b(gjk.d.k);
            int i4 = i2;
            ijk ijkVar = new ijk(bitmapDrawableB);
            csi csiVar = csh.a;
            cjp cjpVar = new cjp(-4294967296L, 5);
            cfy cfyVarAv = ca.av(cfyVar, false);
            ajh ajhVarB = afp.B(2.0f, czz.at(buxVarC).A);
            ca.bb(ijkVar, str, cjn.g(cfyVarAv.a(new ajg(ajhVarB.a, ajhVarB.b, bcmVarB)), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bcmVarB, true, 0, 1042431).a(new aix(-72057594037927936L, ckq.a)), null, csiVar, BitmapDescriptorFactory.HUE_RED, cjpVar, buxVarC, ((i4 << 3) & 112) | 1597448, 40);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new hcx(str, cfyVar, i, 19);
        }
    }

    public static final void c(hfa hfaVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        float f;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(633604259);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(hfaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            hjo hjoVar = (hjo) buxVarC.f(hjp.a);
            ctp ctpVarA = atp.a(atd.i(gjk.e.k, cfl.n), f(hjoVar) ? cfl.j : cfl.k, buxVarC, 0);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVar);
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
            hjm hjmVar = hjoVar.b;
            if (hjmVar == hjm.b) {
                f = 300.0f;
            } else {
                hjm hjmVar2 = hjm.c;
                f = (hjmVar != hjmVar2 || hjoVar.a.compareTo(hjn.b) > 0) ? (hjmVar == hjmVar2 && hjoVar.a == hjn.c) ? 450.0f : 200.0f : 350.0f;
            }
            b(hfaVar.a, awd.l(cfy.e, Float.NaN, Float.NaN, f, f), buxVarC, 0);
            a(hfaVar, null, buxVarC, i2 & 14, 2);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new hcx(hfaVar, cfyVar, i, 20);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013b A[Catch: cqn -> 0x0148, TryCatch #0 {cqn -> 0x0148, blocks: (B:62:0x0130, B:64:0x013b, B:66:0x0141, B:67:0x0146, B:60:0x011b), top: B:85:0x011b }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0146 A[Catch: cqn -> 0x0148, TRY_LEAVE, TryCatch #0 {cqn -> 0x0148, blocks: (B:62:0x0130, B:64:0x013b, B:66:0x0141, B:67:0x0146, B:60:0x011b), top: B:85:0x011b }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.crl r17, defpackage.hgk r18, defpackage.cql r19, defpackage.afck r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hes.d(crl, hgk, cql, afck):java.lang.Object");
    }

    public static final cfy e(cfy cfyVar, hga hgaVar, bux buxVar) {
        boolean zD = ((ggk) buxVar.f(ggo.a)).D();
        buxVar.v(1171764287);
        afak afakVar = afak.a;
        boolean zD2 = buxVar.D(zD) | buxVar.E(hgaVar);
        bvv bvvVar = (bvv) buxVar;
        Object objS = bvvVar.S();
        if (zD2 || objS == buw.a) {
            objS = new hgn(zD, hgaVar);
            bvvVar.ad(objS);
        }
        cfy cfyVarA = crh.a(cfyVar, afakVar, (PointerInputEventHandler) objS);
        bvvVar.Y(false);
        return cfyVarA == null ? cfyVar : cfyVarA;
    }

    private static final boolean f(hjo hjoVar) {
        return hjoVar.b == hjm.a;
    }
}
