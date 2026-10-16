package defpackage;

import androidx.car.app.model.CarColor;

/* loaded from: classes2.dex */
public final class hbf {
    private static final yob a = yob.c("com/android/car/libraries/apphost/sectioneditem/ui/CarFilterChipKt");

    public static final void a(final gbg gbgVar, final long j, final boolean z, bux buxVar, final int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1613212755);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gbgVar) : buxVarC.E(gbgVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.B(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.D(z) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            gbf.d(gbgVar, awd.i(cfy.e, 24.0f), null, null, new cjv(j), false, true, null, null, z, buxVarC, (i2 & 14) | 1572912 | ((i2 << 9) & 57344) | ((i2 << 21) & 1879048192), 428);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: hbd
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar2 = (bux) obj;
                    ((Integer) obj2).intValue();
                    int i4 = i | 1;
                    int i5 = 306783378 & i4;
                    int i6 = 613566756 & i4;
                    hbf.a(gbgVar, j, z, buxVar2, (i4 & (-920350135)) | i5 | (i6 >> 1) | ((i5 + i5) & i6));
                    return afak.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0365 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0423  */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.hbp r35, final defpackage.cfy r36, defpackage.asf r37, defpackage.bux r38, int r39) {
        /*
            Method dump skipped, instructions count: 1158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbf.b(hbp, cfy, asf, bux, int):void");
    }

    private static final boolean c(gbg gbgVar, hbp hbpVar, long j, long j2, bux buxVar) {
        hjw hjwVarF;
        bux buxVar2;
        buxVar.v(-1558163793);
        boolean zP = true;
        if (gbgVar == null) {
            buxVar2 = buxVar;
        } else {
            CarColor carColorA = gbgVar.a();
            if (carColorA == null) {
                buxVar.v(749152839);
                ((bvv) buxVar).Y(false);
                hjwVarF = null;
            } else {
                buxVar.v(1548186874);
                hjwVarF = gzw.f(carColorA, buxVar);
                ((bvv) buxVar).Y(false);
            }
            if (hjwVarF != null) {
                buxVar.v(1548188602);
                zP = fww.s(hjwVarF, j2, buxVar);
                ((bvv) buxVar).Y(false);
            } else {
                hbo hboVar = hbpVar.g;
                if ((hboVar != null ? hboVar.c : null) != null) {
                    buxVar.v(749290748);
                    ((bvv) buxVar).Y(false);
                } else {
                    buxVar.v(1548191899);
                    buxVar2 = buxVar;
                    zP = fww.p(j2, j, buxVar2, 0);
                    ((bvv) buxVar2).Y(false);
                }
            }
            buxVar2 = buxVar;
        }
        ((bvv) buxVar2).Y(false);
        return zP;
    }
}
