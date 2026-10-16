package defpackage;

import android.content.Context;
import java.util.List;

/* loaded from: classes3.dex */
public final class zvy {
    public static final tmb a = new tme();

    private zvy() {
    }

    public static shv a(Context context, String str) {
        sjv sjvVar = sjv.a;
        if (skm.a(context) < 7300000) {
            return null;
        }
        List list = shv.n;
        shp shpVar = new shp(context, str);
        shpVar.d = zwt.a;
        return shpVar.a();
    }
}
