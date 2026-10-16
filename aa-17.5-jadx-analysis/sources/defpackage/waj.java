package defpackage;

import android.util.Log;

/* loaded from: classes.dex */
public final class waj extends war {
    public waj(wap wapVar, String str, Boolean bool, boolean z) {
        super(wapVar, str, bool, z);
    }

    @Override // defpackage.war
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (sxg.c.matcher(str).matches()) {
                return true;
            }
            if (sxg.d.matcher(str).matches()) {
                return false;
            }
        }
        Log.e("PhenotypeFlag", vzz.b(obj, this, "Invalid boolean value for "));
        return null;
    }
}
