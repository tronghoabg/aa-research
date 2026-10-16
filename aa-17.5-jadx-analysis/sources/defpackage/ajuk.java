package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class ajuk implements Serializable, Comparator {
    private static final long serialVersionUID = 4466565437490631532L;

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ajui ajuiVar = (ajui) obj;
        ajui ajuiVar2 = (ajui) obj2;
        int iCompareTo = ajuiVar.c().compareTo(ajuiVar2.c());
        if (iCompareTo == 0) {
            String strB = ajuiVar.b();
            if (strB == null) {
                strB = "";
            } else if (strB.indexOf(46) == -1) {
                strB = strB.concat(".local");
            }
            String strB2 = ajuiVar2.b();
            iCompareTo = strB.compareToIgnoreCase(strB2 != null ? strB2.indexOf(46) == -1 ? strB2.concat(".local") : strB2 : "");
        }
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        String strD = ajuiVar.d();
        if (strD == null) {
            strD = "/";
        }
        String strD2 = ajuiVar2.d();
        return strD.compareTo(strD2 != null ? strD2 : "/");
    }
}
