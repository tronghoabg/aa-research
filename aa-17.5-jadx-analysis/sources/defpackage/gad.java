package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes2.dex */
public final class gad {
    private static final yob a = yob.c("com/android/car/libraries/apphost/basewidgets/image/model/CarIconInternalModelKt");

    /* JADX WARN: Removed duplicated region for block: B:45:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0156 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.gac a(androidx.car.app.model.CarIcon r5, defpackage.geu r6, defpackage.ghw r7, defpackage.ghv r8) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gad.a(androidx.car.app.model.CarIcon, geu, ghw, ghv):gac");
    }

    public static /* synthetic */ gac b(CarIcon carIcon, geu geuVar) {
        ghw ghwVar = ghw.a;
        ghv ghvVar = ghv.a;
        ghvVar.getClass();
        return a(carIcon, geuVar, ghwVar, ghvVar);
    }

    private static final Drawable c(geu geuVar, IconCompat iconCompat) {
        String packageName = ((gmh) geuVar.d()).a.getPackageName();
        packageName.getClass();
        int i = geuVar.getResources().getDisplayMetrics().densityDpi;
        int iA = iconCompat.a();
        Context contextA = geuVar.a();
        if (contextA == null) {
            ((ynz) a.h().o(ypi.a, "CarApp.H.Converter").ai(14)).w("Failed to load drawable for %d, configuration unavailable", iA);
            return null;
        }
        yob yobVar = a;
        ((ynz) yobVar.e().o(ypi.a, "CarApp.H.Converter").ai(11)).R("Loading resource drawable with id %d for density %d from package %s", Integer.valueOf(iA), Integer.valueOf(i), packageName);
        try {
            Drawable drawableForDensity = contextA.getResources().getDrawableForDensity(iA, i, contextA.getTheme());
            if (drawableForDensity != null) {
                return drawableForDensity;
            }
            ((ynz) yobVar.h().o(ypi.a, "CarApp.H.Converter").ai(12)).w("Failed to decode drawable for %d", iA);
            return null;
        } catch (Resources.NotFoundException e) {
            ((ynz) ((ynz) a.h().o(ypi.a, "CarApp.H.Converter")).p(e).ai(13)).w("Failed to load drawable for %d", iA);
            return null;
        }
    }
}
