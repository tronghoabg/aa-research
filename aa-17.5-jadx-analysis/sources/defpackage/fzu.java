package defpackage;

import androidx.car.app.model.CarColor;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class fzu {
    private static final yob a = yob.c("com/android/car/libraries/apphost/basewidgets/image/badge/BadgedImageKt");

    public static final fzv a(fzw fzwVar, geu geuVar) {
        gab gabVarE = fxy.e(fzwVar.a, geuVar);
        CarColor carColor = fzwVar.c;
        hjw hjwVarG = carColor != null ? gzw.g(carColor, geuVar.d().g()) : null;
        fzy fzyVar = fzwVar.d;
        gab gabVarE2 = fzyVar != null ? fxy.e(fzyVar, geuVar) : null;
        CarColor carColor2 = fzwVar.e;
        return new fzv(gabVarE, fzwVar.b, hjwVarG, gabVarE2, carColor2 != null ? gzw.g(carColor2, geuVar.d().g()) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011f  */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.fzv r47, defpackage.dlj r48, defpackage.cjv r49, defpackage.cfy r50, defpackage.dlj r51, defpackage.dlj r52, boolean r53, defpackage.cjv r54, boolean r55, defpackage.bux r56, final int r57, final int r58) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fzu.b(fzv, dlj, cjv, cfy, dlj, dlj, boolean, cjv, boolean, bux, int, int):void");
    }

    public static /* synthetic */ afak c(dlj dljVar, bux buxVar, int i) {
        if (buxVar.I((i & 3) != 2, i & 1)) {
            cfv cfvVar = cfy.e;
            cfy cfyVarC = awd.c(cfvVar, 1.0f);
            ctp ctpVarB = atk.b(cfl.e, false);
            int iG = a.g(buxVar.b());
            ccx ccxVarN = buxVar.N();
            cfy cfyVarJ = bzi.j(buxVar, cfyVarC);
            afdr afdrVar = cwb.a;
            buxVar.M();
            buxVar.w();
            if (buxVar.G()) {
                buxVar.j(afdrVar);
            } else {
                buxVar.y();
            }
            byq.c(buxVar, ctpVarB, cwb.e);
            byq.c(buxVar, ccxVarN, cwb.d);
            byq.c(buxVar, Integer.valueOf(iG), cwb.f);
            byq.b(buxVar, cwb.g);
            byq.c(buxVar, cfyVarJ, cwb.c);
            boz.h(awd.i(cfvVar, dljVar != null ? dljVar.a : 64.0f), 0L, BitmapDescriptorFactory.HUE_RED, 0L, 0, BitmapDescriptorFactory.HUE_RED, buxVar, 0);
            buxVar.n();
        } else {
            buxVar.s();
        }
        return afak.a;
    }

    private static final cjv d(bwq bwqVar) {
        return (cjv) bwqVar.a();
    }
}
