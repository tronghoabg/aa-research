package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class ajum implements Serializable, Comparator {
    public static final ajum a = new ajum();
    private static final long serialVersionUID = 7523645369616405818L;

    private static final String a(ajui ajuiVar) {
        String strD = ajuiVar.d();
        if (strD == null) {
            strD = "/";
        }
        return !strD.endsWith("/") ? strD.concat("/") : strD;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String strA = a((ajui) obj);
        String strA2 = a((ajui) obj2);
        if (strA.equals(strA2)) {
            return 0;
        }
        if (strA.startsWith(strA2)) {
            return -1;
        }
        return strA2.startsWith(strA) ? 1 : 0;
    }
}
