package defpackage;

import android.util.Log;

@Deprecated
/* loaded from: classes2.dex */
public final class qnc {
    private static volatile uxc a = new uxc();

    public static void a(String str, Object obj) {
        qnd qndVar = qnd.a;
        if (qndVar != null) {
            qndVar.p(6, str, obj, null, null);
        } else if (a != null) {
            int i = a.a;
            Log.e((String) qmy.b.f(), obj != null ? a.bJ((String) obj, str, ":") : str);
        }
    }
}
