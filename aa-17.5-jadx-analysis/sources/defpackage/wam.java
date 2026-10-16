package defpackage;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
public final class wam extends war {
    public wam(wap wapVar, String str, Object obj) {
        super(wapVar, str, obj, false);
    }

    @Override // defpackage.war
    public final Object a(Object obj) {
        if (obj instanceof String) {
            try {
                return (acas) abnv.x(acas.a, Base64.decode((String) obj, 3));
            } catch (IOException | IllegalArgumentException unused) {
            }
        }
        Log.e("PhenotypeFlag", vzz.b(obj, this, "Invalid byte[] value for "));
        return null;
    }
}
