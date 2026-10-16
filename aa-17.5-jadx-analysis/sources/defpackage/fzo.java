package defpackage;

import android.net.Uri;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarSpan;
import androidx.car.app.model.CarText;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class fzo {
    public static final fzp a(gac gacVar, geu geuVar) {
        CarColor carColor = gacVar.c;
        fzp fzpVar = new fzp(gacVar.a, gacVar.b, carColor != null ? gzw.g(carColor, geuVar.d().g()) : null);
        gzj.d(fzpVar, gacVar);
        return fzpVar;
    }

    public static final void b(cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1260792057);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            atk.c(afp.E(awd.c(cfyVar, 1.0f), gux.c(buxVarC).Q(), bcr.b(gjk.b.k)), buxVarC, 0);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bqv(cfyVar, i, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.fzp r21, defpackage.cfy r22, defpackage.cfn r23, defpackage.csi r24, float r25, defpackage.cjw r26, defpackage.afeg r27, boolean r28, defpackage.bux r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fzo.c(fzp, cfy, cfn, csi, float, cjw, afeg, boolean, bux, int, int):void");
    }

    public static final void d(final Uri uri, final cfy cfyVar, final cfn cfnVar, final csi csiVar, final float f, final cjw cjwVar, final afeg afegVar, bux buxVar, final int i) {
        Object obj;
        int i2;
        bux buxVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-2121908455);
        if (i3 == 0) {
            obj = uri;
            i2 = (true != buxVarC.E(obj) ? 2 : 4) | i;
        } else {
            obj = uri;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(cfnVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.C(csiVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.z(f) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.C(cjwVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != buxVarC.E(null) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != buxVarC.E(null) ? 33554432 : 67108864;
        }
        if (buxVarC.I((38347923 & i2) != 38347922, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj2 = buw.a;
            if (objS == obj2) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(cjwVar, bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            bwq bwqVar = (bwq) objS;
            cjw cjwVar2 = (cjw) bwqVar.a();
            hdo hdoVarA = afegVar != null ? htg.a(afegVar) : null;
            int i4 = i2 & 3670016;
            int i5 = i2;
            Object objS2 = bvvVar.S();
            if (i4 == 1048576 || objS2 == obj2) {
                objS2 = new fzl(bwqVar, 0);
                bvvVar.ad(objS2);
            }
            int i6 = i5 << 3;
            buxVar2 = buxVarC;
            htg.b(obj, cfyVar, cfnVar, csiVar, f, cjwVar2, hdoVarA, null, (afec) objS2, buxVar2, (i5 & 14) | 48 | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | 150994944);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: fzm
                @Override // defpackage.afeg
                public final Object invoke(Object obj3, Object obj4) {
                    bux buxVar3 = (bux) obj3;
                    ((Integer) obj4).intValue();
                    Uri uri2 = uri;
                    cfy cfyVar2 = cfyVar;
                    cfn cfnVar2 = cfnVar;
                    int i7 = i | 1;
                    int i8 = 306783378 & i7;
                    int i9 = 613566756 & i7;
                    fzo.d(uri2, cfyVar2, cfnVar2, csiVar, f, cjwVar, afegVar, buxVar3, (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 + i8) & i9));
                    return afak.a;
                }
            };
        }
    }

    public static final fzh e(fzg fzgVar, geu geuVar) {
        CarText carText = fzgVar.a;
        gcq gcqVarI = carText != null ? fzc.i(carText, geuVar, gcp.a) : null;
        CarText carText2 = fzgVar.b;
        gcq gcqVarI2 = carText2 != null ? fzc.i(carText2, geuVar, gcp.a) : null;
        fyj fyjVar = fzgVar.c;
        fwl fwlVarG = fyjVar != null ? fwl.g(fyjVar) : null;
        gag gagVar = fzgVar.d;
        gbg gbgVarD = gagVar != null ? fxy.d(gagVar) : null;
        List listE = fzc.e(fzgVar.e, geuVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            fxo fxoVar = ((fwm) it.next()).b;
            if (fxoVar != null) {
                arrayList.add(fxoVar);
            }
        }
        List list = fzgVar.f;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            fwb fwbVar = ((fvu) it2.next()).b;
            fxo fxoVarE = fwbVar != null ? fxa.e(fwbVar, geuVar, null, 6) : null;
            fwy fwyVar = fxoVarE instanceof fwy ? (fwy) fxoVarE : null;
            if (fwyVar != null) {
                arrayList2.add(fwyVar);
            }
        }
        fzh fzhVar = new fzh(gcqVarI, gcqVarI2, fwlVarG, gbgVarD, arrayList, arrayList2);
        gzj.d(fzhVar, fzgVar);
        return fzhVar;
    }

    public static final gcs f(CarText carText) {
        List listBg = woy.bg(carText.toString());
        List<CharSequence> variants = carText.getVariants();
        variants.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(variants, 10));
        Iterator<T> it = variants.iterator();
        while (it.hasNext()) {
            arrayList.add(((CharSequence) it.next()).toString());
        }
        List listBY = woy.bY(listBg, arrayList);
        List<CarText.SpanWrapper> spans = carText.getSpans();
        spans.getClass();
        ArrayList arrayList2 = new ArrayList(woy.bp(spans, 10));
        for (CarText.SpanWrapper spanWrapper : spans) {
            spanWrapper.getClass();
            arrayList2.add(g(spanWrapper));
        }
        List listBg2 = woy.bg(arrayList2);
        List<List<CarText.SpanWrapper>> spansForVariants = carText.getSpansForVariants();
        spansForVariants.getClass();
        ArrayList arrayList3 = new ArrayList(woy.bp(spansForVariants, 10));
        Iterator<T> it2 = spansForVariants.iterator();
        while (it2.hasNext()) {
            List<CarText.SpanWrapper> list = (List) it2.next();
            list.getClass();
            ArrayList arrayList4 = new ArrayList(woy.bp(list, 10));
            for (CarText.SpanWrapper spanWrapper2 : list) {
                spanWrapper2.getClass();
                arrayList4.add(g(spanWrapper2));
            }
            arrayList3.add(arrayList4);
        }
        gcs gcsVar = new gcs(listBY, woy.bY(listBg2, arrayList3), carText);
        gka.b(gcsVar, carText);
        return gcsVar;
    }

    public static final gcu g(CarText.SpanWrapper spanWrapper) {
        int start = spanWrapper.getStart();
        int end = spanWrapper.getEnd();
        CarSpan carSpan = spanWrapper.getCarSpan();
        carSpan.getClass();
        gct gctVar = new gct(carSpan);
        gka.b(gctVar, carSpan);
        gcu gcuVar = new gcu(start, end, gctVar);
        gka.b(gcuVar, spanWrapper);
        return gcuVar;
    }

    public static final boolean h(gcs gcsVar) {
        if (gcsVar == null) {
            return true;
        }
        List list = gcsVar.a;
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).length() != 0) {
                return false;
            }
        }
        return true;
    }
}
