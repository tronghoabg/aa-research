package defpackage;

import android.content.ContextWrapper;
import java.util.ArrayList;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract class l0 {
    public static final dd[] a = {md.a, wb.a, hc.a, j4.a, r5.a, s6.a, zc.a};

    public static dd a(String str) {
        for (dd ddVar : a) {
            if (ddVar.a.equals(str)) {
                return ddVar;
            }
        }
        return null;
    }

    public static dd[] b(ContextWrapper contextWrapper) {
        ArrayList arrayList = new ArrayList();
        dd[] ddVarArr = a;
        for (dd ddVar : ddVarArr) {
            if (xc.e(contextWrapper, "appHien_" + ddVar.a, true)) {
                arrayList.add(ddVar);
            }
        }
        return arrayList.isEmpty() ? ddVarArr : (dd[]) arrayList.toArray(new dd[0]);
    }
}
