package defpackage;

import android.util.Log;

/* loaded from: classes3.dex */
public final class wak extends war {
    public wak(wap wapVar, String str, Double d) {
        super(wapVar, str, d, false);
    }

    @Override // defpackage.war
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", vzz.b(obj, this, "Invalid double value for "));
        return null;
    }
}
