package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;

/* loaded from: classes2.dex */
public final class okw {
    public static final Object a = new Object();

    public static final okx a(SharedPreferences sharedPreferences) {
        okx okxVar;
        synchronized (a) {
            if (!sharedPreferences.contains("troubleshooter_parameters")) {
                return rxj.b;
            }
            try {
                okxVar = (okx) abnv.B(okx.a, Base64.decode(sharedPreferences.getString("troubleshooter_parameters", ""), 0), abnj.a());
            } catch (abon unused) {
                okxVar = rxj.b;
            }
            return okxVar;
        }
    }
}
