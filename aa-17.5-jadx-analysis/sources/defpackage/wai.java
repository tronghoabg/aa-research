package defpackage;

import android.util.Log;

/* loaded from: classes3.dex */
public final class wai extends war {
    public wai(wap wapVar, String str, Integer num) {
        super(wapVar, str, num, false);
    }

    @Override // defpackage.war
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Long) {
            return Integer.valueOf(((Long) obj).intValue());
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", vzz.b(obj, this, "Invalid int value for "));
        return null;
    }
}
