package defpackage;

import java.util.Comparator;
import java.util.List;

/* loaded from: classes3.dex */
public final class uio {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/model/AnnotationAttributeMatcher");
    public static final Comparator b = new tui(5);

    public static boolean a(List list, abar abarVar) {
        int iAp = a.ap(abarVar.c);
        if (iAp == 0) {
            iAp = 2;
        }
        int i = iAp - 1;
        if (i == 1) {
            aboh abohVar = abarVar.b;
            if (list.isEmpty() || abohVar.isEmpty()) {
                return false;
            }
            yht yhtVarAh = yrm.ah(list.iterator());
            yht yhtVarAh2 = yrm.ah(abohVar.iterator());
            while (yhtVarAh.hasNext() && yhtVarAh2.hasNext()) {
                int iCompare = b.compare((abao) yhtVarAh.a(), (abao) yhtVarAh2.a());
                if (iCompare == 0) {
                    return true;
                }
                if (iCompare < 0) {
                    yhtVarAh.next();
                } else {
                    yhtVarAh2.next();
                }
            }
            return false;
        }
        if (i != 2) {
            return false;
        }
        aboh abohVar2 = abarVar.b;
        if (!list.isEmpty() && !abohVar2.isEmpty()) {
            yht yhtVarAh3 = yrm.ah(list.iterator());
            yht yhtVarAh4 = yrm.ah(abohVar2.iterator());
            while (yhtVarAh3.hasNext() && yhtVarAh4.hasNext()) {
                int iCompare2 = b.compare((abao) yhtVarAh3.a(), (abao) yhtVarAh4.a());
                if (iCompare2 != 0) {
                    if (iCompare2 >= 0) {
                        break;
                    }
                    yhtVarAh3.next();
                } else {
                    yhtVarAh3.next();
                    yhtVarAh4.next();
                }
            }
            if (!yhtVarAh4.hasNext()) {
                return true;
            }
        }
        return false;
    }
}
