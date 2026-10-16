package defpackage;

import android.util.Log;

/* loaded from: classes.dex */
final class wah extends war {
    public wah(wap wapVar, String str, Long l) {
        super(wapVar, str, l, true);
    }

    @Override // defpackage.war
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", vzz.b(obj, this, "Invalid long value for "));
        return null;
    }
}
