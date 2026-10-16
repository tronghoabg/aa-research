package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class fwt {
    public static final yob a = yob.c("com/android/car/libraries/apphost/basewidgets/action/ui/ApphostTimedButtonKt");

    public static final void a(cfy cfyVar, fwy fwyVar, float f, ckv ckvVar, fxe fxeVar, bux buxVar, int i) {
        int i2;
        ckv ckvVar2;
        fxe fxeVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-182373762);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(fwyVar) : buxVarC.E(fwyVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.z(f) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            ckvVar2 = ckvVar;
            i2 |= true != buxVarC.C(ckvVar2) ? 1024 : 2048;
        } else {
            ckvVar2 = ckvVar;
        }
        if ((i & 24576) == 0) {
            fxeVar2 = fxeVar;
            i2 |= true != buxVarC.C(fxeVar2) ? 8192 : 16384;
        } else {
            fxeVar2 = fxeVar;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.C(null) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != buxVarC.C(null) ? 524288 : 1048576;
        }
        if (buxVarC.I((599187 & i2) != 599186, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) != 0 && !buxVarC.F()) {
                buxVarC.s();
            }
            buxVarC.l();
            fxe fxeVar3 = fxe.c;
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                objS = new asg();
                bvvVar.ad(objS);
            }
            czz.am(bpe.b.b(fww.f(fxeVar3, buxVarC)), bxc.i(1907090878, true, new kuc(fwyVar, cfyVar, fxeVar3, ckvVar2, (asf) objS, f, fxeVar2, 1), buxVarC), buxVarC, 56);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gzt(cfyVar, fwyVar, f, ckvVar, fxeVar, i, 1);
        }
    }

    public static final void b(fwy fwyVar, ckv ckvVar, fxe fxeVar, bux buxVar) {
        bvf bvfVar = brp.a;
        dfw dfwVarJ = ((dfw) buxVar.f(bvfVar)).j(czz.av(buxVar).m);
        boolean z = fwyVar.e;
        afeg afegVar = z ? fxeVar.i : fxeVar.m;
        afeg afegVar2 = z ? fxeVar.h : fxeVar.l;
        gcq gcqVar = fwyVar.b;
        czz.an(new bxe[]{bnm.a.b(afegVar.invoke(buxVar, 0)), ggf.a.b(afegVar2.invoke(buxVar, 0)), bvfVar.b(dfwVarJ)}, bxc.i(-462045626, true, new gvp(ckvVar, afegVar2, fww.d(gcqVar != null && gcqVar.a.a(), null, null, buxVar, 0), fwyVar, 1), buxVar), buxVar, 48);
    }

    public static final void c(fwu fwuVar, cfy cfyVar, ckv ckvVar, bux buxVar, int i) {
        int i2;
        ckv ckvVar2;
        ckv ckvVar3;
        Object bqiVar;
        afak afakVar;
        fwy fwyVar;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(120147584);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(fwuVar) : buxVarC.E(fwuVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        int i4 = i2 | 27648;
        if (buxVarC.I((i4 & 9363) != 9362, i4 & 1)) {
            int i5 = i4 & (-897);
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                ckvVar3 = gux.f(buxVarC).a.g;
            } else {
                buxVarC.s();
                ckvVar3 = ckvVar;
            }
            buxVarC.l();
            fwy fwyVar2 = fwuVar.b;
            fxe fxeVar = fxe.g;
            hjw hjwVar = hjw.a;
            fxe fxeVarA = fxg.a(fxeVar, null, fwyVar2.f, true, buxVarC);
            long j = fwuVar.c;
            long j2 = aisq.a;
            float fA = aisq.c(j, 0L) > 0 ? (float) aisq.a(fwuVar.d, j) : BitmapDescriptorFactory.HUE_RED;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(false, bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            bwq bwqVar = (bwq) objS;
            Object objS2 = bvvVar.S();
            if (objS2 == obj) {
                objS2 = adv.a(fA);
                bvvVar.ad(objS2);
            }
            adu aduVar = (adu) objS2;
            Object objS3 = bvvVar.S();
            if (objS3 == obj) {
                objS3 = bvq.a(afcp.a, buxVarC);
                bvvVar.ad(objS3);
            }
            aitx aitxVar = (aitx) objS3;
            afak afakVar2 = afak.a;
            int i6 = i4 & 14;
            boolean zE = buxVarC.E(aduVar) | (i6 == 4 || ((i4 & 8) != 0 && buxVarC.E(fwuVar)));
            Object objS4 = bvvVar.S();
            if (zE || objS4 == obj) {
                afakVar = afakVar2;
                fwyVar = fwyVar2;
                bqiVar = new bqi(aduVar, fwuVar, bwqVar, (afck) null, 7);
                bvvVar.ad(bqiVar);
            } else {
                fwyVar = fwyVar2;
                bqiVar = objS4;
                afakVar = afakVar2;
            }
            bvq.g(afakVar, (afeg) bqiVar, buxVarC);
            boolean zE2 = buxVarC.E(aitxVar) | buxVarC.E(aduVar) | (i6 == 4 || ((i4 & 8) != 0 && buxVarC.E(fwuVar)));
            Object objS5 = bvvVar.S();
            if (zE2 || objS5 == obj) {
                fpb fpbVar = new fpb(aitxVar, fwuVar, bwqVar, aduVar, 2);
                aduVar = aduVar;
                bvvVar.ad(fpbVar);
                objS5 = fpbVar;
            }
            int i7 = i5 << 6;
            ckv ckvVar4 = ckvVar3;
            a(cfyVar, fwy.c(fwyVar, (afdr) objS5, null, false, null, 123), ((Number) aduVar.d()).floatValue(), ckvVar4, fxeVarA, buxVarC, ((i5 >> 3) & 14) | (fwy.a << 3) | (458752 & i7) | (3670016 & i7));
            ckvVar2 = ckvVar4;
        } else {
            buxVarC.s();
            ckvVar2 = ckvVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new cuw((Object) fwuVar, cfyVar, (Object) ckvVar2, i, 10);
        }
    }
}
