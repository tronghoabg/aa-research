package defpackage;

import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class wem implements weo {
    @Override // defpackage.weo
    public final boolean a(kwp kwpVar) {
        Method method = wep.a;
        Object obj = kwpVar.a;
        String str = "false";
        try {
            str = (String) wep.a.invoke(null, obj, "false");
        } catch (Exception e) {
            Log.e("SystemProperties", "get error", e);
        }
        return str.equals("true");
    }
}
