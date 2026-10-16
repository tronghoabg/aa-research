package defpackage;

import android.content.ComponentName;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class ggp {
    private static final yob a = yob.c("com/android/car/libraries/apphost/config/flag/FlagValueParser");

    public static final int a(ComponentName componentName, List list, int i) throws NumberFormatException {
        componentName.getClass();
        list.getClass();
        Iterator it = list.iterator();
        Integer numValueOf = null;
        Integer numValueOf2 = null;
        Integer numValueOf3 = null;
        while (it.hasNext()) {
            String str = (String) it.next();
            List listI = xxx.e(":").i(str);
            listI.getClass();
            if (listI.size() != 2) {
                ((ynz) a.g().o(ypi.a, "CarApp.H").ai(40)).y("Invalid override flag format: %s", str);
            } else {
                try {
                    int i2 = Integer.parseInt((String) listI.get(1));
                    String str2 = (String) listI.get(0);
                    if (affa.f(str2, "DEFAULT")) {
                        numValueOf3 = Integer.valueOf(i2);
                    } else if (affa.f(str2, componentName.flattenToString())) {
                        numValueOf = Integer.valueOf(i2);
                    } else if (affa.f(str2, componentName.getPackageName())) {
                        numValueOf2 = Integer.valueOf(i2);
                    }
                } catch (NumberFormatException unused) {
                    ((ynz) a.g().o(ypi.a, "CarApp.H").ai(39)).y("Invalid override flag format: %s", str);
                }
            }
        }
        return numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : numValueOf3 != null ? numValueOf3.intValue() : i;
    }
}
