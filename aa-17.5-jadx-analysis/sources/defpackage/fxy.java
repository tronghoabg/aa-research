package defpackage;

import android.text.TextUtils;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Collection;

/* loaded from: classes2.dex */
public final class fxy {
    public static final void a(fxz fxzVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1314305569);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(fxzVar) : buxVarC.E(fxzVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, 1 & i2)) {
            b(gzj.e(cfyVar, fxzVar), fxzVar.a, fxzVar.c, fxzVar.b, fxzVar.d, BitmapDescriptorFactory.HUE_RED, null, buxVarC, 0, 96);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bro(fxzVar, cfyVar, i, 11, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.cfy r19, java.util.List r20, defpackage.cfm r21, boolean r22, int r23, float r24, defpackage.dlj r25, defpackage.bux r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxy.b(cfy, java.util.List, cfm, boolean, int, float, dlj, bux, int, int):void");
    }

    public static final void c(fyu fyuVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        boolean z;
        bvv bvvVar;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(611315224);
        if (i3 == 0) {
            i2 = i | (true != ((i & 8) == 0 ? buxVarC.C(fyuVar) : buxVarC.E(fyuVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            long jI = gux.c(buxVarC).I();
            cfy cfyVarC = awd.c(cfyVar, 1.0f);
            ctp ctpVarB = atk.b(cfl.a, false);
            bvv bvvVar2 = (bvv) buxVarC;
            int iG = a.g(bvvVar2.u);
            ccx ccxVarAh = bvvVar2.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarC);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar2.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            gbg gbgVar = fyuVar.a;
            cfv cfvVar = cfy.e;
            gbf.d(gbgVar, awd.c(cfvVar, 1.0f), null, csh.a, null, false, false, null, null, false, buxVarC, 3120, 1012);
            cfy cfyVarC2 = awd.c(cfvVar, 1.0f);
            boolean zB = buxVarC.B(jI);
            Object objS = bvvVar2.S();
            if (zB || objS == buw.a) {
                z = true;
                objS = new mxl(jI, 1 == true ? 1 : 0);
                bvvVar = bvvVar2;
                bvvVar.ad(objS);
            } else {
                bvvVar = bvvVar2;
                z = true;
            }
            asl.A(bxc.p(cfyVarC2, (afec) objS), buxVarC);
            bvvVar.Y(z);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bro(fyuVar, cfyVar, i, 13, null);
        }
    }

    public static final gbg d(gag gagVar) {
        gbg gapVar;
        if (gagVar instanceof gae) {
            gapVar = new gau(((gae) gagVar).a);
        } else if (gagVar instanceof gaf) {
            gaf gafVar = (gaf) gagVar;
            gapVar = new gav(gafVar.a, gafVar.b, gafVar.c);
        } else if (gagVar instanceof gal) {
            gal galVar = (gal) gagVar;
            gapVar = new gbi(galVar.a, galVar.b, galVar.c, galVar.d);
        } else if (gagVar instanceof gaj) {
            gapVar = new gbh(((gaj) gagVar).a);
        } else {
            if (!(gagVar instanceof gak)) {
                throw new aezs();
            }
            gak gakVar = (gak) gagVar;
            geu geuVar = gakVar.a;
            CarColor carColor = gakVar.b;
            gapVar = new gap(new jyc(((gbl) geuVar.F(gbl.class)).a(), geuVar, carColor, 1), carColor);
        }
        gzj.d(gapVar, gagVar);
        return gapVar;
    }

    public static final gab e(fzy fzyVar, geu geuVar) {
        CarIcon carIcon = fzyVar.a;
        gff gffVar = carIcon != null ? new gff(geuVar, carIcon, false) : null;
        gac gacVar = fzyVar.b;
        fzp fzpVarA = gacVar != null ? fzo.a(gacVar, geuVar) : null;
        gag gagVar = fzyVar.c;
        gab gabVar = new gab(gffVar, fzpVarA, gagVar != null ? d(gagVar) : null);
        gzj.d(gabVar, fzyVar);
        return gabVar;
    }

    public static int f(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -678927291) {
            if (iHashCode != 3178) {
                if (iHashCode != 3240) {
                    if (iHashCode != 3251) {
                        if (iHashCode != 3365) {
                            if (iHashCode != 3488) {
                                if (iHashCode != 3571) {
                                    if (iHashCode != 3588) {
                                        if (iHashCode == 3592 && str.equals("px")) {
                                            return 1;
                                        }
                                    } else if (str.equals("pt")) {
                                        return 7;
                                    }
                                } else if (str.equals("pc")) {
                                    return 8;
                                }
                            } else if (str.equals("mm")) {
                                return 6;
                            }
                        } else if (str.equals("in")) {
                            return 4;
                        }
                    } else if (str.equals("ex")) {
                        return 3;
                    }
                } else if (str.equals("em")) {
                    return 2;
                }
            } else if (str.equals("cm")) {
                return 5;
            }
        } else if (str.equals("percent")) {
            return 9;
        }
        throw new IllegalArgumentException();
    }

    public static void g(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void h(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
    }

    public static void i(Collection collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
    }
}
